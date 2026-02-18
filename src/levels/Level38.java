package levels;

import cellFactories.EmptyCellFactory;
import cellFactories.MineCellFactory;
import cellLogic.Board;
import cellLogic.BoardLineless;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;
import cellLogic.MineCell;

public class Level38 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(30, "gray", ESC + "0m");
        ColorCounter purple = new ColorCounter(2, "purple", ESC + "35m");
        ColorCounter blue = new ColorCounter(5, "blue", ESC + "34m");

        Board board = new BoardLineless(15, 15, false, gray, purple, blue);

        MineCellFactory grayVerticalMineFactory = new MineCellFactory(gray, 1, 2);
        MineCellFactory grayHorizontalMineFactory = new MineCellFactory(gray, 2, 1);
        MineCellFactory blueHorizontalMineFactory = new MineCellFactory(blue, 2, 1);
        MineCellFactory purpleHorizontalMineFactory = new MineCellFactory(purple, 2, 1);
        
        EmptyCellFactory grayHorizontalUnrevealedFactory = new EmptyCellFactory(gray, false, false, 2, 1);
        EmptyCellFactory grayVerticalUnrevealedFactory = new EmptyCellFactory(gray, false, false, 1, 2);
        EmptyCellFactory grayUnrevealedFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory blueHorizontalUnrevealedFactory = new EmptyCellFactory(blue, false, false, 2, 1);
        EmptyCellFactory purpleHorizontalUnrevealedFactory = new EmptyCellFactory(purple, false, false, 2, 1);

        EmptyCellFactory grayHorizontalUnknownFactory = new EmptyCellFactory(gray, false, true, 2, 1);
        EmptyCellFactory grayVerticalUnknownFactory = new EmptyCellFactory(gray, false, true, 1, 2);

        EmptyCellFactory grayVerticalRevealedFactory = new EmptyCellFactory(gray, true, false, 1, 2);
        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        //Line 1
        board.addCell(grayVerticalMineFactory.build(1));
        board.addCell(grayHorizontalMineFactory.build(1));
        board.addCell(new MineCell(gray));
        board.addCell(grayVerticalMineFactory.build(1));
        board.addCell(grayHorizontalUnrevealedFactory.build(1));
        board.addCell(new MineCell(gray));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(grayHorizontalUnrevealedFactory.build(1));
        board.addCell(grayUnrevealedFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(grayHorizontalUnrevealedFactory.build(1));

        //Line 2
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(purpleHorizontalUnrevealedFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(purpleHorizontalUnrevealedFactory.build(1));
        board.addCell(grayVerticalMineFactory.build(1));
        board.addCell(purpleHorizontalUnrevealedFactory.build(1));
        board.addCell(grayVerticalMineFactory.build(1));
        board.addCell(new EmptyCell(purple, false, false));

        //Line 3
        board.addCell(new MineCell(gray));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(grayHorizontalUnrevealedFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(grayHorizontalUnrevealedFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(grayHorizontalUnrevealedFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        
        //Line 4
        board.addCell(blueHorizontalMineFactory.build(1));
        board.addCell(grayVerticalUnknownFactory.build(1));
        board.addCell(blueHorizontalUnrevealedFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(blueHorizontalMineFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(blueHorizontalMineFactory.build(1));

        //Line 5
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(grayHorizontalUnrevealedFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(grayHorizontalMineFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(grayHorizontalUnrevealedFactory.build(1));
        board.addCell(grayVerticalUnknownFactory.build(1));
        board.addCell(grayHorizontalMineFactory.build(1));

        //Line 6
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(new EmptyCell(purple, false, true, 2, 1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(purpleHorizontalUnrevealedFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(purpleHorizontalMineFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(new EmptyCell(purple, false, false));
        
        //Line 7
        board.addCell(new MineCell(gray));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(grayHorizontalMineFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(grayHorizontalMineFactory.build(1));
        board.addCell(grayVerticalMineFactory.build(1));
        board.addCell(grayHorizontalUnrevealedFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));

        //Line 8
        board.addCell(blueHorizontalUnrevealedFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(blueHorizontalUnrevealedFactory.build(1));
        board.addCell(grayVerticalMineFactory.build(1));
        board.addCell(blueHorizontalUnrevealedFactory.build(1));
        board.addCell(grayVerticalMineFactory.build(1));
        board.addCell(blueHorizontalMineFactory.build(1));

        //Line 9
        board.addCell(grayVerticalMineFactory.build(1));
        board.addCell(grayHorizontalUnrevealedFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(grayHorizontalUnrevealedFactory.build(1));
        board.addCell(grayVerticalMineFactory.build(1));
        board.addCell(grayHorizontalUnrevealedFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(grayHorizontalUnrevealedFactory.build(1));

        //Line 10
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(purpleHorizontalUnrevealedFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(purpleHorizontalMineFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(purpleHorizontalUnrevealedFactory.build(1));
        board.addCell(grayVerticalMineFactory.build(1));
        board.addCell(new EmptyCell(purple, false, false));

        //Line 11
        board.addCell(grayUnrevealedFactory.build(1));
        board.addCell(grayVerticalMineFactory.build(1));
        board.addCell(grayHorizontalUnknownFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(grayHorizontalUnrevealedFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(grayHorizontalMineFactory.build(1));
        board.addCell(grayVerticalMineFactory.build(1));

        //Line 12
        board.addCell(new EmptyCell(blue, true, false, 2, 1));
        board.addCell(grayVerticalMineFactory.build(1));
        board.addCell(blueHorizontalMineFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(blueHorizontalUnrevealedFactory.build(1));
        board.addCell(grayVerticalMineFactory.build(1));
        board.addCell(blueHorizontalUnrevealedFactory.build(1));

        //Line 13
        board.addCell(grayVerticalRevealedFactory.build(1));
        board.addCell(new EmptyCell(gray, true, false, 2, 1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(grayHorizontalMineFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(grayHorizontalMineFactory.build(1));
        board.addCell(grayVerticalMineFactory.build(1));
        board.addCell(grayHorizontalMineFactory.build(1));

        //Line 14
        board.addCell(grayVerticalRevealedFactory.build(1));
        board.addCell(new EmptyCell(purple, true, false, 2, 1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(purpleHorizontalUnrevealedFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(purpleHorizontalUnrevealedFactory.build(1));
        board.addCell(grayVerticalMineFactory.build(1));
        board.addCell(new EmptyCell(purple, false, false));

        //Line 15
        board.addCell(grayRevealedFactory.build(2));
        board.addCell(grayHorizontalMineFactory.build(1));
        board.addCell(new EmptyCell(gray, false, true));
        board.addCell(grayHorizontalUnrevealedFactory.build(1));
        board.addCell(grayUnrevealedFactory.build(1));
        board.addCell(grayHorizontalUnrevealedFactory.build(1));
        board.addCell(grayUnrevealedFactory.build(1));
        
        return board;
    }

    @Override public String toString(){
        return "38";
    }
}