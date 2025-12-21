package cellFactories;

import java.util.ArrayList;

import cellLogic.NonExistentCell;

public class NonExistentCellFactory extends ExternalCounterFactory{
    public NonExistentCellFactory(){
        super();
        this.unknown = true;
    }

    public ArrayList<NonExistentCell> build(int amount){
        ArrayList<NonExistentCell> builtCells = new ArrayList<>(amount);

        for(int i=0; i<amount; i++){
            if(color != null){
                builtCells.add(new NonExistentCell());
            }else{
                builtCells.add(new NonExistentCell());
            }
        }

        return builtCells;
    }
}