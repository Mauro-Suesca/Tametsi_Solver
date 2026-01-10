package cellLogic.simulation.cells;

public class MarkAsMineCommand extends MarkCommand{
    public MarkAsMineCommand(SimulatedUnrevealedCell cellToMark){
        super(cellToMark);
    }

    @Override public void undo(){
        this.cellToMark.unMark();
        this.cellToMark.restoreAdjacencies(true);
    }
}