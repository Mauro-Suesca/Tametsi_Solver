package cellLogic;

public class ExternalCounter extends EmptyCell{
    public ExternalCounter(int remainingMines){
        super(remainingMines, true, false);
    }

    @Override public String getColorANSI(){
        return "\u001B[0m";
    }

    @Override public void reveal(){
        return;
    }

    public int getRemainingNumberOfAdjacencies(){
        return remainingAdjacentCells.size();
    }
}