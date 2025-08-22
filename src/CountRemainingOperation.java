public class CountRemainingOperation extends LogicalOperation{
    CountRemainingOperation(EmptyCell callingCell){
        super(callingCell, COUNT_REMAINING);
    }

    @Override public void executeOperation(){
        callingCell.countRemaining();
    }
}