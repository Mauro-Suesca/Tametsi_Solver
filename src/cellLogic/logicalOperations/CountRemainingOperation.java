package cellLogic.logicalOperations;

import cellLogic.EmptyCell;

public class CountRemainingOperation extends LogicalOperation{
    public CountRemainingOperation(EmptyCell callingCell){
        super(callingCell, COUNT_REMAINING);
    }

    @Override public void executeOperation(){
        callingCell.countRemaining();
    }
}