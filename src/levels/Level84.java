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

public class Level84 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(62, "gray", ESC + "0m");
        ColorCounter purple = new ColorCounter(4, "purple", ESC + "35m");
        ColorCounter cyan = new ColorCounter(2, "cyan", ESC + "36m");
        ColorCounter pink = new ColorCounter(4, "pink", ESC + "38;5;212m");
        
        BoardWithLines board = new BoardWithLines(18, 18, true, gray, purple, cyan, pink);

        board.setMaxMineDifferenceForImaginaryCells(5);

        CellFactory.setBoard(board);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory pinkMineFactory = new MineCellFactory(pink);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory purpleUnrevealedEmptyFactory = new EmptyCellFactory(purple, false, false);
        EmptyCellFactory cyanUnrevealedEmptyFactory = new EmptyCellFactory(cyan, false, false);
        EmptyCellFactory pinkUnrevealedEmptyFactory = new EmptyCellFactory(pink, false, false);
        
        EmptyCellFactory grayUnknownUnrevealedFactory = new EmptyCellFactory(gray, false, true);
        EmptyCellFactory cyanUnknownFactory = new EmptyCellFactory(cyan, false, true);

        EmptyCellFactory grayUnknownRevealedFactory = new EmptyCellFactory(gray, true, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        board.addCellsVertically();

        //Column 1
        grayUnrevealedEmptyFactory.addToBoard(4);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(6);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);

        //Column 2
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 3
        grayUnrevealedEmptyFactory.addToBoard(2);
        nonExistentCellFactory.addToBoard(1);
        board.addCell(new EmptyCell(purple, false, true));
        grayUnrevealedEmptyFactory.addToBoard(4);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);

        //Column 4
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(3);
        board.addCell(new MineCell(purple));
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(3);
        board.addCell(new MineCell(cyan));
        grayUnrevealedEmptyFactory.addToBoard(2);

        //Column 5
        grayUnrevealedEmptyFactory.addToBoard(3);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(5);
        grayMineFactory.addToBoard(2);
        grayUnknownUnrevealedFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 6
        grayUnrevealedEmptyFactory.addToBoard(3);
        board.addCell(new MineCell(purple));
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(5);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        cyanUnknownFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);

        board.addCellsHorizontally();

        //Row 1
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);

        //Row 2
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 3
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(4);
        cyanUnknownFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        
        //Row 4
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        board.addCell(new MineCell(cyan));
        cyanUnrevealedEmptyFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(2);

        //Row 5
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);

        board.addCellsVertically();

        //Column 13
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(4);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 14
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(5);
        board.addCell(new MineCell(purple));
        grayUnrevealedEmptyFactory.addToBoard(3);

        //Column 15
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanUnknownFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(3);
        board.addCell(new MineCell(purple));
        grayUnrevealedEmptyFactory.addToBoard(2);

        //Column 16
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Column 17
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 18
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(5);

        board.addCellsHorizontally();

        //Row 6
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(3);
        
        //Row 7
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(3);

        //Row 8
        grayMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(4);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 9
        grayUnrevealedEmptyFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(2);
        pinkMineFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Row 10
        grayMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(2);
        pinkMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 11
        grayUnrevealedEmptyFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        pinkMineFactory.addToBoard(2);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Row 12
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(5);

        //Row 13
        grayRevealedFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        board.addCellsVertically();

        //Column 7
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);

        //Column 8
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Column 9
        grayRevealedFactory.addToBoard(5);

        //Column 10
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(4);

        //Column 11
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);

        //Column 12
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        
        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(2));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(2));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(2));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(2));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(2));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        
        //HorizontalLines
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(2));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(2));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(2));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(2));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(2));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        
        return board;
    }

    @Override public String toString(){
        return "84";
    }
}