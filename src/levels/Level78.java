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

public class Level78 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(19, "gray", ESC + "0m");
        ColorCounter blue = new ColorCounter(5, "blue", ESC + "34m");
        ColorCounter cyan = new ColorCounter(7, "cyan", ESC + "36m");
        ColorCounter purple = new ColorCounter(2, "purple", ESC + "35m");
        ColorCounter pink = new ColorCounter(11, "pink", ESC + "38;5;212m");
        
        BoardWithLines board = new BoardWithLines(14, 14, true, gray, blue, cyan, purple, pink);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory blueMineFactory = new MineCellFactory(blue);
        MineCellFactory cyanMineFactory = new MineCellFactory(cyan);
        MineCellFactory pinkMineFactory = new MineCellFactory(pink);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory blueUnrevealedEmptyFactory = new EmptyCellFactory(blue, false, false);
        EmptyCellFactory cyanUnrevealedEmptyFactory = new EmptyCellFactory(cyan, false, false);
        EmptyCellFactory purpleUnrevealedEmptyFactory = new EmptyCellFactory(purple, false, false);
        EmptyCellFactory pinkUnrevealedEmptyFactory = new EmptyCellFactory(pink, false, false);
        
        EmptyCellFactory grayUnknownRevealedFactory = new EmptyCellFactory(gray, true, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        board.setAddsCellsHorizontally(false);

        //Column 1
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(cyanUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(cyanMineFactory.build(2));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(new EmptyCell(cyan, false, true));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));

        //Column 2
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(3));
        board.addCell(blueMineFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(4));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));

        //Column 3
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(blueMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(3));
        board.addCell(nonExistentCellFactory.build(4));
        board.addCell(purpleUnrevealedEmptyFactory.build(3));
        board.addCell(new MineCell(purple));
        board.addCell(nonExistentCellFactory.build(1));

        //Column 4
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(1));

        //Column 5
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(8));
        board.addCell(new MineCell(purple));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(1));

        //Column 6
        board.addCell(cyanMineFactory.build(2));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(4));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(2));

        //Column 7
        board.addCell(nonExistentCellFactory.build(3));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(3));

        //Column 8
        board.addCell(nonExistentCellFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnknownRevealedFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(nonExistentCellFactory.build(3));

        //Column 9
        board.addCell(pinkMineFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(4));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(pinkMineFactory.build(2));

        //Column 10
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(4));
        board.addCell(purpleUnrevealedEmptyFactory.build(2));
        board.addCell(pinkMineFactory.build(1));

        //Column 11
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(new EmptyCell(gray, false, true));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(new EmptyCell(purple, false, true));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));

        //Column 12
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(blueMineFactory.build(1));
        board.addCell(new EmptyCell(blue, false, true));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(4));
        board.addCell(purpleUnrevealedEmptyFactory.build(4));
        board.addCell(nonExistentCellFactory.build(1));

        //Column 13
        board.addCell(pinkMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(blueMineFactory.build(2));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(pinkMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(pinkMineFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(4));
        board.addCell(pinkMineFactory.build(1));

        //Column 14
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(new EmptyCell(pink, false, true));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(pinkUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(pinkMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(pinkMineFactory.build(2));

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(nonExistentCellFactory.build(6));
        board.addVerticalLine(externalCounterFactory.build(2));
        board.addVerticalLine(nonExistentCellFactory.build(6));
        
        //HorizontalLines
        board.addHorizontalLine(nonExistentCellFactory.build(6));
        board.addHorizontalLine(externalCounterFactory.build(2));
        board.addHorizontalLine(nonExistentCellFactory.build(6));
        
        return board;
    }

    @Override public String toString(){
        return "78";
    }
}