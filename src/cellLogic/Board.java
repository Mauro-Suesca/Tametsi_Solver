package cellLogic;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

import cellLogic.logicalOperations.LogicalOperation;

public abstract class Board implements CellObserver{
    private static final String DEFAULT_COLOR_ANSI = "\u001B[0m";
    public static final int NO_MAX_DIFFERENCE = -1;
    protected Cell[][] cellsInBoard;
    protected EmptyCell lastActingCell;
    protected ExternalCounter totalMineCounter;
    protected ArrayList<ColorCounter> colorMineCounters;
    protected PriorityQueue<LogicalOperation> operationToProcess;
    protected int totalRows;
    protected int totalColumns;
    protected int currentRow;
    protected int currentColumn;
    protected int maxMineDifferenceForImaginaryCells;
    protected Scanner waitForUserInput;
    protected boolean hasDiagonalAdjacencies;
    protected boolean isTesting;
    protected boolean addsCellsHorizontally;

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
        this.maxMineDifferenceForImaginaryCells = NO_MAX_DIFFERENCE;
        this.isTesting = false;
        this.addsCellsHorizontally = true;
        this.cellsInBoard = new Cell[rows][columns];
        this.operationToProcess = new PriorityQueue<>();
        this.waitForUserInput = new Scanner(System.in);
        resetCurrentRowAndColumn();
    }

    public void setMaxMineDifferenceForImaginaryCells(int maxMineDifferenceForImaginaryCells){
        this.maxMineDifferenceForImaginaryCells = maxMineDifferenceForImaginaryCells;
    }

    public void setAddsCellsHorizontally(boolean addsCellsHorizontally){
        this.addsCellsHorizontally = addsCellsHorizontally;
    }

    public void addCell(List<? extends Cell> newCells){
        for(Cell cell : newCells){
            this.addCell(cell);
        }
    }

    public void addCell(Cell newCell){
        boolean placed = false;

        while(!placed){
            if(cellsInBoard[currentRow][currentColumn] == null){
                newCell.addColor(colorMineCounters.get(0));

                cellsInBoard[currentRow][currentColumn] = newCell;
                newCell.addBoard(this);

                if(newCell.revealed){
                    ((EmptyCell)newCell).addToBoardForProcessing();
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

            advanceAddingPosition();
        }
    }

    private void advanceAddingPosition(){
        if(addsCellsHorizontally){
            if(++currentColumn == totalColumns){
                currentColumn = 0;
                currentRow++;

                if(currentRow >= totalRows){
                    currentRow = 0;
                }
            }
        }else{
            if(++currentRow == totalRows){
                currentRow = 0;
                currentColumn++;
                
                if(currentColumn >= totalColumns){
                    currentColumn = 0;
                }
            }
        }
    }

    public void resetCurrentRowAndColumn(){
        currentRow = 0;
        currentColumn = 0;
    }

    public void addOperationToProcess(LogicalOperation operationToAdd){
        if(!operationToProcess.contains(operationToAdd)){
            operationToProcess.add(operationToAdd);
        }
    }

    public void updateLastActingCell(EmptyCell newLastActingCell){
        if(!(lastActingCell == null)){
            lastActingCell.setIsLastActingCell(false);
        }

        lastActingCell = newLastActingCell;
        newLastActingCell.setIsLastActingCell(true);
    }

    protected void executeNextProcess(){
        while(!operationToProcess.isEmpty()){
            operationToProcess.poll().executeOperation();
        }
    }

    @Override public void reactToCellReveal(Cell revealedCell){
        if(!isTesting){
            render();
        }
    }

    @Override public void reactToCellMarked(Cell markedCell){
        if(!isTesting){
            render();
        }
    }

    protected abstract void render();

    public void start(){
        if(hasDiagonalAdjacencies){
            autoAllAroundAdjacencySetter();
        }else{
            autoSideAdjacencySetter();
        }
        
        render();
        executeNextProcess();
    }

    public boolean startTest(){
        this.isTesting = true;
        waitForUserInput.close();

        if(hasDiagonalAdjacencies){
            autoAllAroundAdjacencySetter();
        }else{
            autoSideAdjacencySetter();
        }
        
        executeNextProcess();

        return totalMineCounter.getRemainingNumberOfAdjacencies() == 0;
    }

    protected abstract void autoAllAroundAdjacencySetter();

    protected void allAroundCellToCellAdjacency(){
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
            }
        }
    }

    protected abstract void autoSideAdjacencySetter();

    protected void sideCellToCellAdjacency(){
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