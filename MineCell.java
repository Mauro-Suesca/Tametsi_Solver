public class MineCell extends Cell{
    MineCell(){
        revealed = false;
        markedAsMine = false;
    }

    public void reveal() throws GameOver{
        throw new GameOver("Revealed a cell with a mine in it!");
    }

    @Override public void reactToCellReveal(Cell revealedCell){
        return;
    }

    @Override public void reactToCellMarked(Cell markedCell){
        return;
    }
}