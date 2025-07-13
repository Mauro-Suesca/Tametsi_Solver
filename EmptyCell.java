public class EmptyCell extends Cell{
    protected int remainingMines;

    @Override public void reveal(){
        if(markedAsMine){
            throw new GameOver("Tried to reveal a marked mine!");
        }

        if(!revealed){
            revealed = true;            
            notifyAdjacentCells();
            executeLogicalSequence();
        }
    }

    @Override public void markAsMine(){
        if(revealed){
            throw new GameOver("Tried to mark a revealed cell!");
        }

        super.markAsMine();
    }

    @Override public void reactToCellReveal(Cell revealedCell){
        if(revealed){
            executeLogicalSequence();
        }
    }

    @Override public void reactToCellMarked(Cell markedCell){
        if(revealed){
            executeLogicalSequence();
        }
    }

    //TODO Kickstarts the logic for this Cell. Must check if it's still valid to call this method for each method that calls this function every time a new step is added to the sequence
    private void executeLogicalSequence(){
        countRemaining();
    }

    //TODO countRemaining method for EmptyCell, starts revealing Cells if remainingMines is 0, marks everything as a mine if remainingMines is equal to number of adjacent cells
    private void countRemaining(){
        if(revealed){

        }
    }

    @Override public String toString(){
        return revealed ? String.valueOf(remainingMines) : super.toString();
    }
}