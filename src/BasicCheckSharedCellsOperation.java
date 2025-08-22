public class BasicCheckSharedCellsOperation extends LogicalOperation{
    BasicCheckSharedCellsOperation(EmptyCell callingCell){
        super(callingCell, BASIC_CHECK_SHARED_CELLS);
    }

    @Override public void executeOperation(){
        callingCell.basicCheckSharedCells();
    }
}