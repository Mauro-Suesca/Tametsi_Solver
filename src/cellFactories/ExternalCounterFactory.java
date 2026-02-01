package cellFactories;

import java.util.ArrayList;

import cellLogic.ExternalCounter;

public class ExternalCounterFactory extends EmptyCellFactory{
    public ExternalCounterFactory(){
        super(true, false);
    }

    @Override public ArrayList<? extends ExternalCounter> build(int amount){
        ArrayList<ExternalCounter> builtCells = new ArrayList<>(amount);

        for(int i=0; i<amount; i++){
            builtCells.add(new ExternalCounter());
        }

        return builtCells;
    }

    @Override public void addToBoard(int amount){
        for(int i=0; i<amount; i++){
            board.addCell(new ExternalCounter());
        }
    }
}