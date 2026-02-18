package levels;

import cellLogic.Board;
import cellLogic.BoardLineless;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;
import cellLogic.MineCell;
import cellLogic.NonExistentCell;

public class Level21 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(8, "gray", ESC + "0m");
        ColorCounter red = new ColorCounter(4, "red", ESC + "31m");

        Board board = new BoardLineless(8, 8, true, gray, red);

        board.addCell(new EmptyCell(gray, 0, true, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(red, 2, false, false));
        board.addCell(new EmptyCell(red, 2, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 0, false, false));

        board.addCell(new EmptyCell(gray, 0, true, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(red));
        board.addCell(new MineCell(red));
        board.addCell(new EmptyCell(gray, 2, false, true));
        board.addCell(new EmptyCell(gray, 0, false, false));

        board.addCell(new EmptyCell(gray, 0, true, false));
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(red));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 1, false, true));
        
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(red, 1, false, false));
        board.addCell(new EmptyCell(red, 2, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 1, false, false));

        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));

        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(red, 1, false, false));
        board.addCell(new EmptyCell(red, 1, false, false));
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new NonExistentCell());

        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, true));
        board.addCell(new MineCell(red));
        board.addCell(new EmptyCell(red, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new NonExistentCell());

        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(red, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new MineCell(gray));
        
        return board;
    }

    @Override public String toString(){
        return "21";
    }
}