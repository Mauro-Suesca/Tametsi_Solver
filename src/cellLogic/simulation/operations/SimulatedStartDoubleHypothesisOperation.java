package cellLogic.simulation.operations;

import cellLogic.simulation.cells.SimulatedRevealedCell;

public class SimulatedStartDoubleHypothesisOperation extends SimulatedOperation{
    public SimulatedStartDoubleHypothesisOperation(SimulatedRevealedCell callingCell){
        super(callingCell, START);
    }

    @Override public boolean executeOperation(){
        callingCell.executeLogicalSequenceForDoubleHypothesis();
        return true;
    }
}