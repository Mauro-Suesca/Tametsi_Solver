package cellLogic.simulation.cells;

import java.util.ArrayList;

import cellLogic.Cell;
import cellLogic.simulation.operations.*;

public class SimulatedRevealedCell extends SimulatedCell{
    private int remainingMines;
    private boolean unknown;

    private SimulatedRevealedCell(SimulatedBoard board, Cell originalCell, int remainingMines, boolean unknown){
        this.board = board;
        this.originalCell = originalCell;
        this.remainingMines = remainingMines;
        this.unknown = unknown;
        this.remainingAdjacentCells = new ArrayList<>();
    }

    private SimulatedRevealedCell(SimulatedBoard board, SimulatedRevealedCell cellToCopy){
        this(board, cellToCopy.originalCell, cellToCopy.remainingMines, cellToCopy.unknown);
    }

    public static SimulatedRevealedCell createSimulatedCell(SimulatedBoard board, Cell originalCell, int remainingMines, boolean unknown){
        return (SimulatedRevealedCell)board.getAlreadyExistingSimulatedCell(new SimulatedRevealedCell(board, originalCell, remainingMines, unknown));
    }

    public static SimulatedRevealedCell createSimulatedCell(SimulatedBoard board, SimulatedRevealedCell originalCell){
        return (SimulatedRevealedCell)board.getAlreadyExistingSimulatedCell(new SimulatedRevealedCell(board, originalCell));
    }

    public void executeLogicalSequence(){
        if(!unknown){
            board.addOperationToProcess(new SimulatedCountForContradictionsOperation(this));
            board.addOperationToProcess(new SimulatedCountRemainingOperation(this));
        }
    }

    public boolean executeLogicalSequenceForDoubleHypothesis(){
        if(!unknown){
            board.addOperationToProcess(new SimulatedCountForContradictionsOperation(this));
            board.addOperationToProcess(new SimulatedCountRemainingOperation(this));
            board.addOperationToProcess(new SimulatedProofByContradictionOperation(this));
        }
        return true;
    }

    public boolean countAndCheckIfThereAreContradictions(){
        if(remainingMines < 0){
            return true;
        }
        if(remainingMines > remainingAdjacentCells.size()){
            return true;
        }

        return false;
    }

    public void countRemaining(){
        if(remainingMines == 0){
            for(int i=0; i<remainingAdjacentCells.size(); i++){
                remainingAdjacentCells.get(i).markAsEmpty();
                i--;
            }
        }else if(remainingAdjacentCells.size() == remainingMines){
            for(int i=0; i<remainingAdjacentCells.size(); i++){
                remainingAdjacentCells.get(i).markAsMine();
                i--;
            }
        }

        board.addOperationToProcess(new SimulatedCountForContradictionsOperation(this));
    }

    public void proofByContradiction(){
        boolean hypothesisIsHasMine;
        
        if(remainingMines == 0){
            return;
        }else if(remainingMines == 1){
            hypothesisIsHasMine = true;
        }else{
            if(remainingAdjacentCells.size() - remainingMines == 1){
                hypothesisIsHasMine = false;
            }else{
                return;
            }
        }

        for(int i=0; i<remainingAdjacentCells.size(); i++){
            boolean canBeHypothesizedOn = true;

            if(remainingAdjacentCells.get(i) instanceof SimulatedUnrevealedCell){
                SimulatedUnrevealedCell cellToHypothesizeOn = (SimulatedUnrevealedCell)remainingAdjacentCells.get(i);
                canBeHypothesizedOn = !cellToHypothesizeOn.hasBeenMarked();
            }else{
                canBeHypothesizedOn = false;
            }
                
            if(canBeHypothesizedOn){
                SimulatedBoard currentHypothesisSimulation = new SimulatedBoard(false);

                SimulatedUnrevealedCell testCell = (SimulatedUnrevealedCell)remainingAdjacentCells.get(i).simulateCell(currentHypothesisSimulation);

                if(!currentHypothesisSimulation.checkIfHypothesisIsPossible(testCell, hypothesisIsHasMine)){
                    if(hypothesisIsHasMine){
                        remainingAdjacentCells.get(i).markAsEmpty();
                        i--;
                    }else{
                        remainingAdjacentCells.get(i).markAsMine();
                        i--;
                    }
                }
            }
        }

        board.addOperationToProcess(new SimulatedCountForContradictionsOperation(this));
    }

    @Override public void notifyAdjacentCells(){
        return;
    }

    @Override public void reactToCellMarkedAsEmpty(SimulatedCell revealedCell){
        react();
    }

    @Override public void reactToCellMarkedAsMine(SimulatedCell markedCell){
        remainingMines--;
        react();
    }

    private void react(){
        if(board.getNeedsToUseDoubleHypothesis()){
            board.addOperationToProcess(new SimulatedStartDoubleHypothesisOperation(this));
        }else{
            board.addOperationToProcess(new SimulatedStartOperation(this));
        }
    }

    @Override public boolean markAsEmpty(){
        return true;
    }

    @Override public boolean markAsMine(){
        return false;
    }

    @Override protected SimulatedRevealedCell simulateCell(SimulatedBoard board){
        SimulatedRevealedCell resultingSimulatedCell = SimulatedRevealedCell.createSimulatedCell(board, this);

        return (SimulatedRevealedCell)simulateAdjacentCells(board, resultingSimulatedCell);
    }

    @Override public boolean equals(Object otherObject){
        if(!(otherObject instanceof SimulatedRevealedCell)){
            return false;
        }

        SimulatedRevealedCell otherCell = (SimulatedRevealedCell)otherObject;
        if(otherCell.board.equals(this.board) && otherCell.originalCell == this.originalCell){
            return true;
        }

        return false;
    }
}