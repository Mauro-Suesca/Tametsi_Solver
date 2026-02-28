package levels;

import cellFactories.CellFactory;
import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.ColorCounter;

public class Level118 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(52, "gray", ESC + "0m");
        ColorCounter green = new ColorCounter(26, "green", ESC + "32m");
        ColorCounter pink = new ColorCounter(18, "pink", ESC + "38;5;212m");
        
        BoardWithLines board = new BoardWithLines(19, 19, true, gray, green, pink);

        board.setMaxMineDifferenceForImaginaryCells(5);

        CellFactory.setBoard(board);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory greenMineFactory = new MineCellFactory(green);
        MineCellFactory pinkMineFactory = new MineCellFactory(pink);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory greenUnrevealedEmptyFactory = new EmptyCellFactory(green, false, false);
        EmptyCellFactory pinkUnrevealedEmptyFactory = new EmptyCellFactory(pink, false, false);
        
        EmptyCellFactory grayUnknownFactory = new EmptyCellFactory(gray, false, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        board.addCellsVertically();

        //Column 1
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(4);
        grayUnknownFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayRevealedFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(3);

        //Column 2
        grayUnrevealedEmptyFactory.addToBoard(7);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);

        //Column 3
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(2);
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Column 4
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayRevealedFactory.addToBoard(9);
        pinkUnrevealedEmptyFactory.addToBoard(2);
        pinkMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnknownFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);

        board.addCellsHorizontally();

        //Row 1
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);

        //Row 2
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(7);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);

        //Row 3
        grayUnrevealedEmptyFactory.addToBoard(4);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(4);
        grayUnknownFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 4
        grayRevealedFactory.addToBoard(15);

        //Row 5
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(2);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(3);
        greenMineFactory.addToBoard(5);
        grayRevealedFactory.addToBoard(1);

        //Row 6
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(3);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(2);
        greenMineFactory.addToBoard(2);
        greenUnrevealedEmptyFactory.addToBoard(2);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 7
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(2);
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(2);
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 8
        greenUnrevealedEmptyFactory.addToBoard(3);
        nonExistentCellFactory.addToBoard(8);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);

        //Row 9
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(5);
        
        board.addCellsVertically();

        //Column 13
        pinkUnrevealedEmptyFactory.addToBoard(3);
        pinkMineFactory.addToBoard(2);
        pinkUnrevealedEmptyFactory.addToBoard(2);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);

        //Column 14
        pinkMineFactory.addToBoard(2);
        pinkUnrevealedEmptyFactory.addToBoard(4);
        pinkMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 15
        pinkUnrevealedEmptyFactory.addToBoard(5);
        pinkMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);

        //Column 16
        grayRevealedFactory.addToBoard(8);
        grayUnrevealedEmptyFactory.addToBoard(3);

        //Column 17
        grayMineFactory.addToBoard(5);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);

        //Column 18
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(4);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Column 19
        grayUnrevealedEmptyFactory.addToBoard(6);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(4);

        board.addCellsHorizontally();

        //Row 10
        greenMineFactory.addToBoard(3);
        nonExistentCellFactory.addToBoard(5);
        
        //Row 11
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(2);
        nonExistentCellFactory.addToBoard(5);

        //Row 12
        nonExistentCellFactory.addToBoard(8);

        //Row 13
        pinkMineFactory.addToBoard(2);
        pinkUnrevealedEmptyFactory.addToBoard(2);
        pinkMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);

        //Row 14
        pinkUnrevealedEmptyFactory.addToBoard(5);
        pinkMineFactory.addToBoard(2);
        pinkUnrevealedEmptyFactory.addToBoard(1);

        //Row 15
        pinkMineFactory.addToBoard(2);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(2);

        //Row 16
        grayRevealedFactory.addToBoard(8);

        //Row 17
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 18
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);

        //Row 19
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(externalCounterFactory.build(3));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(3));
        board.addVerticalLine(nonExistentCellFactory.build(5));
        board.addVerticalLine(externalCounterFactory.build(3));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(3));
        
        //HorizontalLines
        board.addHorizontalLine(externalCounterFactory.build(3));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(3));
        board.addHorizontalLine(nonExistentCellFactory.build(5));
        board.addHorizontalLine(externalCounterFactory.build(3));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(3));
        
        return board;
    }

    @Override public String toString(){
        return "118";
    }
}