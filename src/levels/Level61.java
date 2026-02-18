package levels;

import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;
import cellLogic.MineCell;

public class Level61 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(31, "grises", ESC + "0m");
        ColorCounter cyan = new ColorCounter(9, "cian", ESC + "36m");
        ColorCounter yellow = new ColorCounter(5, "amarillas", ESC + "33m");
        ColorCounter orange = new ColorCounter(2, "naranjas", ESC + "38;5;214m");
        ColorCounter red = new ColorCounter(5, "rojas", ESC + "31m");
        
        BoardWithLines board = new BoardWithLines(18, 18, true, gray, cyan, yellow, orange, red);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory cyanMineFactory = new MineCellFactory(cyan);
        MineCellFactory yellowMineFactory = new MineCellFactory(yellow);
        MineCellFactory redMineFactory = new MineCellFactory(red);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory cyanUnrevealedEmptyFactory = new EmptyCellFactory(cyan, false, false);
        EmptyCellFactory yellowUnrevealedEmptyFactory = new EmptyCellFactory(yellow, false, false);
        EmptyCellFactory orangeUnrevealedEmptyFactory = new EmptyCellFactory(orange, false, false);
        EmptyCellFactory redUnrevealedEmptyFactory = new EmptyCellFactory(red, false, false);

        EmptyCellFactory grayUnknownFactory = new EmptyCellFactory(gray, false, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        //Row 1 (Part 1)
        board.addCell(nonExistentCellFactory.build(9));

        board.setAddsCellsHorizontally(false);

        //Column 10
        board.addCell(cyanMineFactory.build(2));
        board.addCell(cyanUnrevealedEmptyFactory.build(5));
        board.addCell(cyanMineFactory.build(2));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        board.setAddsCellsHorizontally(true);

        //Row 1 (Part 2)
        board.addCell(grayUnrevealedEmptyFactory.build(6));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Row 2
        board.addCell(nonExistentCellFactory.build(10));
        board.addCell(grayMineFactory.build(2));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnknownFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Row 3 (Part 1)
        board.addCell(nonExistentCellFactory.build(9));
        board.addCell(grayMineFactory.build(1));

        board.setAddsCellsHorizontally(false);

        //Column 12
        board.addCell(yellowUnrevealedEmptyFactory.build(2));
        board.addCell(yellowMineFactory.build(2));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayUnknownFactory.build(1));
        board.addCell(orangeUnrevealedEmptyFactory.build(3));
        board.addCell(new MineCell(orange));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));

        board.setAddsCellsHorizontally(true);

        //Row 3 (Part 2)
        board.addCell(yellowUnrevealedEmptyFactory.build(3));

        board.setAddsCellsHorizontally(false);

        //Column 16
        board.addCell(yellowMineFactory.build(1));
        board.addCell(yellowUnrevealedEmptyFactory.build(3));
        board.addCell(yellowMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(4));
        board.addCell(orangeUnrevealedEmptyFactory.build(4));
        board.addCell(new EmptyCell(orange, true, false));
        board.addCell(grayRevealedFactory.build(2));

        board.setAddsCellsHorizontally(true);

        //Row 3 (Part 3)
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        //Row 4
        board.addCell(nonExistentCellFactory.build(9));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        //Row 5
        board.addCell(nonExistentCellFactory.build(14));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Row 6
        board.addCell(nonExistentCellFactory.build(9));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(3));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Row 7
        board.addCell(nonExistentCellFactory.build(9));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(yellowUnrevealedEmptyFactory.build(2));
        board.addCell(yellowMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        //Row 8
        board.addCell(nonExistentCellFactory.build(10));
        board.addCell(grayMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Row 9
        board.addCell(nonExistentCellFactory.build(9));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(4));

        //Row 10
        board.addCell(cyanMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(2));
        board.addCell(cyanMineFactory.build(3));
        board.addCell(cyanUnrevealedEmptyFactory.build(2));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(5));
        board.addCell(grayMineFactory.build(1));

        board.setAddsCellsHorizontally(false);

        //Column 1
        board.addCell(grayUnrevealedEmptyFactory.build(8));

        //Column 2
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        //Column 3
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(redMineFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(2));
        board.addCell(redMineFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        board.setAddsCellsHorizontally(true);

        //Row 11
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnknownFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        //Row 12
        board.addCell(redUnrevealedEmptyFactory.build(2));
        board.addCell(redMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(orangeUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Row 13
        board.addCell(nonExistentCellFactory.build(3));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(2));

        //Row 14
        board.addCell(nonExistentCellFactory.build(3));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnknownFactory.build(1));
        board.addCell(nonExistentCellFactory.build(5));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Row 15
        board.addCell(nonExistentCellFactory.build(3));
        board.addCell(redMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(nonExistentCellFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));

        //Row 16
        board.addCell(redUnrevealedEmptyFactory.build(4));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(new MineCell(orange));
        board.addCell(orangeUnrevealedEmptyFactory.build(2));
        board.addCell(grayRevealedFactory.build(2));

        //Row 17
        board.addCell(grayMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));

        //Row 18
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(4));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayRevealedFactory.build(2));

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(nonExistentCellFactory.build(9));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(3));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(1));
        
        //HorizontalLines
        board.addHorizontalLine(nonExistentCellFactory.build(9));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(3));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(1));
        
        return board;
    }

    @Override public String toString(){
        return "61";
    }
}