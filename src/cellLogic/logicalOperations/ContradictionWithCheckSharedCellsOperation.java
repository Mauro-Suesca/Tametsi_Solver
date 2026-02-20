package cellLogic.logicalOperations;

import cellLogic.EmptyCell;

public class ContradictionWithCheckSharedCellsOperation extends LogicalOperation{
    public ContradictionWithCheckSharedCellsOperation(EmptyCell callingCell){
        super(callingCell, CONTRADICTION_WITH_CHECK_SHARED_CELLS);
    }

    @Override public void executeOperation(){
        callingCell.checkHypothesesForContradictions(false, true);
    }
}