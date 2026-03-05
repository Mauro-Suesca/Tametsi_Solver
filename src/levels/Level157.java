package levels;

import cellFactories.CellFactory;
import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.ColorCounter;

public class Level157 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(14, "gray", ESC + "0m");
        ColorCounter orange = new ColorCounter(34, "orange", ESC + "38;5;214m");
        ColorCounter blue = new ColorCounter(27, "blue", ESC + "34m");
        
        BoardWithLines board = new BoardWithLines(19, 19, true, gray, orange, blue);

        CellFactory.setBoard(board);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory orangeMineFactory = new MineCellFactory(orange);
        MineCellFactory blueMineFactory = new MineCellFactory(blue);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory orangeUnrevealedEmptyFactory = new EmptyCellFactory(orange, false, false);
        EmptyCellFactory blueUnrevealedEmptyFactory = new EmptyCellFactory(blue, false, false);
        
        EmptyCellFactory orangeUnknownFactory = new EmptyCellFactory(orange, false, true);
        EmptyCellFactory blueUnknownFactory = new EmptyCellFactory(blue, false, true);

        EmptyCellFactory grayUnknownRevealedFactory = new EmptyCellFactory(gray, true, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        board.addCellsVertically();
        board.skipLines(3);

        //Column 4
        nonExistentCellFactory.addToBoard(6);
        orangeUnrevealedEmptyFactory.addToBoard(2);
        grayRevealedFactory.addToBoard(3);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(6);

        //Column 5
        nonExistentCellFactory.addToBoard(6);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(2);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(2);
        nonExistentCellFactory.addToBoard(6);

        //Column 6
        nonExistentCellFactory.addToBoard(6);
        orangeMineFactory.addToBoard(2);
        grayRevealedFactory.addToBoard(3);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(6);

        board.skipLines(3);

        //Column 10
        grayRevealedFactory.addToBoard(3);
        grayUnknownRevealedFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(5);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);

        board.skipLines(3);

        //Column 14
        nonExistentCellFactory.addToBoard(6);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        nonExistentCellFactory.addToBoard(6);

        //Column 15
        nonExistentCellFactory.addToBoard(6);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(6);

        //Column 16
        nonExistentCellFactory.addToBoard(6);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayRevealedFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(6);

        board.skipLines(3);
        board.addCellsHorizontally();
        board.skipLines(6);

        //Row 7
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(2);
        orangeUnrevealedEmptyFactory.addToBoard(2);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 8
        orangeUnknownFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(5);
        blueUnrevealedEmptyFactory.addToBoard(2);
        blueMineFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);

        //Row 9
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(2);
        orangeUnknownFactory.addToBoard(1);
        orangeMineFactory.addToBoard(2);
        blueUnrevealedEmptyFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(3);

        //Row 10
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(5);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);

        //Row 11
        orangeUnrevealedEmptyFactory.addToBoard(3);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(2);
        blueMineFactory.addToBoard(3);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 12
        orangeUnknownFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(3);
        orangeMineFactory.addToBoard(1);
        orangeUnknownFactory.addToBoard(1);
        blueMineFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(3);

        //Row 13
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(2);
        orangeUnrevealedEmptyFactory.addToBoard(3);
        blueMineFactory.addToBoard(3);
        grayMineFactory.addToBoard(3);

        board.skipLines(6);
        board.addCellsVertically();

        //Column 1
        nonExistentCellFactory.addToBoard(12);

        //Column 2
        nonExistentCellFactory.addToBoard(12);

        //Column 3
        nonExistentCellFactory.addToBoard(12);

        //Column 7
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(2);
        blueMineFactory.addToBoard(5);
        blueUnrevealedEmptyFactory.addToBoard(1);

        //Column 8
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(2);
        orangeMineFactory.addToBoard(3);
        blueMineFactory.addToBoard(3);
        blueUnrevealedEmptyFactory.addToBoard(2);
        blueMineFactory.addToBoard(1);

        //Column 9
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        blueMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(2);
        blueUnknownFactory.addToBoard(1);

        //Column 11
        orangeUnrevealedEmptyFactory.addToBoard(3);
        grayRevealedFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        blueUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        blueMineFactory.addToBoard(2);
        blueUnrevealedEmptyFactory.addToBoard(1);

        //Column 12
        orangeMineFactory.addToBoard(2);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(2);
        blueUnrevealedEmptyFactory.addToBoard(4);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);

        //Column 13
        orangeUnknownFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(3);
        orangeMineFactory.addToBoard(2);
        blueUnknownFactory.addToBoard(1);
        blueMineFactory.addToBoard(2);
        blueUnrevealedEmptyFactory.addToBoard(3);

        //Column 17
        nonExistentCellFactory.addToBoard(12);

        //Column 18
        nonExistentCellFactory.addToBoard(12);

        //Column 19
        nonExistentCellFactory.addToBoard(12);

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(nonExistentCellFactory.build(6));
        board.addVerticalLine(externalCounterFactory.build(2));
        board.addVerticalLine(nonExistentCellFactory.build(3));
        board.addVerticalLine(externalCounterFactory.build(2));
        board.addVerticalLine(nonExistentCellFactory.build(6));
        
        //HorizontalLines
        board.addHorizontalLine(nonExistentCellFactory.build(6));
        board.addHorizontalLine(externalCounterFactory.build(2));
        board.addHorizontalLine(nonExistentCellFactory.build(3));
        board.addHorizontalLine(externalCounterFactory.build(2));
        board.addHorizontalLine(nonExistentCellFactory.build(6));

        return board;
    }

    @Override public String toString(){
        return "157";
    }
}