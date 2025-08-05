public class BoardLineless extends Board{
    BoardLineless(int numberOfMinesInBoard, int columns, int rows){
        super(numberOfMinesInBoard, columns, rows);
    }

    @Override protected void render(){
        clearScreen();

        System.out.println("Remaining mines in board: " + totalMineCounter + "\n");

        for(int row = 0; row < cellsInBoard.length; row++){
            for(int column = 0; column < cellsInBoard[row].length; column++){
                System.out.print(cellsInBoard[row][column]);
            }
            System.out.println();
        }

        if(totalMineCounter.getRemainingNumberOfAdjacencies() == 0){
            System.out.println("\nCongratulations, the level has been completed!");
            System.out.print("\nPress 'ENTER' to finish");
            waitForUserInput.nextLine();

            clearScreen();
            waitForUserInput.close();
            return;
        }

        System.out.print("\nPress 'ENTER' to continue");
        waitForUserInput.nextLine();
    }

    /**
     * Only works for Tametsi level 6, could be useful to check other ways for other levels
     */
    @Override protected void autoAdjacencySetter(){
        cellAndBoardToCellAdjacency();

        // Total mine counter to Board adjacency
        totalMineCounter.addBoard(this);
    }
}