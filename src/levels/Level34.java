package levels;

import cellFactories.EmptyCellFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardLineless;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;

public class Level34 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(25, "grises", "\u001B[0m");
        ColorCounter cyan = new ColorCounter(0, "cian", "\u001B[36m");
        ColorCounter blue = new ColorCounter(9, "azules", "\u001B[34m");

        Board board = new BoardLineless(15, 15, false, gray, cyan, blue);

        board.setMaxMineDifferenceForImaginaryCells(5);

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory blueMineFactory = new MineCellFactory(blue);
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory blueUnrevealedEmptyFactory = new EmptyCellFactory(blue, false, false);

        EmptyCellFactory gray3x3Factory = new EmptyCellFactory(gray, true, false, 3, 3);
        EmptyCellFactory gray2x2Factory = new EmptyCellFactory(gray, true, false, 2, 2);

        //Line 1
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(8));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));

        //Line 2
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(new EmptyCell(cyan, false, false, 2, 2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(gray3x3Factory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(gray2x2Factory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));

        //Line 3
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        //Line 4
        board.addCell(grayMineFactory.build(1));
        board.addCell(gray2x2Factory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(3));
        board.addCell(blueMineFactory.build(2));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(gray2x2Factory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 5
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(2));
        board.addCell(blueMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 6
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(2));
        board.addCell(new EmptyCell(gray, true, false, 5, 5));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(blueMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));

        //Line 7
        board.addCell(new EmptyCell(gray, false, true));
        board.addCell(gray3x3Factory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(2));
        board.addCell(gray3x3Factory.build(1));
        board.addCell(grayMineFactory.build(1));

        //Line 8
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));

        //Line 9
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(blueMineFactory.build(2));
        board.addCell(grayMineFactory.build(1));

        //Line 10
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(blueUnrevealedEmptyFactory.build(2));
        board.addCell(blueMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 11
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(new EmptyCell(gray, true, true, 2, 2));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(blueMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(2));
        board.addCell(new EmptyCell(blue, false, true));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(new EmptyCell(gray, true, false, 2, 2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 12
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(new EmptyCell(blue, false, true));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(gray3x3Factory.build(1));
        board.addCell(blueMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 13
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(gray2x2Factory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(new EmptyCell(cyan, false, false, 2, 2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));

        //Line 14
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(2));

        //Line 15
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(7));
        board.addCell(grayMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        
        return board;
    }

    @Override public String toString(){
        return "34";
    }
}