package cellLogic.simulation.operations;

import cellLogic.simulation.cells.SimulatedRevealedCell;

public class SimulatedCheckSharedCellsOperation extends SimulatedOperation{
    public SimulatedCheckSharedCellsOperation(SimulatedRevealedCell callingCell){
        super(callingCell, CHECK_SHARED_CELLS);
    }

    @Override public boolean executeOperation(){
        return callingCell.basicCheckSharedCells();
    }
}