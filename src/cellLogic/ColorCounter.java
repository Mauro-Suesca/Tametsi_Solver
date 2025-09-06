package cellLogic;

public class ColorCounter extends ExternalCounter{
    private String colorWord;
    private String colorANSI;

    public ColorCounter(int remainingMines, String colorWord, String colorANSI){
        super(remainingMines);
        this.colorWord = colorWord;
        this.colorANSI = colorANSI;
    }

    @Override public String getColorANSI(){
        return colorANSI;
    }

    public String getColoredColorWord(){
        return colorANSI + colorWord + "\u001B[0m";
    }

    public int getRemainingMines(){
        return remainingMines;
    }
}