package levels;

import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;

public class Level64 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(31, "gray", "\u001B[0m");
        ColorCounter cyan = new ColorCounter(2, "cyan", "\u001B[36m");
                
        BoardWithLines board = new BoardWithLines(13, 13, false, gray, cyan);

        board.setMaxMineDifferenceForImaginaryCells(5);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory cyanMineFactory = new MineCellFactory(cyan, 2, 2);
                
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory cyanUnrevealedEmptyFactory = new EmptyCellFactory(cyan, false, false, 2, 2);
        
        EmptyCellFactory grayUnknownFactory = new EmptyCellFactory(gray, false, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);
        EmptyCellFactory cyanRevealedFactory = new EmptyCellFactory(cyan, true, false, 2, 2);

        //Row 1
        board.addCell(grayRevealedFactory.build(6));
        board.addCell(grayMineFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnknownFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Row 2
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(cyanRevealedFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(cyanRevealedFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        //Row 3
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(new EmptyCell(gray, true, true));
        board.addCell(grayUnrevealedEmptyFactory.build(3));

        //Row 4
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(7));

        //Row 5
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Row 6
        board.addCell(grayUnrevealedEmptyFactory.build(5));

        //Row 7
        board.addCell(grayUnrevealedEmptyFactory.build(4));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnknownFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(2));

        //Row 8
        board.addCell(grayUnknownFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Row 9
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));

        //Row 10
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Row 11
        board.addCell(grayMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Row 12
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Row 13
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(5));
        board.addCell(grayUnknownFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(2));
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
        board.addHorizontalLine(nonExistentCellFactory.build(2));
        board.addHorizontalLine(externalCounterFactory.build(1));
        
        return board;
    }

    @Override public String toString(){
        return "64";
    }
}