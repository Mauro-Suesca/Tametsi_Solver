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
        if(markedAsMine){
            throw new GameOver("Tried to reveal a marked mine!");
        }

        if(!revealed){
            revealed = true;            
            notifyAdjacentCells();
            board.addCellToProcess(this);
        }
    }

    @Override public void markAsMine() throws GameOver{
        throw new GameOver("Tried to mark an empty cell as a mine!");
    }

    @Override public void reactToCellReveal(Cell revealedCell){
        board.addCellToProcess(this);
    }

    @Override public void reactToCellMarked(Cell markedCell){
        remainingMines--;
        board.addCellToProcess(this);
    }

    //TODO Kickstarts the logic for this Cell. We must check if it's still valid to call this method for each method that calls this function every time a new step is added to the sequence
    public void executeLogicalSequence(){
        if(revealed && !unknown){
            countRemaining();
            //TODO Make a way to implement hypothesis logic by contradiction
            //TODO Make a way to mark groups of Cells as having a certain number of mines, and make adjacent cells understand the number of mines in a group and apply logic.
            //TODO Maybe make a way to implement logic by cases
        }
    }

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

    @Override public String toString(){
        if(revealed){
            return (unknown ? "? " : String.valueOf(remainingMines) + " ");
        }else{
            return super.toString();
        }
    }
}