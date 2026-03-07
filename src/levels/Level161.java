package levels;

import cellFactories.CellFactory;
import cellFactories.EmptyCellFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardLineless;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;

public class Level161 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(58, "gray", ESC + "0m");
        ColorCounter cyan = new ColorCounter(27, "cyan", ESC + "36m");
        ColorCounter pink = new ColorCounter(10, "pink", ESC + "38;5;212m");
        ColorCounter purple = new ColorCounter(14, "purple", ESC + "35m");

        Board board = new BoardLineless(21, 21, true, gray, cyan, pink, purple);

        board.setMaxMineDifferenceForImaginaryCells(5);

        CellFactory.setBoard(board);

        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();
    
        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory cyanMineFactory = new MineCellFactory(cyan);
        MineCellFactory pinkMineFactory = new MineCellFactory(pink);
        MineCellFactory purpleMineFactory = new MineCellFactory(purple);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory cyanUnrevealedEmptyFactory = new EmptyCellFactory(cyan, false, false);
        EmptyCellFactory pinkUnrevealedEmptyFactory = new EmptyCellFactory(pink, false, false);
        EmptyCellFactory purpleUnrevealedEmptyFactory = new EmptyCellFactory(purple, false, false);

        EmptyCellFactory grayUnknownUnrevealedFactory = new EmptyCellFactory(gray, false, true);
        EmptyCellFactory purpleUnknownFactory = new EmptyCellFactory(purple, false, true);

        EmptyCellFactory grayUnknownRevealedFactory = new EmptyCellFactory(gray, true, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        //Row 1
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 2
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(11);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(5);
        grayUnrevealedEmptyFactory.addToBoard(1);

        board.addCellsVertically();

        //Column 1
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(4);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 2
        grayRevealedFactory.addToBoard(5);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(4);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(5);
        grayUnrevealedEmptyFactory.addToBoard(1);

        board.skipLines(17);

        //Column 20
        grayRevealedFactory.addToBoard(10);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(5);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 21
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);

        board.addCellsHorizontally();

        //Row 3
        cyanMineFactory.addToBoard(2);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(2);
        pinkMineFactory.addToBoard(1);
        board.addCell(new EmptyCell(pink, false, true));
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(2);

        board.skipLines(2);

        //Row 5
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(2);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(3);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(2);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(3);

        //Row 6
        grayRevealedFactory.addToBoard(8);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(6);

        //Row 7
        purpleUnknownFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnknownFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(2);
        purpleUnrevealedEmptyFactory.addToBoard(1);

        board.skipLines(4);

        //Row 11
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        purpleMineFactory.addToBoard(3);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);

        //Row 12
        grayRevealedFactory.addToBoard(2);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(7);
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);

        //Row 13
        grayUnrevealedEmptyFactory.addToBoard(2);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(4);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);

        //Row 14
        nonExistentCellFactory.addToBoard(2);
        cyanMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(3);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(2);

        //Row 15
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);

        //Row 16
        grayRevealedFactory.addToBoard(3);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(5);

        //Row 17
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(6);
        pinkMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(2);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(2);

        board.skipLines(3);

        //Row 20
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(4);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(4);

        //Row 21
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(2);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        board.addCellsVertically();

        //Column 3
        cyanUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        board.addCell(new EmptyCell(cyan, false, true));
        cyanMineFactory.addToBoard(1);

        //Column 4
        nonExistentCellFactory.addToBoard(5);
        cyanUnrevealedEmptyFactory.addToBoard(1);

        //Column 5
        cyanUnrevealedEmptyFactory.addToBoard(3);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);

        //Column 6
        grayRevealedFactory.addToBoard(6);

        //Column 7
        pinkUnrevealedEmptyFactory.addToBoard(1);
        pinkMineFactory.addToBoard(2);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);

        //Column 8
        nonExistentCellFactory.addToBoard(5);
        pinkMineFactory.addToBoard(1);

        //Column 9
        nonExistentCellFactory.addToBoard(5);
        pinkUnrevealedEmptyFactory.addToBoard(1);

        //Column 10
        nonExistentCellFactory.addToBoard(5);
        pinkUnrevealedEmptyFactory.addToBoard(1);

        //Column 11
        pinkUnrevealedEmptyFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(4);

        //Column 12
        grayRevealedFactory.addToBoard(3);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);

        //Column 13
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(4);

        //Column 14
        nonExistentCellFactory.addToBoard(6);

        //Column 15
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);

        //Column 16
        grayRevealedFactory.addToBoard(6);

        //Column 17
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(3);
        cyanUnrevealedEmptyFactory.addToBoard(2);

        //Column 18
        nonExistentCellFactory.addToBoard(5);
        cyanUnrevealedEmptyFactory.addToBoard(1);

        //Column 19
        cyanMineFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);

        return board;
    }

    @Override public String toString(){
        return "161";
    }
}