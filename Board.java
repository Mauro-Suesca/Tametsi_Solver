import java.util.ArrayDeque;
import java.util.Scanner;

public class Board implements CellObserver{
    private Cell[][] cellsInBoard;
    private ExternalCounter[] verticalLines;
    private ExternalCounter[] horizontalLines;
    private ExternalCounter totalMineCounter;
    private ArrayDeque<EmptyCell> cellsToProcess;
    private int currentRow;
    private int currentColumn;
    private Scanner waitForUserInput;

    Board(int numberOfMinesInBoard, int columns, int rows){
        this.totalMineCounter = new ExternalCounter(numberOfMinesInBoard);
        this.cellsInBoard = new Cell[columns][rows];
        this.verticalLines = new ExternalCounter[columns];
        this.horizontalLines = new ExternalCounter[rows];
        this.cellsToProcess = new ArrayDeque<>();
        this.waitForUserInput = new Scanner(System.in);
        resetCurrentRowAndColumn();
    }

    public void addCell(Cell newCell){
        cellsInBoard[currentRow][currentColumn] = newCell;

        if (++currentColumn == verticalLines.length){
            currentColumn = 0;
            currentRow++;
        }
    }

    public void addVerticalLine(ExternalCounter newLine){
        verticalLines[currentColumn++] = newLine;
    }

    public void addHorizontalLine(ExternalCounter newLine){
        horizontalLines[currentRow++] = newLine;
    }

    public void resetCurrentRowAndColumn(){
        currentRow = 0;
        currentColumn = 0;
    }

    public void addCellToProcess(EmptyCell cellToAdd){
        cellsToProcess.add(cellToAdd);
    }

    public void setFirstStep(EmptyCell firstCellToProcess){
        if(cellsToProcess.size() == 0){
            cellsToProcess.add(firstCellToProcess);
        }
    }

    public void executeNextProcess(){
        if(!cellsToProcess.isEmpty()){
            cellsToProcess.remove().executeLogicalSequence();
            executeNextProcess();
        }
    }

    @Override
    public void reactToCellReveal(Cell revealedCell){
        render();
    }

    @Override
    public void reactToCellMarked(Cell markedCell){
        render();
    }

    public void render() {
        clearScreen();

        System.out.println("Remaining mines in board: " + totalMineCounter + "\n");

        System.out.print("  ");
        for (ExternalCounter line : verticalLines){
            System.out.print(line);
        }
        System.out.println();

        for (int row = 0; row < cellsInBoard.length; row++){
            System.out.print(horizontalLines[row]);
            for (int column = 0; column < cellsInBoard[row].length; column++) {
                System.out.print(cellsInBoard[row][column]);
            }
            System.out.println();
        }

        if (totalMineCounter.getRemainingNumberOfAdjacencies() == 0){
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

    // Only works for Tametsi level 9, could be useful to check other ways for other levels
    public void autoAdjacencySetter(){
        // Cell and Board to Cell adjacency
        for (int row = 0; row < cellsInBoard.length; row++){
            for (int column = 0; column < cellsInBoard[row].length; column++){
                Cell currentCell = cellsInBoard[row][column];

                addIfValidPosition(currentCell, row - 1, column - 1);
                addIfValidPosition(currentCell, row, column - 1);
                addIfValidPosition(currentCell, row + 1, column - 1);

                addIfValidPosition(currentCell, row - 1, column);
                addIfValidPosition(currentCell, row + 1, column);

                addIfValidPosition(currentCell, row - 1, column + 1);
                addIfValidPosition(currentCell, row, column + 1);
                addIfValidPosition(currentCell, row + 1, column + 1);

                totalMineCounter.addAdjacent(currentCell);
                currentCell.addBoard(this);
            }
        }

        // Cell and Board to Line adjacency
        for (int row = 0; row < cellsInBoard.length; row++){
            for (int column = 0; column < cellsInBoard[row].length; column++){
                verticalLines[column].addAdjacent(cellsInBoard[row][column]);
                horizontalLines[row].addAdjacent(cellsInBoard[row][column]);

                verticalLines[column].addBoard(this);
            }

            horizontalLines[row].addBoard(this);
        }

        // Total mine counter to Board adjacency
        totalMineCounter.addBoard(this);
    }

    private void addIfValidPosition(Cell currentCell, int row, int column){
        if (row < 0 || row >= horizontalLines.length) {
            return;
        }
        if (column < 0 || column >= verticalLines.length) {
            return;
        }

        currentCell.addAdjacent(cellsInBoard[row][column]);
    }

    private void clearScreen(){
        for(int i=0; i<2; i++){
            System.out.print("\u001B[3J\u001B[2J\u001B[H\u001B[0m"); //ANSI Code for clearing the screen
        }
        
        System.out.flush();
    }
}