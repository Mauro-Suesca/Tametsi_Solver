import java.util.Set;

public abstract class Cell implements AdjacentCell{
    protected Set<Cell> remainingAdjacentCells;
    protected boolean revealed;
    protected boolean markedAsMine;

    public void markAsMine(){
        if(revealed){
            throw new GameOver("Tried to mark a revealed cell!");
        }

        if(!markedAsMine){
            markedAsMine = true;
            notifyAdjacentCells();
        }
    }

    protected void notifyAdjacentCells(){
        for(Cell adjacentCell : remainingAdjacentCells){
            removeAdjacent(adjacentCell);
            if(revealed){
                adjacentCell.reactToCellReveal(this);
            }
            if(markedAsMine){
                adjacentCell.reactToCellMarked(this);
            }
        }
    }

    //Acts like "subscribe" from Observer design pattern.
    public void addAdjacent(Cell otherCell){
        remainingAdjacentCells.add(otherCell);
        otherCell.remainingAdjacentCells.add(this);
    }

    //Acts like "unsubscribe" from Observer design pattern.
    public void removeAdjacent(Cell otherCell){
        remainingAdjacentCells.remove(otherCell);
        otherCell.remainingAdjacentCells.remove(this);
    }

    @Override public String toString(){
        return markedAsMine ? "■" : "◻";
    }
}