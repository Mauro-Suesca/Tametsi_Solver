package levels;

import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.ColorCounter;

public class Level55 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(66, "grises", ESC + "0m");
        ColorCounter red = new ColorCounter(6, "rojas", ESC + "31m");
        ColorCounter blue = new ColorCounter(4, "azules", ESC + "34m");

        BoardWithLines board = new BoardWithLines(15, 15, true, gray, red, blue);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory redMineFactory = new MineCellFactory(red);
        MineCellFactory blueMineFactory = new MineCellFactory(blue);
                
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory redUnrevealedEmptyFactory = new EmptyCellFactory(red, false, false);
        EmptyCellFactory blueUnrevealedEmptyFactory = new EmptyCellFactory(blue, false, false);

        EmptyCellFactory grayUnknownFactory = new EmptyCellFactory(gray, false, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        //Line 1
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(3));

        //Line 2
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(4));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(4));

        //Line 3
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(2));
        board.addCell(redUnrevealedEmptyFactory.build(2));
        board.addCell(redMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(6));

        //Line 4
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(redMineFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 5
        board.addCell(grayUnrevealedEmptyFactory.build(6));
        board.addCell(redUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnknownFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));

        //Line 6
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnknownFactory.build(2));

        //Line 7
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(blueUnrevealedEmptyFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(blueMineFactory.build(2));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 8
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(2));
        board.addCell(blueMineFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(3));
        board.addCell(grayMineFactory.build(1));
        board.addCell(blueMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(2));

        //Line 9
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(blueUnrevealedEmptyFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(3));
        board.addCell(grayMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 10
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));

        //Line 11
        board.addCell(grayUnknownFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayUnknownFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(redMineFactory.build(2));
        board.addCell(grayMineFactory.build(4));
        board.addCell(grayUnrevealedEmptyFactory.build(2));

        //Line 12
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(2));
        board.addCell(redMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(3));

        //Line 13
        board.addCell(grayUnrevealedEmptyFactory.build(4));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));

        //Line 14
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(5));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(6));

        //Line 15
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnknownFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnknownFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(3));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(3));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(3));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        
        //HorizontalLines
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(3));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(3));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(3));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        
        return board;
    }

    @Override public String toString(){
        return "55";
    }
}