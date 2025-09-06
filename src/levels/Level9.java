package levels;

import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.EmptyCell;
import cellLogic.ExternalCounter;
import cellLogic.MineCell;

public class Level9 extends Level{
    @Override protected Board setup(){
        BoardWithLines board = new BoardWithLines(12, 6, 6, true);

        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new EmptyCell(0, false, true));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(0, false, false));

        board.addCell(new EmptyCell(3, false, false));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(4, false, false));
        board.addCell(new EmptyCell(3, false, true));
        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new EmptyCell(1, false, false));

        board.addCell(new MineCell());
        board.addCell(new EmptyCell(5, false, false));
        board.addCell(new MineCell());
        board.addCell(new MineCell());
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(1, false, true));

        board.addCell(new MineCell());
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(4, false, false));
        board.addCell(new EmptyCell(5, false, true));
        board.addCell(new EmptyCell(3, false, false));
        board.addCell(new EmptyCell(2, false, false));

        board.addCell(new MineCell());
        board.addCell(new EmptyCell(4, false, true));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(3, false, false));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(1, false, false));

        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new EmptyCell(1, false, true));

        board.resetCurrentRowAndColumn();

        board.addVerticalLine(new ExternalCounter(3));
        board.addVerticalLine(new ExternalCounter(3));
        board.addVerticalLine(new ExternalCounter(2));
        board.addVerticalLine(new ExternalCounter(2));
        board.addVerticalLine(new ExternalCounter(2));
        board.addVerticalLine(new ExternalCounter(0));

        board.addHorizontalLine(new ExternalCounter(1));
        board.addHorizontalLine(new ExternalCounter(1));
        board.addHorizontalLine(new ExternalCounter(4));
        board.addHorizontalLine(new ExternalCounter(2));
        board.addHorizontalLine(new ExternalCounter(3));
        board.addHorizontalLine(new ExternalCounter(1));

        return board;
    }

    @Override public String toString(){
        return "9";
    }
}