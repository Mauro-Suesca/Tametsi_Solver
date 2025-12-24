package levels;

import cellFactories.EmptyCellFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardLineless;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;
import cellLogic.MineCell;

public class Level32 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(3, "gray", "\u001B[0m");
        ColorCounter purple = new ColorCounter(15, "purple", "\u001B[35m");
        ColorCounter cyan = new ColorCounter(4, "cyan", "\u001B[36m");
        ColorCounter yellow = new ColorCounter(5, "yellow", "\u001B[33m");

        Board board = new BoardLineless(11, 13, true, gray, cyan, purple, yellow);

        MineCellFactory purpleMineFactory = new MineCellFactory(purple);
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory cyanUnrevealedEmptyFactory = new EmptyCellFactory(cyan, false, false);
        EmptyCellFactory purpleUnrevealedEmptyFactory = new EmptyCellFactory(purple, false, false);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        //Line 1
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(7));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(gray));

        //Line 2
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(gray));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(purpleMineFactory.build(2));
        board.addCell(purpleUnrevealedEmptyFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(gray));

        //Line 3
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(cyan));
        board.addCell(cyanUnrevealedEmptyFactory.build(4));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));

        //Line 4
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(new EmptyCell(yellow, false, false));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(new EmptyCell(yellow, false, false));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));

        //Line 5
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(new EmptyCell(yellow, false, false));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(new EmptyCell(yellow, false, false));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(new MineCell(yellow));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));

        //Line 6
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(new MineCell(yellow));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(new EmptyCell(yellow, false, false));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));

        //Line 7
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(new MineCell(cyan));
        board.addCell(new MineCell(yellow));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(new EmptyCell(yellow, false, false));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(new EmptyCell(yellow, false, false));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));

        //Line 8
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(new EmptyCell(yellow, false, false));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(new EmptyCell(yellow, false, false));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));

        //Line 9
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(new EmptyCell(yellow, false, false));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(new EmptyCell(yellow, false, false));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(new MineCell(yellow));
        board.addCell(new MineCell(cyan));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));

        //Line 10
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(new EmptyCell(purple, false, true));
        board.addCell(new MineCell(cyan));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(new MineCell(yellow));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(new EmptyCell(yellow, false, false));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));

        //Line 11
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(5));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));

        //Line 12
        board.addCell(new EmptyCell(gray, false, true));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(2));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(3));
        board.addCell(new EmptyCell(purple, true, false));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(new EmptyCell(gray, true, true));

        //Line 13
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(7));
        board.addCell(grayRevealedFactory.build(2));

        return board;
    }

    @Override public String toString(){
        return "32";
    }
}