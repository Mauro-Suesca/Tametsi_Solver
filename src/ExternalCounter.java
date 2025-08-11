public class ExternalCounter extends EmptyCell{
    ExternalCounter(int remainingMines){
        super(remainingMines, true, false);
        this.colorANSI = "\u001B[0m";
    }

    @Override public void reveal(){
        return;
    }

    public int getRemainingNumberOfAdjacencies(){
        return remainingAdjacentCells.size();
    }
}