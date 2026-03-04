package cellLogic.logicalOperations;

import cellLogic.EmptyCell;

public class ExtensiveProofByContradictionOperation extends LogicalOperation{
    public ExtensiveProofByContradictionOperation(EmptyCell callingCell){
        super(callingCell, EXTENSIVE_PROOF_BY_CONTRADICTION);
    }

    @Override public void executeOperation(){
        callingCell.extensiveProofByContradiction();
    }
}