package cellLogic.simulation.cells;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;

import cellLogic.Cell;
import cellLogic.simulation.operations.SimulatedOperation;

public class SimulatedBoard{
    private PriorityQueue<SimulatedOperation> operationsToProcess;
    private PriorityQueue<SimulatedOperation> operationsToProcessWhileHypothesizing;
    private ArrayList<SimulatedCell> alreadyExistingCells;
    private Stack<MarkCommand> commandsExecutedWhileHypothesizing;
    private boolean needsToUseDoubleHypothesis;
    private boolean isHypothesizing;

    public SimulatedBoard(boolean needsToUseDoubleHypothesis){
        this.operationsToProcess = new PriorityQueue<>();
        this.alreadyExistingCells = new ArrayList<>();
        this.needsToUseDoubleHypothesis = needsToUseDoubleHypothesis;
        this.isHypothesizing = false;
    }

    protected boolean getNeedsToUseDoubleHypothesis(){
        return needsToUseDoubleHypothesis;
    }

    protected boolean getIsHypothesizing(){
        return isHypothesizing;
    }

    protected void startHypothesizing(){
        this.isHypothesizing = true;
        this.commandsExecutedWhileHypothesizing = new Stack<>();
        this.operationsToProcessWhileHypothesizing = new PriorityQueue<>();
    }

    protected void finishHypothesis(){
        this.isHypothesizing = false;

        while(!commandsExecutedWhileHypothesizing.isEmpty()){
            commandsExecutedWhileHypothesizing.pop().undo();
        }
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
        if(isHypothesizing){
            if(!operationsToProcessWhileHypothesizing.contains(operationToAdd)){
                operationsToProcessWhileHypothesizing.add(operationToAdd);
            }
        }else{
            if(!operationsToProcess.contains(operationToAdd)){
                operationsToProcess.add(operationToAdd);
            }
        }
    }

    public void addExecutedCommand(MarkCommand commandToAdd){
        commandsExecutedWhileHypothesizing.push(commandToAdd);
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
        PriorityQueue<SimulatedOperation> operations = isHypothesizing ? operationsToProcessWhileHypothesizing : operationsToProcess;
        boolean isPossible = true;

        while(!operations.isEmpty()){
            isPossible = operations.remove().executeOperation();

            if(!isPossible){
                break;
            }
        }

        return isPossible;
    }
}