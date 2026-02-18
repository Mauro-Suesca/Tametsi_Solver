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

public class Level67 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(41, "gray", ESC + "0m");
        ColorCounter cyan = new ColorCounter(7, "cyan", ESC + "36m");
        ColorCounter orange = new ColorCounter(8, "orange", ESC + "38;5;214m");
        
        BoardWithLines board = new BoardWithLines(19, 19, true, gray, cyan, orange);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory cyanUnrevealedEmptyFactory = new EmptyCellFactory(cyan, false, false);
        EmptyCellFactory orangeUnrevealedEmptyFactory = new EmptyCellFactory(orange, false, false);

        EmptyCellFactory grayUnknownFactory = new EmptyCellFactory(gray, false, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);
        EmptyCellFactory orangeRevealedFactory = new EmptyCellFactory(orange, true, false);

        //Row 1
        board.addCell(nonExistentCellFactory.build(9));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(9));

        //Row 2
        board.addCell(nonExistentCellFactory.build(8));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(8));

        //Row 3
        board.addCell(nonExistentCellFactory.build(7));
        board.addCell(new MineCell(orange));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(new MineCell(orange));
        board.addCell(nonExistentCellFactory.build(7));

        //Row 4
        board.addCell(nonExistentCellFactory.build(6));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(new EmptyCell(gray, true, true));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(6));

        //Row 5
        board.addCell(nonExistentCellFactory.build(5));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(new MineCell(orange));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(5));

        //Row 6
        board.addCell(nonExistentCellFactory.build(4));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(4));

        //Row 7
        board.addCell(nonExistentCellFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(nonExistentCellFactory.build(3));

        //Row 8
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(new MineCell(orange));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(new MineCell(cyan));
        board.addCell(grayMineFactory.build(1));
        board.addCell(new MineCell(cyan));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(orangeRevealedFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));

        //Row 9
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnknownFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(cyan));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(orangeRevealedFactory.build(1));
        board.addCell(grayRevealedFactory.build(2));
        board.addCell(nonExistentCellFactory.build(1));

        //Row 10
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(orange));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(new MineCell(cyan));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(new MineCell(cyan));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(new MineCell(orange));
        board.addCell(grayRevealedFactory.build(4));

        //Row 11
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnknownFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(cyan));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnknownFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(orangeRevealedFactory.build(1));
        board.addCell(grayRevealedFactory.build(2));
        board.addCell(nonExistentCellFactory.build(1));

        //Row 12
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(new MineCell(orange));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(orangeRevealedFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));

        //Row 13
        board.addCell(nonExistentCellFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(grayMineFactory.build(1));
        board.addCell(new MineCell(cyan));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(3));

        //Row 14
        board.addCell(nonExistentCellFactory.build(4));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(4));

        //Row 15
        board.addCell(nonExistentCellFactory.build(5));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(5));

        //Row 16
        board.addCell(nonExistentCellFactory.build(6));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(6));

        //Row 17
        board.addCell(nonExistentCellFactory.build(7));
        board.addCell(new MineCell(orange));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(new EmptyCell(orange, false, true));
        board.addCell(nonExistentCellFactory.build(7));

        //Row 18
        board.addCell(nonExistentCellFactory.build(8));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(8));

        //Row 19
        board.addCell(nonExistentCellFactory.build(9));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(9));

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(nonExistentCellFactory.build(6));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(5));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(6));
        
        //HorizontalLines
        board.addHorizontalLine(nonExistentCellFactory.build(6));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(5));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(6));
        
        return board;
    }

    @Override public String toString(){
        return "67";
    }
}