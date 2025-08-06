public class NonExistentCell extends CellExtension{
    NonExistentCell(){
        super(1, 1);
    }

    @Override public void addAdjacent(Cell otherCell){
        return;
    }

    @Override public String toString(){
        return "  ";
    }
}