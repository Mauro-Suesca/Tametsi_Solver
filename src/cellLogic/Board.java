package cellLogic;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public abstract class Board implements CellObserver{
    private static String DEFAULT_COLOR_ANSI = "\u001B[0m";
    protected Cell[][] cellsInBoard;
    protected ExternalCounter totalMineCounter;
    protected ArrayList<ColorCounter> colorMineCounters;
    protected PriorityQueue<LogicalOperation> operationToProcess;
    protected ArrayList<ImaginaryCell> existingImaginaryCells;
    protected int totalRows;
    protected int totalColumns;
    protected int currentRow;
    protected int currentColumn;
    protected Scanner waitForUserInput;
    protected boolean hasDiagonalAdjacencies;

    public Board(int numberOfMinesInBoard, int columns, int rows, boolean hasDiagonalAdjacencies){
        this(columns, rows, hasDiagonalAdjacencies, new ColorCounter(numberOfMinesInBoard, "grises", DEFAULT_COLOR_ANSI));
    }

    public Board(int columns, int rows, boolean hasDiagonalAdjacencies, ColorCounter ... colorMineCounters){
        this(columns, rows, hasDiagonalAdjacencies);

        int totalNumberOfMines = 0;
        for(ColorCounter colorCounter : colorMineCounters){
            this.colorMineCounters.add(colorCounter);
            totalNumberOfMines += colorCounter.getRemainingMines();
        }
        
        this.totalMineCounter = new ExternalCounter(totalNumberOfMines);
    }

    private Board(int columns, int rows, boolean hasDiagonalAdjacencies){
        this.colorMineCounters = new ArrayList<>();
        this.totalRows = rows;
        this.totalColumns = columns;
        this.hasDiagonalAdjacencies = hasDiagonalAdjacencies;
        this.cellsInBoard = new Cell[columns][rows];
        this.operationToProcess = new PriorityQueue<>();
        this.existingImaginaryCells = new ArrayList<>();
        this.waitForUserInput = new Scanner(System.in);
        resetCurrentRowAndColumn();
    }

    public void addCell(Cell newCell){
        boolean placed = false;

        while(!placed){
            if(cellsInBoard[currentRow][currentColumn] == null){
                if(newCell.getColorANSI().equals("")){
                    newCell.addColor(colorMineCounters.get(0));
                }

                cellsInBoard[currentRow][currentColumn] = newCell;

                if(newCell.revealed){
                    this.addOperationToProcess(new StartOperation((EmptyCell)newCell));
                }

                if(newCell.getHorizontalSize() > 1 || newCell.getVerticalSize() > 1){
                    for(int row=0; row < newCell.getVerticalSize(); row++){
                        for(int column=0; column < newCell.getHorizontalSize(); column++){
                            if(row != 0 || column != 0){
                                cellsInBoard[currentRow + row][currentColumn + column] = new CellExtension(newCell, column, row);
                            }
                        }
                    }
                }

                placed = true;
            }
            if(++currentColumn == totalColumns){
                currentColumn = 0;
                currentRow++;
            }
        }
    }

    public void resetCurrentRowAndColumn(){
        currentRow = 0;
        currentColumn = 0;
    }

    public void addImaginaryCell(ImaginaryCell newImaginaryCell){
        if(!this.existingImaginaryCells.contains(newImaginaryCell)){
            newImaginaryCell.addToBoard(this);
            this.existingImaginaryCells.add(newImaginaryCell);
        }
    }

    public void addOperationToProcess(LogicalOperation operationToAdd){
        if(!operationToProcess.contains(operationToAdd)){
            operationToProcess.add(operationToAdd);
        }
    }

    protected void executeNextProcess(){
        if(!operationToProcess.isEmpty()){
            operationToProcess.poll().executeOperation();
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

    public void start(){
        if(hasDiagonalAdjacencies){
            autoAllAroundAdjacencySetter();
        }else{
            autoSideAdjacencySetter();
        }

        for(ColorCounter color : colorMineCounters){
            this.addOperationToProcess(new StartOperation(color));
        }
        
        render();
        executeNextProcess();
    }

    protected abstract void autoAllAroundAdjacencySetter();

    protected void allAroundCellAndBoardToCellAdjacency(){
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

    protected abstract void autoSideAdjacencySetter();

    protected void sideCellAndBoardToCellAdjacency(){
        for(int row = 0; row < cellsInBoard.length; row++){
            for(int column = 0; column < cellsInBoard[row].length; column++){
                Cell currentCell = cellsInBoard[row][column];

                for(int adjacentRow=row-1; adjacentRow<row+currentCell.getVerticalSize()+1; adjacentRow+=currentCell.getVerticalSize()+1){
                    for(int adjacentColumn=column; adjacentColumn<column+currentCell.getHorizontalSize(); adjacentColumn++){
                        addIfValidPosition(currentCell, adjacentRow, adjacentColumn);
                    }
                }

                for(int adjacentColumn=column-1; adjacentColumn<column+currentCell.getHorizontalSize()+1; adjacentColumn+=currentCell.getHorizontalSize()+1){
                    for(int adjacentRow=row; adjacentRow<row+currentCell.getVerticalSize(); adjacentRow++){
                        addIfValidPosition(currentCell, adjacentRow, adjacentColumn);
                    }
                }

                if(!(currentCell instanceof CellExtension)){
                    totalMineCounter.addAdjacent(currentCell);
                    currentCell.addBoard(this);
                }
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