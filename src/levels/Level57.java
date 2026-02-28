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
        ColorCounter gray = new ColorCounter(16, "gray", ESC + "0m");
        ColorCounter pink = new ColorCounter(4, "pink", ESC + "38;5;212m");
        ColorCounter purple = new ColorCounter(11, "purple", ESC + "35m");
        
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

        board.addCellsVertically();

        //Column 1
        board.addCell(grayRevealedFactory.build(4));
        board.addCell(grayUnrevealedEmptyFactory.build(4));

        //Column 2
        board.addCell(pinkMineFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(pinkMineFactory.build(3));
        board.addCell(pinkUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));

        //Column 3
        board.addCell(purpleRevealedFactory.build(4));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        //Column 4
        board.addCell(grayRevealedFactory.build(4));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Column 5
        board.addCell(nonExistentCellFactory.build(4));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        //Column 6
        board.addCell(nonExistentCellFactory.build(4));
        board.addCell(grayMineFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        board.addCellsHorizontally();

        //Row 1
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(4));
        board.addCell(new EmptyCell(gray, false, true));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));

        //Row 2
        board.addCell(grayMineFactory.build(1));
        board.addCell(purpleMineFactory.build(3));
        board.addCell(purpleUnrevealedEmptyFactory.build(4));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Row 3
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(pinkUnknownFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(4));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Row 4
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(pinkUnknownFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(pinkUnknownFactory.build(1));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        board.addCellsVertically();

        //Column 7
        board.addCell(grayMineFactory.build(1));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Column 8
        board.addCell(purpleMineFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        //Column 9
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(pinkUnknownFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Column 10
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Column 11
        board.addCell(nonExistentCellFactory.build(4));

        //Column 12
        board.addCell(nonExistentCellFactory.build(4));

        //Column 13
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));

        //Column 14
        board.addCell(pinkUnrevealedEmptyFactory.build(4));

        //Column 15
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(purpleMineFactory.build(2));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));

        //Column 16
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(nonExistentCellFactory.build(16));
        
        //HorizontalLines
        board.addHorizontalLine(externalCounterFactory.build(8));
        
        return board;
    }

    @Override public String toString(){
        return "57";
    }
}