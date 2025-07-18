import java.util.ArrayList;

public class SimulatedUnrevealedCell extends SimulatedCell{
    private boolean markedAsMine;
    private boolean markedAsEmpty;

    private SimulatedUnrevealedCell(SimulatedBoard board, Cell originalCell, boolean markedAsMine){
        this.board = board;
        this.originalCell = originalCell;
        this.markedAsMine = markedAsMine;
        this.remainingAdjacentCells = new ArrayList<>();
    }

    public static SimulatedUnrevealedCell createSimulatedCell(SimulatedBoard board, Cell originalCell, boolean markedAsMine){
        return (SimulatedUnrevealedCell)board.getAlreadyExistingSimulatedCell(new SimulatedUnrevealedCell(board, originalCell, markedAsMine));
    }

    @Override protected void notifyAdjacentCells(){
        for(int i=0; i<remainingAdjacentCells.size(); i++){
            SimulatedCell adjacentCell = remainingAdjacentCells.get(i);

            this.removeAdjacent(adjacentCell);
            i--;

            if(markedAsEmpty){
                adjacentCell.reactToCellMarkedAsEmpty(this);
            }
            if(markedAsMine){
                adjacentCell.reactToCellMarkedAsMine(this);
            }
        }
    }

    @Override public void reactToCellMarkedAsEmpty(SimulatedCell revealedCell){
        return;
    }

    @Override public void reactToCellMarkedAsMine(SimulatedCell markedCell){
        return;
    }

    @Override public void markAsEmpty(){
        if(markedAsMine){
            throw new GameOver("Contradiction");
        }
        markedAsEmpty = true;
        notifyAdjacentCells();
    }

    @Override public void markAsMine(){
        if(markedAsEmpty){
            throw new GameOver("Contradiction");
        }
        markedAsMine = true;
        notifyAdjacentCells();
    }

    @Override public boolean equals(Object otherObject){
        if(!(otherObject instanceof SimulatedUnrevealedCell)){
            return false;
        }

        SimulatedUnrevealedCell otherCell = (SimulatedUnrevealedCell)otherObject;
        if(otherCell.board.equals(this.board) && otherCell.originalCell.equals(this.originalCell)){
            return true;
        }

        return false;
    }
}