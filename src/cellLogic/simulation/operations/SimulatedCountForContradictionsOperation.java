package cellLogic.simulation.operations;

import cellLogic.simulation.cells.SimulatedRevealedCell;

public class SimulatedCountForContradictionsOperation extends SimulatedOperation{
    public SimulatedCountForContradictionsOperation(SimulatedRevealedCell callingCell){
        super(callingCell, START);
    }

    @Override public boolean executeOperation(){
        return !callingCell.countAndCheckIfThereAreContradictions();
    }
}