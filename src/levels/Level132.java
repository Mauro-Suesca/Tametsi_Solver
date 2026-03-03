package levels;

import cellFactories.CellFactory;
import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.ColorCounter;

public class Level132 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(83, "grises", ESC + "0m");
        ColorCounter purple = new ColorCounter(14, "moradas", ESC + "35m");
        ColorCounter pink = new ColorCounter(3, "rosadas", ESC + "38;5;212m");
        
        BoardWithLines board = new BoardWithLines(17, 17, true, gray, purple, pink);

        board.setMaxMineDifferenceForImaginaryCells(5);

        CellFactory.setBoard(board);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory purpleMineFactory = new MineCellFactory(purple);
        MineCellFactory pinkMineFactory = new MineCellFactory(pink);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory purpleUnrevealedEmptyFactory = new EmptyCellFactory(purple, false, false);
        EmptyCellFactory pinkUnrevealedEmptyFactory = new EmptyCellFactory(pink, false, false);
        
        EmptyCellFactory grayUnknownFactory = new EmptyCellFactory(gray, false, true);
        EmptyCellFactory purpleUnknownFactory = new EmptyCellFactory(purple, false, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        //Row 1
        grayRevealedFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(3);
        nonExistentCellFactory.addToBoard(5);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayUnknownFactory.addToBoard(1);

        board.skipLines(5);
        
        //Row 7
        nonExistentCellFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(3);
        purpleMineFactory.addToBoard(2);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(4);
        purpleMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);

        //Row 8
        nonExistentCellFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(4);
        grayUnrevealedEmptyFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(3);
        nonExistentCellFactory.addToBoard(2);

        //Row 9
        nonExistentCellFactory.addToBoard(3);
        pinkUnrevealedEmptyFactory.addToBoard(4);
        pinkMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        pinkMineFactory.addToBoard(2);
        pinkUnrevealedEmptyFactory.addToBoard(3);
        nonExistentCellFactory.addToBoard(3);

        //Row 10
        nonExistentCellFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnknownFactory.addToBoard(1);
        grayMineFactory.addToBoard(3);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(4);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(2);

        //Row 11
        nonExistentCellFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(4);
        purpleMineFactory.addToBoard(2);
        grayUnknownFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(3);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        nonExistentCellFactory.addToBoard(1);

        board.skipLines(5);

        //Row 17
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(3);
        nonExistentCellFactory.addToBoard(5);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);

        board.addCellsVertically();

        //Column 1
        grayRevealedFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(4);
        grayUnrevealedEmptyFactory.addToBoard(3);

        //Column 2
        grayMineFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Column 3
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(3);

        //Column 4
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(4);

        //Column 5
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayUnknownFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 6
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(2);

        //Column 7
        purpleUnrevealedEmptyFactory.addToBoard(9);
        purpleMineFactory.addToBoard(1);

        //Column 8
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(2);
        nonExistentCellFactory.addToBoard(1);

        //Column 9
        nonExistentCellFactory.addToBoard(2);
        pinkUnrevealedEmptyFactory.addToBoard(6);
        nonExistentCellFactory.addToBoard(2);

        //Column 10
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        nonExistentCellFactory.addToBoard(1);

        //Column 11
        purpleMineFactory.addToBoard(2);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleUnknownFactory.addToBoard(1);
        purpleMineFactory.addToBoard(2);
        purpleUnrevealedEmptyFactory.addToBoard(3);
        purpleUnknownFactory.addToBoard(1);

        //Column 12
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(4);
        grayMineFactory.addToBoard(1);

        //Column 13
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Column 14
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Column 15
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(2);

        //Column 16
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(5);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Column 17
        grayUnknownFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(6);

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(nonExistentCellFactory.build(3));
        board.addVerticalLine(externalCounterFactory.build(3));
        board.addVerticalLine(nonExistentCellFactory.build(5));
        board.addVerticalLine(externalCounterFactory.build(3));
        board.addVerticalLine(nonExistentCellFactory.build(3));
        
        //HorizontalLines
        board.addHorizontalLine(nonExistentCellFactory.build(3));
        board.addHorizontalLine(externalCounterFactory.build(3));
        board.addHorizontalLine(nonExistentCellFactory.build(5));
        board.addHorizontalLine(externalCounterFactory.build(3));
        board.addHorizontalLine(nonExistentCellFactory.build(3));
        
        return board;
    }

    @Override public String toString(){
        return "132";
    }
}