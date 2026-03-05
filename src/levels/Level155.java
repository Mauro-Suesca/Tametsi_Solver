package levels;

import cellFactories.CellFactory;
import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;

public class Level155 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(38, "gray", ESC + "0m");
        ColorCounter red = new ColorCounter(17, "red", ESC + "31m");
        ColorCounter yellow = new ColorCounter(7, "yellow", ESC + "33m");
        ColorCounter blue = new ColorCounter(10, "blue", ESC + "34m");
        
        BoardWithLines board = new BoardWithLines(16, 16, true, gray, red, yellow, blue);

        board.setMaxMineDifferenceForImaginaryCells(5);

        CellFactory.setBoard(board);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory redMineFactory = new MineCellFactory(red);
        MineCellFactory yellowMineFactory = new MineCellFactory(yellow);
        MineCellFactory blueMineFactory = new MineCellFactory(blue);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory redUnrevealedEmptyFactory = new EmptyCellFactory(red, false, false);
        EmptyCellFactory yellowUnrevealedEmptyFactory = new EmptyCellFactory(yellow, false, false);
        EmptyCellFactory blueUnrevealedEmptyFactory = new EmptyCellFactory(blue, false, false);
        
        EmptyCellFactory grayUnknownUnrevealedFactory = new EmptyCellFactory(gray, false, true);
        EmptyCellFactory redUnknownFactory = new EmptyCellFactory(red, false, true);
        EmptyCellFactory blueUnknownFactory = new EmptyCellFactory(blue, false, true);

        EmptyCellFactory grayUnknownRevealedFactory = new EmptyCellFactory(gray, true, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        board.addCellsVertically();

        //Column 1
        redUnrevealedEmptyFactory.addToBoard(2);
        redMineFactory.addToBoard(4);
        redUnrevealedEmptyFactory.addToBoard(2);
        redMineFactory.addToBoard(1);
        redUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);

        //Column 2
        redUnrevealedEmptyFactory.addToBoard(1);
        redMineFactory.addToBoard(1);
        redUnrevealedEmptyFactory.addToBoard(4);
        redMineFactory.addToBoard(2);
        redUnrevealedEmptyFactory.addToBoard(1);
        redMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(2);

        //Column 3
        redUnrevealedEmptyFactory.addToBoard(2);
        redMineFactory.addToBoard(1);
        redUnrevealedEmptyFactory.addToBoard(1);
        redMineFactory.addToBoard(1);
        redUnrevealedEmptyFactory.addToBoard(3);
        redUnknownFactory.addToBoard(1);
        redUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(5);

        //Column 4
        redUnrevealedEmptyFactory.addToBoard(4);
        redMineFactory.addToBoard(1);
        redUnknownFactory.addToBoard(1);
        redUnrevealedEmptyFactory.addToBoard(2);
        redMineFactory.addToBoard(1);
        redUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);

        //Column 5
        redMineFactory.addToBoard(1);
        redUnrevealedEmptyFactory.addToBoard(1);
        redMineFactory.addToBoard(1);
        redUnrevealedEmptyFactory.addToBoard(2);
        redMineFactory.addToBoard(2);
        redUnrevealedEmptyFactory.addToBoard(3);
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 6
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(8);
        grayUnknownRevealedFactory.addToBoard(1);

        board.addCellsHorizontally();

        //Row 1
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);

        //Row 2
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);

        //Row 3
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);

        //Row 4
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(5);

        //Row 5
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 6
        grayRevealedFactory.addToBoard(10);

        //Row 7
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(3);

        board.addCellsVertically();

        //Column 13
        grayRevealedFactory.addToBoard(4);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);

        //Column 14
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(4);
        blueMineFactory.addToBoard(2);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);

        //Column 15
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnknownFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(4);
        blueUnknownFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);

        //Column 16
        blueUnrevealedEmptyFactory.addToBoard(2);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(2);
        blueUnknownFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(2);
        blueMineFactory.addToBoard(1);

        board.addCellsHorizontally();

        //Row 8
        grayUnrevealedEmptyFactory.addToBoard(5);
        grayMineFactory.addToBoard(1);

        //Row 9
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(2);

        //Row 10
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Row 11
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Row 12
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(4);

        //Row 13
        grayRevealedFactory.addToBoard(4);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);

        //Row 14
        yellowMineFactory.addToBoard(1);
        yellowUnrevealedEmptyFactory.addToBoard(1);
        yellowMineFactory.addToBoard(1);
        yellowUnrevealedEmptyFactory.addToBoard(1);
        yellowMineFactory.addToBoard(2);

        //Row 15
        yellowMineFactory.addToBoard(2);
        yellowUnrevealedEmptyFactory.addToBoard(2);
        yellowMineFactory.addToBoard(1);
        yellowUnrevealedEmptyFactory.addToBoard(1);

        //Row 16
        yellowUnrevealedEmptyFactory.addToBoard(5);
        board.addCell(new EmptyCell(yellow, false, true));

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(nonExistentCellFactory.build(2));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(6));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(2));
        
        //HorizontalLines
        board.addHorizontalLine(nonExistentCellFactory.build(2));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(6));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(2));
        
        return board;
    }

    @Override public String toString(){
        return "155";
    }
}