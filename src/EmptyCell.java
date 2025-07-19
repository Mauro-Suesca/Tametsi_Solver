import java.util.ArrayList;

public class EmptyCell extends Cell{
    protected int remainingMines;
    protected boolean unknown;

    EmptyCell(int remainingMines, boolean revealed, boolean unknown){
        remainingAdjacentCells = new ArrayList<>();
        this.remainingMines = remainingMines;
        this.revealed = revealed;
        this.unknown = unknown;
        this.markedAsMine = false;
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

    //TODO Implement logic for checking if a different cell's adjacencies are contained within this cell, and to act upon it
    protected void basicCheckSharedCells(){
        
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
            return (unknown ? "? " : String.valueOf(remainingMines) + " ");
        }else{
            return super.toString();
        }
    }
}