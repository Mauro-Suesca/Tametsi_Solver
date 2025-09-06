package levels;

import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;
import cellLogic.ExternalCounter;
import cellLogic.MineCell;
import cellLogic.NonExistentCell;

public class Level13 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(6, "grises", "\u001B[0m");
        ColorCounter red = new ColorCounter(5, "rojas", "\u001B[31m");
        ColorCounter blue = new ColorCounter(4, "azules", "\u001B[34m");

        BoardWithLines board = new BoardWithLines(6, 6, true, gray, red, blue);

        board.addCell(new EmptyCell(red, 1, false, true));
        board.addCell(new EmptyCell(red, 1, false, true));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(blue, 1, false, false));

        board.addCell(new MineCell(red));
        board.addCell(new EmptyCell(red, 2, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new EmptyCell(blue, 3, false, false));
        board.addCell(new EmptyCell(blue, 2, false, false));

        board.addCell(new EmptyCell(gray, 3, false, true));
        board.addCell(new EmptyCell(gray, 5, false, false));
        board.addCell(new MineCell(red));
        board.addCell(new EmptyCell(blue, 4, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));

        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(red, 6, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, false, false));

        board.addCell(new EmptyCell(blue, 4, true, false));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(red));
        board.addCell(new MineCell(red));

        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(blue, 2, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 3, false, true));
        board.addCell(new MineCell(red));
        board.addCell(new EmptyCell(red, 3, false, false));

        board.resetCurrentRowAndColumn();

        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(2));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(5));
        board.addVerticalLine(new NonExistentCell());

        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new ExternalCounter(1));
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new ExternalCounter(4));
        board.addHorizontalLine(new NonExistentCell());
        
        return board;
    }

    @Override public String toString(){
        return "13";
    }
}