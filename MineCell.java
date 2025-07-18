import java.util.ArrayList;

public class MineCell extends Cell{
    MineCell(){
        remainingAdjacentCells = new ArrayList<>();
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

    @Override public SimulatedUnrevealedCell simulateCell(SimulatedBoard board){
        return SimulatedUnrevealedCell.createSimulatedCell(board, this, markedAsMine);
    }
}