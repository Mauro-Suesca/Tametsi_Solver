public class ProofByContradictionOperation extends LogicalOperation{
    ProofByContradictionOperation(EmptyCell callingCell){
        super(callingCell, PROOF_BY_CONTRADICTION);
    }

    @Override public void executeOperation(){
        callingCell.checkHypothesesForContradictions();
    }
}