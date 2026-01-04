package levels;

import cellFactories.EmptyCellFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardLineless;
import cellLogic.ColorCounter;
import cellLogic.MineCell;

public class Level44 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(19, "grises", "\u001B[0m");
        ColorCounter yellow = new ColorCounter(3, "amarillas", "\u001B[33m");
        ColorCounter red = new ColorCounter(8, "rojas", "\u001B[31m");

        Board board = new BoardLineless(12, 12, true, gray, yellow, red);

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory redMineFactory = new MineCellFactory(red);
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory redUnrevealedEmptyFactory = new EmptyCellFactory(red, false, false);
        EmptyCellFactory yellowUnrevealedEmptyFactory = new EmptyCellFactory(yellow, false, false);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        //Line 1
        board.addCell(grayRevealedFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(new MineCell(yellow));
        board.addCell(redUnrevealedEmptyFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 2
        board.addCell(grayRevealedFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(4));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(redMineFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(2));

        //Line 3
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));
        board.addCell(redMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(3));

        //Line 4
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(redMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 5
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));

        //Line 6
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(yellow));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(redMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));

        //Line 7
        board.addCell(grayUnrevealedEmptyFactory.build(4));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(new MineCell(yellow));
        board.addCell(redUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        //Line 8
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(2));

        //Line 9
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(4));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));
        board.addCell(redMineFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));

        //Line 10
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(4));
        board.addCell(grayMineFactory.build(1));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(redMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));

        //Line 11
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(redMineFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 12
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(1));
        
        return board;
    }

    @Override public String toString(){
        return "44";
    }
}