package cellLogic.simulation.cells;

import java.util.ArrayList;

import cellLogic.Cell;
import cellLogic.simulation.operations.*;

public class SimulatedRevealedCell extends SimulatedCell{
    private int remainingMines;

    private SimulatedRevealedCell(Cell originalCell, int remainingMines){
        this.originalCell = originalCell;
        this.remainingMines = remainingMines;
        this.remainingAdjacentCells = new ArrayList<>();
    }

    public static SimulatedRevealedCell createSimulatedCell(Cell originalCell, int remainingMines){
        return (SimulatedRevealedCell)board.getAlreadyExistingSimulatedCell(new SimulatedRevealedCell(originalCell, remainingMines));
    }

    protected void increaseRemainingMines(){
        this.remainingMines++;
    }

    public void executeLogicalSequence(){
        board.addOperationToProcess(new SimulatedCountForContradictionsOperation(this));
        board.addOperationToProcess(new SimulatedCountRemainingOperation(this));
        board.addOperationToProcess(new SimulatedCheckSharedCellsOperation(this));
    }

    public void executeLogicalSequenceForDoubleHypothesis(){
        board.addOperationToProcess(new SimulatedCountForContradictionsOperation(this));
        board.addOperationToProcess(new SimulatedCountRemainingOperation(this));
        board.addOperationToProcess(new SimulatedCheckSharedCellsOperation(this));
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

    public boolean countRemaining(){
        boolean result = true;

        if(remainingMines == 0){
            for(int i=0; i<remainingAdjacentCells.size(); i++){
                if(remainingAdjacentCells.get(i).markAsEmpty()){
                    i--;
                }else{
                    result = false;
                    break;
                }               
            }
        }else if(remainingAdjacentCells.size() == remainingMines){
            for(int i=0; i<remainingAdjacentCells.size(); i++){
                if(remainingAdjacentCells.get(i).markAsMine()){
                    i--;
                }else{
                    result = false;
                    break;
                }  
            }
        }

        board.addOperationToProcess(new SimulatedCountForContradictionsOperation(this));

        return result;
    }

    public boolean basicCheckSharedCells(){
        for(int i=0; i<remainingAdjacentCells.size(); i++){
            SimulatedCell adjacentCell = remainingAdjacentCells.get(i);
            ArrayList<SimulatedRevealedCell> completelySharingCells = new ArrayList<>();

            for(int j=0; j<adjacentCell.remainingAdjacentCells.size(); j++){
                if(adjacentCell.remainingAdjacentCells.get(j) instanceof SimulatedRevealedCell){
                    SimulatedRevealedCell currentPossibleSharerCell = (SimulatedRevealedCell)adjacentCell.remainingAdjacentCells.get(j);
                    ArrayList<SimulatedCell> currentPossibleSharerCellAdjacencies = currentPossibleSharerCell.remainingAdjacentCells;

                    if(!this.equals(currentPossibleSharerCell) && this.remainingAdjacentCells.containsAll(currentPossibleSharerCellAdjacencies)){
                        completelySharingCells.add(currentPossibleSharerCell);
                    }else if(!this.equals(currentPossibleSharerCell) && currentPossibleSharerCellAdjacencies.containsAll(this.remainingAdjacentCells)){
                        currentPossibleSharerCell.react();
                    }
                }
            }

            for(SimulatedRevealedCell completelySharingCell : completelySharingCells){
                ArrayList<SimulatedCell> cellsOutsideOfSharedAdjacencies = new ArrayList<>(this.remainingAdjacentCells);
                cellsOutsideOfSharedAdjacencies.removeAll(completelySharingCell.remainingAdjacentCells);

                int minesOutsideOfSharedOnes = this.remainingMines - completelySharingCell.remainingMines;
                
                if(minesOutsideOfSharedOnes == 0){
                    for(int j=0; j<cellsOutsideOfSharedAdjacencies.size(); j++){
                        cellsOutsideOfSharedAdjacencies.get(j).markAsEmpty();
                    }
                }else if(minesOutsideOfSharedOnes == cellsOutsideOfSharedAdjacencies.size()){
                    for(int j=0; j<cellsOutsideOfSharedAdjacencies.size(); j++){
                        cellsOutsideOfSharedAdjacencies.get(j).markAsMine();
                    }
                }else if(minesOutsideOfSharedOnes < 0){
                    return false;
                }
            }
        }

        board.addOperationToProcess(new SimulatedCountForContradictionsOperation(this));

        return true;
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

        //During the hypothesis, due to the way adjacencies are restored, the SimulatedCells themselves might change places in the list, so this is created to make sure every cell is hypothesized on
        final ArrayList<SimulatedCell> unchangedOriginalAdjacencies = new ArrayList<>(remainingAdjacentCells);

        for(int i=0; i<unchangedOriginalAdjacencies.size(); i++){
            board.startHypothesizing();

            //Every cell adjacent to a SimulatedRevealedCell must be an unmarked SimulatedUnrevealedCell, because when they are marked they are removed from adjacencies, and two SimulatedRevealedCell cannot be adjacent
            SimulatedUnrevealedCell testCell = (SimulatedUnrevealedCell)unchangedOriginalAdjacencies.get(i);

            if(!board.checkIfHypothesisIsPossible(testCell, hypothesisIsHasMine)){
                board.finishHypothesis();

                if(hypothesisIsHasMine){
                    testCell.markAsEmpty();
                }else{
                    testCell.markAsMine();
                }
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
        
        return otherCell.originalCell == this.originalCell;
    }
}