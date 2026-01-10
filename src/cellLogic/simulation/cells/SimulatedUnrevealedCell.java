package cellLogic.simulation.cells;

import java.util.ArrayList;

import cellLogic.Cell;

public class SimulatedUnrevealedCell extends SimulatedCell{
    private boolean markedAsMine;
    private boolean markedAsEmpty;
    private ArrayList<SimulatedCell> preHypothesisRemainingAdjacentCells;

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

        if(board.getIsHypothesizing()){
            board.addExecutedCommand(new MarkAsEmptyCommand(this));
        }

        notifyAdjacentCells();
        
        return true;
    }

    @Override public boolean markAsMine(){
        if(markedAsEmpty){
            return false;
        }

        markedAsMine = true;

        if(board.getIsHypothesizing()){
            board.addExecutedCommand(new MarkAsMineCommand(this));
        }

        notifyAdjacentCells();
        return true;
    }

    public void unMark(){
        this.markedAsEmpty = false;
        this.markedAsMine = false;
    }

    public void copyAdjacenciesForRestoring(){
        this.preHypothesisRemainingAdjacentCells = new ArrayList<>(remainingAdjacentCells);
    }

    public void restoreAdjacencies(boolean wasMarkedAsMine){
        this.remainingAdjacentCells = new ArrayList<>();
        for(SimulatedCell adjacentCell : preHypothesisRemainingAdjacentCells){
            this.addAdjacent(adjacentCell);
        }
        
        if(wasMarkedAsMine){
            for(SimulatedCell adjacentCell : remainingAdjacentCells){
                if(adjacentCell instanceof SimulatedRevealedCell){
                    ((SimulatedRevealedCell) adjacentCell).increaseRemainingMines();
                }
            }
        }
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