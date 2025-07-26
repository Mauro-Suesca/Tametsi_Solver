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
    private boolean hasLines;
    private Scanner waitForUserInput;

    Board(int numberOfMinesInBoard, int columns, int rows, boolean hasLines){
        this.hasLines = hasLines;
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

    private void setFirstStep(EmptyCell firstCellToProcess){
        if(cellsToProcess.size() == 0){
            cellsToProcess.add(firstCellToProcess);
        }
    }

    private void executeNextProcess(){
        if(!cellsToProcess.isEmpty()){
            cellsToProcess.remove().executeLogicalSequence();
            executeNextProcess();
        }
    }

    @Override
    public void reactToCellReveal(Cell revealedCell){
        if(hasLines){
            render();
        }else{
            renderLineless();
        }
    }

    @Override
    public void reactToCellMarked(Cell markedCell){
        if(hasLines){
            render();
        }else{
            renderLineless();
        }
    }

    private void render(){
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

    private void renderLineless(){
        clearScreen();

        System.out.println("Minas faltantes en el tablero: " + totalMineCounter + "\n");

        for(int row = 0; row < cellsInBoard.length; row++){
            for(int column = 0; column < cellsInBoard[row].length; column++){
                System.out.print(cellsInBoard[row][column]);
            }
            System.out.println();
        }

        if(totalMineCounter.getRemainingNumberOfAdjacencies() == 0){
            System.out.println("\n¡Felicitaciones, se completó el nivel!");
            System.out.print("\nPresiona 'ENTER' para terminar");
            waitForUserInput.nextLine();

            clearScreen();
            waitForUserInput.close();
            return;
        }

        System.out.print("\nPresiona 'ENTER' para terminar");
        waitForUserInput.nextLine();
    }

    public void start(EmptyCell firstStep){
        setFirstStep(firstStep);
        if(hasLines){
            autoAdjacencySetter();
            render();
        }else{
            autoAdjacencySetterLineless();
            renderLineless();
        }
        executeNextProcess();
    }

    // Only works for Tametsi level 9, could be useful to check other ways for other levels
    private void autoAdjacencySetter(){
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

    // Only works for Tametsi level 6, could be useful to check other ways for other levels
    private void autoAdjacencySetterLineless(){
        cellAndBoardToCellAdjacency();

        // Total mine counter to Board adjacency
        totalMineCounter.addBoard(this);
    }

    private void cellAndBoardToCellAdjacency(){
        for(int row = 0; row < cellsInBoard.length; row++){
            for(int column = 0; column < cellsInBoard[row].length; column++){
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
    }

    private void addIfValidPosition(Cell currentCell, int row, int column){
        if(row < 0 || row >= horizontalLines.length){
            return;
        }
        if(column < 0 || column >= verticalLines.length){
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