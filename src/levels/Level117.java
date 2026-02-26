package levels;

import cellFactories.CellFactory;
import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.ColorCounter;

public class Level117 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(52, "gray", ESC + "0m");
        ColorCounter pink = new ColorCounter(5, "pink", ESC + "38;5;212m");
        ColorCounter orange = new ColorCounter(5, "orange", ESC + "38;5;214m");
        
        BoardWithLines board = new BoardWithLines(17, 17, true, gray, pink, orange);

        board.setMaxMineDifferenceForImaginaryCells(5);

        CellFactory.setBoard(board);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory pinkMineFactory = new MineCellFactory(pink);
        MineCellFactory orangeMineFactory = new MineCellFactory(orange);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory pinkUnrevealedEmptyFactory = new EmptyCellFactory(pink, false, false);
        EmptyCellFactory orangeUnrevealedEmptyFactory = new EmptyCellFactory(orange, false, false);
        
        EmptyCellFactory grayUnknownUnrevealedFactory = new EmptyCellFactory(gray, false, true);
        EmptyCellFactory pinkUnknownFactory = new EmptyCellFactory(pink, false, true);
        EmptyCellFactory orangeUnknownFactory = new EmptyCellFactory(orange, false, true);

        EmptyCellFactory grayUnknownRevealedFactory = new EmptyCellFactory(gray, true, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        board.skipLines(6);

        //Row 7
        grayRevealedFactory.addToBoard(3);
        nonExistentCellFactory.addToBoard(11);
        grayRevealedFactory.addToBoard(3);

        //Row 8
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        pinkUnknownFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(5);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        pinkMineFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Row 9
        grayUnrevealedEmptyFactory.addToBoard(3);
        pinkUnrevealedEmptyFactory.addToBoard(2);
        pinkMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(5);
        pinkMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(3);

        //Row 10
        grayMineFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(3);
        nonExistentCellFactory.addToBoard(5);
        pinkUnknownFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 11
        grayRevealedFactory.addToBoard(3);
        nonExistentCellFactory.addToBoard(11);
        grayRevealedFactory.addToBoard(3);

        board.skipLines(6);
        board.setAddsCellsHorizontally(false);

        //Column 1
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(5);

        //Column 2
        grayUnrevealedEmptyFactory.addToBoard(4);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(4);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 3
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(4);

        //Column 4
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(4);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);

        //Column 5
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 6
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(7);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Column 7
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(6);
        grayRevealedFactory.addToBoard(3);

        //Column 8
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Column 9
        grayUnrevealedEmptyFactory.addToBoard(3);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(2);
        orangeMineFactory.addToBoard(1);
        orangeUnknownFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(3);

        //Column 10
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(2);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 11
        grayRevealedFactory.addToBoard(3);
        nonExistentCellFactory.addToBoard(6);
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);

        //Column 12
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(3);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);

        //Column 13
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(7);
        grayMineFactory.addToBoard(1);

        //Column 14
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(7);
        grayMineFactory.addToBoard(3);

        //Column 15
        grayUnrevealedEmptyFactory.addToBoard(6);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(5);

        //Column 16
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 17
        grayUnrevealedEmptyFactory.addToBoard(4);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(externalCounterFactory.build(6));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(3));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(6));
        
        //HorizontalLines
        board.addHorizontalLine(externalCounterFactory.build(6));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(3));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(6));
        
        return board;
    }

    @Override public String toString(){
        return "117";
    }
}