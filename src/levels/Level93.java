package levels;

import cellFactories.CellFactory;
import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.EmptyCell;

public class Level93 extends Level{
    @Override protected Board setup(){
        BoardWithLines board = new BoardWithLines(70, 15, 15, true);

        board.setMaxMineDifferenceForImaginaryCells(5);

        CellFactory.setBoard(board);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory mineFactory = new MineCellFactory();
                
        EmptyCellFactory unrevealedEmptyFactory = new EmptyCellFactory(false, false);
        
        EmptyCellFactory unknownFactory = new EmptyCellFactory(false, true);

        EmptyCellFactory revealedFactory = new EmptyCellFactory(true, false);       
        
        board.addCellsVertically();

        //Column 1 (Part 1)
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(4);

        board.addCellsHorizontally();

        //Row 8
        revealedFactory.addToBoard(6);
        nonExistentCellFactory.addToBoard(3);
        revealedFactory.addToBoard(6);

        board.addCellsVertically();

        //Column 1 (Part 2)
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(1);

        //Column 2
        unrevealedEmptyFactory.addToBoard(4);
        mineFactory.addToBoard(2);
        unrevealedEmptyFactory.addToBoard(5);
        mineFactory.addToBoard(2);
        unrevealedEmptyFactory.addToBoard(1);

        //Column 3
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(4);
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(4);

        //Column 4
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(3);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(2);

        //Column 5
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(4);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(3);
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);

        //Column 6
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(3);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(2);
        unknownFactory.addToBoard(1);

        //Column 7
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(2);
        nonExistentCellFactory.addToBoard(2);
        mineFactory.addToBoard(2);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(2);

        //Column 8
        revealedFactory.addToBoard(6);
        nonExistentCellFactory.addToBoard(2);
        revealedFactory.addToBoard(5);
        board.addCell(new EmptyCell(true, true));

        //Column 9
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(2);
        nonExistentCellFactory.addToBoard(2);
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);

        //Column 10
        unrevealedEmptyFactory.addToBoard(3);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(3);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);

        //Column 11
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(3);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(4);
        mineFactory.addToBoard(1);

        //Column 12
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(3);
        mineFactory.addToBoard(4);
        unrevealedEmptyFactory.addToBoard(3);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);

        //Column 13
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(4);
        mineFactory.addToBoard(3);
        unrevealedEmptyFactory.addToBoard(1);
        unknownFactory.addToBoard(1);

        //Column 14
        unrevealedEmptyFactory.addToBoard(3);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(5);
        mineFactory.addToBoard(1);

        //Column 15
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(2);
        unrevealedEmptyFactory.addToBoard(3);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(4);

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(externalCounterFactory.build(6));
        board.addVerticalLine(nonExistentCellFactory.build(3));
        board.addVerticalLine(externalCounterFactory.build(6));

        //HorizontalLines
        board.addHorizontalLine(externalCounterFactory.build(6));
        board.addHorizontalLine(nonExistentCellFactory.build(3));
        board.addHorizontalLine(externalCounterFactory.build(6));

        return board;
    }

    @Override public String toString(){
        return "93";
    }
}