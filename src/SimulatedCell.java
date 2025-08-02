import java.util.ArrayList;

public abstract class SimulatedCell{
    protected ArrayList<SimulatedCell> remainingAdjacentCells;
    protected SimulatedBoard board;
    protected Cell originalCell;

    protected abstract void notifyAdjacentCells();
    
    public void addAdjacent(SimulatedCell otherCell){
        if(!remainingAdjacentCells.contains(otherCell)){
            remainingAdjacentCells.add(otherCell);
            otherCell.remainingAdjacentCells.add(this);
        }
    }

    public void removeAdjacent(SimulatedCell otherCell){
        remainingAdjacentCells.remove(otherCell);
        otherCell.remainingAdjacentCells.remove(this);
    }

    public boolean isSameOriginalCell(Cell possibleOriginalCell){
        return this.originalCell.equals(possibleOriginalCell);
    }

    public abstract void reactToCellMarkedAsEmpty(SimulatedCell emptyCell);

    public abstract void reactToCellMarkedAsMine(SimulatedCell markedCell);

    public abstract boolean markAsEmpty();

    public abstract boolean markAsMine();

    @Override public abstract boolean equals(Object otherObject);
}