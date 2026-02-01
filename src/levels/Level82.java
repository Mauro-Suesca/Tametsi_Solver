package levels;

import cellFactories.CellFactory;
import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.EmptyCell;

public class Level82 extends Level{
    @Override protected Board setup(){
        BoardWithLines board = new BoardWithLines(55, 15, 15, true);

        board.setMaxMineDifferenceForImaginaryCells(10);

        CellFactory.setBoard(board);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory mineFactory = new MineCellFactory();
                
        EmptyCellFactory unrevealedEmptyFactory = new EmptyCellFactory(false, false);
        
        EmptyCellFactory unknownRevealedFactory = new EmptyCellFactory(true, true);

        EmptyCellFactory revealedFactory = new EmptyCellFactory(true, false);       
        
        //Row 1
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(4);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(2);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);

        //Row 2
        revealedFactory.addToBoard(1);
        unknownRevealedFactory.addToBoard(1);
        revealedFactory.addToBoard(9);
        unknownRevealedFactory.addToBoard(1);
        revealedFactory.addToBoard(3);

        //Row 3
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(4);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(5);
        mineFactory.addToBoard(1);

        //Row 4
        nonExistentCellFactory.addToBoard(15);

        //Row 5
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(2);
        unrevealedEmptyFactory.addToBoard(4);
        mineFactory.addToBoard(3);
        unrevealedEmptyFactory.addToBoard(4);
        mineFactory.addToBoard(1);

        //Row 6
        revealedFactory.addToBoard(7);
        unrevealedEmptyFactory.addToBoard(1);
        revealedFactory.addToBoard(7);

        //Row 7
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(2);
        unrevealedEmptyFactory.addToBoard(3);
        mineFactory.addToBoard(4);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);

        //Row 8
        nonExistentCellFactory.addToBoard(15);

        //Row 9
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(4);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(2);
        board.addCell(new EmptyCell(false, true));
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(2);

        //Row 10
        revealedFactory.addToBoard(4);
        mineFactory.addToBoard(1);
        revealedFactory.addToBoard(5);
        mineFactory.addToBoard(1);
        revealedFactory.addToBoard(4);

        //Row 11
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(2);
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(4);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(3);
        unrevealedEmptyFactory.addToBoard(1);

        //Row 12
        nonExistentCellFactory.addToBoard(15);

        //Row 13
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(4);
        unrevealedEmptyFactory.addToBoard(3);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(1);

        //Row 14
        revealedFactory.addToBoard(3);
        unrevealedEmptyFactory.addToBoard(1);
        revealedFactory.addToBoard(3);
        unrevealedEmptyFactory.addToBoard(1);
        revealedFactory.addToBoard(3);
        unrevealedEmptyFactory.addToBoard(1);
        revealedFactory.addToBoard(3);

        //Row 15
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(2);
        unrevealedEmptyFactory.addToBoard(4);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(2);

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(nonExistentCellFactory.build(15));

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
        return "82";
    }
}