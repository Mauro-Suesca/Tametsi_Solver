package levels;

import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;
import cellLogic.ExternalCounter;
import cellLogic.MineCell;
import cellLogic.NonExistentCell;

public class Level20 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(52, "grises", ESC + "0m");
        ColorCounter red = new ColorCounter(5, "rojas", ESC + "31m");
        ColorCounter blue = new ColorCounter(3, "azules", ESC + "34m");

        BoardWithLines board = new BoardWithLines(15, 15, true, gray, red, blue);

        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));

        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));

        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 6, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 6, false, false));
        board.addCell(new EmptyCell(gray, 6, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));

        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));

        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 3, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 4, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(gray, 2, false, false));

        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 3, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 3, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new EmptyCell(gray, 3, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));

        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new MineCell(gray));

        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, true, false));
        board.addCell(new EmptyCell(gray, 2, false, false));

        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 5, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 4, true, false));
        board.addCell(new MineCell(gray));

        board.addCell(new EmptyCell(red, 0, false, true));
        board.addCell(new EmptyCell(red, 1, true, false));
        board.addCell(new EmptyCell(red, 1, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(red));
        board.addCell(new EmptyCell(red, 4, true, false));
        board.addCell(new MineCell(red));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(red, 0, false, false));
        board.addCell(new EmptyCell(red, 2, true, false));
        board.addCell(new MineCell(red));
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(red));
        board.addCell(new EmptyCell(red, 3, true, false));
        board.addCell(new MineCell(red));

        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 4, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));

        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 0, false, false));

        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 0, false, true));
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, true, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(gray, 0, false, false));

        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, true, false));
        board.addCell(new EmptyCell(gray, 0, false, false));

        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(blue, 1, true, false));
        board.addCell(new EmptyCell(blue, 0, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(blue, 0, false, false));
        board.addCell(new EmptyCell(blue, 1, true, false));
        board.addCell(new MineCell(blue));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(blue, 0, false, false));
        board.addCell(new EmptyCell(blue, 1, true, false));
        board.addCell(new EmptyCell(blue, 1, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(blue, 2, true, false));
        board.addCell(new EmptyCell(blue, 0, false, false));

        board.resetCurrentRowAndColumn();

        board.addVerticalLine(new ExternalCounter(7));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(5));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(5));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(9));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(4));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(8));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(6));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(5));

        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        
        return board;
    }

    @Override public String toString(){
        return "20";
    }
}