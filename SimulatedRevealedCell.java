import java.util.ArrayList;

public class SimulatedRevealedCell extends SimulatedCell{
    private int remainingMines;
    private boolean unknown;

    private SimulatedRevealedCell(SimulatedBoard board, Cell originalCell, int remainingMines, boolean unknown){
        this.board = board;
        this.originalCell = originalCell;
        this.remainingMines = remainingMines;
        this.unknown = unknown;
        this.remainingAdjacentCells = new ArrayList<>();
    }

    public static SimulatedRevealedCell createSimulatedCell(SimulatedBoard board, Cell originalCell, int remainingMines, boolean unknown){
        return (SimulatedRevealedCell)board.getAlreadyExistingSimulatedCell(new SimulatedRevealedCell(board, originalCell, remainingMines, unknown));
    }

    public boolean executeLogicalSequence(){
        if(!unknown){
            if(countAndCheckIfThereAreContradictions()){
                return false;
            }
            countRemaining();
            if(countAndCheckIfThereAreContradictions()){
                return false;
            }
        }
        return true;
    }

    private boolean countAndCheckIfThereAreContradictions(){
        if(remainingMines < 0){
            return true;
        }
        if(remainingMines > remainingAdjacentCells.size()){
            return true;
        }

        return false;
    }

    private void countRemaining(){
        if(remainingMines == 0){
            for(int i=0; i<remainingAdjacentCells.size(); i++){
                remainingAdjacentCells.get(i).markAsEmpty();
                i--;
            }
        }else if(remainingAdjacentCells.size() == remainingMines){
            for(int i=0; i<remainingAdjacentCells.size(); i++){
                remainingAdjacentCells.get(i).markAsMine();
                i--;
            }
        }
    }

    @Override public void notifyAdjacentCells(){
        return;
    }

    @Override public void reactToCellMarkedAsEmpty(SimulatedCell revealedCell){
        board.addCellToProcess(this);
    }

    @Override public void reactToCellMarkedAsMine(SimulatedCell markedCell){
        remainingMines--;
        board.addCellToProcess(this);
    }

    @Override public void markAsEmpty(){
        return;
    }

    @Override public void markAsMine(){
        return;
    }

    @Override public boolean equals(Object otherObject){
        if(!(otherObject instanceof SimulatedRevealedCell)){
            return false;
        }

        SimulatedRevealedCell otherCell = (SimulatedRevealedCell)otherObject;
        if(otherCell.board.equals(this.board) && otherCell.originalCell.equals(this.originalCell)){
            return true;
        }

        return false;
    }
}