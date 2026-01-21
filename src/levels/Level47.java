package levels;

import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.ColorCounter;
import cellLogic.MineCell;

public class Level47 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(30, "grises", "\u001B[0m");
        ColorCounter blue = new ColorCounter(4, "azules", "\u001B[34m");
        ColorCounter orange = new ColorCounter(5, "naranjas", "\u001B[38;5;214m");

        BoardWithLines board = new BoardWithLines(11, 11, true, gray, blue, orange);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory orangeMineFactory = new MineCellFactory(orange);
                
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory orangeUnrevealedEmptyFactory = new EmptyCellFactory(orange, false, false);
        EmptyCellFactory blueUnrevealedEmptyFactory = new EmptyCellFactory(blue, false, false);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        //Line 1
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));

        //Line 2
        board.addCell(grayUnrevealedEmptyFactory.build(4));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(4));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 3
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(8));

        //Line 4
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        
        //Line 5
        board.addCell(grayUnrevealedEmptyFactory.build(4));
        board.addCell(grayRevealedFactory.build(4));
        board.addCell(orangeMineFactory.build(1));
        board.addCell(orangeUnrevealedEmptyFactory.build(2));

        //Line 6
        board.addCell(grayMineFactory.build(4));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(orangeMineFactory.build(2));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));

        //Line 7
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(orangeUnrevealedEmptyFactory.build(3));

        //Line 8
        board.addCell(grayMineFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(4));
        board.addCell(orangeMineFactory.build(1));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(orangeMineFactory.build(1));

        //Line 9
        board.addCell(grayUnrevealedEmptyFactory.build(4));
        board.addCell(new MineCell(blue));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(blue));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));

        //Line 10
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(blueUnrevealedEmptyFactory.build(3));
        board.addCell(new MineCell(blue));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));

        //Line 11
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(2));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(blue));
        board.addCell(blueUnrevealedEmptyFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(externalCounterFactory.build(4));
        board.addVerticalLine(nonExistentCellFactory.build(7));

        //HorizontalLines
        board.addHorizontalLine(externalCounterFactory.build(4));
        board.addHorizontalLine(nonExistentCellFactory.build(7));
        
        return board;
    }

    @Override public String toString(){
        return "47";
    }
}