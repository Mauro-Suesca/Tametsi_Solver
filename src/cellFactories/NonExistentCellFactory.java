package cellFactories;

import java.util.ArrayList;

import cellLogic.NonExistentCell;

public class NonExistentCellFactory extends ExternalCounterFactory{
    public NonExistentCellFactory(){
        super();
        this.unknown = true;
    }

    @Override public ArrayList<NonExistentCell> build(int amount){
        ArrayList<NonExistentCell> builtCells = new ArrayList<>(amount);

        for(int i=0; i<amount; i++){
            builtCells.add(new NonExistentCell());
        }

        return builtCells;
    }

    @Override public void addToBoard(int amount){
        for(int i=0; i<amount; i++){
            board.addCell(new NonExistentCell());
        }
    }
}