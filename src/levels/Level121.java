package levels;

import cellFactories.CellFactory;
import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;

public class Level121 extends Level{
    @Override protected Board setup(){
        BoardWithLines board = new BoardWithLines(33, 9, 9, true);

        board.setMaxMineDifferenceForImaginaryCells(5);

        CellFactory.setBoard(board);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();

        MineCellFactory mineFactory = new MineCellFactory();
                
        EmptyCellFactory unrevealedEmptyFactory = new EmptyCellFactory(false, false);
        
        EmptyCellFactory unknownFactory = new EmptyCellFactory(false, true);

        board.addCellsVertically();

        //Column 1
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(3);
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(3);

        //Column 2
        mineFactory.addToBoard(2);
        unrevealedEmptyFactory.addToBoard(3);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        unknownFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);

        //Column 3
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unknownFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);

        //Column 4
        unknownFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(3);
        unknownFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(4);

        //Column 5
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unknownFactory.addToBoard(1);
        mineFactory.addToBoard(2);
        unknownFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unknownFactory.addToBoard(1);
        mineFactory.addToBoard(1);

        //Column 6
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(2);
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(2);

        //Column 7
        mineFactory.addToBoard(3);
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(1);
        unknownFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(2);

        //Column 8
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        unknownFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(3);
        mineFactory.addToBoard(2);

        //Column 9
        mineFactory.addToBoard(2);
        unrevealedEmptyFactory.addToBoard(3);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        unknownFactory.addToBoard(1);
        mineFactory.addToBoard(1);

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(externalCounterFactory.build(9));

        //HorizontalLines
        board.addHorizontalLine(externalCounterFactory.build(9));

        return board;
    }

    @Override public String toString(){
        return "121";
    }
}