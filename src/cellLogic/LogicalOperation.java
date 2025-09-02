package cellLogic;

public abstract class LogicalOperation implements Comparable<LogicalOperation>{
    protected static final int START = 0;
    protected static final int COUNT_REMAINING = 1;
    protected static final int BASIC_CHECK_SHARED_CELLS = 2;
    protected static final int PROOF_BY_CONTRADICTION = 3;
    protected static final int INTERMEDIATE_CHECK_SHARED_CELLS = 4;
    protected static final int PROOF_BY_CASES = 5;
    protected EmptyCell callingCell;
    protected int type;

    LogicalOperation(EmptyCell callingCell, int type){
        this.callingCell = callingCell;
        this.type = type;
    }

    public abstract void executeOperation();
    
    @Override public int compareTo(LogicalOperation otherOperation){
        if(this.type < otherOperation.type){
            return -1;
        }else if(this.type == otherOperation.type){
            return 0;
        }else{
            return 1;
        }
    }

    @Override public boolean equals(Object otherObject){
        if(!(otherObject instanceof LogicalOperation)){
            return false;
        }

        LogicalOperation otherOperation = (LogicalOperation)otherObject;

        return this.type == otherOperation.type && this.callingCell == otherOperation.callingCell;
    }
}