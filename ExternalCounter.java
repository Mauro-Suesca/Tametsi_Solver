public class ExternalCounter extends EmptyCell{
    ExternalCounter(int remainingMines){
        super(remainingMines, true, false);
    }

    @Override public void reveal(){
        return;
    }

    @Override public void executeLogicalSequence(){
        countRemaining();
        checkHypothesesForContradictions();
        proofByCases();
    }

    public int getRemainingNumberOfAdjacencies(){
        return remainingAdjacentCells.size();
    }
}