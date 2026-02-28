package levels;

import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;

public class Level59 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(27, "gray", ESC + "0m");
        ColorCounter blue = new ColorCounter(10, "blue", ESC + "34m");
        ColorCounter cyan = new ColorCounter(9, "cyan", ESC + "36m");
        ColorCounter red = new ColorCounter(2, "red", ESC + "31m");
        
        BoardWithLines board = new BoardWithLines(16, 16, false, gray, blue, cyan, red);

        board.setMaxMineDifferenceForImaginaryCells(5);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory blueMineFactory = new MineCellFactory(blue);
        MineCellFactory cyanMineFactory = new MineCellFactory(cyan);
        MineCellFactory redMineFactory = new MineCellFactory(red, 2, 4);
                
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory blueUnrevealedEmptyFactory = new EmptyCellFactory(blue, false, false);
        EmptyCellFactory cyanUnrevealedEmptyFactory = new EmptyCellFactory(cyan, false, false);
        EmptyCellFactory redUnrevealedEmptyFactory = new EmptyCellFactory(red, false, false, 2, 4);

        EmptyCellFactory grayUnknownEmptyFactory = new EmptyCellFactory(gray, false, true);

        board.addCellsVertically();

        //Column 1
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Column 2
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(redMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(new EmptyCell(cyan, false, true));
        board.addCell(cyanUnrevealedEmptyFactory.build(3));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(redMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Column 3
        board.addCell(grayUnknownEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(5));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Column 4
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(4));
        board.addCell(grayMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(5));

        //Column 5
        board.addCell(blueUnrevealedEmptyFactory.build(3));
        board.addCell(blueMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(3));
        board.addCell(blueMineFactory.build(2));

        board.addCellsHorizontally();

        //Row 1
        board.addCell(nonExistentCellFactory.build(6));
        board.addCell(blueMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(4));

        //Row 2
        board.addCell(nonExistentCellFactory.build(6));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        //Row 3
        board.addCell(nonExistentCellFactory.build(6));
        board.addCell(blueMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));

        //Row 4
        board.addCell(nonExistentCellFactory.build(6));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Row 5
        board.addCell(blueUnrevealedEmptyFactory.build(3));
        board.addCell(blueMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(blueMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        board.addCellsVertically();

        //Column 6
        board.addCell(grayUnknownEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        board.addCellsHorizontally();

        //Row 12
        board.addCell(blueUnrevealedEmptyFactory.build(5));
        board.addCell(blueMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        //Row 13
        board.addCell(nonExistentCellFactory.build(6));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));

        //Row 14
        board.addCell(nonExistentCellFactory.build(6));
        board.addCell(blueMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));

        //Row 15
        board.addCell(nonExistentCellFactory.build(6));
        board.addCell(blueMineFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Row 16
        board.addCell(nonExistentCellFactory.build(6));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(4));

        board.addCellsVertically();

        //Column 7
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(1));

        //Column 8
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Column 9
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnknownEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Column 10
        board.addCell(grayUnrevealedEmptyFactory.build(4));
        board.addCell(grayUnknownEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Column 11
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Column 12
        board.addCell(grayUnrevealedEmptyFactory.build(2));

        //Column 13
        board.addCell(grayMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(3));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Column 14
        board.addCell(cyanMineFactory.build(3));
        board.addCell(cyanUnrevealedEmptyFactory.build(3));

        //Column 15
        board.addCell(cyanMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(3));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));

        //Column 16
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(4));

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(2));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(2));
        board.addVerticalLine(externalCounterFactory.build(4));
        board.addVerticalLine(nonExistentCellFactory.build(2));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(2));
        board.addVerticalLine(externalCounterFactory.build(1));

        //HorizontalLines
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(4));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(4));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(4));
        board.addHorizontalLine(externalCounterFactory.build(1));
        
        return board;
    }

    @Override public String toString(){
        return "59";
    }
}