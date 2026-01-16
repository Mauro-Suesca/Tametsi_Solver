package levels;

import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.ColorCounter;
import cellLogic.MineCell;

public class Level50 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(30, "grises", "\u001B[0m");
        ColorCounter purple = new ColorCounter(7, "moradas", "\u001B[35m");
        ColorCounter green = new ColorCounter(3, "verdes", "\u001B[32m");
        
        BoardWithLines board = new BoardWithLines(12, 12, true, gray, purple, green);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
                
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory purpleUnrevealedEmptyFactory = new EmptyCellFactory(purple, false, false);
        EmptyCellFactory greenUnrevealedEmptyFactory = new EmptyCellFactory(green, false, false);

        EmptyCellFactory greenUnknownFactory = new EmptyCellFactory(green, false, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);
        EmptyCellFactory purpleRevealedFactory = new EmptyCellFactory(purple, true, false);

        //Line 1
        board.addCell(new MineCell(purple));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(2));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));

        //Line 2
        board.addCell(grayMineFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(greenUnknownFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(greenUnknownFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        //Line 3
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(4));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(purple));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        //Line 4
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(green));
        board.addCell(greenUnknownFactory.build(1));
        board.addCell(nonExistentCellFactory.build(6));
        board.addCell(greenUnrevealedEmptyFactory.build(3));

        //Line 5
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(new MineCell(purple));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));

        //Line 6
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(purple));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));

        //Line 7
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));

        //Line 8
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(new MineCell(purple));
        board.addCell(grayMineFactory.build(2));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));

        //Line 9
        board.addCell(greenUnrevealedEmptyFactory.build(3));
        board.addCell(nonExistentCellFactory.build(6));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(green));
        board.addCell(greenUnrevealedEmptyFactory.build(1));

        //Line 10
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(4));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(purple));
        board.addCell(grayRevealedFactory.build(2));

        //Line 11
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(purple));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(green));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(purpleRevealedFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));

        //Line 12
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(4));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(purpleRevealedFactory.build(1));

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(nonExistentCellFactory.build(4));
        board.addVerticalLine(externalCounterFactory.build(4));
        board.addVerticalLine(nonExistentCellFactory.build(4));
        
        //HorizontalLines
        board.addHorizontalLine(nonExistentCellFactory.build(4));
        board.addHorizontalLine(externalCounterFactory.build(4));
        board.addHorizontalLine(nonExistentCellFactory.build(4));
        
        return board;
    }

    @Override public String toString(){
        return "50";
    }
}