public class ExternalCounter extends EmptyCell{
    ExternalCounter(int remainingMines){
        super(remainingMines, true, false);
    }

    @Override public void reveal(){
        return;
    }

    @Override public void executeLogicalSequence(){
        countRemaining();
        //TODO Copy changes in EmptyCell to here
    }

    public int getRemainingNumberOfAdjacencies(){
        System.out.println("total");
        return remainingAdjacentCells.size();
    }
}