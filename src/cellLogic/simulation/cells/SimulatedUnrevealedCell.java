package cellLogic.simulation.cells;

import java.util.ArrayList;

import cellLogic.Cell;

public class SimulatedUnrevealedCell extends SimulatedCell{
    private boolean markedAsMine;
    private boolean markedAsEmpty;
    private ArrayList<SimulatedCell> preHypothesisRemainingAdjacentCells;

    private SimulatedUnrevealedCell(Cell originalCell, boolean markedAsMine){
        this.originalCell = originalCell;
        this.markedAsMine = markedAsMine;
        this.remainingAdjacentCells = new ArrayList<>();
    }

    public static SimulatedUnrevealedCell createSimulatedCell(Cell originalCell, boolean markedAsMine){
        return (SimulatedUnrevealedCell)board.getAlreadyExistingSimulatedCell(new SimulatedUnrevealedCell(originalCell, markedAsMine));
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

    @Override public boolean equals(Object otherObject){
        if(!(otherObject instanceof SimulatedUnrevealedCell)){
            return false;
        }

        SimulatedUnrevealedCell otherCell = (SimulatedUnrevealedCell)otherObject;

        return otherCell.originalCell == this.originalCell;
    }
}