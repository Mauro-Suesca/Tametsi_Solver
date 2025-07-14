public class ExternalCounter extends EmptyCell{
    ExternalCounter(int remainingMines){
        super(remainingMines, true, false);
    }

    @Override public void reveal(){
        return;
    }

    @Override protected void executeLogicalSequence(){
        countRemaining();
        //TODO Copy changes in EmptyCell to here
    }
}