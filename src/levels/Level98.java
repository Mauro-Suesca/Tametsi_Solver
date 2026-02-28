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
import cellLogic.MineCell;

public class Level98 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(85, "gray", ESC + "0m");
        ColorCounter cyan = new ColorCounter(4, "cyan", ESC + "36m");
        ColorCounter orange = new ColorCounter(4, "orange", ESC + "38;5;214m");
        ColorCounter pink = new ColorCounter(5, "pink", ESC + "38;5;212m");
        ColorCounter purple = new ColorCounter(5, "purple", ESC + "35m");
        
        BoardWithLines board = new BoardWithLines(19, 19, true, gray, cyan, orange, pink, purple);

        board.setMaxMineDifferenceForImaginaryCells(5);

        CellFactory.setBoard(board);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory cyanUnrevealedEmptyFactory = new EmptyCellFactory(cyan, false, false);
        EmptyCellFactory orangeUnrevealedEmptyFactory = new EmptyCellFactory(orange, false, false);
        EmptyCellFactory pinkUnrevealedEmptyFactory = new EmptyCellFactory(pink, false, false);
        EmptyCellFactory purpleUnrevealedEmptyFactory = new EmptyCellFactory(purple, false, false);
        
        EmptyCellFactory grayUnknownUnrevealedFactory = new EmptyCellFactory(gray, false, true);
        EmptyCellFactory pinkUnknownFactory = new EmptyCellFactory(pink, false, true);

        EmptyCellFactory grayUnknownRevealedFactory = new EmptyCellFactory(gray, true, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        board.skipLines(4);

        //Row 5
        nonExistentCellFactory.addToBoard(15);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(3);

        board.skipLines(4);

        //Row 10
        grayRevealedFactory.addToBoard(4);
        nonExistentCellFactory.addToBoard(11);
        grayRevealedFactory.addToBoard(3);
        grayUnknownRevealedFactory.addToBoard(1);

        board.skipLines(4);

        //Row 15
        grayRevealedFactory.addToBoard(4);
        nonExistentCellFactory.addToBoard(15);

        board.skipLines(4);
        board.addCellsVertically();

        //Column 1
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(5);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Column 2
        grayMineFactory.addToBoard(1);
        board.addCell(new MineCell(cyan));
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        board.addCell(new MineCell(orange));
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        board.addCell(new MineCell(pink));
        pinkUnknownFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);

        //Column 3
        grayUnrevealedEmptyFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        board.addCell(new MineCell(cyan));
        grayUnrevealedEmptyFactory.addToBoard(2);
        orangeUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        board.addCell(new MineCell(pink));
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        board.addCell(new MineCell(purple));
        purpleUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Column 4
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(4);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 5
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(2);
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(2);
        nonExistentCellFactory.addToBoard(4);
        grayRevealedFactory.addToBoard(3);
        grayUnknownRevealedFactory.addToBoard(1);

        //Column 6
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(3);

        //Column 7
        grayUnknownUnrevealedFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(2);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        board.addCell(new MineCell(pink));
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        board.addCell(new MineCell(purple));
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        board.addCell(new MineCell(cyan));
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 8
        grayUnrevealedEmptyFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        board.addCell(new MineCell(orange));
        grayUnrevealedEmptyFactory.addToBoard(2);
        board.addCell(new MineCell(pink));
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        board.addCell(new EmptyCell(purple, false, true));
        purpleUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        board.addCell(new EmptyCell(cyan, false, true));
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 9
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(2);

        //Column 10
        grayRevealedFactory.addToBoard(3);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(7);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(4);

        //Column 11
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(6);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 12
        grayUnrevealedEmptyFactory.addToBoard(1);
        board.addCell(new MineCell(pink));
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        board.addCell(new MineCell(purple));
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(2);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 13
        grayUnrevealedEmptyFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        pinkUnknownFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        board.addCell(new MineCell(orange));
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 14
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(4);

        //Column 15
        grayRevealedFactory.addToBoard(4);
        nonExistentCellFactory.addToBoard(4);
        grayRevealedFactory.addToBoard(7);
        grayUnknownRevealedFactory.addToBoard(1);

        //Column 16
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);

        //Column 17
        grayMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        board.addCell(new MineCell(purple));
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        board.addCell(new MineCell(cyan));
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        board.addCell(new EmptyCell(orange, false, true));
        orangeUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 18
        grayUnrevealedEmptyFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        board.addCell(new MineCell(purple));
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        board.addCell(new MineCell(orange));
        grayUnrevealedEmptyFactory.addToBoard(2);
        pinkUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);

        //Column 19
        grayUnrevealedEmptyFactory.addToBoard(4);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(5);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(2));
        board.addVerticalLine(nonExistentCellFactory.build(3));
        board.addVerticalLine(externalCounterFactory.build(2));
        board.addVerticalLine(nonExistentCellFactory.build(3));
        board.addVerticalLine(externalCounterFactory.build(2));
        board.addVerticalLine(nonExistentCellFactory.build(3));
        board.addVerticalLine(externalCounterFactory.build(2));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        
        //HorizontalLines
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(2));
        board.addHorizontalLine(nonExistentCellFactory.build(3));
        board.addHorizontalLine(externalCounterFactory.build(2));
        board.addHorizontalLine(nonExistentCellFactory.build(3));
        board.addHorizontalLine(externalCounterFactory.build(2));
        board.addHorizontalLine(nonExistentCellFactory.build(3));
        board.addHorizontalLine(externalCounterFactory.build(2));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        
        return board;
    }

    @Override public String toString(){
        return "98";
    }
}