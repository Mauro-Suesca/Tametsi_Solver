package cellLogic.logicalOperations;

import cellLogic.EmptyCell;

public class ProofByDoubleHypothesisOperation extends LogicalOperation{
    public ProofByDoubleHypothesisOperation(EmptyCell callingCell){
        super(callingCell, PROOF_BY_DOUBLE_HYPOTHESIS);
    }

    @Override public void executeOperation(){
        callingCell.checkHypothesesForContradictions(true);
    }
}