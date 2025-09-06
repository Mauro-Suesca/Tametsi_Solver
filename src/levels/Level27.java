package levels;

import cellLogic.Board;
import cellLogic.BoardLineless;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;
import cellLogic.MineCell;
import cellLogic.NonExistentCell;

public class Level27 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(15, "grises", "\u001B[0m");
        ColorCounter cyan = new ColorCounter(3, "cian", "\u001B[36m");
        ColorCounter blue = new ColorCounter(4, "azules", "\u001B[34m");
        ColorCounter pink = new ColorCounter(1, "rosadas", "\u001B[38;5;212m");
        ColorCounter purple = new ColorCounter(4, "moradas", "\u001B[35m");

        Board board = new BoardLineless(12, 12, true, gray, cyan, blue, pink, purple);

        board.addCell(new EmptyCell(gray, 0, true, false));
        board.addCell(new EmptyCell(gray, 0, true, false));
        board.addCell(new EmptyCell(gray, 0, true, false));
        board.addCell(new EmptyCell(cyan, 0, true, false));
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(purple, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));

        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(gray, 3, true, false));
        board.addCell(new EmptyCell(cyan, 2, true, false));
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(purple));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));

        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(cyan));
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(purple, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));

        board.addCell(new EmptyCell(pink, 2, false, false));
        board.addCell(new MineCell(pink));
        board.addCell(new EmptyCell(pink, 5, false, false));
        board.addCell(new EmptyCell(cyan, 3, false, false));
        board.addCell(new EmptyCell(pink, 2, false, false));
        board.addCell(new EmptyCell(pink, 0, false, false));
        board.addCell(new EmptyCell(pink, 0, false, false));
        board.addCell(new EmptyCell(pink, 1, false, false));
        board.addCell(new EmptyCell(pink, 1, false, false));
        board.addCell(new EmptyCell(pink, 1, false, false));
        board.addCell(new EmptyCell(pink, 0, false, false));
        board.addCell(new EmptyCell(pink, 0, false, false));

        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(cyan));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(purple));
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());

        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(cyan, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(purple, 2, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());

        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(cyan, 2, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(purple, 2, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());

        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(cyan));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(purple));
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());

        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(blue, 2, false, false));
        board.addCell(new EmptyCell(blue, 1, false, false));
        board.addCell(new EmptyCell(blue, 3, false, false));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(blue, 2, false, false));
        board.addCell(new EmptyCell(blue, 0, false, false));
        board.addCell(new EmptyCell(blue, 1, false, false));
        board.addCell(new EmptyCell(purple, 2, false, false));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(blue, 3, false, false));
        board.addCell(new MineCell(blue));

        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(cyan, 2, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(purple, 1, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, false, false));
        
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 5, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(cyan, 1, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(purple, 1, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));

        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(cyan, 1, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(purple));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));

        board.start();
        
        return board;
    }

    @Override public String toString(){
        return "27";
    }
}