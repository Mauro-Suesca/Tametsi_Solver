package cellLogic.logicalOperations;

import cellLogic.EmptyCell;

public class IntermediateCheckSharedCellsOperation extends LogicalOperation{
    public IntermediateCheckSharedCellsOperation(EmptyCell callingCell){
        super(callingCell, INTERMEDIATE_CHECK_SHARED_CELLS);
    }

    @Override public void executeOperation(){
        callingCell.intermediateCheckSharedCells();
    }
}