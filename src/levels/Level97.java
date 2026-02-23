package levels;

import cellFactories.CellFactory;
import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;

public class Level97 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(53, "gray", ESC + "0m");
        ColorCounter pink = new ColorCounter(24, "pink", ESC + "38;5;212m");
        ColorCounter orange = new ColorCounter(23, "orange", ESC + "38;5;214m");
        
        BoardWithLines board = new BoardWithLines(19, 19, true, gray, pink, orange);

        CellFactory.setBoard(board);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory pinkMineFactory = new MineCellFactory(pink);
        MineCellFactory orangeMineFactory = new MineCellFactory(orange);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory pinkUnrevealedEmptyFactory = new EmptyCellFactory(pink, false, false);
        EmptyCellFactory orangeUnrevealedEmptyFactory = new EmptyCellFactory(orange, false, false);
        
        EmptyCellFactory grayUnknownUnrevealedFactory = new EmptyCellFactory(gray, false, true);
        EmptyCellFactory orangeUnknownFactory = new EmptyCellFactory(orange, false, true);

        EmptyCellFactory grayUnknownRevealedFactory = new EmptyCellFactory(gray, true, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        board.setAddsCellsHorizontally(false);

        //Column 1
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);

        board.setAddsCellsHorizontally(true);

        //Row 1
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(4);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);

        board.skipToNextLine();
        board.skipToNextLine();
    
        //Row 4
        pinkUnrevealedEmptyFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        pinkMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        orangeUnknownFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(2);
        pinkMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        board.skipToNextLine();
        board.skipToNextLine();

        //Row 7
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(2);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        pinkMineFactory.addToBoard(2);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        board.skipToNextLine();

        //Row 9
        orangeUnrevealedEmptyFactory.addToBoard(3);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(5);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 10
        grayRevealedFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        orangeUnknownFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(4);
        grayMineFactory.addToBoard(1);

        //Row 11
        orangeMineFactory.addToBoard(3);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(4);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);

        board.skipToNextLine();

        //Row 13
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(4);
        grayMineFactory.addToBoard(2);

        board.skipToNextLine();
        board.skipToNextLine();

        //Row 16
        pinkMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(2);
        board.addCell(new EmptyCell(pink, false, true));
        pinkUnrevealedEmptyFactory.addToBoard(2);
        pinkMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(2);
        pinkMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        board.skipToNextLine();
        board.skipToNextLine();

        //Row 19
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        board.setAddsCellsHorizontally(false);

        //Column 2
        grayRevealedFactory.addToBoard(6);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(3);

        //Column 3
        grayRevealedFactory.addToBoard(4);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);

        //Column 4
        pinkUnrevealedEmptyFactory.addToBoard(1);
        pinkMineFactory.addToBoard(3);
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        pinkMineFactory.addToBoard(3);
        pinkUnrevealedEmptyFactory.addToBoard(1);

        //Column 5
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);

        //Column 6
        grayRevealedFactory.addToBoard(6);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(3);

        //Column 7
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        orangeUnrevealedEmptyFactory.addToBoard(2);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);

        //Column 8
        grayRevealedFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(7);

        //Column 9
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(2);
        orangeUnrevealedEmptyFactory.addToBoard(3);
        grayRevealedFactory.addToBoard(4);

        //Column 10
        grayRevealedFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        pinkUnrevealedEmptyFactory.addToBoard(4);

        //Column 11
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeUnknownFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(4);
        grayRevealedFactory.addToBoard(4);

        //Column 12
        grayRevealedFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(5);

        //Column 13
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(4);

        //Column 14
        grayRevealedFactory.addToBoard(3);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(3);
        orangeUnrevealedEmptyFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);

        //Column 15
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(2);
        orangeUnrevealedEmptyFactory.addToBoard(1);

        //Column 16
        pinkUnrevealedEmptyFactory.addToBoard(1);
        pinkMineFactory.addToBoard(1);
        pinkUnrevealedEmptyFactory.addToBoard(1);
        pinkMineFactory.addToBoard(3);
        grayRevealedFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(2);
        grayRevealedFactory.addToBoard(1);

        //Column 17
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(3);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        orangeMineFactory.addToBoard(2);
        orangeUnrevealedEmptyFactory.addToBoard(2);

        //Column 18
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(4);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);

        //Column 19
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(11));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(5));
        board.addVerticalLine(externalCounterFactory.build(1));
        
        //HorizontalLines
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(11));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(5));
        board.addHorizontalLine(externalCounterFactory.build(1));
        
        return board;
    }

    @Override public String toString(){
        return "97";
    }
}