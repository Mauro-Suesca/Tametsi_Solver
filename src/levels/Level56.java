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

public class Level56 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(21, "grises", "\u001B[0m");
        ColorCounter purple = new ColorCounter(5, "moradas", "\u001B[35m");
        ColorCounter cyan = new ColorCounter(3, "cian", "\u001B[36m");        
        ColorCounter yellow = new ColorCounter(3, "amarillas", "\u001B[33m");

        BoardWithLines board = new BoardWithLines(8, 8, false, gray, purple, cyan, yellow);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory purpleMineFactory = new MineCellFactory(purple);
        MineCellFactory yellowMineFactory = new MineCellFactory(yellow);
                
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory cyanUnrevealedEmptyFactory = new EmptyCellFactory(cyan, false, false);
        EmptyCellFactory purpleUnrevealedEmptyFactory = new EmptyCellFactory(purple, false, false);
        EmptyCellFactory yellowUnrevealedEmptyFactory = new EmptyCellFactory(yellow, false, false);

        board.setAddsCellsHorizontally(false);

        //Line 1
        board.addCell(purpleUnrevealedEmptyFactory.build(3));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(2));

        //Line 2
        board.addCell(new MineCell(cyan));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(cyan));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(2));

        //Line 3
        board.addCell(yellowUnrevealedEmptyFactory.build(2));
        board.addCell(new EmptyCell(yellow, false, true));
        board.addCell(yellowMineFactory.build(1));
        board.addCell(new EmptyCell(gray, false, true));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        
        //Line 4
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(new EmptyCell(gray, true, false, 2, 2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(new EmptyCell(gray, false, true));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 5
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(4));
        board.addCell(new EmptyCell(gray, false, true));

        //Line 6
        board.addCell(grayMineFactory.build(4));
        board.addCell(purpleMineFactory.build(4));

        //Line 7
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(3));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(cyan));
        board.addCell(cyanUnrevealedEmptyFactory.build(2));

        //Line 8
        board.addCell(grayMineFactory.build(4));
        board.addCell(yellowUnrevealedEmptyFactory.build(2));
        board.addCell(yellowMineFactory.build(2));

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(externalCounterFactory.build(3));
        board.addVerticalLine(nonExistentCellFactory.build(2));
        board.addVerticalLine(externalCounterFactory.build(3));

        //HorizontalLines
        board.addHorizontalLine(externalCounterFactory.build(3));
        board.addHorizontalLine(nonExistentCellFactory.build(2));
        board.addHorizontalLine(externalCounterFactory.build(3));
        
        return board;
    }

    @Override public String toString(){
        return "56";
    }
}