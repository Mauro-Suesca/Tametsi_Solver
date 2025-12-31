package cellLogic.simulation.cells;

import java.util.ArrayList;

import cellLogic.Cell;

public class SimulatedUnrevealedCell extends SimulatedCell{
    private boolean markedAsMine;
    private boolean markedAsEmpty;

    private SimulatedUnrevealedCell(SimulatedBoard board, Cell originalCell, boolean markedAsMine){
        this.board = board;
        this.originalCell = originalCell;
        this.markedAsMine = markedAsMine;
        this.remainingAdjacentCells = new ArrayList<>();
    }

    private SimulatedUnrevealedCell(SimulatedBoard board, SimulatedUnrevealedCell cellToCopy){
        this(board, cellToCopy.originalCell, cellToCopy.markedAsMine);
        this.markedAsEmpty = cellToCopy.markedAsEmpty;
    }

    public static SimulatedUnrevealedCell createSimulatedCell(SimulatedBoard board, Cell originalCell, boolean markedAsMine){
        return (SimulatedUnrevealedCell)board.getAlreadyExistingSimulatedCell(new SimulatedUnrevealedCell(board, originalCell, markedAsMine));
    }

    public static SimulatedUnrevealedCell createSimulatedCell(SimulatedBoard board, SimulatedUnrevealedCell originalCell){
        return (SimulatedUnrevealedCell)board.getAlreadyExistingSimulatedCell(new SimulatedUnrevealedCell(board, originalCell));
    }

    public boolean hasBeenMarked(){
        return markedAsEmpty || markedAsMine;
    }

    @Override protected void notifyAdjacentCells(){
        for(int i=0; i<remainingAdjacentCells.size(); i++){
            SimulatedCell adjacentCell = remainingAdjacentCells.get(i);

            this.removeAdjacent(adjacentCell);
            i--;

            if(markedAsEmpty){
                adjacentCell.reactToCellMarkedAsEmpty(this);
            }
            if(markedAsMine){
                adjacentCell.reactToCellMarkedAsMine(this);
            }
        }
    }

    @Override public void reactToCellMarkedAsEmpty(SimulatedCell revealedCell){
        return;
    }

    @Override public void reactToCellMarkedAsMine(SimulatedCell markedCell){
        return;
    }

    @Override public boolean markAsEmpty(){
        if(markedAsMine){
            return false;
        }

        markedAsEmpty = true;
        notifyAdjacentCells();
        return true;
    }

    @Override public boolean markAsMine(){
        if(markedAsEmpty){
            return false;
        }

        markedAsMine = true;
        notifyAdjacentCells();
        return true;
    }

    @Override protected SimulatedUnrevealedCell simulateCell(SimulatedBoard board){
        SimulatedUnrevealedCell resultingSimulatedCell = SimulatedUnrevealedCell.createSimulatedCell(board, this);

        return (SimulatedUnrevealedCell)simulateAdjacentCells(board, resultingSimulatedCell);
    }

    @Override public boolean equals(Object otherObject){
        if(!(otherObject instanceof SimulatedUnrevealedCell)){
            return false;
        }

        SimulatedUnrevealedCell otherCell = (SimulatedUnrevealedCell)otherObject;
        if(otherCell.board.equals(this.board) && otherCell.originalCell == this.originalCell){
            return true;
        }

        return false;
    }
}