package cellLogic;

import cellLogic.logicalOperations.*;
import cellLogic.simulation.cells.*;

import java.util.ArrayList;

public class EmptyCell extends Cell{
    protected int remainingMines;
    protected boolean unknown;
    protected boolean needsToCountAdjacentMines;
    protected boolean isLastActingCell;

    //Constructors for EmptyCells that already know their adjacent mines from the get-go
    public EmptyCell(int remainingMines, boolean revealed, boolean unknown){
        super();
        this.remainingMines = remainingMines;
        this.revealed = revealed;
        this.unknown = unknown;
        this.markedAsMine = false;
        this.needsToCountAdjacentMines = false;
        this.isLastActingCell = false;
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

            if(needsToCountAdjacentMines && otherCell instanceof MineCell){
                this.remainingMines++;
            }
        }
    }

    @Override public void reveal(){
        if(!revealed){
            revealed = true; 
            addToBoardForProcessing();      
            notifyAdjacentCells();
        }
    }

    @Override public void markAsMine() throws GameOver{
        throw new GameOver("Tried to mark an empty cell as a mine!");
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
        board.addOperationToProcess(new IntermediateCheckSharedCellsOperation(this));
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
                ArrayList<Cell> completelySharingCellAdjacencies = completelySharingCell.remainingAdjacentCells;
                int numberOfCellsOutsideOfSharedOnes = this.remainingAdjacentCells.size() - completelySharingCellAdjacencies.size();
                int minesOutsideOfSharedOnes = this.remainingMines - completelySharingCell.remainingMines;
                
                if(minesOutsideOfSharedOnes == 0){
                    board.updateLastActingCell(this);
                    for(int k=0; k<remainingAdjacentCells.size(); k++){
                        adjacentCell = remainingAdjacentCells.get(k);

                        if(!completelySharingCellAdjacencies.contains(adjacentCell)){
                            if(k <= i){
                                i--;
                            }

                            adjacentCell.reveal();
                            k--;
                        }
                    }
                }else if(minesOutsideOfSharedOnes == numberOfCellsOutsideOfSharedOnes){
                    board.updateLastActingCell(this);
                    for(int k=0; k<remainingAdjacentCells.size(); k++){
                        adjacentCell = remainingAdjacentCells.get(k);

                        if(!completelySharingCellAdjacencies.contains(adjacentCell)){
                            if(k <= i){
                                i--;
                            }

                            adjacentCell.markAsMine();
                            k--;
                        }
                    }
                }
            }
        }
    }
    
    public void intermediateCheckSharedCells(){
        for(int i=0; i<remainingAdjacentCells.size(); i++){
            ArrayList<EmptyCell> completelySharingCells = findCompletelySharingCells(remainingAdjacentCells.get(i));

            for(EmptyCell completelySharingCell : completelySharingCells){
                ArrayList<Cell> adjacenciesOutsideOfSharingCell = new ArrayList<>(this.remainingAdjacentCells);
                adjacenciesOutsideOfSharingCell.removeAll(completelySharingCell.remainingAdjacentCells);
                int minesOutsideOfSharedOnes = this.remainingMines - completelySharingCell.remainingMines;
                
                if(adjacenciesOutsideOfSharingCell.size() > 0){
                    ImaginaryCell cellWithAdjacenciesOutsideOfSharingCell = new ImaginaryCell(minesOutsideOfSharedOnes, adjacenciesOutsideOfSharingCell);

                    if(!cellWithAdjacenciesOutsideOfSharingCell.isRepeated()){
                        cellWithAdjacenciesOutsideOfSharingCell.addToBoard(board);
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

                if(this != adjacentCell && !currentPossibleSharerCell.unknown && this.remainingAdjacentCells.containsAll(currentPossibleSharerCellAdjacencies)){
                    completelySharingCells.add(currentPossibleSharerCell);
                }else if(this != adjacentCell && !currentPossibleSharerCell.unknown && currentPossibleSharerCellAdjacencies.containsAll(this.remainingAdjacentCells)){
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
                    i--;
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
        if(revealed){
            return this.getColorANSI() + (isLastActingCell ? "\u001B[4m" : "") + (unknown ? "?" : String.valueOf(remainingMines)) + (isLastActingCell ? "\u001B[0m " : " ");
        }else{
            return super.toString();
        }
    }
}