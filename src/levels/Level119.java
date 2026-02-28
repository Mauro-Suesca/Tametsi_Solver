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

public class Level119 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(45, "gray", ESC + "0m");
        ColorCounter purple = new ColorCounter(13, "purple", ESC + "35m");
        ColorCounter cyan = new ColorCounter(12, "cyan", ESC + "36m");
        
        BoardWithLines board = new BoardWithLines(15, 15, true, gray, purple, cyan);

        board.setMaxMineDifferenceForImaginaryCells(5);

        CellFactory.setBoard(board);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory purpleMineFactory = new MineCellFactory(purple);
        MineCellFactory cyanMineFactory = new MineCellFactory(cyan);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory purpleUnrevealedEmptyFactory = new EmptyCellFactory(purple, false, false);
        EmptyCellFactory cyanUnrevealedEmptyFactory = new EmptyCellFactory(cyan, false, false);
        
        EmptyCellFactory grayUnknownUnrevealedFactory = new EmptyCellFactory(gray, false, true);
        EmptyCellFactory cyanUnknownFactory = new EmptyCellFactory(cyan, false, true);

        EmptyCellFactory grayUnknownRevealedFactory = new EmptyCellFactory(gray, true, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        board.skipLines(3);

        //Row 4
        grayRevealedFactory.addToBoard(3);
        nonExistentCellFactory.addToBoard(1);
        board.addCell(new EmptyCell(purple, false, true));
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(4);

        //Row 5
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        purpleMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);

        //Row 6
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(3);
        purpleMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);

        //Row 7
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        purpleMineFactory.addToBoard(2);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Row 8
        grayRevealedFactory.addToBoard(3);
        nonExistentCellFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(2);

        //Row 9
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(2);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanUnknownFactory.addToBoard(1);

        //Row 10
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(2);
        nonExistentCellFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(6);

        //Row 11
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(2);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        cyanMineFactory.addToBoard(2);
        nonExistentCellFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(2);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);

        //Row 12
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(5);
        nonExistentCellFactory.addToBoard(1);
        cyanMineFactory.addToBoard(2);
        cyanUnknownFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(3);

        board.skipLines(3);
        board.addCellsVertically();

        //Column 1
        grayMineFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 2
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 3
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(4);
        grayMineFactory.addToBoard(1);

        //Column 4
        grayRevealedFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);

        //Column 5
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);

        //Column 6
        purpleUnrevealedEmptyFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);

        //Column 7
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(3);

        //Column 8
        grayRevealedFactory.addToBoard(6);

        //Column 9
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(2);
        cyanUnrevealedEmptyFactory.addToBoard(1);

        //Column 10
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(3);

        //Column 11
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);

        //Column 12
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(3);

        //Column 13
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(4);
        grayMineFactory.addToBoard(1);

        //Column 14
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(5);

        //Column 15
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(nonExistentCellFactory.build(4));
        board.addVerticalLine(externalCounterFactory.build(3));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(3));
        board.addVerticalLine(nonExistentCellFactory.build(4));
        
        //HorizontalLines
        board.addHorizontalLine(nonExistentCellFactory.build(4));
        board.addHorizontalLine(externalCounterFactory.build(3));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(3));
        board.addHorizontalLine(nonExistentCellFactory.build(4));
        
        return board;
    }

    @Override public String toString(){
        return "119";
    }
}