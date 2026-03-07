package levels;

import cellFactories.CellFactory;
import cellFactories.EmptyCellFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardLineless;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;

public class Level158 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(0, "gray", ESC + "0m");
        ColorCounter cyan = new ColorCounter(18, "cyan", ESC + "36m");
        ColorCounter blue = new ColorCounter(21, "blue", ESC + "34m");
        ColorCounter pink = new ColorCounter(17, "pink", ESC + "38;5;212m");
        ColorCounter purple = new ColorCounter(21, "purple", ESC + "35m");

        Board board = new BoardLineless(19, 19, true, gray, cyan, blue, pink, purple);

        board.setMaxMineDifferenceForImaginaryCells(5);

        CellFactory.setBoard(board);

        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();
    
        MineCellFactory cyanMineFactory = new MineCellFactory(cyan);
        MineCellFactory blueMineFactory = new MineCellFactory(blue);
        MineCellFactory pinkMineFactory = new MineCellFactory(pink);
        MineCellFactory purpleMineFactory = new MineCellFactory(purple);
        
        EmptyCellFactory cyanUnrevealedEmptyFactory = new EmptyCellFactory(cyan, false, false);
        EmptyCellFactory blueUnrevealedEmptyFactory = new EmptyCellFactory(blue, false, false);
        EmptyCellFactory pinkUnrevealedEmptyFactory = new EmptyCellFactory(pink, false, false);
        EmptyCellFactory purpleUnrevealedEmptyFactory = new EmptyCellFactory(purple, false, false);

        EmptyCellFactory cyanUnknownFactory = new EmptyCellFactory(cyan, false, true);
        EmptyCellFactory pinkUnknownFactory = new EmptyCellFactory(pink, false, true);
        EmptyCellFactory purpleUnknownFactory = new EmptyCellFactory(purple, false, true);

        EmptyCellFactory grayUnknownRevealedFactory = new EmptyCellFactory(gray, true, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        board.addCellsVertically();

        //Column 1
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(3);
        nonExistentCellFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(5);
        purpleMineFactory.addToBoard(2);
        purpleUnknownFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(3);

        //Column 2
        blueUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(5);
        blueMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(9);
        purpleMineFactory.addToBoard(1);

        //Column 3
        blueUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        pinkMineFactory.addToBoard(2);
        pinkUnrevealedEmptyFactory.addToBoard(4);
        pinkMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);

        board.skipLines(13);

        //Column 17
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        cyanUnknownFactory.addToBoard(1);
        cyanMineFactory.addToBoard(2);
        grayRevealedFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);

        //Column 18
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(9);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(5);
        blueMineFactory.addToBoard(1);

        //Column 19
        pinkUnrevealedEmptyFactory.addToBoard(4);
        pinkMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(2);
        pinkUnknownFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(2);
        nonExistentCellFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(2);
        blueUnrevealedEmptyFactory.addToBoard(3);

        board.addCellsHorizontally();

        //Row 1
        blueMineFactory.addToBoard(2);
        blueUnrevealedEmptyFactory.addToBoard(2);
        nonExistentCellFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(2);
        pinkMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(2);
        pinkMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        pinkUnknownFactory.addToBoard(1);

        //Row 2
        grayRevealedFactory.addToBoard(3);
        blueMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(6);
        grayUnknownRevealedFactory.addToBoard(1);

        //Row 3
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(3);
        purpleMineFactory.addToBoard(2);

        //Row 4
        nonExistentCellFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(5);

        //Row 5
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(2);
        nonExistentCellFactory.addToBoard(1);

        //Row 6
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(3);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);

        //Row 7
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);

        //Row 8
        nonExistentCellFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        cyanUnknownFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);

        //Row 9
        purpleUnrevealedEmptyFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        purpleMineFactory.addToBoard(2);
        blueUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);

        //Row 10
        grayRevealedFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(5);
        blueUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);

        //Row 11
        pinkUnrevealedEmptyFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        pinkMineFactory.addToBoard(2);
        pinkUnrevealedEmptyFactory.addToBoard(2);
        blueMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);

        board.skipLines(3);

        //Row 14
        nonExistentCellFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(3);
        pinkMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(5);

        board.skipLines(4);

        //Row 18
        grayRevealedFactory.addToBoard(7);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        board.addCell(new EmptyCell(blue, false, true));
        grayRevealedFactory.addToBoard(3);

        //Row 19
        purpleMineFactory.addToBoard(2);
        purpleUnknownFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        nonExistentCellFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(3);

        board.addCellsVertically();

        //Column 4
        nonExistentCellFactory.addToBoard(4);
        pinkUnrevealedEmptyFactory.addToBoard(1);

        //Column 5
        cyanUnrevealedEmptyFactory.addToBoard(2);
        cyanMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);

        //Column 6
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);

        //Column 7
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);

        //Column 8
        nonExistentCellFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);

        //Column 9
        pinkUnrevealedEmptyFactory.addToBoard(4);
        pinkMineFactory.addToBoard(1);

        //Column 10
        grayRevealedFactory.addToBoard(4);
        grayUnknownRevealedFactory.addToBoard(1);

        //Column 11
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);

        //Column 12
        nonExistentCellFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(2);

        //Column 13
        blueUnrevealedEmptyFactory.addToBoard(2);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(2);

        //Column 14
        grayRevealedFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);

        //Column 15
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);

        //Column 16
        nonExistentCellFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);

        return board;
    }

    @Override public String toString(){
        return "158";
    }
}