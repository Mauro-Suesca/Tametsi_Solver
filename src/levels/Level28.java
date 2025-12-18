package levels;

import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;
import cellLogic.ExternalCounter;
import cellLogic.MineCell;
import cellLogic.NonExistentCell;

public class Level28 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(53, "gray", "\u001B[0m");
        ColorCounter blue = new ColorCounter(6, "blue", "\u001B[34m");

        BoardWithLines board = new BoardWithLines(16, 12, true, gray, blue);

        //Line 1
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 0, false, false));

        //Line 2
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(blue, 4, false, false));
        board.addCell(new EmptyCell(blue, 3, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(blue, 3, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));

        //Line 3
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(blue));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new EmptyCell(blue, 4, false, false));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(gray, 2, false, false));

        //Line 4
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 5, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(gray));

        //Line 5
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(gray));
        
        //Line 6
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new EmptyCell(gray, 1, false, true));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));

        //Line 7
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, false, true));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 0, false, false));

        //Line 8
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));

        //Line 9
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));

        //Line 10
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(blue, 2, false, false));
        board.addCell(new EmptyCell(blue, 2, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 5, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(blue, 5, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));

        //Line 11
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(blue, 2, false, false));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 3, false, true));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(blue, 3, false, false));
        board.addCell(new EmptyCell(blue, 3, false, false));
        board.addCell(new MineCell(gray));

        //Line 12
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, true));
        board.addCell(new EmptyCell(gray, 1, false, false));

        board.resetCurrentRowAndColumn();

        board.addVerticalLine(new ExternalCounter(5));
        board.addVerticalLine(new ExternalCounter(3));
        board.addVerticalLine(new ExternalCounter(2));
        board.addVerticalLine(new ExternalCounter(2));
        board.addVerticalLine(new ExternalCounter(6));
        board.addVerticalLine(new ExternalCounter(5));
        board.addVerticalLine(new ExternalCounter(3));
        board.addVerticalLine(new ExternalCounter(2));
        board.addVerticalLine(new ExternalCounter(0));
        board.addVerticalLine(new ExternalCounter(5));
        board.addVerticalLine(new ExternalCounter(5));
        board.addVerticalLine(new ExternalCounter(2));
        board.addVerticalLine(new ExternalCounter(6));
        board.addVerticalLine(new ExternalCounter(7));
        board.addVerticalLine(new ExternalCounter(2));
        board.addVerticalLine(new ExternalCounter(4));

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
        return "28";
    }
}