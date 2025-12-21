package cellFactories;

import java.util.ArrayList;

import cellLogic.ColorCounter;
import cellLogic.EmptyCell;

public class EmptyCellFactory extends CellFactory{
    protected boolean unknown;

    public EmptyCellFactory(boolean revealed, boolean unknown){
        this.unknown = unknown;
        this.color = null;
        this.setRevealed(revealed);
        this.setMarkedAsMine(false);
        this.setHorizontalSize(1);
        this.setVerticalSize(1);
    }

    public EmptyCellFactory(boolean revealed, boolean unknown, int horizontalSize, int verticalSize){
        this(revealed, unknown);
        this.setHorizontalSize(horizontalSize);
        this.setVerticalSize(verticalSize);
    }

    public EmptyCellFactory(ColorCounter color, boolean revealed, boolean unknown){
        this(revealed, unknown);
        this.setColor(color);
    }

    public EmptyCellFactory(ColorCounter color, boolean revealed, boolean unknown, int horizontalSize, int verticalSize){
        this(revealed, unknown, horizontalSize, verticalSize);
        this.setColor(color);
    }

    public ArrayList<? extends EmptyCell> build(int amount){
        ArrayList<EmptyCell> builtCells = new ArrayList<>(amount);

        for(int i=0; i<amount; i++){
            if(color != null){
                builtCells.add(new EmptyCell(color, revealed, unknown, horizontalSize, verticalSize));
            }else{
                builtCells.add(new EmptyCell(revealed, unknown, horizontalSize, verticalSize));
            }
        }

        return builtCells;
    }
}