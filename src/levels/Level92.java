package levels;

import cellFactories.CellFactory;
import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.ColorCounter;

public class Level92 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(68, "gray", ESC + "0m");
        ColorCounter blue = new ColorCounter(68, "blue", ESC + "34m");
        
        BoardWithLines board = new BoardWithLines(21, 21, true, gray, blue);

        board.setMaxMineDifferenceForImaginaryCells(5);

        CellFactory.setBoard(board);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory blueMineFactory = new MineCellFactory(blue);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory blueUnrevealedEmptyFactory = new EmptyCellFactory(blue, false, false);

        EmptyCellFactory grayUnknownFactory = new EmptyCellFactory(gray, false, true);
        EmptyCellFactory blueUnknownFactory = new EmptyCellFactory(blue, false, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);
        
        //Row 1
        grayRevealedFactory.addToBoard(21);

        //Row 2
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);

        //Row 3
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnknownFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(5);
        grayRevealedFactory.addToBoard(1);

        board.setAddsCellsHorizontally(false);

        //Column 1
        grayRevealedFactory.addToBoard(18);

        //Column 2
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);

        //Column 3
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnknownFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(5);
        grayRevealedFactory.addToBoard(1);

        board.setAddsCellsHorizontally(true);

        //Row 4
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(4);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(5);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(2);
        blueMineFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayRevealedFactory.addToBoard(1);

        //Row 5
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(5);
        blueMineFactory.addToBoard(2);
        blueUnrevealedEmptyFactory.addToBoard(4);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);

        board.setAddsCellsHorizontally(false);

        //Column 19
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayUnknownFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(7);
        grayMineFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayRevealedFactory.addToBoard(1);

        //Column 20
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(4);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);

        //Column 21
        grayRevealedFactory.addToBoard(17);

        //Column 4
        blueUnrevealedEmptyFactory.addToBoard(2);
        blueMineFactory.addToBoard(3);
        blueUnrevealedEmptyFactory.addToBoard(4);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(2);
        blueMineFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayRevealedFactory.addToBoard(1);

        //Column 5
        blueUnrevealedEmptyFactory.addToBoard(2);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnknownFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        
        board.setAddsCellsHorizontally(true);

        //Row 14
        blueUnknownFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(4);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(5);

        //Row 15
        blueUnrevealedEmptyFactory.addToBoard(3);
        blueMineFactory.addToBoard(2);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(5);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);

        //Row 16
        blueUnknownFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(2);
        blueUnrevealedEmptyFactory.addToBoard(3);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(2);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);

        //Row 17
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(2);
        blueUnrevealedEmptyFactory.addToBoard(3);
        blueMineFactory.addToBoard(2);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(2);
        blueMineFactory.addToBoard(2);

        //Row 18
        blueUnrevealedEmptyFactory.addToBoard(3);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnknownFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(5);

        //Row 19
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(7);
        grayMineFactory.addToBoard(1);
        grayUnknownFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Row 20
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);

        //Row 21
        grayRevealedFactory.addToBoard(14);

        //Row 6
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(2);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(3);
        blueUnrevealedEmptyFactory.addToBoard(5);

        //Row 7
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(7);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(2);
        blueMineFactory.addToBoard(1);

        //Row 8
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(4);
        blueMineFactory.addToBoard(1);

        board.setAddsCellsHorizontally(false);

        //Column 6
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(2);
        blueUnrevealedEmptyFactory.addToBoard(1);
        
        //Column 7
        blueUnrevealedEmptyFactory.addToBoard(2);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);

        //Column 8
        blueUnrevealedEmptyFactory.addToBoard(5);

        //Column 9
        grayUnknownFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayUnknownFactory.addToBoard(1);

        //Column 10
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);

        //Column 11
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 12
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(3);

        //Column 13
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayUnknownFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);

        //Column 14
        blueUnrevealedEmptyFactory.addToBoard(3);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);

        //Column 15
        blueUnknownFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(3);

        //Column 16
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(2);
        blueMineFactory.addToBoard(2);

        //Column 17
        blueUnrevealedEmptyFactory.addToBoard(3);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);

        //Column 18
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(2);
        blueMineFactory.addToBoard(1);
        
        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(nonExistentCellFactory.build(5));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(2));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(2));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(5));
        
        //HorizontalLines
        board.addHorizontalLine(nonExistentCellFactory.build(5));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(2));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(2));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(5));
        
        return board;
    }

    @Override public String toString(){
        return "92";
    }
}