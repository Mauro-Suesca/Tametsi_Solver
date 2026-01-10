package cellLogic.simulation.cells;

public class MarkAsEmptyCommand extends MarkCommand{
    public MarkAsEmptyCommand(SimulatedUnrevealedCell cellToMark){
        super(cellToMark);
    }

    @Override public void undo(){
        this.cellToMark.unMark();
        this.cellToMark.restoreAdjacencies(false);
    }
}