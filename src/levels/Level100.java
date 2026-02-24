package levels;

import cellFactories.CellFactory;
import cellFactories.EmptyCellFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardLineless;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;

public class Level100 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(0, "gray", ESC + "0m");
        ColorCounter purple = new ColorCounter(13, "purple", ESC + "35m");
        ColorCounter pink = new ColorCounter(8, "pink", ESC + "38;5;212m");
        ColorCounter blue = new ColorCounter(15, "blue", ESC + "34m");
        ColorCounter cyan = new ColorCounter(11, "cyan", ESC + "36m");

        Board board = new BoardLineless(15, 15, true, gray, purple, pink, blue, cyan);

        CellFactory.setBoard(board);

        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();
    
        MineCellFactory purpleMineFactory = new MineCellFactory(purple);
        MineCellFactory pinkMineFactory = new MineCellFactory(pink);
        MineCellFactory blueMineFactory = new MineCellFactory(blue);
        MineCellFactory cyanMineFactory = new MineCellFactory(cyan);
        
        EmptyCellFactory purpleUnrevealedEmptyFactory = new EmptyCellFactory(purple, false, false);
        EmptyCellFactory pinkUnrevealedEmptyFactory = new EmptyCellFactory(pink, false, false);
        EmptyCellFactory blueUnrevealedEmptyFactory = new EmptyCellFactory(blue, false, false);
        EmptyCellFactory cyanUnrevealedEmptyFactory = new EmptyCellFactory(cyan, false, false);

        EmptyCellFactory purpleUnknownFactory = new EmptyCellFactory(purple, false, true);
        EmptyCellFactory blueUnknownFactory = new EmptyCellFactory(blue, false, true);

        EmptyCellFactory grayUnknownRevealedFactory = new EmptyCellFactory(gray, true, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        board.setAddsCellsHorizontally(false);

        //Column 1
        nonExistentCellFactory.addToBoard(4);
        blueUnrevealedEmptyFactory.addToBoard(2);
        blueUnknownFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(3);
        nonExistentCellFactory.addToBoard(4);

        //Column 2
        nonExistentCellFactory.addToBoard(4);
        blueUnknownFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(4);

        board.setAddsCellsHorizontally(true);

        //Row 1
        nonExistentCellFactory.addToBoard(2);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleUnknownFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(4);

        //Row 2
        nonExistentCellFactory.addToBoard(2);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(5);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(4);

        //Row 3
        nonExistentCellFactory.addToBoard(2);
        purpleMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        pinkMineFactory.addToBoard(3);
        grayRevealedFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(4);

        //Row 4
        nonExistentCellFactory.addToBoard(2);
        purpleMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(4);

        //Row 5
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(3);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(2);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);

        //Row 6
        grayRevealedFactory.addToBoard(4);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(3);
        blueMineFactory.addToBoard(1);

        //Row 7
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(2);
        cyanMineFactory.addToBoard(3);
        pinkMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        
        board.setAddsCellsHorizontally(false);

        //Column 12
        cyanMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        blueUnknownFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(4);

        //Column 13
        cyanMineFactory.addToBoard(3);
        grayRevealedFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(4);

        //Column 14
        grayRevealedFactory.addToBoard(4);
        blueMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(4);

        //Column 15
        blueMineFactory.addToBoard(2);
        blueUnrevealedEmptyFactory.addToBoard(3);
        nonExistentCellFactory.addToBoard(4);

        //Column 3
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(4);

        //Column 4
        nonExistentCellFactory.addToBoard(1);
        board.addCell(new EmptyCell(cyan, false, true));
        grayRevealedFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(4);

        //Column 5
        purpleUnknownFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(2);

        board.setAddsCellsHorizontally(true);

        //Row 14
        purpleMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        purpleMineFactory.addToBoard(1);
        
        //Row 15
        purpleUnrevealedEmptyFactory.addToBoard(2);
        purpleMineFactory.addToBoard(2);
        purpleUnrevealedEmptyFactory.addToBoard(3);

        board.setAddsCellsHorizontally(false);

        //Column 6
        grayUnknownRevealedFactory.addToBoard(3);
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);

        //Column 7
        pinkUnrevealedEmptyFactory.addToBoard(2);
        pinkMineFactory.addToBoard(2);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);

        //Column 8
        nonExistentCellFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);

        //Column 9
        pinkUnrevealedEmptyFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(2);

        //Column 10
        grayRevealedFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);

        //Column 11
        purpleMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);

        return board;
    }

    @Override public String toString(){
        return "100";
    }
}