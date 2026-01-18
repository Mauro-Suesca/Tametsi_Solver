package levels;

import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;

public class Level57 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(16, "grises", "\u001B[0m");
        ColorCounter pink = new ColorCounter(4, "rosadas", "\u001B[38;5;212m");
        ColorCounter purple = new ColorCounter(11, "moradas", "\u001B[35m");
        
        BoardWithLines board = new BoardWithLines(16, 8, true, gray, pink, purple);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory pinkMineFactory = new MineCellFactory(pink);
        MineCellFactory purpleMineFactory = new MineCellFactory(purple);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory pinkUnrevealedEmptyFactory = new EmptyCellFactory(pink, false, false);
        EmptyCellFactory purpleUnrevealedEmptyFactory = new EmptyCellFactory(purple, false, false);
        
        EmptyCellFactory pinkUnknownFactory = new EmptyCellFactory(pink, false, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);
        EmptyCellFactory purpleRevealedFactory = new EmptyCellFactory(purple, true, false);

        board.setAddsCellsHorizontally(false);

        //Vertical Line 1
        board.addCell(grayRevealedFactory.build(4));
        board.addCell(grayUnrevealedEmptyFactory.build(4));

        //Vertical Line 2
        board.addCell(pinkMineFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(pinkMineFactory.build(3));
        board.addCell(pinkUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));

        //Vertical Line 3
        board.addCell(purpleRevealedFactory.build(4));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        //Vertical Line 4
        board.addCell(grayRevealedFactory.build(4));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Vertical Line 5
        board.addCell(nonExistentCellFactory.build(4));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        //Vertical Line 6
        board.addCell(nonExistentCellFactory.build(4));
        board.addCell(grayMineFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        board.setAddsCellsHorizontally(true);

        //Horizontal Line 1
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(4));
        board.addCell(new EmptyCell(gray, false, true));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));

        //Horizontal Line 2
        board.addCell(grayMineFactory.build(1));
        board.addCell(purpleMineFactory.build(3));
        board.addCell(purpleUnrevealedEmptyFactory.build(4));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Horizontal Line 3
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(pinkUnknownFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(4));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Horizontal Line 4
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(pinkUnknownFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(pinkUnknownFactory.build(1));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        board.setAddsCellsHorizontally(false);

        //Vertical Line 7
        board.addCell(grayMineFactory.build(1));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Vertical Line 8
        board.addCell(purpleMineFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        //Vertical Line 9
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(pinkUnknownFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Vertical Line 10
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Vertical Line 11
        board.addCell(nonExistentCellFactory.build(4));

        //Vertical Line 12
        board.addCell(nonExistentCellFactory.build(4));

        //Vertical Line 13
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));

        //Vertical Line 14
        board.addCell(pinkUnrevealedEmptyFactory.build(4));

        //Vertical Line 15
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(purpleMineFactory.build(2));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));

        //Vertical Line 16
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));

        board.resetCurrentRowAndColumn();

        //VerticalCounters
        board.addVerticalLine(nonExistentCellFactory.build(16));
        
        //HorizontalCounters
        board.addHorizontalLine(externalCounterFactory.build(8));
        
        return board;
    }

    @Override public String toString(){
        return "57";
    }
}