package cellLogic;

public class ProofByCasesOperation extends LogicalOperation{
    ProofByCasesOperation(EmptyCell callingCell){
        super(callingCell, PROOF_BY_CASES);
    }

    @Override public void executeOperation(){
        callingCell.proofByCases();
    }
}