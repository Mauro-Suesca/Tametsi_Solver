package levels;

import cellFactories.EmptyCellFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardLineless;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;
import cellLogic.MineCell;

public class Level30 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(61, "gray", "\u001B[0m");
        ColorCounter green = new ColorCounter(2, "green", "\u001B[32m");
        ColorCounter cyan = new ColorCounter(1, "cyan", "\u001B[36m");
        ColorCounter pink = new ColorCounter(1, "pink", "\u001B[38;5;212m");

        Board board = new BoardLineless(16, 16, true, gray, cyan, green, pink);

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory greenMineFactory = new MineCellFactory(green);
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory cyanUnrevealedEmptyFactory = new EmptyCellFactory(cyan, false, false);
        EmptyCellFactory pinkUnrevealedEmptyFactory = new EmptyCellFactory(pink, false, false);
        EmptyCellFactory greenUnrevealedEmptyFactory = new EmptyCellFactory(green, false, false);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);
        EmptyCellFactory cyanUnrevealedUnknownEmptyFactory = new EmptyCellFactory(cyan, false, true);

        //Line 1
        board.addCell(grayMineFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(6));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 2
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(7));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 3
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(new EmptyCell(gray, false, true));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));

        //Line 4
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(cyanUnrevealedEmptyFactory.build(3));
        board.addCell(cyanUnrevealedUnknownEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(pinkUnrevealedEmptyFactory.build(4));
        board.addCell(grayUnrevealedEmptyFactory.build(3));

        //Line 5
        board.addCell(nonExistentCellFactory.build(6));
        board.addCell(cyanUnrevealedUnknownEmptyFactory.build(1));
        board.addCell(new EmptyCell(gray, false, true));
        board.addCell(new EmptyCell(gray, false, true));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(new MineCell(pink));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));

        //Line 6
        board.addCell(nonExistentCellFactory.build(6));
        board.addCell(new MineCell(cyan));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(new EmptyCell(pink, false, true));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));

        //Line 7
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(cyanUnrevealedUnknownEmptyFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));

        //Line 8
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(new EmptyCell(gray, false, true));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(1));

        //Line 9
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(5));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(2));

        //Line 10
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(greenUnrevealedEmptyFactory.build(4));
        board.addCell(grayMineFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(1));

        //Line 11
        board.addCell(grayMineFactory.build(2));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(9));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));

        //Line 12
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(9));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));

        //Line 13
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(greenUnrevealedEmptyFactory.build(2));
        board.addCell(greenMineFactory.build(2));
        board.addCell(grayRevealedFactory.build(4));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(4));

        //Line 14
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(4));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(2));

        //Line 15
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));

        //Line 16
        board.addCell(grayMineFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(3));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(4));

        return board;
    }

    @Override public String toString(){
        return "30";
    }
}