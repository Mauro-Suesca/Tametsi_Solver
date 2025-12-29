package cellLogic.simulation.operations;

import cellLogic.simulation.cells.SimulatedRevealedCell;

public class SimulatedProofByContradictionOperation extends SimulatedOperation{
    public SimulatedProofByContradictionOperation(SimulatedRevealedCell callingCell){
        super(callingCell, START);
    }

    @Override public boolean executeOperation(){
        return callingCell.proofByContradiction();
    }
}