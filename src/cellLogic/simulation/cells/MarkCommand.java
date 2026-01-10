package cellLogic.simulation.cells;

public abstract class MarkCommand{
    protected SimulatedUnrevealedCell cellToMark;

    public MarkCommand(SimulatedUnrevealedCell cellToMark){
        this.cellToMark = cellToMark;
        this.cellToMark.copyAdjacenciesForRestoring();
    }

    public abstract void undo();
}
