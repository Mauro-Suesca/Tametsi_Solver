package levels;

import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;

public class Level79 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(14, "grises", ESC + "0m");
        ColorCounter pink = new ColorCounter(19, "rosadas", ESC + "38;5;212m");
        ColorCounter blue = new ColorCounter(10, "azules", ESC + "34m");
        ColorCounter yellow = new ColorCounter(0, "amarillas", ESC + "33m");
        
        BoardWithLines board = new BoardWithLines(15, 15, true, gray, pink, blue, yellow);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory blueMineFactory = new MineCellFactory(blue);
        MineCellFactory pinkMineFactory = new MineCellFactory(pink);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory blueUnrevealedEmptyFactory = new EmptyCellFactory(blue, false, false);
        EmptyCellFactory pinkUnrevealedEmptyFactory = new EmptyCellFactory(pink, false, false);
        
        //Row 1
        board.addCell(nonExistentCellFactory.build(5));
        board.addCell(pinkUnrevealedEmptyFactory.build(5));
        board.addCell(nonExistentCellFactory.build(5));

        //Row 2
        board.addCell(nonExistentCellFactory.build(5));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(new EmptyCell(yellow, false, false));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(pinkMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(5));

        board.setAddsCellsHorizontally(false);

        //Column 1
        board.addCell(nonExistentCellFactory.build(3));
        board.addCell(pinkMineFactory.build(3));
        board.addCell(pinkUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(5));

        //Column 2
        board.addCell(nonExistentCellFactory.build(3));
        board.addCell(pinkMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(pinkMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(5));

        //Column 3
        board.addCell(blueMineFactory.build(2));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(4));
        board.addCell(blueMineFactory.build(3));
        board.addCell(nonExistentCellFactory.build(2));

        board.setAddsCellsHorizontally(true);

        //Row 3
        board.addCell(blueUnrevealedEmptyFactory.build(6));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(blueMineFactory.build(1));
        board.addCell(new EmptyCell(blue, false, true));

        board.setAddsCellsHorizontally(false);

        //Column 13
        board.addCell(blueMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(6));
        board.addCell(pinkMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(3));
        board.addCell(nonExistentCellFactory.build(2));

        //Column 14
        board.addCell(nonExistentCellFactory.build(3));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(5));

        //Column 15
        board.addCell(nonExistentCellFactory.build(3));
        board.addCell(pinkUnrevealedEmptyFactory.build(2));
        board.addCell(pinkMineFactory.build(2));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(5));

        board.setAddsCellsHorizontally(true);

        //Row 4
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));

        //Row 5 (Part 1)
        board.addCell(grayUnrevealedEmptyFactory.build(2));

        board.setAddsCellsHorizontally(false);

        //Column 6
        board.addCell(pinkUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(3));
        board.addCell(pinkUnrevealedEmptyFactory.build(4));
        board.addCell(pinkMineFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));

        //Column 7
        board.addCell(nonExistentCellFactory.build(7));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));

        //Column 8
        board.addCell(nonExistentCellFactory.build(7));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(blueMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(pinkMineFactory.build(1));

        //Column 9
        board.addCell(nonExistentCellFactory.build(7));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(blueMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));

        //Column 10
        board.addCell(pinkMineFactory.build(2));
        board.addCell(nonExistentCellFactory.build(3));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(pinkMineFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(pinkMineFactory.build(2));

        board.setAddsCellsHorizontally(true);

        //Row 5 (Part 2)
        board.addCell(grayUnrevealedEmptyFactory.build(2));

        //Row 6
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(pinkMineFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(pinkMineFactory.build(1));

        //Row 7
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(new EmptyCell(gray, false, true));

        //Row 8
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(grayMineFactory.build(1));

        //Row 9
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Row 10
        board.addCell(pinkMineFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(3));

        //Row 11
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        
        //Row 12
        board.addCell(grayMineFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Row 13
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(blueMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(2));

        //Row 14
        board.addCell(nonExistentCellFactory.build(4));

        //Row 15
        board.addCell(nonExistentCellFactory.build(4));

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(nonExistentCellFactory.build(2));
        board.addVerticalLine(externalCounterFactory.build(2));
        board.addVerticalLine(nonExistentCellFactory.build(7));
        board.addVerticalLine(externalCounterFactory.build(2));
        board.addVerticalLine(nonExistentCellFactory.build(2));
        
        //HorizontalLines
        board.addHorizontalLine(nonExistentCellFactory.build(2));
        board.addHorizontalLine(externalCounterFactory.build(2));
        board.addHorizontalLine(nonExistentCellFactory.build(7));
        board.addHorizontalLine(externalCounterFactory.build(2));
        board.addHorizontalLine(nonExistentCellFactory.build(2));
        
        return board;
    }

    @Override public String toString(){
        return "79";
    }
}