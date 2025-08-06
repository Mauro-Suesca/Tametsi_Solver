public class CellExtension extends Cell{
    private Cell originCell;
    private int horizontalPosition;
    private int verticalPosition;

    CellExtension(int horizontalPosition, int verticalPosition){
        this.horizontalPosition = horizontalPosition;
        this.verticalPosition = verticalPosition;
    }

    CellExtension(Cell originCell, int horizontalPosition, int verticalPosition){
        this(horizontalPosition, verticalPosition);
        this.originCell = originCell;
    }

    @Override public void reveal(){
        return;
    }

    @Override public void markAsMine(){
        return;
    }

    @Override public void reactToCellReveal(Cell revealedCell){
        return;
    }

    @Override public void reactToCellMarked(Cell markedCell){
        return;
    }

    //Acts like "subscribe" from Observer design pattern.
    @Override public void addAdjacent(Cell otherCell){
        if(otherCell != originCell){
            originCell.addAdjacent(otherCell);
        }
    }

    @Override public SimulatedCell simulateCell(SimulatedBoard board){
        return null;
    }

    @Override public String toString(){
        if(horizontalPosition == verticalPosition){
            return "┘ ";
        }else if(horizontalPosition == 0){
            return "└ ";
        }else if(verticalPosition == 0){
            return "┐ ";
        }else if(horizontalPosition > verticalPosition){
            return "│ ";
        }else{
            return "─ ";
        }
    }
}