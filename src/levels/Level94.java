package levels;

import cellFactories.CellFactory;
import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.ColorCounter;

public class Level94 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(28, "gray", ESC + "0m");
        ColorCounter green = new ColorCounter(4, "green", ESC + "32m");
        
        BoardWithLines board = new BoardWithLines(10, 10, false, gray, green);

        CellFactory.setBoard(board);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory greenMineFactory = new MineCellFactory(green, 2, 2);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory greenUnrevealedEmptyFactory = new EmptyCellFactory(green, false, false, 2, 2);

        EmptyCellFactory grayUnknownFactory = new EmptyCellFactory(gray, false, true);

        //Row 1
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(5);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 2
        grayMineFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 3
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);

        //Row 4
        grayUnknownFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(5);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 5
        grayMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 6
        grayUnrevealedEmptyFactory.addToBoard(4);

        //Row 7
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(4);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 8
        grayUnknownFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Row 9
        grayMineFactory.addToBoard(4);

        //Row 10
        grayUnknownFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        
        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(2));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(2));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(2));
        board.addVerticalLine(externalCounterFactory.build(1));
        
        //HorizontalLines
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(2));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(2));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(2));
        board.addHorizontalLine(externalCounterFactory.build(1));
        
        return board;
    }

    @Override public String toString(){
        return "94";
    }
}