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

public class Level76 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(23, "gray", "\u001B[0m");
        ColorCounter green = new ColorCounter(0, "green", "\u001B[32m");
        ColorCounter orange = new ColorCounter(8, "orange", "\u001B[38;5;214m");
        ColorCounter yellow = new ColorCounter(4, "yellow", "\u001B[33m");
        
        BoardWithLines board = new BoardWithLines(13, 13, true, gray, green, orange, yellow);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory yellowMineFactory = new MineCellFactory(yellow);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory yellowUnrevealedEmptyFactory = new EmptyCellFactory(yellow, false, false);
        EmptyCellFactory orangeUnrevealedEmptyFactory = new EmptyCellFactory(orange, false, false);

        EmptyCellFactory grayUnknownFactory = new EmptyCellFactory(gray, false, true);
        EmptyCellFactory greenUnknownFactory = new EmptyCellFactory(green, false, true);
        EmptyCellFactory orangeUnknownFactory = new EmptyCellFactory(orange, false, true);

        //Row 1
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(1));

        //Row 2
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(3));

        //Row 3
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(greenUnknownFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnknownFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        //Row 4
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(greenUnknownFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(greenUnknownFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(new MineCell(orange));
        board.addCell(orangeUnrevealedEmptyFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));

        //Row 5
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(new EmptyCell(green, false, false));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(orangeUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(new MineCell(orange));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        //Row 6
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(new MineCell(orange));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(new MineCell(orange));
        board.addCell(nonExistentCellFactory.build(1));

        //Row 7
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(new EmptyCell(yellow, false, true));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(orange));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnknownFactory.build(1));

        //Row 8
        board.addCell(grayMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(yellowUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(new MineCell(orange));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(new MineCell(orange));

        //Row 9
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(yellowUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(orange));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));

        //Row 10
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(yellowUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(orangeUnknownFactory.build(1));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));

        //Row 11
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(yellowMineFactory.build(2));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(orangeUnknownFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));

        //Row 12
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(yellowUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(yellowMineFactory.build(1));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Row 13
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(yellowUnrevealedEmptyFactory.build(2));
        board.addCell(yellowMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(1));
        
        //HorizontalLines
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(1));
        
        return board;
    }

    @Override public String toString(){
        return "76";
    }
}