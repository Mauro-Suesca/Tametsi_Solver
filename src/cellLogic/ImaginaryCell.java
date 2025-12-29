package cellLogic;

import java.util.ArrayList;

import cellLogic.logicalOperations.StartOperation;

public class ImaginaryCell extends EmptyCell{
    private ArrayList<Cell> originalAdjacencies;
    
    public ImaginaryCell(int remainingMines, ArrayList<Cell> remainingAdjacentCells){
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

    public boolean isRepeated(){
        boolean isRepeated = false;

        //If there's an EmptyCell that has the same adjacencies as this ImaginaryCell, it must be among the adjacent cells of any of this ImaginaryCells adjacencies. As such, we check for matches within the adjacencies of the first Cell adjacent to this ImaginaryCell
        ArrayList<Cell> potentiallyEquivalentCells = this.originalAdjacencies.get(0).remainingAdjacentCells;

        for(Cell cellToCheck : potentiallyEquivalentCells){
            if(this.isEquivalentTo(cellToCheck)){
                isRepeated = true;
                break;
            }
        }

        return isRepeated;
    }

    //equals(Object) doesn't work because we need the check to happen only within isRepeated(), and overriding equals(Object) would be too much because it would check for all adjacencies when using contains() in collections
    private boolean isEquivalentTo(Cell otherCell){
        if(otherCell instanceof EmptyCell){
            EmptyCell otherEmptyCell = (EmptyCell)otherCell;

            if(!otherEmptyCell.revealed || otherEmptyCell.unknown){
                return false;
            }

            if(otherEmptyCell.remainingAdjacentCells.size() != this.originalAdjacencies.size()){
                return false;
            }

            
            for(int i=0; i<this.originalAdjacencies.size(); i++){
                if(otherEmptyCell.remainingAdjacentCells.get(i) != this.originalAdjacencies.get(i)){
                    return false;
                }
            }

            return true;
        }
        
        return false;
    }
}