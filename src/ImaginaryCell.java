import java.util.ArrayList;

public class ImaginaryCell extends EmptyCell{
    private ArrayList<Cell> originalAdjacencies;
    
    ImaginaryCell(int remainingMines, ArrayList<Cell> remainingAdjacentCells){
        super(remainingMines, true, false);
        this.originalAdjacencies = remainingAdjacentCells;
    }

    public void addToBoard(Board board){
        this.addBoard(board);

        this.remainingAdjacentCells = new ArrayList<>();

        for(Cell cell : originalAdjacencies){
            this.addAdjacent(cell);
        }

        this.board.addOperationToProcess(new StartOperation(this));
    }

    @Override public boolean equals(Object otherObject){
        if(otherObject instanceof ImaginaryCell){
            ImaginaryCell otherCell = (ImaginaryCell)otherObject;


            if(otherCell.originalAdjacencies.size() != this.originalAdjacencies.size()){
                return false;
            }

            if(otherCell.remainingAdjacentCells.size() != this.remainingAdjacentCells.size()){
                return false;
            }

            for(int i=0; i<this.remainingAdjacentCells.size(); i++){
                if(otherCell.remainingAdjacentCells.get(i) != this.remainingAdjacentCells.get(i)){
                    return false;
                }
            }

            return true;
        }
        
        return false;
    }
}