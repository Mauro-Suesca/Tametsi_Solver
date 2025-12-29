package cellLogic;

import java.util.ArrayList;

import cellLogic.simulation.cells.SimulatedBoard;
import cellLogic.simulation.cells.SimulatedCell;

public abstract class Cell implements CellObserver{
    protected Board board;
    protected ArrayList<Cell> remainingAdjacentCells;
    protected boolean revealed;
    protected boolean markedAsMine;
    protected int horizontalSize;
    protected int verticalSize;
    protected ColorCounter color;

    Cell(){
        remainingAdjacentCells = new ArrayList<>();
        horizontalSize = 1;
        verticalSize = 1;
    }

    public int getHorizontalSize(){
        return horizontalSize;
    }

    public int getVerticalSize(){
        return verticalSize;
    }

    public String getColorANSI(){
        return color.getColorANSI();
    }

    protected void notifyAdjacentCells(){
        for(int i=0; i<remainingAdjacentCells.size(); i++){
            Cell adjacentCell = remainingAdjacentCells.get(i);
            if(revealed){
                if(adjacentCell.revealed){
                    this.removeAdjacent(adjacentCell);
                    i--;
                }
                adjacentCell.reactToCellReveal(this);
            }
            if(markedAsMine){
                this.removeAdjacent(adjacentCell);
                i--;
                adjacentCell.reactToCellMarked(this);
            }
        }

        if(revealed) board.reactToCellReveal(this);
        if(markedAsMine) board.reactToCellMarked(this);
    }

    public void addBoard(Board newBoard){
        if(this.board == null){
            this.board = newBoard;
        }  
    }

    public void addColor(ColorCounter color){
        if(this.color == null){
            this.color = color;
            this.addAdjacent(color);
        }
    }

    //Acts like "subscribe" from Observer design pattern.
    public abstract void addAdjacent(Cell otherCell);

    //Acts like "unsubscribe" from Observer design pattern.
    public void removeAdjacent(Cell otherCell){
        remainingAdjacentCells.remove(otherCell);
        otherCell.remainingAdjacentCells.remove(this);
    }

    public abstract void reveal();
    
    public abstract void markAsMine();

    public abstract SimulatedCell simulateCell(SimulatedBoard board);


    @Override public String toString(){
        return this.getColorANSI() + (markedAsMine ? "■ " : "[]");
    }
}