package cellLogic.simulation.operations;

import cellLogic.simulation.cells.SimulatedRevealedCell;

public class SimulatedStartDoubleHypothesisOperation extends SimulatedOperation{
    public SimulatedStartDoubleHypothesisOperation(SimulatedRevealedCell callingCell){
        super(callingCell, START_WITH_DOUBLE_HYPOTHESIS);
    }

    @Override public boolean executeOperation(){
        callingCell.executeLogicalSequenceForDoubleHypothesis();
        return true;
    }
}