package cellLogic;

import java.util.ArrayList;

import cellLogic.simulation.cells.SimulatedBoard;
import cellLogic.simulation.cells.SimulatedCell;
import cellLogic.simulation.cells.SimulatedRevealedCell;
import cellLogic.simulation.cells.SimulatedUnrevealedCell;

public abstract class Cell implements CellObserver{
    protected static final String ESC = "\u001B[";
    protected static Board board;
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
        return color != null ? color.getColorANSI() : "";
    }

    public static void setBoard(Board board){
        Cell.board = board;
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

    protected void notifyAdjacent(){
        notifyAdjacentCells();
        notifyBoard();
    }

    protected abstract void notifyAdjacentCells();

    protected void notifyBoard(){
        if(revealed) board.reactToCellReveal(this);
        if(markedAsMine) board.reactToCellMarked(this);
    }

    public abstract void reveal();
    
    public abstract void markAsMine();

    public abstract SimulatedCell simulateCell(SimulatedBoard board);

    protected SimulatedCell simulateAdjacentCells(SimulatedBoard simulatedBoard, SimulatedCell resultingSimulatedCell){
        for(int i=0; i<remainingAdjacentCells.size(); i++){
            Cell adjacentCell = remainingAdjacentCells.get(i);
            
            if(!adjacentCell.revealed || !((EmptyCell)adjacentCell).unknown){
                if(!simulatedBoard.checkIfCellExistsInBoard(adjacentCell)){
                    resultingSimulatedCell.addAdjacent(adjacentCell.simulateCell(simulatedBoard));
                }else if(adjacentCell.revealed){
                    EmptyCell adjacentEmptyCell = (EmptyCell) adjacentCell;
                    resultingSimulatedCell.addAdjacent(SimulatedRevealedCell.createSimulatedCell(adjacentEmptyCell, adjacentEmptyCell.remainingMines));
                }else{
                    resultingSimulatedCell.addAdjacent(SimulatedUnrevealedCell.createSimulatedCell(adjacentCell, adjacentCell.markedAsMine));
                }
            }
        }

        return resultingSimulatedCell;
    }

    @Override public String toString(){
        return this.getColorANSI() + (markedAsMine ? "■ " : "[]");
    }
}