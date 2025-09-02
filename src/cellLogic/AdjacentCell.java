package cellLogic;

public interface AdjacentCell extends CellObserver{
    public void reveal();
    public void markAsMine();
}
