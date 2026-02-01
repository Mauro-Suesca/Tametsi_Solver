package cellLogic;

import cellLogic.logicalOperations.*;
import cellLogic.simulation.cells.*;

import java.util.ArrayList;

public class EmptyCell extends Cell{
    protected int remainingMines;
    protected boolean unknown;
    protected boolean needsToCountAdjacentMines;
    protected boolean isLastActingCell;
    protected boolean isLastActingCellDueToImaginary;
    protected boolean isNatural0;

    //Constructors for EmptyCells that already know their adjacent mines from the get-go
    public EmptyCell(int remainingMines, boolean revealed, boolean unknown){
        super();
        this.remainingMines = remainingMines;
        this.revealed = revealed;
        this.unknown = unknown;
        this.markedAsMine = false;
        this.needsToCountAdjacentMines = false;
        this.isLastActingCell = false;
        this.isLastActingCellDueToImaginary = false;
        this.isNatural0 = true;
    }

    public EmptyCell(ColorCounter color, int remainingMines, boolean revealed, boolean unknown){
        this(remainingMines, revealed, unknown);
        this.addColor(color);
    }

    public EmptyCell(int remainingMines, boolean revealed, boolean unknown, int horizontalSize, int verticalSize){
        this(remainingMines, revealed, unknown);
        this.horizontalSize = horizontalSize;
        this.verticalSize = verticalSize;
    }

    public EmptyCell(ColorCounter color, int remainingMines, boolean revealed, boolean unknown, int horizontalSize, int verticalSize){
        this(remainingMines, revealed, unknown, horizontalSize, verticalSize);
        this.addColor(color);
    }

    //Constructors for EmptyCells that don't know how many mines they have adjacent and thus have to count them
    public EmptyCell(boolean revealed, boolean unknown){
        this(0, revealed, unknown);
        this.needsToCountAdjacentMines = true;
    }

    public EmptyCell(ColorCounter color, boolean revealed, boolean unknown){
        this(revealed, unknown);
        this.addColor(color);
    }

    public EmptyCell(boolean revealed, boolean unknown, int horizontalSize, int verticalSize){
        this(revealed, unknown);
        this.horizontalSize = horizontalSize;
        this.verticalSize = verticalSize;
    }

    public EmptyCell(ColorCounter color, boolean revealed, boolean unknown, int horizontalSize, int verticalSize){
        this(revealed, unknown, horizontalSize, verticalSize);
        this.addColor(color);
    }

    public void setIsLastActingCell(boolean isLastActingCell){
        this.isLastActingCell = isLastActingCell;
    }

    protected void setIsLastActingCellDueToImaginary(boolean isLastActingCellDueToImaginary){
        this.setIsLastActingCell(isLastActingCellDueToImaginary);
        this.isLastActingCellDueToImaginary = isLastActingCellDueToImaginary;
    }

    public int getRemainingMines(){
        return remainingMines;
    }

    @Override public void addAdjacent(Cell otherCell){
        if(!remainingAdjacentCells.contains(otherCell) && (!this.revealed || !otherCell.revealed)){
            if(otherCell instanceof DifferentlyAdjacentCell){
                otherCell.addAdjacent(this);
            }else{
                remainingAdjacentCells.add(otherCell);
                otherCell.remainingAdjacentCells.add(this);
            }

            if(otherCell instanceof MineCell){
                if(needsToCountAdjacentMines){
                    this.remainingMines++;
                }
                this.isNatural0 = false;
            }
        }
    }

    @Override protected void notifyAdjacentCells(){
        for(int i=0; i<remainingAdjacentCells.size(); i++){
            Cell adjacentCell = remainingAdjacentCells.get(i);

            if(adjacentCell.revealed){
                this.removeAdjacent(adjacentCell);
                i--;
            }
            
            adjacentCell.reactToCellReveal(this);
        }
    }

    @Override public void reveal(){
        if(!revealed){
            if(isNatural0){
                reveal(false);
                notifyBoard();
            }else{
                reveal(true);
            }
        }
    }

