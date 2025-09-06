package levels;

import cellLogic.Board;
import cellLogic.BoardLineless;
import cellLogic.EmptyCell;
import cellLogic.MineCell;

public class Level12 extends Level{
    @Override protected Board setup(){
        Board board = new BoardLineless(18, 10, 10, false);

        board.addCell(new EmptyCell(1, true, false));
        board.addCell(new MineCell());
        board.addCell(new MineCell(2, 2));
        board.addCell(new MineCell(2, 2));
        board.addCell(new EmptyCell(1, true, false));
        board.addCell(new EmptyCell(1, false, false, 2, 2));
        board.addCell(new MineCell());

        board.addCell(new EmptyCell(3, true, false, 2, 2));
        board.addCell(new EmptyCell(1, true, false));
        board.addCell(new EmptyCell(2, true, false));

        board.addCell(new EmptyCell(1, false, false, 2, 2));
        board.addCell(new EmptyCell(2, false, true, 2, 2));
        board.addCell(new EmptyCell(1, false, false, 2, 2));
        board.addCell(new EmptyCell(1, false, true));
        board.addCell(new MineCell());

        board.addCell(new MineCell());
        board.addCell(new EmptyCell(1, true, true));
        board.addCell(new EmptyCell(4, true, false, 2, 2));

        board.addCell(new EmptyCell(3, true, false, 2, 2));
        board.addCell(new EmptyCell(1, true, true));
        board.addCell(new EmptyCell(1, true, false));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(2, true, false));
        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new MineCell());

        board.addCell(new MineCell());
        board.addCell(new EmptyCell(3, false, false, 2, 2));
        board.addCell(new MineCell(2, 2));
        board.addCell(new MineCell(2, 2));
        board.addCell(new MineCell());

        board.addCell(new MineCell());
        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new EmptyCell(1, true, false));
        board.addCell(new EmptyCell(1, false, true));

        board.addCell(new MineCell());
        board.addCell(new EmptyCell(2, true, false, 2, 2));
        board.addCell(new EmptyCell(2, false, true, 2, 2));
        board.addCell(new EmptyCell(1, true, false, 2, 2));
        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(1, true, false));

        board.addCell(new MineCell());
        board.addCell(new EmptyCell(2, false, false, 2, 2));
        board.addCell(new EmptyCell(1, false, false));
        
        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(1, true, false));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new MineCell());
        
        return board;
    }

    @Override public String toString(){
        return "12";
    }
}