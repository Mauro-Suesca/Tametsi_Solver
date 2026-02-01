package cellLogic;

public class BoardLineless extends Board{
    public BoardLineless(int numberOfMinesInBoard, int columns, int rows, boolean hasDiagonalAdjacencies){
        super(numberOfMinesInBoard, columns, rows, hasDiagonalAdjacencies);
    }

    public BoardLineless(int columns, int rows, boolean hasDiagonalAdjacencies, ColorCounter ... colorMineCounters){
        super(columns, rows, hasDiagonalAdjacencies, colorMineCounters);
    }

    @Override protected void render(){
        clearScreen();

        System.out.println("Minas faltantes en el tablero: " + totalMineCounter + "\n");

        if(colorMineCounters.size() > 1){
            for(ColorCounter colorCounter : colorMineCounters){
                System.out.println("\u001B[0mMinas " + colorCounter.getColoredColorWord() + " faltantes en el tablero: " + colorCounter);
            }
        }

        System.out.println();

        for(int row = 0; row < cellsInBoard.length; row++){
            for(int column = 0; column < cellsInBoard[row].length; column++){
                System.out.print(cellsInBoard[row][column]);
            }
            System.out.println();
        }

        if(totalMineCounter.getRemainingNumberOfAdjacencies() == 0){
            System.out.println("\u001B[0m\n¡Felicitaciones, se completó el nivel!");
            System.out.print("\nPresiona 'ENTER' para terminar");
            waitForUserInput.nextLine();

            clearScreen();
            waitForUserInput.close();
            return;
        }

        System.out.print("\u001B[0m\nPresiona 'ENTER' para terminar");
        waitForUserInput.nextLine();
    }

    @Override protected void autoAllAroundAdjacencySetter(){
        allAroundCellToCellAdjacency();
    }

    @Override protected void autoSideAdjacencySetter(){
        sideCellToCellAdjacency();
    }
}