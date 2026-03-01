package levels;

import cellFactories.CellFactory;
import cellFactories.EmptyCellFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardLineless;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;

public class Level130 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(32, "gray", ESC + "0m");
        ColorCounter purple = new ColorCounter(29, "purple", ESC + "35m");
        ColorCounter pink = new ColorCounter(8, "pink", ESC + "38;5;212m");
        ColorCounter orange = new ColorCounter(18, "orange", ESC + "38;5;214m");

        Board board = new BoardLineless(19, 19, true, gray, purple, pink, orange);

        board.setMaxMineDifferenceForImaginaryCells(10);

        CellFactory.setBoard(board);

        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();
    
        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory purpleMineFactory = new MineCellFactory(purple);
        MineCellFactory pinkMineFactory = new MineCellFactory(pink);
        MineCellFactory orangeMineFactory = new MineCellFactory(orange);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory purpleUnrevealedEmptyFactory = new EmptyCellFactory(purple, false, false);
        EmptyCellFactory pinkUnrevealedEmptyFactory = new EmptyCellFactory(pink, false, false);
        EmptyCellFactory orangeUnrevealedEmptyFactory = new EmptyCellFactory(orange, false, false);

        EmptyCellFactory grayUnknownUnrevealedFactory = new EmptyCellFactory(gray, false, true);

        EmptyCellFactory grayUnknownRevealedFactory = new EmptyCellFactory(gray, true, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        board.addCellsVertically();

        //Column 1
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        nonExistentCellFactory.addToBoard(4);

        //Column 2
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(9);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(4);

        //Column 3
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(5);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        purpleMineFactory.addToBoard(2);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(4);

        //Column 4
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(9);
        purpleMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(4);

        board.addCellsHorizontally();

        //Row 1
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(4);

        //Row 2
        grayRevealedFactory.addToBoard(10);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(4);

        //Row 3
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(2);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(3);
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(4);

        //Row 4
        nonExistentCellFactory.addToBoard(4);
        purpleMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(4);

        //Row 5
        purpleMineFactory.addToBoard(2);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        pinkMineFactory.addToBoard(2);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);

        //Row 6
        board.addCell(new EmptyCell(purple, false, true));
        grayRevealedFactory.addToBoard(6);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(1);

        board.skipLines(10);

        //Row 17
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        purpleMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Row 18
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(3);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(5);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 19
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(4);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        board.addCellsVertically();

        //Column 5
        purpleMineFactory.addToBoard(2);
        purpleUnrevealedEmptyFactory.addToBoard(5);
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 6
        grayRevealedFactory.addToBoard(7);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);

        board.skipLines(7);

        //Column 13
        orangeMineFactory.addToBoard(3);
        grayRevealedFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);

        //Column 14
        grayRevealedFactory.addToBoard(8);
        purpleMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);

        //Column 15
        purpleUnrevealedEmptyFactory.addToBoard(3);
        purpleMineFactory.addToBoard(4);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        nonExistentCellFactory.addToBoard(1);

        //Column 16
        purpleUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(9);

        //Column 17
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(3);

        //Column 18
        grayRevealedFactory.addToBoard(10);

        //Column 19
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);

        board.addCellsHorizontally();

        //Row 7
        orangeMineFactory.addToBoard(3);
        orangeUnrevealedEmptyFactory.addToBoard(3);

        //Row 8
        orangeMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(5);

        //Row 9
        orangeUnrevealedEmptyFactory.addToBoard(3);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);

        //Row 10
        grayRevealedFactory.addToBoard(6);

        //Row 11
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(2);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);

        //Row 12
        orangeUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(5);

        //Row 13
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(2);
        orangeMineFactory.addToBoard(1);

        //Row 14
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(5);

        //Row 15
        pinkUnrevealedEmptyFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);

        //Row 16
        pinkMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);

        return board;
    }

    @Override public String toString(){
        return "130";
    }
}