package levels;

import cellFactories.EmptyCellFactory;
import cellFactories.MineCellFactory;
import cellLogic.Board;
import cellLogic.BoardLineless;
import cellLogic.ColorCounter;
import cellLogic.NonExistentCell;

public class Level63 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(0, "gray", ESC + "0m");
        ColorCounter blue = new ColorCounter(9, "blue", ESC + "34m");
        ColorCounter cyan = new ColorCounter(34, "cyan", ESC + "36m");
        
        Board board = new BoardLineless(11, 11, true, blue, cyan);

        MineCellFactory blueMineFactory = new MineCellFactory(blue);
        MineCellFactory cyanMineFactory = new MineCellFactory(cyan);
        
        EmptyCellFactory blueUnrevealedEmptyFactory = new EmptyCellFactory(blue, false, false);
        EmptyCellFactory cyanUnrevealedEmptyFactory = new EmptyCellFactory(cyan, false, false);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        //Row 1
        board.addCell(new NonExistentCell());
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(5));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(blueMineFactory.build(1));
        board.addCell(new NonExistentCell());

        //Row 2
        board.addCell(blueUnrevealedEmptyFactory.build(2));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(2));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(blueMineFactory.build(1));

        //Row 3 (Part 1)
        board.addCell(cyanMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        
        board.addCellsVertically();

        //Column 5
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(2));
        board.addCell(blueMineFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(2));
        board.addCell(grayRevealedFactory.build(1));

        //Column 6
        board.addCell(blueMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(4));
        board.addCell(blueMineFactory.build(2));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));

        //Column 7
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(blueMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(3));
        board.addCell(grayRevealedFactory.build(1));

        board.addCellsHorizontally();

        //Row 3 (Part 2)
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        
        //Row 4
        board.addCell(grayRevealedFactory.build(8));

        //Row 5
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(2));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));

        //Row 6
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(4));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));

        //Row 7
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(5));
        board.addCell(grayRevealedFactory.build(1));

        //Row 8
        board.addCell(grayRevealedFactory.build(8));

        //Row 9
        board.addCell(cyanMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(2));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));

        //Row 10
        board.addCell(blueMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(2));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(2));

        //Row 11
        board.addCell(new NonExistentCell());
        board.addCell(blueMineFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(2));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(new NonExistentCell());

        return board;
    }

    @Override public String toString(){
        return "63";
    }
}