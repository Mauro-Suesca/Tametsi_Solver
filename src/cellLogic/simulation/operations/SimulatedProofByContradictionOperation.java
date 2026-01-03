package cellLogic.simulation.operations;

import cellLogic.simulation.cells.SimulatedRevealedCell;

public class SimulatedProofByContradictionOperation extends SimulatedOperation{
    public SimulatedProofByContradictionOperation(SimulatedRevealedCell callingCell){
        super(callingCell, PROOF_BY_CONTRADICTION);
    }

    @Override public boolean executeOperation(){
        callingCell.proofByContradiction();
        return true;
    }
}