import java.util.Set;

public abstract class Cell implements AdjacentCell{
    protected Set<AdjacentCell> remainingAdjacentCells;
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
        for(AdjacentCell adjacentCell : remainingAdjacentCells){
            removeAdjacent(adjacentCell);
            if(revealed){
                adjacentCell.reactToCellReveal(this);
            }
            if(markedAsMine){
                adjacentCell.reactToCellMarked(this);
            }
        }
    }

    //TODO addAdjacent method, acts like "subscribe" from Observer design pattern, adds cells both ways
    protected void addAdjacent(AdjacentCell otherCell){

    }

    //TODO removeAdjacent method, acts like "unsubscribe" from Observer design pattern, removes cells both ways
    protected void removeAdjacent(AdjacentCell otherCell){
        
    }

    @Override public String toString(){
        return markedAsMine ? "■" : "◻";
    }
}