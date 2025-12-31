package cellLogic;

import cellLogic.simulation.cells.SimulatedBoard;
import cellLogic.simulation.cells.SimulatedUnrevealedCell;

public class MineCell extends Cell{
    public MineCell(){
        super();
        revealed = false;
        markedAsMine = false;
    }

    public MineCell(int horizontalSize, int verticalSize){
        this();
        this.horizontalSize = horizontalSize;
        this.verticalSize = verticalSize;
    }

    public MineCell(ColorCounter color, int horizontalSize, int verticalSize){
        this(horizontalSize, verticalSize);
        this.addColor(color);
    }

    public MineCell(ColorCounter color){
        this(color, 1, 1);
    }

    @Override public void addAdjacent(Cell otherCell){
        if(!remainingAdjacentCells.contains(otherCell)){
            if(otherCell instanceof DifferentlyAdjacentCell){
                otherCell.addAdjacent(this);
            }else{
                remainingAdjacentCells.add(otherCell);
                otherCell.remainingAdjacentCells.add(this);
            }

            if(otherCell instanceof EmptyCell){
                EmptyCell otherEmptyCell = (EmptyCell)otherCell;
                if(otherEmptyCell.needsToCountAdjacentMines){
                    otherEmptyCell.remainingMines++;
                }
            }
        }
    }

    @Override public void reveal() throws GameOver{
        throw new GameOver("Revealed a cell with a mine in it!");
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

        return (SimulatedUnrevealedCell)simulateAdjacentCells(simulatedBoard, resultingSimulatedCell);
    }
}