package levels;

import cellFactories.EmptyCellFactory;
import cellFactories.MineCellFactory;
import cellLogic.Board;
import cellLogic.BoardLineless;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;
import cellLogic.MineCell;

public class Level54 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(16, "grises", "\u001B[0m");
        ColorCounter pink = new ColorCounter(13, "rosadas", "\u001B[38;5;212m");
        ColorCounter cyan = new ColorCounter(15, "cian", "\u001B[36m");
        ColorCounter yellow = new ColorCounter(15, "amarillas", "\u001B[33m");

        Board board = new BoardLineless(13, 13, true, gray, pink, cyan, yellow);
        
        MineCellFactory pinkMineFactory = new MineCellFactory(pink);
        MineCellFactory cyanMineFactory = new MineCellFactory(cyan);
        MineCellFactory yellowMineFactory = new MineCellFactory(yellow);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory cyanUnrevealedEmptyFactory = new EmptyCellFactory(cyan, false, false);
        EmptyCellFactory pinkUnrevealedEmptyFactory = new EmptyCellFactory(pink, false, false);
        EmptyCellFactory yellowUnrevealedEmptyFactory = new EmptyCellFactory(yellow, false, false);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        board.setAddsCellsHorizontally(false);

        //Line 1
        board.addCell(grayRevealedFactory.build(2));
        board.addCell(new EmptyCell(gray, true, true));
        board.addCell(grayRevealedFactory.build(9));
        board.addCell(new EmptyCell(gray, true, true));

        //Line 2
        board.addCell(new MineCell(gray));
        board.addCell(pinkUnrevealedEmptyFactory.build(3));
        board.addCell(new MineCell(gray));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(2));
        board.addCell(new MineCell(gray));
        board.addCell(yellowMineFactory.build(2));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 3
        board.addCell(grayRevealedFactory.build(13));

        //Line 4
        board.addCell(new MineCell(gray));
        board.addCell(pinkMineFactory.build(3));
        board.addCell(new MineCell(gray));
        board.addCell(cyanMineFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(yellowMineFactory.build(3));
        board.addCell(new MineCell(gray));

        //Line 5
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(pinkMineFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(pinkMineFactory.build(1));
        board.addCell(new MineCell(gray));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(yellowMineFactory.build(1));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));
        board.addCell(yellowMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 6
        board.addCell(grayRevealedFactory.build(13));

        //Line 7
        board.addCell(new MineCell(gray));
        board.addCell(pinkMineFactory.build(2));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(gray));
        board.addCell(yellowMineFactory.build(2));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(gray));

        //Line 8
        board.addCell(grayRevealedFactory.build(13));

        //Line 9
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(pinkMineFactory.build(1));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(pinkMineFactory.build(1));
        board.addCell(new MineCell(gray));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(yellowUnrevealedEmptyFactory.build(2));
        board.addCell(yellowMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 10
        board.addCell(new MineCell(gray));
        board.addCell(pinkMineFactory.build(3));
        board.addCell(new MineCell(gray));
        board.addCell(cyanMineFactory.build(3));
        board.addCell(new MineCell(gray));
        board.addCell(yellowMineFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 11
        board.addCell(grayRevealedFactory.build(13));

        //Line 12
        board.addCell(new MineCell(gray));
        board.addCell(pinkUnrevealedEmptyFactory.build(2));
        board.addCell(pinkMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(yellowMineFactory.build(2));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(gray));

        //Line 13
        board.addCell(grayRevealedFactory.build(13));
        
        return board;
    }

    @Override public String toString(){
        return "54";
    }
}