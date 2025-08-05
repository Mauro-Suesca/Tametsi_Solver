public class BoardWithLines extends Board{
    private ExternalCounter[] verticalLines;
    private ExternalCounter[] horizontalLines;

    BoardWithLines(int numberOfMinesInBoard, int columns, int rows){
        super(numberOfMinesInBoard, columns, rows);
        this.verticalLines = new ExternalCounter[columns];
        this.horizontalLines = new ExternalCounter[rows];
    }

    public void addVerticalLine(ExternalCounter newLine){
        verticalLines[++currentColumn] = newLine;
    }

    public void addHorizontalLine(ExternalCounter newLine){
        horizontalLines[currentRow++] = newLine;
    }

    @Override protected void render(){
        clearScreen();

        System.out.println("Minas faltantes en el tablero: " + totalMineCounter + "\n");

        System.out.print("  ");
        for(ExternalCounter line : verticalLines){
            System.out.print(line);
        }
        System.out.println();

        for(int row = 0; row < cellsInBoard.length; row++){
            System.out.print(horizontalLines[row]);
            for(int column = 0; column < cellsInBoard[row].length; column++){
                System.out.print(cellsInBoard[row][column]);
            }
            System.out.println();
        }

        if (totalMineCounter.getRemainingNumberOfAdjacencies() == 0){
            System.out.println("\n¡Felicitaciones, se completó el nivel!");
            System.out.print("\nPresiona 'ENTER' para terminar");
            waitForUserInput.nextLine();

            clearScreen();
            waitForUserInput.close();
            return;
        }

        System.out.print("\nPresiona 'ENTER' para continuar");
        waitForUserInput.nextLine();
    }

    /**
     * Only works for Tametsi level 9, could be useful to check other ways for other levels
     */
    @Override protected void autoAdjacencySetter(){
        cellAndBoardToCellAdjacency();

        // Cell and Board to Line adjacency
        for(int row = 0; row < cellsInBoard.length; row++){
            for(int column = 0; column < cellsInBoard[row].length; column++){
                verticalLines[column].addAdjacent(cellsInBoard[row][column]);
                horizontalLines[row].addAdjacent(cellsInBoard[row][column]);

                verticalLines[column].addBoard(this);
            }

            horizontalLines[row].addBoard(this);
        }

        // Total mine counter to Board adjacency
        totalMineCounter.addBoard(this);
    }
}