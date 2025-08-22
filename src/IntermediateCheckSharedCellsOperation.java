public class IntermediateCheckSharedCellsOperation extends LogicalOperation{
    IntermediateCheckSharedCellsOperation(EmptyCell callingCell){
        super(callingCell, INTERMEDIATE_CHECK_SHARED_CELLS);
    }

    @Override public void executeOperation(){
        callingCell.intermediateCheckSharedCells();
    }
}