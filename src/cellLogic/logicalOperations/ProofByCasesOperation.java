package cellLogic.logicalOperations;

import cellLogic.EmptyCell;

public class ProofByCasesOperation extends LogicalOperation{
    public ProofByCasesOperation(EmptyCell callingCell){
        super(callingCell, PROOF_BY_CASES);
    }

    @Override public void executeOperation(){
        callingCell.proofByCases();
    }
}