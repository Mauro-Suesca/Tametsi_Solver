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

        System.out.println("Remaining mines in board: " + totalMineCounter);

        if(colorMineCounters.size() > 1){
            for(ColorCounter colorCounter : colorMineCounters){
                System.out.println("\u001B[0mRemaining " + colorCounter.getColoredColorWord() + " mines in board: " + colorCounter);
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

    @Override protected void autoAllAroundAdjacencySetter(){
        allAroundCellAndBoardToCellAdjacency();

        //ColorCounters to Board adjacency
        for(ColorCounter colorCounter : colorMineCounters){
            colorCounter.addBoard(this);
        }

        //Total mine counter to Board adjacency
        totalMineCounter.addBoard(this);
    }

    @Override protected void autoSideAdjacencySetter(){
        sideCellAndBoardToCellAdjacency();

        //ColorCounters to Board adjacency
        for(ColorCounter colorCounter : colorMineCounters){
            colorCounter.addBoard(this);
        }

        //Total mine counter to Board adjacency
        totalMineCounter.addBoard(this);
    }
}