public class CellExtension extends Cell{
    private int horizontalPosition;
    private int verticalPosition;

    CellExtension(int horizontalPosition, int verticalPosition){
        this.horizontalPosition = horizontalPosition;
        this.verticalPosition = verticalPosition;
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

    @Override public SimulatedCell simulateCell(SimulatedBoard board){
        return null;
    }

    @Override public String toString(){
        if(horizontalPosition == 1){
            return "┐ ";
        }else if(verticalPosition == 1){
            return "└ ";
        }else if(horizontalPosition == verticalPosition){
            return "┘ ";
        }else if(horizontalPosition > verticalPosition){
            return "│ ";
        }else{
            return "─ ";
        }
    }
}