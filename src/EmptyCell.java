import java.util.ArrayList;

public class EmptyCell extends Cell{
    protected int remainingMines;
    protected boolean unknown;

    EmptyCell(int remainingMines, boolean revealed, boolean unknown){
        super();
        this.remainingMines = remainingMines;
        this.revealed = revealed;
        this.unknown = unknown;
        this.markedAsMine = false;
    }

    EmptyCell(ColorCounter color, int remainingMines, boolean revealed, boolean unknown){
        this(remainingMines, revealed, unknown);
        this.addColor(color);
    }

    EmptyCell(int remainingMines, boolean revealed, boolean unknown, int horizontalSize, int verticalSize){
        this(remainingMines, revealed, unknown);
        this.horizontalSize = horizontalSize;
        this.verticalSize = verticalSize;
    }

    EmptyCell(ColorCounter color, int remainingMines, boolean revealed, boolean unknown, int horizontalSize, int verticalSize){
        this(remainingMines, revealed, unknown, horizontalSize, verticalSize);
        this.addColor(color);
    }

    @Override public void reveal(){
        if(!revealed){
            revealed = true;   
            board.addCellToProcess(this);         
            notifyAdjacentCells();
        }
    }

    @Override public void markAsMine() throws GameOver{
        throw new GameOver("¡Se trató de marcar una celda vacía!");
    }

    @Override public void reactToCellReveal(Cell revealedCell){
        board.addCellToProcess(this);
    }

    @Override public void reactToCellMarked(Cell markedCell){
        remainingMines--;
        board.addCellToProcess(this);
    }

    public void executeLogicalSequence(){
        if(revealed && !unknown){
            countRemaining();
            basicCheckSharedCells();
            checkHypothesesForContradictions();
            proofByCases();
        }
    }

    //Direct proof
    protected void countRemaining(){
        if(remainingMines == 0){
            for(int i=0; i<remainingAdjacentCells.size(); i++){
                remainingAdjacentCells.get(i).reveal();
                i--;
            }
        }else if(remainingAdjacentCells.size() == remainingMines){
            for(int i=0; i<remainingAdjacentCells.size(); i++){
                remainingAdjacentCells.get(i).markAsMine();
                i--;
            }
        }
    }

    protected void basicCheckSharedCells(){      
        for(int i=0; i<remainingAdjacentCells.size(); i++){
            ArrayList<EmptyCell> completelySharingCells = new ArrayList<>();

            Cell adjacentCell = remainingAdjacentCells.get(i);
            for(int j=0; j<adjacentCell.remainingAdjacentCells.size(); j++){
                if(adjacentCell.remainingAdjacentCells.get(j).revealed){
                    EmptyCell currentPossibleSharerCell = (EmptyCell)adjacentCell.remainingAdjacentCells.get(j);
                    ArrayList<Cell> currentPossibleSharerCellAdjacencies = currentPossibleSharerCell.remainingAdjacentCells;

                    if(this != adjacentCell && !currentPossibleSharerCell.unknown && this.remainingAdjacentCells.containsAll(currentPossibleSharerCellAdjacencies)){
                        completelySharingCells.add(currentPossibleSharerCell);
                    }else if(this != adjacentCell && !currentPossibleSharerCell.unknown && currentPossibleSharerCellAdjacencies.containsAll(this.remainingAdjacentCells)){
                        board.addCellToProcess(currentPossibleSharerCell);
                    }
                }
            }            

            for(EmptyCell completelySharingCell : completelySharingCells){
                ArrayList<Cell> completelySharingCellAdjacencies = completelySharingCell.remainingAdjacentCells;
                int numberOfCellsOutsideOfSharedOnes = this.remainingAdjacentCells.size() - completelySharingCellAdjacencies.size();
                int minesOutsideOfSharedOnes = this.remainingMines - completelySharingCell.remainingMines;
                
                if(minesOutsideOfSharedOnes == 0){
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

    //Proof by contradiction
    protected void checkHypothesesForContradictions(){
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
                SimulatedBoard currentHypothesisSimulation = new SimulatedBoard();

                SimulatedUnrevealedCell testCell = (SimulatedUnrevealedCell)remainingAdjacentCells.get(i).simulateCell(currentHypothesisSimulation);

                if(!currentHypothesisSimulation.checkIfHypothesisIsPossible(testCell, hypothesisIsHasMine)){
                    if(hypothesisIsHasMine){
                        remainingAdjacentCells.get(i).reveal();
                        i--;
                    }else{
                        remainingAdjacentCells.get(i).markAsMine();
                        i--;
                    }
                }
            }
        }
    }

    @Override public SimulatedCell simulateCell(SimulatedBoard simulatedBoard){
        SimulatedCell resultingSimulatedCell;

        if(revealed){
            resultingSimulatedCell = SimulatedRevealedCell.createSimulatedCell(simulatedBoard, this, remainingMines, unknown);
        }else{
            resultingSimulatedCell = SimulatedUnrevealedCell.createSimulatedCell(simulatedBoard, this, markedAsMine);
        }

        for(int i=0; i<remainingAdjacentCells.size(); i++){
            if(!simulatedBoard.checkIfCellExistsInBoard(remainingAdjacentCells.get(i))){
                resultingSimulatedCell.addAdjacent(remainingAdjacentCells.get(i).simulateCell(simulatedBoard));
            }else if(remainingAdjacentCells.get(i).revealed){
                EmptyCell adjacentCell = (EmptyCell) remainingAdjacentCells.get(i);
                resultingSimulatedCell.addAdjacent(SimulatedRevealedCell.createSimulatedCell(simulatedBoard, adjacentCell, adjacentCell.remainingMines, adjacentCell.unknown));
            }else{
                Cell adjacentCell = remainingAdjacentCells.get(i);
                resultingSimulatedCell.addAdjacent(SimulatedUnrevealedCell.createSimulatedCell(simulatedBoard, adjacentCell, adjacentCell.markedAsMine));
            }
        }

        return resultingSimulatedCell;
    }

    //TODO Implement logic for proof by cases
    protected void proofByCases(){

    }

    @Override public String toString(){
        if(revealed){
            return colorANSI + (unknown ? "? " : String.valueOf(remainingMines) + " ");
        }else{
            return super.toString();
        }
    }
}