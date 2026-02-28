package levels;

import cellFactories.CellFactory;
import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.EmptyCell;

public class Level87 extends Level{
    @Override protected Board setup(){
        BoardWithLines board = new BoardWithLines(55, 17, 17, true);

        CellFactory.setBoard(board);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory mineFactory = new MineCellFactory();
                
        EmptyCellFactory unrevealedEmptyFactory = new EmptyCellFactory(false, false);
        
        EmptyCellFactory unknownRevealedFactory = new EmptyCellFactory(true, true);

        EmptyCellFactory revealedFactory = new EmptyCellFactory(true, false);       
        
        board.addCellsVertically();

        //Column 1
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(2);
        unrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(9);

        //Column 2
        mineFactory.addToBoard(1);
        revealedFactory.addToBoard(6);
        unrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(9);

        board.addCellsHorizontally();

        //Row 1
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(2);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(2);
        nonExistentCellFactory.addToBoard(8);

        //Row 2
        revealedFactory.addToBoard(5);
        unknownRevealedFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(8);

        //Row 3
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(3);
        revealedFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(8);

        board.addCellsVertically();

        //Column 3
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unknownRevealedFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(9);

        //Column 4
        revealedFactory.addToBoard(2);
        unrevealedEmptyFactory.addToBoard(1);
        revealedFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(9);

        //Column 5
        unknownRevealedFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        unknownRevealedFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(9);

        //Column 6
        revealedFactory.addToBoard(4);
        mineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(9);

        //Column 7
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(4);
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(2);

        //Column 8
        revealedFactory.addToBoard(4);
        unknownRevealedFactory.addToBoard(1);
        revealedFactory.addToBoard(8);
        unrevealedEmptyFactory.addToBoard(1);

        //Column 9
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(2);
        unrevealedEmptyFactory.addToBoard(1);
        board.addCell(new EmptyCell(false, true));
        unrevealedEmptyFactory.addToBoard(4);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        revealedFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);

        board.addCellsHorizontally();

        //Row 4
        nonExistentCellFactory.addToBoard(8);

        //Row 5
        nonExistentCellFactory.addToBoard(8);

        //Row 6
        nonExistentCellFactory.addToBoard(8);

        //Row 7
        nonExistentCellFactory.addToBoard(8);

        //Row 8
        mineFactory.addToBoard(3);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(1);

        //Row 9
        revealedFactory.addToBoard(1);
        unknownRevealedFactory.addToBoard(1);
        revealedFactory.addToBoard(5);
        unrevealedEmptyFactory.addToBoard(1);

        //Row 10
        revealedFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(4);
        revealedFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);

        //Row 11
        revealedFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        revealedFactory.addToBoard(3);
        mineFactory.addToBoard(1);
        revealedFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);

        board.addCellsVertically();

        //Column 10
        revealedFactory.addToBoard(3);
        unrevealedEmptyFactory.addToBoard(1);
        revealedFactory.addToBoard(1);
        mineFactory.addToBoard(1);

        //Column 11
        unrevealedEmptyFactory.addToBoard(2);
        revealedFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        revealedFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);

        //Column 12
        revealedFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        revealedFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        revealedFactory.addToBoard(1);
        mineFactory.addToBoard(1);

        //Column 13
        unrevealedEmptyFactory.addToBoard(2);
        revealedFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        revealedFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);

        //Column 14
        revealedFactory.addToBoard(3);
        unrevealedEmptyFactory.addToBoard(1);
        revealedFactory.addToBoard(1);
        mineFactory.addToBoard(1);

        //Column 15
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(2);
        unrevealedEmptyFactory.addToBoard(1);
        revealedFactory.addToBoard(1);
        mineFactory.addToBoard(1);

        //Column 16
        revealedFactory.addToBoard(5);
        unrevealedEmptyFactory.addToBoard(1);

        //Column 17
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(4);

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(5));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(7));
        board.addVerticalLine(externalCounterFactory.build(1));

        //HorizontalLines
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(6));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(8));
        board.addHorizontalLine(externalCounterFactory.build(1));

        return board;
    }

    @Override public String toString(){
        return "87";
    }
}