package cellLogic.simulation.cells;

import java.util.ArrayDeque;
import java.util.ArrayList;

import cellLogic.Cell;
import cellLogic.simulation.operations.SimulatedOperation;

public class SimulatedBoard{
    private ArrayDeque<SimulatedOperation> operationsToProcess;
    private ArrayList<SimulatedCell> alreadyExistingCells;
    private boolean needsToUseDoubleHypothesis;

    public SimulatedBoard(boolean needsToUseDoubleHypothesis){
        this.operationsToProcess = new ArrayDeque<>();
        this.alreadyExistingCells = new ArrayList<>();
        this.needsToUseDoubleHypothesis = needsToUseDoubleHypothesis;
    }

    protected boolean getNeedsToUseDoubleHypothesis(){
        return needsToUseDoubleHypothesis;
    }

    public boolean checkIfCellExistsInBoard(Cell originalCell){
        boolean result = false;

        for(int i=0; i<alreadyExistingCells.size(); i++){
            if(alreadyExistingCells.get(i).isSameOriginalCell(originalCell)){
                result = true;
                break;
            }
        }

        return result;
    }

    public SimulatedCell getAlreadyExistingSimulatedCell(SimulatedCell cellToRetrieve){
        SimulatedCell resultingSimulatedCell;

        if(alreadyExistingCells.contains(cellToRetrieve)){
            resultingSimulatedCell = alreadyExistingCells.get(alreadyExistingCells.indexOf(cellToRetrieve));
        }else{
            resultingSimulatedCell = cellToRetrieve;
            alreadyExistingCells.add(cellToRetrieve);
        }
        return resultingSimulatedCell;
    }

    public void addOperationToProcess(SimulatedOperation operationToAdd){
        operationsToProcess.add(operationToAdd);
    }

    public boolean checkIfHypothesisIsPossible(SimulatedUnrevealedCell testCell, boolean hypothesizedCellHasMine){
        if(hypothesizedCellHasMine){
            if(!testCell.markAsMine()){
                return false;
            }
        }else{
            if(!testCell.markAsEmpty()){
                return false;
            }
        }

        return checkIfNextProcessIsPossible();
    }

    public boolean checkIfNextProcessIsPossible(){
        if(!operationsToProcess.isEmpty()){
            return operationsToProcess.remove().executeOperation() && checkIfNextProcessIsPossible();
        }else{
            return true;
        }
    }
}