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
        ColorCounter gray = new ColorCounter(16, "gray", ESC + "0m");
        ColorCounter pink = new ColorCounter(13, "pink", ESC + "38;5;212m");
        ColorCounter cyan = new ColorCounter(15, "cyan", ESC + "36m");
        ColorCounter orange = new ColorCounter(15, "orange", ESC + "38;5;214m");

        Board board = new BoardLineless(13, 13, true, gray, pink, cyan, orange);
        
        MineCellFactory pinkMineFactory = new MineCellFactory(pink);
        MineCellFactory cyanMineFactory = new MineCellFactory(cyan);
        MineCellFactory orangeMineFactory = new MineCellFactory(orange);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory cyanUnrevealedEmptyFactory = new EmptyCellFactory(cyan, false, false);
        EmptyCellFactory pinkUnrevealedEmptyFactory = new EmptyCellFactory(pink, false, false);
        EmptyCellFactory orangeUnrevealedEmptyFactory = new EmptyCellFactory(orange, false, false);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        board.addCellsVertically();

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
        board.addCell(orangeMineFactory.build(2));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 3
        board.addCell(grayRevealedFactory.build(13));

        //Line 4
        board.addCell(new MineCell(gray));
        board.addCell(pinkMineFactory.build(3));
        board.addCell(new MineCell(gray));
        board.addCell(cyanMineFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(orangeMineFactory.build(3));
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
        board.addCell(orangeMineFactory.build(1));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(orangeMineFactory.build(1));
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
        board.addCell(orangeMineFactory.build(2));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
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
        board.addCell(orangeUnrevealedEmptyFactory.build(2));
        board.addCell(orangeMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 10
        board.addCell(new MineCell(gray));
        board.addCell(pinkMineFactory.build(3));
        board.addCell(new MineCell(gray));
        board.addCell(cyanMineFactory.build(3));
        board.addCell(new MineCell(gray));
        board.addCell(orangeMineFactory.build(3));
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
        board.addCell(orangeMineFactory.build(2));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(gray));

        //Line 13
        board.addCell(grayRevealedFactory.build(13));
        
        return board;
    }

    @Override public String toString(){
        return "54";
    }
}