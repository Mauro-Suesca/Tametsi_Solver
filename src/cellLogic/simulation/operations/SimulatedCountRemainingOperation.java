package cellLogic.simulation.operations;

import cellLogic.simulation.cells.SimulatedRevealedCell;

public class SimulatedCountRemainingOperation extends SimulatedOperation{
    public SimulatedCountRemainingOperation(SimulatedRevealedCell callingCell){
        super(callingCell, START);
    }

    @Override public boolean executeOperation(){
        callingCell.countRemaining();
        return true;
    }
}