package levels;

import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.EmptyCell;
import cellLogic.ExternalCounter;
import cellLogic.MineCell;
import cellLogic.NonExistentCell;

public class Level18 extends Level{
    @Override protected Board setup(){
        BoardWithLines board = new BoardWithLines(30, 10, 10, false);

        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new MineCell());

        board.addCell(new MineCell());
        board.addCell(new EmptyCell(5, true, false, 2, 2));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(3, true, false, 2, 2));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(3, true, false, 2, 2));
        board.addCell(new MineCell());

        board.addCell(new MineCell());
        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new EmptyCell(1, false, false));

        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(3, false, false));
        board.addCell(new MineCell());
        board.addCell(new MineCell());
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(2, true, false));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(2, false, false));

        board.addCell(new MineCell());
        board.addCell(new EmptyCell(6, true, false, 2, 2));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(5, true, false, 2, 2));
        board.addCell(new EmptyCell(2, true, false));
        board.addCell(new EmptyCell(4, true, false, 2, 2));
        board.addCell(new MineCell());

        board.addCell(new MineCell());
        board.addCell(new MineCell());
        board.addCell(new MineCell());
        board.addCell(new MineCell());

        board.addCell(new EmptyCell(3, false, false));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(2, false, true));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(1, true, false));
        board.addCell(new MineCell());

        board.addCell(new MineCell());
        board.addCell(new EmptyCell(4, true, false, 2, 2));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(3, true, false, 2, 2));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(4, true, false, 2, 2));
        board.addCell(new MineCell());

        board.addCell(new MineCell());
        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new MineCell());
        board.addCell(new MineCell());

        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(1, false, true));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(1, true, false));
        board.addCell(new MineCell());

        board.resetCurrentRowAndColumn();

        board.addVerticalLine(new ExternalCounter(6));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(5));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(4));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(8));

        board.addHorizontalLine(new ExternalCounter(4));
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new ExternalCounter(5));
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new ExternalCounter(2));
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new ExternalCounter(1));
        
        return board;
    }

    @Override public String toString(){
        return "18";
    }
}