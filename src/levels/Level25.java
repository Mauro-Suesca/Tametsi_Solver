package levels;

import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;
import cellLogic.ExternalCounter;
import cellLogic.MineCell;
import cellLogic.NonExistentCell;

public class Level25 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(15, "grises", "\u001B[0m");
        ColorCounter blue = new ColorCounter(10, "azules", "\u001B[34m");

        BoardWithLines board = new BoardWithLines(9, 9, false, gray, blue);

        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new EmptyCell(blue, 0, false, false));
        board.addCell(new EmptyCell(blue, 1, false, false));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(blue, 1, false, false));
        board.addCell(new EmptyCell(blue, 0, false, false));
        board.addCell(new EmptyCell(blue, 1, false, false));
        board.addCell(new EmptyCell(blue, 0, false, false));
        board.addCell(new EmptyCell(gray, 0, false, false));

        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(blue, 0, false, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(blue, 0, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));

        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(blue, 1, false, true));
        board.addCell(new EmptyCell(blue, 0, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new MineCell(gray));

        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(blue, 0, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 4, true, true));
        board.addCell(new MineCell(gray));

        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));

        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(blue, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));

        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(blue, 1, false, false));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(blue, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 1, false, false));
        
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, true, false));
        board.addCell(new EmptyCell(blue, 1, false, false));
        board.addCell(new EmptyCell(gray, 4, true, true));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(blue, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));

        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(blue));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(blue, 2, false, false));
        board.addCell(new MineCell(blue));
        board.addCell(new MineCell(blue));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(blue, 2, false, false));
        board.addCell(new MineCell(gray));

        board.resetCurrentRowAndColumn();

        board.addVerticalLine(new ExternalCounter(3));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(2));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(3));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(3));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(4));

        board.addHorizontalLine(new ExternalCounter(1));
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new ExternalCounter(3));
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new ExternalCounter(7));
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new ExternalCounter(3));
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new ExternalCounter(7));
        
        return board;
    }

    @Override public String toString(){
        return "25";
    }
}