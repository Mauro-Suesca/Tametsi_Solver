package cellLogic;

public class StartOperation extends LogicalOperation{
    public StartOperation(EmptyCell callingCell){
        super(callingCell, START);
    }

    @Override public void executeOperation(){
        callingCell.startLogicalSequence();
    }
}