import java.util.ArrayDeque;
import java.util.Scanner;

public abstract class Board implements CellObserver{
    protected Cell[][] cellsInBoard;
    protected ExternalCounter totalMineCounter;
    protected ArrayDeque<EmptyCell> cellsToProcess;
    protected int totalRows;
    protected int totalColumns;
    protected int currentRow;
    protected int currentColumn;
    protected Scanner waitForUserInput;

    Board(int numberOfMinesInBoard, int columns, int rows){
        this.totalMineCounter = new ExternalCounter(numberOfMinesInBoard);
        this.totalRows = rows;
        this.totalColumns = columns;
        this.cellsInBoard = new Cell[columns][rows];
        this.cellsToProcess = new ArrayDeque<>();
        this.waitForUserInput = new Scanner(System.in);
        resetCurrentRowAndColumn();
    }

    public void addCell(Cell newCell){
        if(++currentColumn == totalColumns){
            currentColumn = 0;
            currentRow++;
        }

        if(cellsInBoard[currentRow][currentColumn] == null){
            cellsInBoard[currentRow][currentColumn] = newCell;
        }
    }

    public void resetCurrentRowAndColumn(){
        currentRow = 0;
        currentColumn = -1;
    }

    public void addCellToProcess(EmptyCell cellToAdd){
        cellsToProcess.add(cellToAdd);
    }

    protected void setFirstStep(EmptyCell firstCellToProcess){
        if(cellsToProcess.size() == 0){
            cellsToProcess.add(firstCellToProcess);
        }
    }

    protected void executeNextProcess(){
        if(!cellsToProcess.isEmpty()){
            cellsToProcess.remove().executeLogicalSequence();
            executeNextProcess();
        }
    }

    @Override public void reactToCellReveal(Cell revealedCell){
        render();
    }

    @Override public void reactToCellMarked(Cell markedCell){
        render();
    }

    protected abstract void render();

    public void start(EmptyCell firstStep){
        setFirstStep(firstStep);
        autoAdjacencySetter();
        render();
        executeNextProcess();
    }

    protected abstract void autoAdjacencySetter();

    protected void cellAndBoardToCellAdjacency(){
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

    protected void addIfValidPosition(Cell currentCell, int row, int column){
        if(row < 0 || row >= totalRows){
            return;
        }
        if(column < 0 || column >= totalColumns){
            return;
        }

        currentCell.addAdjacent(cellsInBoard[row][column]);
    }

    protected void clearScreen(){
        for(int i=0; i<2; i++){
            System.out.print("\u001B[3J\u001B[2J\u001B[H\u001B[0m"); //ANSI Code for clearing the screen
        }
        
        System.out.flush();
    }
}