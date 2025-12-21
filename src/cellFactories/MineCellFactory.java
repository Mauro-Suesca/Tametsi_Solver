package cellFactories;

import java.util.ArrayList;

import cellLogic.ColorCounter;
import cellLogic.MineCell;

public class MineCellFactory extends CellFactory{
    public MineCellFactory(){
        this.color = null;
        this.setRevealed(false);
        this.setMarkedAsMine(false);
        this.setHorizontalSize(1);
        this.setVerticalSize(1);
    }

    public MineCellFactory(int horizontalSize, int verticalSize){
        this();
        this.setHorizontalSize(horizontalSize);
        this.setVerticalSize(verticalSize);
    }

    public MineCellFactory(ColorCounter color, int horizontalSize, int verticalSize){
        this(horizontalSize, verticalSize);
        this.setColor(color);
    }

    public MineCellFactory(ColorCounter color){
        this(color, 1, 1);
    }

    public ArrayList<MineCell> build(int amount){
        ArrayList<MineCell> builtCells = new ArrayList<>(amount);

        for(int i=0; i<amount; i++){
            if(color != null){
                builtCells.add(new MineCell(color, horizontalSize, verticalSize));
            }else{
                builtCells.add(new MineCell(horizontalSize, verticalSize));
            }
        }

        return builtCells;
    }
}