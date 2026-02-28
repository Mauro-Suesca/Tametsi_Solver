package levels;

import cellFactories.CellFactory;
import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.ColorCounter;

public class Level116 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(25, "gray", ESC + "0m");
        ColorCounter green = new ColorCounter(7, "green", ESC + "32m");
        ColorCounter orange = new ColorCounter(7, "orange", ESC + "38;5;214m");
        ColorCounter cyan = new ColorCounter(6, "cyan", ESC + "36m");
        ColorCounter pink = new ColorCounter(8, "pink", ESC + "38;5;212m");
        
        BoardWithLines board = new BoardWithLines(15, 15, false, gray, green, orange, cyan, pink);

        CellFactory.setBoard(board);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory greenMineFactory = new MineCellFactory(green);
        MineCellFactory orangeMineFactory = new MineCellFactory(orange);
        MineCellFactory cyanMineFactory = new MineCellFactory(cyan);
        MineCellFactory pinkMineFactory = new MineCellFactory(pink);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory greenUnrevealedEmptyFactory = new EmptyCellFactory(green, false, false);
        EmptyCellFactory orangeUnrevealedEmptyFactory = new EmptyCellFactory(orange, false, false);
        EmptyCellFactory cyanUnrevealedEmptyFactory = new EmptyCellFactory(cyan, false, false);
        EmptyCellFactory pinkUnrevealedEmptyFactory = new EmptyCellFactory(pink, false, false);
        
        EmptyCellFactory grayUnknownRevealedFactory = new EmptyCellFactory(gray, true, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        board.addCellsVertically();
        board.skipLines(1);

        //Column 2
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        board.skipLines(1);

        //Column 4
        cyanUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);

        board.skipLines(1);

        //Column 6
        cyanMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);

        board.skipLines(1);

        //Column 8
        cyanUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);

        board.skipLines(1);

        //Column 10
        cyanUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);

        board.skipLines(1);

        //Column 12
        cyanMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);

        board.skipLines(1);

        //Column 14
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        board.skipLines(1);
        board.addCellsHorizontally();

        //Row 1
        grayRevealedFactory.addToBoard(3);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(4);

        //Row 2
        grayMineFactory.addToBoard(2);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(2);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);

        //Row 3
        grayRevealedFactory.addToBoard(3);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(4);

        //Row 4
        pinkMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        cyanMineFactory.addToBoard(2);
        grayMineFactory.addToBoard(2);
        orangeMineFactory.addToBoard(1);

        //Row 5
        grayRevealedFactory.addToBoard(8);

        //Row 6
        pinkMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(4);
        orangeUnrevealedEmptyFactory.addToBoard(2);

        //Row 7
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(6);

        //Row 8
        pinkUnrevealedEmptyFactory.addToBoard(1);
        pinkMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(2);

        //Row 9
        grayRevealedFactory.addToBoard(3);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(4);

        //Row 10
        pinkMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(3);
        orangeMineFactory.addToBoard(2);

        //Row 11
        grayRevealedFactory.addToBoard(7);
        grayUnknownRevealedFactory.addToBoard(1);

        //Row 12
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        orangeUnrevealedEmptyFactory.addToBoard(1);

        //Row 13
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(7);

        //Row 14
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(2);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);

        //Row 15
        grayRevealedFactory.addToBoard(6);
        grayUnknownRevealedFactory.addToBoard(2);
        
        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(1));
        
        //HorizontalLines
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(1));
        
        return board;
    }

    @Override public String toString(){
        return "116";
    }
}