    private void reveal(boolean notifyBoard){
        revealed = true;
        addToBoardForProcessing();

        if(notifyBoard){
            notifyAdjacent();
        }else{
            notifyAdjacentCells();
        }

        if(unknown){
            for(int i=0; i<remainingAdjacentCells.size(); i++){
                this.removeAdjacent(remainingAdjacentCells.get(i));
                i--;
            }
        }else{
            if(isNatural0){
                for(int i=0; i<remainingAdjacentCells.size(); i++){
                    ((EmptyCell)remainingAdjacentCells.get(i)).reveal(false);
                    i--;
                }
            }
        }
    }

    @Override public void markAsMine() throws GameOver{
        throw new GameOver("¡Se trató de marcar una celda vacía!");
    }

    @Override public void reactToCellReveal(Cell revealedCell){
        addToBoardForProcessing();
    }

    @Override public void reactToCellMarked(Cell markedCell){
        remainingMines--;
        addToBoardForProcessing();
    }

    protected void addToBoardForProcessing(){
        if(revealed && !unknown){
            board.addOperationToProcess(new StartOperation(this));
        }
    }

    public void startLogicalSequence(){
        board.addOperationToProcess(new CountRemainingOperation(this));
        board.addOperationToProcess(new BasicCheckSharedCellsOperation(this));
        board.addOperationToProcess(new ProofByContradictionOperation(this));
        board.addOperationToProcess(new AdvancedCheckSharedCellsOperation(this));
        board.addOperationToProcess(new ProofByDoubleHypothesisOperation(this));
        board.addOperationToProcess(new ProofByCasesOperation(this));
    }

    //Direct proof
    public void countRemaining(){
        if(remainingMines == 0){
            board.updateLastActingCell(this);
            for(int i=0; i<remainingAdjacentCells.size(); i++){
                remainingAdjacentCells.get(i).reveal();
                i--;
            }
        }else if(remainingAdjacentCells.size() == remainingMines){
            board.updateLastActingCell(this);
            for(int i=0; i<remainingAdjacentCells.size(); i++){
                remainingAdjacentCells.get(i).markAsMine();
                i--;
            }
        }
    }

    public void basicCheckSharedCells(){
        for(int i=0; i<remainingAdjacentCells.size(); i++){
            Cell adjacentCell = remainingAdjacentCells.get(i);
            ArrayList<EmptyCell> completelySharingCells = findCompletelySharingCells(adjacentCell);

            for(EmptyCell completelySharingCell : completelySharingCells){
                ArrayList<Cell> cellsOutsideOfSharedAdjacencies = new ArrayList<>(this.remainingAdjacentCells);
                cellsOutsideOfSharedAdjacencies.removeAll(completelySharingCell.remainingAdjacentCells);

                int minesOutsideOfSharedOnes = this.remainingMines - completelySharingCell.remainingMines;
                
                if(minesOutsideOfSharedOnes == 0){
                    board.updateLastActingCell(this);
                    
                    for(int k=0; k<cellsOutsideOfSharedAdjacencies.size(); k++){
                        cellsOutsideOfSharedAdjacencies.get(k).reveal();
                    }
                }else if(minesOutsideOfSharedOnes == cellsOutsideOfSharedAdjacencies.size()){
                    board.updateLastActingCell(this);

                    for(int k=0; k<cellsOutsideOfSharedAdjacencies.size(); k++){
                        cellsOutsideOfSharedAdjacencies.get(k).markAsMine();
                    }
                }
            }
        }
    }
    
    public void advancedCheckSharedCells(){
        for(int i=0; i<remainingAdjacentCells.size(); i++){
            ArrayList<EmptyCell> completelySharingCells = findCompletelySharingCells(remainingAdjacentCells.get(i));

            for(EmptyCell completelySharingCell : completelySharingCells){
                ArrayList<Cell> adjacenciesOutsideOfSharingCell = new ArrayList<>(this.remainingAdjacentCells);
                adjacenciesOutsideOfSharingCell.removeAll(completelySharingCell.remainingAdjacentCells);
                int minesOutsideOfSharedOnes = this.remainingMines - completelySharingCell.remainingMines;
                
                if(board.maxMineDifferenceForImaginaryCells == Board.NO_MAX_DIFFERENCE || board.maxMineDifferenceForImaginaryCells >= minesOutsideOfSharedOnes){
                    if(adjacenciesOutsideOfSharingCell.size() > 0){
                        ImaginaryCell cellWithAdjacenciesOutsideOfSharingCell = new ImaginaryCell(minesOutsideOfSharedOnes, adjacenciesOutsideOfSharingCell, this);

                        if(!cellWithAdjacenciesOutsideOfSharingCell.isRepeated()){
                            cellWithAdjacenciesOutsideOfSharingCell.addToBoard(board);
                        }
                    }
                }
            }
        }

        board.addOperationToProcess(new ProofByContradictionOperation(this));
    }

