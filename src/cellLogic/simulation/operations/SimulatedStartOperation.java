package cellLogic.simulation.operations;

import cellLogic.simulation.cells.SimulatedRevealedCell;

public class SimulatedStartOperation extends SimulatedOperation{
    public SimulatedStartOperation(SimulatedRevealedCell callingCell){
        super(callingCell, START);
    }

    @Override public boolean executeOperation(){
        callingCell.executeLogicalSequence();
        return true;
    }
}