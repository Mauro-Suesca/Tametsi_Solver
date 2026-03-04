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

public class Level134 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(33, "gray", ESC + "0m");
        ColorCounter blue = new ColorCounter(22, "blue", ESC + "34m");
        ColorCounter cyan = new ColorCounter(48, "cyan", ESC + "36m");
        
        BoardWithLines board = new BoardWithLines(19, 19, true, gray, blue, cyan);

        board.setMaxMineDifferenceForImaginaryCells(5);

        CellFactory.setBoard(board);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory blueMineFactory = new MineCellFactory(blue);
        MineCellFactory cyanMineFactory = new MineCellFactory(cyan);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory blueUnrevealedEmptyFactory = new EmptyCellFactory(blue, false, false);
        EmptyCellFactory cyanUnrevealedEmptyFactory = new EmptyCellFactory(cyan, false, false);
        
        EmptyCellFactory cyanUnknownFactory = new EmptyCellFactory(cyan, false, true);

        EmptyCellFactory grayUnknownRevealedFactory = new EmptyCellFactory(gray, true, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        board.addCellsVertically();

        //Column 1
        blueUnrevealedEmptyFactory.addToBoard(4);
        board.addCell(new EmptyCell(blue, false, true));
        blueMineFactory.addToBoard(2);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(2);
        blueUnrevealedEmptyFactory.addToBoard(4);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(3);
        blueMineFactory.addToBoard(1);

        //Column 2
        blueMineFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(2);
        cyanUnrevealedEmptyFactory.addToBoard(6);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(2);
        cyanMineFactory.addToBoard(3);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);

        //Column 3
        blueUnrevealedEmptyFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(5);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(8);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);

        board.skipLines(13);

        //Column 17
        blueUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);

        //Column 18
        blueUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(8);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(7);
        blueMineFactory.addToBoard(1);

        //Column 19
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(7);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(4);
        blueMineFactory.addToBoard(3);
        blueUnrevealedEmptyFactory.addToBoard(3);

        board.addCellsHorizontally();

        //Row 1
        blueUnrevealedEmptyFactory.addToBoard(4);
        blueMineFactory.addToBoard(2);
        blueUnrevealedEmptyFactory.addToBoard(2);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(2);
        blueUnrevealedEmptyFactory.addToBoard(1);

        //Row 2
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(5);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(4);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);

        //Row 3
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(6);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);

        //Row 4
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(2);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(4);

        board.skipLines(12);

        //Row 16
        cyanUnrevealedEmptyFactory.addToBoard(4);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(2);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(3);

        //Row 17
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);

        //Row 18
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(4);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(5);

        //Row 19
        blueUnrevealedEmptyFactory.addToBoard(4);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(2);
        blueMineFactory.addToBoard(3);
        blueUnrevealedEmptyFactory.addToBoard(3);

        board.addCellsVertically();

        //Column 4
        cyanMineFactory.addToBoard(2);
        cyanUnrevealedEmptyFactory.addToBoard(2);
        cyanMineFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(2);

        //Column 5
        grayRevealedFactory.addToBoard(4);
        cyanMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);

        //Column 6
        grayRevealedFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(2);
        cyanMineFactory.addToBoard(2);
        grayRevealedFactory.addToBoard(1);

        //Column 7
        grayUnknownRevealedFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        cyanMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);

        //Column 8
        grayRevealedFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(5);
        grayMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);

        //Column 9
        cyanMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(3);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);

        //Column 10
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayRevealedFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(3);
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 11
        cyanUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(3);
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(2);

        //Column 12
        grayRevealedFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(5);
        grayUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);

        //Column 13
        grayRevealedFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);

        //Column 14
        grayRevealedFactory.addToBoard(1);
        cyanMineFactory.addToBoard(3);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(2);
        cyanMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);

        //Column 15
        grayRevealedFactory.addToBoard(4);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        cyanUnknownFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(4);

        //Column 16
        cyanUnrevealedEmptyFactory.addToBoard(3);
        cyanUnknownFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(5);
        cyanMineFactory.addToBoard(1);

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(3));
        board.addVerticalLine(nonExistentCellFactory.build(5));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(5));
        board.addVerticalLine(externalCounterFactory.build(3));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        
        //HorizontalLines
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(3));
        board.addHorizontalLine(nonExistentCellFactory.build(5));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(5));
        board.addHorizontalLine(externalCounterFactory.build(3));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        
        return board;
    }

    @Override public String toString(){
        return "134";
    }
}