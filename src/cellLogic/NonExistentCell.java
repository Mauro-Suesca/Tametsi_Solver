package cellLogic;

public class NonExistentCell extends ExternalCounter implements DifferentlyAdjacentCell{
    public NonExistentCell(){
        super(0);
        this.unknown = true;
        this.needsToCountAdjacentMines = false;
    }

    @Override public void addAdjacent(Cell otherCell){
        //Purposefully left empty because NonExistentCells aren't supposed to be adjacent to any other Cell
    }

    @Override public String toString(){
        return "  ";
    }
}