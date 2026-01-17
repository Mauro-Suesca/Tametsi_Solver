package cellLogic.logicalOperations;

import cellLogic.EmptyCell;

public class IntermediateCheckSharedCellsOperation extends LogicalOperation{
    public IntermediateCheckSharedCellsOperation(EmptyCell callingCell){
        super(callingCell, INTERMEDIATE_CHECK_SHARED_CELLS);
    }

    @Override public void executeOperation(){
        callingCell.intermediateCheckSharedCells();
    }

    @Override public int compareTo(LogicalOperation otherOperation){
        int result = super.compareTo(otherOperation);

        if(result == 0){
            if(this.callingCell.getRemainingMines() < otherOperation.callingCell.getRemainingMines()){
                result = -1;
            }else if(this.callingCell.getRemainingMines() == otherOperation.callingCell.getRemainingMines()){
                result = 0;
            }else{
                result = 1;
            }
        }

        return result;
    }
}