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

public class Level133 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(56, "gray", ESC + "0m");
        ColorCounter purple = new ColorCounter(17, "purple", ESC + "35m");
        ColorCounter green = new ColorCounter(7, "green", ESC + "32m");
        ColorCounter cyan = new ColorCounter(13, "cyan", ESC + "36m");
        
        BoardWithLines board = new BoardWithLines(19, 19, true, gray, purple, green, cyan);

        board.setMaxMineDifferenceForImaginaryCells(5);

        CellFactory.setBoard(board);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory purpleMineFactory = new MineCellFactory(purple);
        MineCellFactory greenMineFactory = new MineCellFactory(green);
        MineCellFactory cyanMineFactory = new MineCellFactory(cyan);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory purpleUnrevealedEmptyFactory = new EmptyCellFactory(purple, false, false);
        EmptyCellFactory greenUnrevealedEmptyFactory = new EmptyCellFactory(green, false, false);
        EmptyCellFactory cyanUnrevealedEmptyFactory = new EmptyCellFactory(cyan, false, false);
        
        EmptyCellFactory grayUnknownUnrevealedFactory = new EmptyCellFactory(gray, false, true);

        EmptyCellFactory grayUnknownRevealedFactory = new EmptyCellFactory(gray, true, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        board.skipLines(5);

        //Row 6
        grayUnrevealedEmptyFactory.addToBoard(3);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(3);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(2);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);

        //Row 7
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(2);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(7);

        //Row 8
        grayUnrevealedEmptyFactory.addToBoard(3);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(2);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(2);
        purpleUnrevealedEmptyFactory.addToBoard(2);

        //Row 9
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(3);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);

        //Row 10
        grayMineFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        purpleMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(3);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 11
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(2);
        purpleMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(3);
        purpleMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(7);

        //Row 12
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(3);
        cyanMineFactory.addToBoard(2);
        cyanUnrevealedEmptyFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 13
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(4);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        cyanMineFactory.addToBoard(2);
        nonExistentCellFactory.addToBoard(2);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);

        //Row 14
        greenUnrevealedEmptyFactory.addToBoard(2);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(2);
        greenMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(3);
        cyanMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        board.skipLines(5);
        board.addCellsVertically();

        //Column 1
        grayUnrevealedEmptyFactory.addToBoard(4);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);

        //Column 2
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(3);

        //Column 3
        grayUnrevealedEmptyFactory.addToBoard(4);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 4
        grayMineFactory.addToBoard(2);
        grayUnknownUnrevealedFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Column 5
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(5);

        //Column 6
        grayUnrevealedEmptyFactory.addToBoard(3);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(2);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        board.addCell(new EmptyCell(green, false, true));

        //Column 7
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(4);

        //Column 8
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);

        //Column 9
        grayUnrevealedEmptyFactory.addToBoard(9);
        grayMineFactory.addToBoard(1);

        //Column 10
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(4);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Column 11
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);

        //Column 12
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(2);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);

        //Column 13
        grayRevealedFactory.addToBoard(5);
        nonExistentCellFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 14
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(2);
        greenMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 15
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);

        //Column 16
        grayUnrevealedEmptyFactory.addToBoard(5);
        cyanUnrevealedEmptyFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(3);

        //Column 17
        grayUnrevealedEmptyFactory.addToBoard(5);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(4);

        //Column 18
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(4);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 19
        grayUnrevealedEmptyFactory.addToBoard(4);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(3));
        board.addVerticalLine(nonExistentCellFactory.build(4));
        board.addVerticalLine(externalCounterFactory.build(3));
        board.addVerticalLine(nonExistentCellFactory.build(4));
        board.addVerticalLine(externalCounterFactory.build(3));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        
        //HorizontalLines
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(3));
        board.addHorizontalLine(nonExistentCellFactory.build(4));
        board.addHorizontalLine(externalCounterFactory.build(3));
        board.addHorizontalLine(nonExistentCellFactory.build(4));
        board.addHorizontalLine(externalCounterFactory.build(3));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        
        return board;
    }

    @Override public String toString(){
        return "133";
    }
}