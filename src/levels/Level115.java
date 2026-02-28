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

public class Level115 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(31, "gray", ESC + "0m");
        ColorCounter purple = new ColorCounter(24, "purple", ESC + "35m");
        ColorCounter orange = new ColorCounter(6, "orange", ESC + "38;5;214m");
        
        BoardWithLines board = new BoardWithLines(15, 15, false, gray, purple, orange);

        CellFactory.setBoard(board);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory purpleMineFactory = new MineCellFactory(purple);

        MineCellFactory orange2x2MineFactory = new MineCellFactory(orange, 2, 2);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory purpleUnrevealedEmptyFactory = new EmptyCellFactory(purple, false, false);
        
        EmptyCellFactory grayUnknownRevealedFactory = new EmptyCellFactory(gray, true, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        //Row 1
        purpleMineFactory.addToBoard(4);
        purpleUnrevealedEmptyFactory.addToBoard(5);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        purpleMineFactory.addToBoard(3);

        board.addCellsVertically();

        //Column 1
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(4);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);

        //Column 2
        orange2x2MineFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        board.addCell(new EmptyCell(gray, false, true));
        grayRevealedFactory.addToBoard(1);
        board.addCell(new MineCell(orange, 2, 3));
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        board.addCell(new EmptyCell(orange, false, false, 2, 2));
        purpleUnrevealedEmptyFactory.addToBoard(1);

        board.skipLines(1);

        //Column 4
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);

        board.skipLines(1);

        //Column 6
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);

        //Column 7
        board.addCell(new EmptyCell(orange, false, false, 3, 2));
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        board.addCell(new MineCell(orange, 3, 3));
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        board.addCell(new MineCell(orange, 3, 2));
        purpleUnrevealedEmptyFactory.addToBoard(1);

        //Column 8
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);

        board.skipLines(1);

        //Column 10
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        board.addCell(new EmptyCell(purple, false, true));

        board.skipLines(1);

        //Column 12
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);

        //Column 13
        orange2x2MineFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        board.addCell(new EmptyCell(orange, false, false, 2, 3));
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        orange2x2MineFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);

        //Column 14
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);

        //Column 15
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(3);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(2);
        purpleUnrevealedEmptyFactory.addToBoard(1);

        board.addCellsHorizontally();

        //Row 2
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 3
        nonExistentCellFactory.addToBoard(2);

        //Row 4
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);

        //Row 5
        nonExistentCellFactory.addToBoard(4);
        
        //Row 6
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Row 7
        nonExistentCellFactory.addToBoard(2);

        //Row 8
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Row 9
        nonExistentCellFactory.addToBoard(2);

        //Row 10
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);

        //Row 11
        nonExistentCellFactory.addToBoard(4);

        //Row 12
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);

        //Row 13
        nonExistentCellFactory.addToBoard(2);

        //Row 14
        grayMineFactory.addToBoard(2);

        //Row 15
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        purpleMineFactory.addToBoard(1);

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(2));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(3));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(2));
        board.addVerticalLine(externalCounterFactory.build(1));
        
        //HorizontalLines
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(2));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(3));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(2));
        board.addHorizontalLine(externalCounterFactory.build(1));
        
        return board;
    }

    @Override public String toString(){
        return "115";
    }
}