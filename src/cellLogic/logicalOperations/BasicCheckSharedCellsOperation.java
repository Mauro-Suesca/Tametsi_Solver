package cellLogic.logicalOperations;

import cellLogic.EmptyCell;

public class BasicCheckSharedCellsOperation extends LogicalOperation{
    public BasicCheckSharedCellsOperation(EmptyCell callingCell){
        super(callingCell, BASIC_CHECK_SHARED_CELLS);
    }

    @Override public void executeOperation(){
        callingCell.basicCheckSharedCells();
    }
}