package levels;

import cellFactories.EmptyCellFactory;
import cellFactories.MineCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;
import cellLogic.ExternalCounter;
import cellLogic.MineCell;
import cellLogic.NonExistentCell;

public class Level42 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(62, "grises", "\u001B[0m");
        ColorCounter cyan = new ColorCounter(7, "cian", "\u001B[36m");
        ColorCounter blue = new ColorCounter(7, "azules", "\u001B[34m");

        BoardWithLines board = new BoardWithLines(15, 15, true, gray, cyan, blue);

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory cyanUnrevealedEmptyFactory = new EmptyCellFactory(cyan, false, false);
        EmptyCellFactory blueUnrevealedEmptyFactory = new EmptyCellFactory(blue, false, false);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        //Line 1
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(4));

        //Line 2
        board.addCell(grayUnrevealedEmptyFactory.build(5));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(new EmptyCell(gray, false, true));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 3
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 4
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        //Line 5
        board.addCell(grayUnrevealedEmptyFactory.build(4));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(new MineCell(cyan));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(new MineCell(blue));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));

        //Line 6
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(new MineCell(cyan));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));

        //Line 7
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(new MineCell(cyan));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(cyan));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(blue));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        //Line 8
        board.addCell(grayMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(blue));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(blue));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 9
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(new MineCell(blue));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        //Line 10
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(cyan));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 11
        board.addCell(grayUnrevealedEmptyFactory.build(4));
        board.addCell(new MineCell(cyan));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(blue));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 12
        board.addCell(grayUnrevealedEmptyFactory.build(5));
        board.addCell(new MineCell(cyan));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(blue));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));

        //Line 13
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(4));

        //Line 14
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));

        //Line 15
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(5));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter());
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter());
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter());
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter());
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter());
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter());
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter());
        board.addVerticalLine(new NonExistentCell());

        //HorizontalLines
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new ExternalCounter());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new ExternalCounter());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new ExternalCounter());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new ExternalCounter());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new ExternalCounter());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new ExternalCounter());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new ExternalCounter());
        board.addHorizontalLine(new NonExistentCell());
        
        return board;
    }

    @Override public String toString(){
        return "42";
    }
}