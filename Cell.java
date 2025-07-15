import java.util.ArrayDeque;
import java.util.ArrayList;

public abstract class Cell implements AdjacentCell{
    protected static ArrayDeque<EmptyCell> cellsToProcess;
    protected static Board board;
    protected ArrayList<Cell> remainingAdjacentCells;
    protected boolean revealed;
    protected boolean markedAsMine;

    public void addCellToProcess(EmptyCell cellToAdd){
        cellsToProcess.add(cellToAdd);
    }

    public static void executeNextProcess(){
        if(!cellsToProcess.isEmpty()){
            cellsToProcess.remove().executeLogicalSequence();
            executeNextProcess();
        }
    }

    public static void setFirstStep(EmptyCell firstCellToProcess){
        if(cellsToProcess == null){
            cellsToProcess = new ArrayDeque<>();
        }
        if(cellsToProcess.size() == 0){
            cellsToProcess.add(firstCellToProcess);
        }
    }

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

    public static void addBoard(Board newBoard){
        if(board == null){
            board = newBoard;
        }  
    }

    //Acts like "subscribe" from Observer design pattern.
    public void addAdjacent(Cell otherCell){
        if(!remainingAdjacentCells.contains(otherCell)){
            remainingAdjacentCells.add(otherCell);
            otherCell.remainingAdjacentCells.add(this);
        }
    }

    //Acts like "unsubscribe" from Observer design pattern.
    public void removeAdjacent(Cell otherCell){
        remainingAdjacentCells.remove(otherCell);
        otherCell.remainingAdjacentCells.remove(this);
    }

    @Override public String toString(){
        return markedAsMine ? "■ " : "[]";
    }
}