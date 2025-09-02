package cellLogic;

public class CellExtension extends Cell{
    private Cell originCell;
    private int horizontalPosition;
    private int verticalPosition;

    CellExtension(Cell originCell, int horizontalPosition, int verticalPosition){
        this.horizontalPosition = horizontalPosition;
        this.verticalPosition = verticalPosition;
        this.originCell = originCell;
        this.colorANSI = originCell.getColorANSI();
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
        String result = colorANSI;

        if(horizontalPosition == verticalPosition){
            result += "┘ ";
        }else if(horizontalPosition == 0){
            result += "└ ";
        }else if(verticalPosition == 0){
            result += "┐ ";
        }else if(horizontalPosition > verticalPosition){
            result += "│ ";
        }else{
            result += "─ ";
        }

        return result;
    }
}