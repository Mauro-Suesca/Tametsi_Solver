package levels;

import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;
import cellLogic.MineCell;

public class Level60 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(11, "gray", ESC + "0m");
        ColorCounter red = new ColorCounter(12, "red", ESC + "31m");
        ColorCounter yellow = new ColorCounter(3, "yellow", ESC + "33m");
        ColorCounter blue = new ColorCounter(7, "blue", ESC + "34m");

        BoardWithLines board = new BoardWithLines(15, 15, true, gray, red, yellow, blue);

        board.setMaxMineDifferenceForImaginaryCells(5);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory redMineFactory = new MineCellFactory(red);
        MineCellFactory blueMineFactory = new MineCellFactory(blue);
                
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory redUnrevealedEmptyFactory = new EmptyCellFactory(red, false, false);
        EmptyCellFactory yellowUnrevealedEmptyFactory = new EmptyCellFactory(yellow, false, false);
        EmptyCellFactory blueUnrevealedEmptyFactory = new EmptyCellFactory(blue, false, false);

        EmptyCellFactory yellowUnknownFactory = new EmptyCellFactory(yellow, false, true);

        //Row 1 (Part 1)
        board.addCell(nonExistentCellFactory.build(5));

        board.addCellsVertically();

        //Column 6
        board.addCell(redMineFactory.build(2));
        board.addCell(redUnrevealedEmptyFactory.build(2));
        board.addCell(redMineFactory.build(1));
        board.addCell(blueMineFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(3));
        board.addCell(redMineFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(redMineFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(2));
        board.addCell(redMineFactory.build(1));

        //Column 7
        board.addCell(yellowUnrevealedEmptyFactory.build(2));
        board.addCell(new EmptyCell(gray, false, true));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));
        board.addCell(yellowUnknownFactory.build(1));

        //Column 8
        board.addCell(new MineCell(yellow));
        board.addCell(yellowUnknownFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(yellowUnrevealedEmptyFactory.build(2));

        //Column 9
        board.addCell(yellowUnknownFactory.build(1));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(yellowUnrevealedEmptyFactory.build(2));

        //Column 10
        board.addCell(redMineFactory.build(2));
        board.addCell(redUnrevealedEmptyFactory.build(2));
        board.addCell(redMineFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(2));
        board.addCell(redMineFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(blueMineFactory.build(1));
        board.addCell(redMineFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(2));
        board.addCell(redMineFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(1));

        board.addCellsHorizontally();

        //Row 1 (Part 2)
        board.addCell(nonExistentCellFactory.build(5));

        //Row 2
        board.addCell(nonExistentCellFactory.build(10));

        //Row 3
        board.addCell(nonExistentCellFactory.build(10));

        //Row 4
        board.addCell(nonExistentCellFactory.build(10));

        //Row 5
        board.addCell(nonExistentCellFactory.build(10));

        //Row 6
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(blueMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(6));
        board.addCell(blueMineFactory.build(2));

        //Row 7
        board.addCell(yellowUnknownFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(new MineCell(yellow));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));

        //Row 8
        board.addCell(yellowUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(yellow));
        
        //Row 9
        board.addCell(yellowUnknownFactory.build(1));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(yellowUnrevealedEmptyFactory.build(2));

        //Row 10
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(blueMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(new EmptyCell(blue, false, true));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(new EmptyCell(blue, false, true));
        board.addCell(blueUnrevealedEmptyFactory.build(3));
        board.addCell(blueMineFactory.build(1));

        //Row 11
        board.addCell(nonExistentCellFactory.build(10));

        //Row 12
        board.addCell(nonExistentCellFactory.build(10));

        //Row 13
        board.addCell(nonExistentCellFactory.build(10));

        //Row 14
        board.addCell(nonExistentCellFactory.build(10));

        //Row 15
        board.addCell(nonExistentCellFactory.build(10));

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(nonExistentCellFactory.build(6));
        board.addVerticalLine(externalCounterFactory.build(3));
        board.addVerticalLine(nonExistentCellFactory.build(6));
        
        //HorizontalLines
        board.addHorizontalLine(nonExistentCellFactory.build(6));
        board.addHorizontalLine(externalCounterFactory.build(3));
        board.addHorizontalLine(nonExistentCellFactory.build(6));
        
        return board;
    }

    @Override public String toString(){
        return "60";
    }
}