    private ArrayList<EmptyCell> findCompletelySharingCells(Cell adjacentCell){
        ArrayList<EmptyCell> completelySharingCells = new ArrayList<>();

        for(int i=0; i<adjacentCell.remainingAdjacentCells.size(); i++){
            if(adjacentCell.remainingAdjacentCells.get(i).revealed){
                EmptyCell currentPossibleSharerCell = (EmptyCell)adjacentCell.remainingAdjacentCells.get(i);
                ArrayList<Cell> currentPossibleSharerCellAdjacencies = currentPossibleSharerCell.remainingAdjacentCells;

                if(this != currentPossibleSharerCell && !currentPossibleSharerCell.unknown && this.remainingAdjacentCells.containsAll(currentPossibleSharerCellAdjacencies)){
                    completelySharingCells.add(currentPossibleSharerCell);
                }else if(this != currentPossibleSharerCell && !currentPossibleSharerCell.unknown && currentPossibleSharerCellAdjacencies.containsAll(this.remainingAdjacentCells)){
                    currentPossibleSharerCell.addToBoardForProcessing();
                }
            }
        }

        return completelySharingCells;
    }

    //Proof by contradiction
    public void checkHypothesesForContradictions(boolean needsToUseDoubleHypothesis){
        boolean hypothesisIsHasMine;
        
        if(remainingMines == 0){
            return;
        }else if(remainingMines == 1){
            hypothesisIsHasMine = true;
        }else{
            if(remainingAdjacentCells.size() - remainingMines == 1){
                hypothesisIsHasMine = false;
            }else{
                return;
            }
        }

        for(int i=0; i<remainingAdjacentCells.size(); i++){
            if(!remainingAdjacentCells.get(i).revealed){
                SimulatedBoard currentHypothesisSimulation = new SimulatedBoard(needsToUseDoubleHypothesis);

                SimulatedUnrevealedCell testCell = (SimulatedUnrevealedCell)remainingAdjacentCells.get(i).simulateCell(currentHypothesisSimulation);

                if(!currentHypothesisSimulation.checkIfHypothesisIsPossible(testCell, hypothesisIsHasMine)){
                    board.updateLastActingCell(this);
                    if(hypothesisIsHasMine){
                        remainingAdjacentCells.get(i).reveal();
                    }else{
                        remainingAdjacentCells.get(i).markAsMine();
                    }
                    board.addOperationToProcess(needsToUseDoubleHypothesis ? new ProofByDoubleHypothesisOperation(this) : new ProofByContradictionOperation(this));
                    break;
                }
            }
        }
    }

    @Override public SimulatedCell simulateCell(SimulatedBoard simulatedBoard){
        SimulatedCell resultingSimulatedCell = null;

        if(revealed && !unknown){
            resultingSimulatedCell = SimulatedRevealedCell.createSimulatedCell(simulatedBoard, this, remainingMines);
        }else if(!revealed){
            resultingSimulatedCell = SimulatedUnrevealedCell.createSimulatedCell(simulatedBoard, this, markedAsMine);
        }
        
        return simulateAdjacentCells(simulatedBoard, resultingSimulatedCell);
    }

    //TODO Implement logic for proof by cases
    public void proofByCases(){
        
    }

    @Override public String toString(){
        String result;

        if(revealed){
            result = this.getColorANSI();

            result += (isLastActingCell ? "\u001B[4m" : "") + (isLastActingCellDueToImaginary ? "\u001B[3m" : "");
            
            result += (unknown ? "?" : String.valueOf(remainingMines)) + "\u001B[0m";

            result += (remainingMines <= 9 ? " " : "");
        }else{
            result = super.toString();
        }

        return result;
    }
}