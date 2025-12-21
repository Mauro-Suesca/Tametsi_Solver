package cellLogic;

public class NonExistentCell extends ExternalCounter implements DifferentlyAdjacentCell{
    public NonExistentCell(){
        super(0);
        this.unknown = true;
        this.needsToCountAdjacentMines = false;
    }

    @Override public void addAdjacent(Cell otherCell){
        
    }

    @Override public String toString(){
        return "  ";
    }
}