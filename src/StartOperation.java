public class StartOperation extends LogicalOperation{
    StartOperation(EmptyCell callingCell){
        super(callingCell, START);
    }

    @Override public void executeOperation(){
        callingCell.startLogicalSequence();
    }
}