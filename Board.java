public class Board implements CellObserver{
    private Cell[][] cellsInBoard;
    private ExternalCounter[] verticalLines;
    private ExternalCounter[] horizontalLines;
    private ExternalCounter totalMineCounter;
    private int currentRow;
    private int currentColumn;

    Board(int numberOfMinesInBoard, int columns, int rows){
        this.totalMineCounter = new ExternalCounter(numberOfMinesInBoard);
        this.cellsInBoard = new Cell[columns][rows];
        this.verticalLines = new ExternalCounter[columns];
        this.horizontalLines = new ExternalCounter[rows];
        resetCurrentRowAndColumn();
    }

    public void addCell(Cell newCell){
        cellsInBoard[currentRow][currentColumn] = newCell;

        if(++currentColumn == verticalLines.length){
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

    @Override public void reactToCellReveal(Cell revealedCell){
        render();
    }

    @Override public void reactToCellMarked(Cell markedCell){
        render();
    }

    public void render(){
        //TODO Maybe delete the previous board before showing the new one?
        System.out.print(" ");
        for(ExternalCounter line : verticalLines){
            System.out.print(line);
        }
        System.out.println();

        for(int row=0; row<cellsInBoard.length; row++){
            System.out.print(horizontalLines[row]);
            for(int column=0; column<cellsInBoard[row].length; column++){
                System.out.print(cellsInBoard[row][column]);
            }
            System.out.println();
        }

        if(totalMineCounter.getRemainingNumberOfAdjacencies() == 0){
            System.out.println("\nCongratulations, the level has been completed!");
        }
        //TODO Ask for user input before continuing
    }

    //Only works for Tametsi level 9, could be useful to check other ways for other levels
    public void autoAdjacencySetter(){
        //Cell to Cell adjacency
        for(int row=0; row<6; row++){
            for(int column=0; column<6; column++){
                Cell currentCell = cellsInBoard[row][column];

                addIfValidPosition(currentCell, row-1, column-1);
                addIfValidPosition(currentCell, row, column-1);
                addIfValidPosition(currentCell, row+1, column-1);

                addIfValidPosition(currentCell, row-1, column);
                addIfValidPosition(currentCell, row+1, column);

                addIfValidPosition(currentCell, row-1, column+1);
                addIfValidPosition(currentCell, row, column+1);
                addIfValidPosition(currentCell, row+1, column+1);

                totalMineCounter.addAdjacent(currentCell);
            }
        }

        //Line to Cell adjacency
        for(int row=0; row<cellsInBoard.length; row++){
            for(int column=0; column<cellsInBoard[row].length; column++){
                verticalLines[column].addAdjacent(cellsInBoard[row][column]);
                horizontalLines[row].addAdjacent(cellsInBoard[row][column]);
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
}