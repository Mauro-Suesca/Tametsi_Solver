package levels;

import cellFactories.CellFactory;
import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.ColorCounter;

public class Level114 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(30, "gray", ESC + "0m");
        ColorCounter red = new ColorCounter(13, "red", ESC + "31m");
        ColorCounter cyan = new ColorCounter(13, "cyan", ESC + "36m");
        
        BoardWithLines board = new BoardWithLines(15, 15, false, gray, red, cyan);

        CellFactory.setBoard(board);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory redMineFactory = new MineCellFactory(red);
        MineCellFactory cyanMineFactory = new MineCellFactory(cyan);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory redUnrevealedEmptyFactory = new EmptyCellFactory(red, false, false);
        EmptyCellFactory cyanUnrevealedEmptyFactory = new EmptyCellFactory(cyan, false, false);
        
        EmptyCellFactory grayUnknownRevealedFactory = new EmptyCellFactory(gray, true, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        board.setAddsCellsHorizontally(false);
        board.skipLines(1);

        //Column 2
        cyanMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        redMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        redUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        redMineFactory.addToBoard(1);

        board.skipLines(1);

        //Column 4
        cyanMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        redMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        redMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        redUnrevealedEmptyFactory.addToBoard(1);

        board.skipLines(1);

        //Column 6
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);

        board.skipLines(1);

        //Column 8
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        board.skipLines(1);

        //Column 10
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(1);

        board.skipLines(1);

        //Column 12
        redUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        redMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        redMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);

        board.skipLines(1);

        //Column 14
        redMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        redUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        redUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);

        board.skipLines(1);
        board.setAddsCellsHorizontally(true);

        //Row 1
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(4);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);

        //Row 2
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(2);
        grayMineFactory.addToBoard(2);
        redMineFactory.addToBoard(1);
        redUnrevealedEmptyFactory.addToBoard(1);
        redMineFactory.addToBoard(1);

        //Row 3
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);

        //Row 4
        cyanMineFactory.addToBoard(2);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        redUnrevealedEmptyFactory.addToBoard(1);
        redMineFactory.addToBoard(1);
        redUnrevealedEmptyFactory.addToBoard(1);

        //Row 5
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(5);

        //Row 6
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Row 7
        grayRevealedFactory.addToBoard(8);

        //Row 8
        grayMineFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);

        //Row 9
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(6);

        //Row 10
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(2);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Row 11
        grayRevealedFactory.addToBoard(5);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);

        //Row 12
        redUnrevealedEmptyFactory.addToBoard(2);
        redMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(2);

        //Row 13
        grayRevealedFactory.addToBoard(8);

        //Row 14
        redMineFactory.addToBoard(2);
        redUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        cyanUnrevealedEmptyFactory.addToBoard(3);

        //Row 15
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(7);
        
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
        return "114";
    }
}