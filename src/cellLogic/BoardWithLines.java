package cellLogic;

public class BoardWithLines extends Board{
    private ExternalCounter[] verticalLines;
    private ExternalCounter[] horizontalLines;

    public BoardWithLines(int numberOfMinesInBoard, int columns, int rows, boolean hasDiagonalAdjacencies){
        super(numberOfMinesInBoard, columns, rows, hasDiagonalAdjacencies);
        this.verticalLines = new ExternalCounter[columns];
        this.horizontalLines = new ExternalCounter[rows];
    }

    public BoardWithLines(int columns, int rows, boolean hasDiagonalAdjacencies, ColorCounter ... colorMineCounters){
        super(columns, rows, hasDiagonalAdjacencies, colorMineCounters);
        this.verticalLines = new ExternalCounter[columns];
        this.horizontalLines = new ExternalCounter[rows];
    }

    public void addVerticalLine(ExternalCounter newLine){
        verticalLines[currentColumn++] = newLine;
        this.addOperationToProcess(new StartOperation(newLine));
    }

    public void addHorizontalLine(ExternalCounter newLine){
        horizontalLines[currentRow++] = newLine;
        this.addOperationToProcess(new StartOperation(newLine));
    }

    @Override protected void render(){
        clearScreen();

        System.out.println("Remaining mines in board: " + totalMineCounter);

        if(colorMineCounters.size() > 1){
            for(ColorCounter colorCounter : colorMineCounters){
                System.out.println("\u001B[0mRemaining " + colorCounter.getColoredColor() + " mines in board: " + colorCounter);
            }
        }

        System.out.println();

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

        if(totalMineCounter.getRemainingNumberOfAdjacencies() == 0){
            System.out.println("\u001B[0m\nCongratulations, the level has been completed!");
            System.out.print("\nPress 'ENTER' to finish");
            waitForUserInput.nextLine();

            clearScreen();
            waitForUserInput.close();
            return;
        }

        System.out.print("\u001B[0m\nPress 'ENTER' to continue");
        waitForUserInput.nextLine();
    }

    /**
     * Only works for Tametsi level 9, could be useful to check other ways for other levels
     */
    @Override protected void autoAllAroundAdjacencySetter(){
        allAroundCellAndBoardToCellAdjacency();

        //Cell and Board to Line adjacency
        for(int row = 0; row < cellsInBoard.length; row++){
            for(int column = 0; column < cellsInBoard[row].length; column++){
                verticalLines[column].addAdjacent(cellsInBoard[row][column]);
                horizontalLines[row].addAdjacent(cellsInBoard[row][column]);

                verticalLines[column].addBoard(this);
            }

            horizontalLines[row].addBoard(this);
        }

        //ColorCounters to Board adjacency
        for(ColorCounter colorCounter : colorMineCounters){
            colorCounter.addBoard(this);
        }

        //Total mine counter to Board adjacency
        totalMineCounter.addBoard(this);
    }

    @Override protected void autoSideAdjacencySetter(){
        sideCellAndBoardToCellAdjacency();

        //Cell and Board to Line adjacency
        for(int row = 0; row < cellsInBoard.length; row++){
            for(int column = 0; column < cellsInBoard[row].length; column++){
                verticalLines[column].addAdjacent(cellsInBoard[row][column]);
                horizontalLines[row].addAdjacent(cellsInBoard[row][column]);

                verticalLines[column].addBoard(this);
            }

            horizontalLines[row].addBoard(this);
        }

        //ColorCounters to Board adjacency
        for(ColorCounter colorCounter : colorMineCounters){
            colorCounter.addBoard(this);
        }

        //Total mine counter to Board adjacency
        totalMineCounter.addBoard(this);
    }
}