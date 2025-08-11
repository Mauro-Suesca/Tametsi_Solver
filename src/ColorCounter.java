public class ColorCounter extends ExternalCounter{
    private String color;

    ColorCounter(int remainingMines, String color, String colorANSI){
        super(remainingMines);
        this.color = color;
        this.colorANSI = colorANSI;
    }

    public String getColoredColor(){
        return colorANSI + color + "\u001B[0m";
    }

    public int getRemainingMines(){
        return remainingMines;
    }
}