package cellLogic.simulation.cells;

import java.util.ArrayList;

import cellLogic.Cell;

public abstract class SimulatedCell{
    protected ArrayList<SimulatedCell> remainingAdjacentCells;
    protected SimulatedBoard board;
    protected Cell originalCell;

    public Cell getOriginalCell(){
        return originalCell;
    }

    protected abstract void notifyAdjacentCells();
    
    public void addAdjacent(SimulatedCell otherCell){
        if(!remainingAdjacentCells.contains(otherCell)){
            remainingAdjacentCells.add(otherCell);
            otherCell.remainingAdjacentCells.add(this);
        }
    }

    public void removeAdjacent(SimulatedCell otherCell){
        remainingAdjacentCells.remove(otherCell);
        otherCell.remainingAdjacentCells.remove(this);
    }

    public boolean isSameOriginalCell(Cell possibleOriginalCell){
        return this.originalCell == possibleOriginalCell;
    }

    public abstract void reactToCellMarkedAsEmpty(SimulatedCell emptyCell);

    public abstract void reactToCellMarkedAsMine(SimulatedCell markedCell);

    public abstract boolean markAsEmpty();

    public abstract boolean markAsMine();

    protected abstract SimulatedCell simulateCell(SimulatedBoard board);

    protected SimulatedCell simulateAdjacentCells(SimulatedBoard simulatedBoard, SimulatedCell resultingSimulatedCell){
        for(int i=0; i<remainingAdjacentCells.size(); i++){
            if(!simulatedBoard.checkIfCellExistsInBoard(remainingAdjacentCells.get(i).getOriginalCell())){
                resultingSimulatedCell.addAdjacent(remainingAdjacentCells.get(i).simulateCell(simulatedBoard));
            }else if(remainingAdjacentCells.get(i) instanceof SimulatedRevealedCell){
                SimulatedRevealedCell adjacentCell = (SimulatedRevealedCell) remainingAdjacentCells.get(i);
                resultingSimulatedCell.addAdjacent(SimulatedRevealedCell.createSimulatedCell(simulatedBoard, adjacentCell));
            }else{
                SimulatedUnrevealedCell adjacentCell = (SimulatedUnrevealedCell)remainingAdjacentCells.get(i);
                resultingSimulatedCell.addAdjacent(SimulatedUnrevealedCell.createSimulatedCell(simulatedBoard, adjacentCell));
            }
        }

        return resultingSimulatedCell;
    }

    @Override public abstract boolean equals(Object otherObject);
}