package cellFactories;

import java.util.ArrayList;

import cellLogic.ExternalCounter;

public class ExternalCounterFactory extends EmptyCellFactory{
    public ExternalCounterFactory(){
        super(true, false);
    }

    public ArrayList<? extends ExternalCounter> build(int amount){
        ArrayList<ExternalCounter> builtCells = new ArrayList<>(amount);

        for(int i=0; i<amount; i++){
            if(color != null){
                builtCells.add(new ExternalCounter());
            }else{
                builtCells.add(new ExternalCounter());
            }
        }

        return builtCells;
    }
}