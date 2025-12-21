package cellFactories;

import java.util.List;

import cellLogic.Cell;
import cellLogic.ColorCounter;

public abstract class CellFactory{
    protected int horizontalSize, verticalSize;
    protected boolean revealed;
    protected boolean markedAsMine;
    protected ColorCounter color;

    public void setHorizontalSize(int size){
        this.horizontalSize = size;
    }

    public void setVerticalSize(int size){
        this.verticalSize = size;
    }

    public void setRevealed(boolean revealed){
        this.revealed = revealed;
    }

    public void setMarkedAsMine(boolean markedAsMine){
        this.markedAsMine = markedAsMine;
    }

    public void setColor(ColorCounter color){
        this.color = color;
    }

    public abstract List<? extends Cell> build(int amount);
}