public class MineCell extends Cell{
    MineCell(){
        super();
        revealed = false;
        markedAsMine = false;
    }

    MineCell(int horizontalSize, int verticalSize){
        this();
        this.horizontalSize = horizontalSize;
        this.verticalSize = verticalSize;
    }

    MineCell(ColorCounter color, int horizontalSize, int verticalSize){
        this(horizontalSize, verticalSize);
        this.addColor(color);
    }

    MineCell(ColorCounter color){
        this(color, 1, 1);
    }

    @Override public void reveal() throws GameOver{
        throw new GameOver("¡Se reveló una celda con una mina!");
    }

    @Override public void markAsMine(){
        if(!markedAsMine){
            markedAsMine = true;
            notifyAdjacentCells();
        }
    }

    @Override public void reactToCellReveal(Cell revealedCell){
        return;
    }

    @Override public void reactToCellMarked(Cell markedCell){
        return;
    }

    @Override public SimulatedUnrevealedCell simulateCell(SimulatedBoard simulatedBoard){
        SimulatedUnrevealedCell resultingSimulatedCell = SimulatedUnrevealedCell.createSimulatedCell(simulatedBoard, this, markedAsMine);

        for(int i=0; i<remainingAdjacentCells.size(); i++){
            if(!simulatedBoard.checkIfCellExistsInBoard(remainingAdjacentCells.get(i))){
                resultingSimulatedCell.addAdjacent(remainingAdjacentCells.get(i).simulateCell(simulatedBoard));
            }else if(remainingAdjacentCells.get(i).revealed){
                EmptyCell adjacentCell = (EmptyCell) remainingAdjacentCells.get(i);
                resultingSimulatedCell.addAdjacent(SimulatedRevealedCell.createSimulatedCell(simulatedBoard, adjacentCell, adjacentCell.remainingMines, adjacentCell.unknown));
            }else{
                Cell adjacentCell = remainingAdjacentCells.get(i);
                resultingSimulatedCell.addAdjacent(SimulatedUnrevealedCell.createSimulatedCell(simulatedBoard, adjacentCell, adjacentCell.markedAsMine));
            }
        }

        return resultingSimulatedCell;
    }
}