public class Board implements CellObserver{
    private Cell[][] cellsInBoard;
    private int columns, files;

    @Override public void reactToCellReveal(Cell revealedCell){
        render();
    }

    @Override public void reactToCellMarked(Cell markedCell){
        render();
    }

    private void render(){
        //TODO Maybe delete the previous board before showing the new one?
        for(int i=0; i<columns; i++){
            for(int j=0; j<files; j++){
                System.out.print(cellsInBoard[i][j]);
            }
            System.out.println();
        }
        //TODO Ask for user input before continuing
    }
}