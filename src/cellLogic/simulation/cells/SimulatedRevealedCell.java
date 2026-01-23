package cellLogic.simulation.cells;

import java.util.ArrayList;

import cellLogic.Cell;
import cellLogic.simulation.operations.*;

public class SimulatedRevealedCell extends SimulatedCell{
    private int remainingMines;

    private SimulatedRevealedCell(SimulatedBoard board, Cell originalCell, int remainingMines){
        this.board = board;
        this.originalCell = originalCell;
        this.remainingMines = remainingMines;
        this.remainingAdjacentCells = new ArrayList<>();
    }

    public static SimulatedRevealedCell createSimulatedCell(SimulatedBoard board, Cell originalCell, int remainingMines){
        return (SimulatedRevealedCell)board.getAlreadyExistingSimulatedCell(new SimulatedRevealedCell(board, originalCell, remainingMines));
    }

    protected void increaseRemainingMines(){
        this.remainingMines++;
    }

    public void executeLogicalSequence(){
        board.addOperationToProcess(new SimulatedCountForContradictionsOperation(this));
        board.addOperationToProcess(new SimulatedCountRemainingOperation(this));
    }

    public void executeLogicalSequenceForDoubleHypothesis(){
        board.addOperationToProcess(new SimulatedCountForContradictionsOperation(this));
        board.addOperationToProcess(new SimulatedCountRemainingOperation(this));
        board.addOperationToProcess(new SimulatedProofByContradictionOperation(this));
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
            board.startHypothesizing();

            //Every cell adjacent to a SimulatedRevealedCell must be an unmarked SimulatedUnrevealedCell, because when they are marked they are removed from adjacencies, and two SimulatedRevealedCell cannot be adjacent
            SimulatedUnrevealedCell testCell = (SimulatedUnrevealedCell)remainingAdjacentCells.get(i);

            if(!board.checkIfHypothesisIsPossible(testCell, hypothesisIsHasMine)){
                board.finishHypothesis();

                if(hypothesisIsHasMine){
                    remainingAdjacentCells.get(i).markAsEmpty();
                }else{
                    remainingAdjacentCells.get(i).markAsMine();
                }
                i--;
            }else{
                board.finishHypothesis();
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
        if(!board.getNeedsToUseDoubleHypothesis() || board.getIsHypothesizing()){
            board.addOperationToProcess(new SimulatedStartOperation(this));
        }else{
            board.addOperationToProcess(new SimulatedStartDoubleHypothesisOperation(this));
        }
    }

    @Override public boolean markAsEmpty(){
        return true;
    }

    @Override public boolean markAsMine(){
        return false;
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