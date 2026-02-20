package cellLogic.simulation.operations;

import cellLogic.simulation.cells.SimulatedRevealedCell;

public abstract class SimulatedOperation implements Comparable<SimulatedOperation>{
    protected static final int START = 0;
    protected static final int START_WITH_DOUBLE_HYPOTHESIS = 0;
    protected static final int COUNT_FOR_CONTRADICTION = 1;
    protected static final int COUNT_REMAINING = 2;
    protected static final int CHECK_SHARED_CELLS = 3;
    protected static final int PROOF_BY_CONTRADICTION = 4;
    protected SimulatedRevealedCell callingCell;
    protected int type;

    SimulatedOperation(SimulatedRevealedCell callingCell, int type){
        this.callingCell = callingCell;
        this.type = type;
    }

    public abstract boolean executeOperation();

    @Override public int compareTo(SimulatedOperation otherOperation){
        if(this.type < otherOperation.type){
            return -1;
        }else if(this.type == otherOperation.type){
            return 0;
        }else{
            return 1;
        }
    }

    @Override public boolean equals(Object otherObject){
        if(!(otherObject instanceof SimulatedOperation)){
            return false;
        }

        SimulatedOperation otherOperation = (SimulatedOperation)otherObject;

        return this.type == otherOperation.type && this.callingCell.getOriginalCell() == otherOperation.callingCell.getOriginalCell();
    }
}
