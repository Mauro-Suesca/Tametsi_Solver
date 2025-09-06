package levels;

import cellLogic.Board;
import cellLogic.BoardLineless;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;
import cellLogic.MineCell;

public class Level23 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(28, "grises", "\u001B[0m");
        ColorCounter blue = new ColorCounter(0, "azules", "\u001B[34m");
        ColorCounter purple = new ColorCounter(3, "moradas", "\u001B[35m");
        ColorCounter yellow = new ColorCounter(6, "amarillas", "\u001B[33m");

        Board board = new BoardLineless(12, 12, false, gray, blue, purple, yellow);

        board.addCell(new EmptyCell(blue, 3, false, false, 2, 2));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 1, false, false, 2, 2));
        board.addCell(new EmptyCell(purple, 1, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray, 2, 2));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(yellow, 0, false, false));

        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new MineCell(purple));
        board.addCell(new MineCell(yellow));
        board.addCell(new EmptyCell(gray, 1, false, false));

        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(blue, 2, false, false, 2, 2));
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 4, false, false, 2, 2));
        board.addCell(new EmptyCell(purple, 2, false, false));
        board.addCell(new MineCell(yellow));
        board.addCell(new EmptyCell(gray, 3, false, false, 2, 2));

        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(yellow, 0, false, false));
        board.addCell(new EmptyCell(purple, 1, false, false));

        board.addCell(new EmptyCell(gray, 4, false, false, 2, 2));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(blue, 4, false, false, 2, 2));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(yellow));
        board.addCell(new EmptyCell(gray, 1, false, false, 2, 2));
        board.addCell(new EmptyCell(purple, 1, false, false));
        board.addCell(new MineCell(gray));

        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(yellow, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(purple, 2, false, false));

        board.addCell(new MineCell(purple));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray, 2, 2));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(yellow));
        board.addCell(new EmptyCell(blue, 5, false, false, 2, 2));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray, 2, 2));

        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(purple, 1, true, false));
        board.addCell(new MineCell(yellow));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));

        board.addCell(new EmptyCell(gray, 0, true, false, 2, 2));
        board.addCell(new EmptyCell(purple, 2, true, false));
        board.addCell(new MineCell(yellow));
        board.addCell(new EmptyCell(gray, 7, false, false, 2, 2));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(blue, 7, false, false, 2, 2));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));

        board.addCell(new EmptyCell(yellow, 0, true, false));
        board.addCell(new EmptyCell(purple, 1, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, false, true));

        board.addCell(new EmptyCell(gray, 0, true, false));
        board.addCell(new EmptyCell(yellow, 0, true, false));
        board.addCell(new EmptyCell(gray, 2, true, false, 2, 2));
        board.addCell(new MineCell(purple));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray, 2, 2));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(blue, 1, false, false, 2, 2));

        board.addCell(new EmptyCell(yellow, 0, true, false));
        board.addCell(new EmptyCell(gray, 0, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(purple, 3, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        
        return board;
    }

    @Override public String toString(){
        return "23";
    }
}