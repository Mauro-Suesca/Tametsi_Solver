import java.util.ArrayDeque;
import java.util.ArrayList;

public class SimulatedBoard{
    private ArrayDeque<SimulatedRevealedCell> cellsToProcess;
    private ArrayList<SimulatedCell> alreadyExistingCells;

    SimulatedBoard(){
        this.cellsToProcess = new ArrayDeque<>();
        this.alreadyExistingCells = new ArrayList<>();
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

    public void addCellToProcess(SimulatedRevealedCell cellToAdd){
        cellsToProcess.add(cellToAdd);
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
        if(!cellsToProcess.isEmpty()){
            return cellsToProcess.remove().executeLogicalSequence() && checkIfNextProcessIsPossible();
        }else{
            return true;
        }
    }
}