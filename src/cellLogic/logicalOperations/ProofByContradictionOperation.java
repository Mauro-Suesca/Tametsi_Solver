package cellLogic.logicalOperations;

import cellLogic.EmptyCell;

public class ProofByContradictionOperation extends LogicalOperation{
    public ProofByContradictionOperation(EmptyCell callingCell){
        super(callingCell, PROOF_BY_CONTRADICTION);
    }

    @Override public void executeOperation(){
        callingCell.checkHypothesesForContradictions(false);
    }
}