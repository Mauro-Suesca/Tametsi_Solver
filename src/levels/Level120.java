package levels;

import cellFactories.CellFactory;
import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;

public class Level120 extends Level{
    @Override protected Board setup(){
        BoardWithLines board = new BoardWithLines(31, 9, 9, true);

        board.setMaxMineDifferenceForImaginaryCells(5);

        CellFactory.setBoard(board);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();

        MineCellFactory mineFactory = new MineCellFactory();
                
        EmptyCellFactory unrevealedEmptyFactory = new EmptyCellFactory(false, false);
        
        EmptyCellFactory unknownFactory = new EmptyCellFactory(false, true);

        //Row 1
        unrevealedEmptyFactory.addToBoard(2);
        unknownFactory.addToBoard(2);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(3);
        
        //Row 2
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(2);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(2);

        //Row 3
        unrevealedEmptyFactory.addToBoard(5);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(3);

        board.addCellsVertically();

        //Column 1
        mineFactory.addToBoard(4);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);

        //Column 2
        unrevealedEmptyFactory.addToBoard(6);

        //Column 3
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(3);
        unrevealedEmptyFactory.addToBoard(1);

        board.addCellsHorizontally();

        //Row 4
        mineFactory.addToBoard(3);
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(1);

        //Row 5
        mineFactory.addToBoard(3);
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(1);

        //Row 6
        unrevealedEmptyFactory.addToBoard(4);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);

        //Row 7
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(2);
        unrevealedEmptyFactory.addToBoard(3);

        //Row 8
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(3);
        mineFactory.addToBoard(2);

        //Row 9
        unrevealedEmptyFactory.addToBoard(4);
        mineFactory.addToBoard(2);

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(externalCounterFactory.build(9));

        //HorizontalLines
        board.addHorizontalLine(externalCounterFactory.build(9));

        return board;
    }

    @Override public String toString(){
        return "120";
    }
}