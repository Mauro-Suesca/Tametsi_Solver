package levels;

import cellLogic.Board;
import cellLogic.BoardLineless;
import cellLogic.EmptyCell;
import cellLogic.MineCell;

public class Level6 extends Level{
    @Override protected Board setup(){
        Board board = new BoardLineless(6, 5, 5, true);

        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new EmptyCell(1, true, false));
        board.addCell(new EmptyCell(0, true, false));
        board.addCell(new EmptyCell(2, true, false));
        board.addCell(new MineCell());

        board.addCell(new MineCell());
        board.addCell(new EmptyCell(1, true, false));
        board.addCell(new EmptyCell(1, true, false));
        board.addCell(new EmptyCell(3, true, false));
        board.addCell(new MineCell());

        board.addCell(new EmptyCell(3, false, false));
        board.addCell(new EmptyCell(3, false, false));
        board.addCell(new EmptyCell(2, false, true));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(2, false, false));

        board.addCell(new MineCell());
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new EmptyCell(1, false, false));
        
        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new EmptyCell(1, false, true));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(0, false, false));

        return board;
    }

    @Override public String toString(){
        return "6";
    }
}