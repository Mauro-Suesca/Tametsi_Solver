import java.util.ArrayList;

public class ImaginaryCell extends EmptyCell{
    ImaginaryCell(int remainingMines, ArrayList<Cell> remainingAdjacentCells){
        super(remainingMines, true, false);
        this.remainingAdjacentCells = remainingAdjacentCells;
    }

    public void addToBoard(Board board){
        this.addBoard(board);
        ArrayList<Cell> copyOfRemainingAdjacentCells = new ArrayList<>(remainingAdjacentCells);

        this.remainingAdjacentCells = new ArrayList<>();

        for(Cell cell : copyOfRemainingAdjacentCells){
            this.addAdjacent(cell);
        }

        this.board.addCellToProcess(this);
    }
}