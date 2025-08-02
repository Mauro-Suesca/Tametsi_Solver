//Acts like Subscriber in Observer design pattern
public interface CellObserver{
    public void reactToCellReveal(Cell revealedCell);
    public void reactToCellMarked(Cell markedCell);
}