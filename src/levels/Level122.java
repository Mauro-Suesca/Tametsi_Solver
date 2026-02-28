package levels;

import cellFactories.CellFactory;
import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;

public class Level122 extends Level{
    @Override protected Board setup(){
        BoardWithLines board = new BoardWithLines(32, 10, 10, true);

        board.setMaxMineDifferenceForImaginaryCells(5);

        CellFactory.setBoard(board);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();

        MineCellFactory mineFactory = new MineCellFactory();
                
        EmptyCellFactory unrevealedEmptyFactory = new EmptyCellFactory(false, false);
        
        EmptyCellFactory unknownFactory = new EmptyCellFactory(false, true);

        //Row 1
        mineFactory.addToBoard(2);
        unknownFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(4);
        mineFactory.addToBoard(2);
        unrevealedEmptyFactory.addToBoard(1);

        //Row 2
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(3);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(3);

        //Row 3
        unrevealedEmptyFactory.addToBoard(3);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(6);

        //Row 4
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        unknownFactory.addToBoard(1);
        mineFactory.addToBoard(2);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);

        //Row 5
        mineFactory.addToBoard(2);
        unknownFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unknownFactory.addToBoard(2);
        unrevealedEmptyFactory.addToBoard(3);

        //Row 6
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(2);
        unrevealedEmptyFactory.addToBoard(1);
        unknownFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        unknownFactory.addToBoard(2);
        unrevealedEmptyFactory.addToBoard(1);

        //Row 7
        unrevealedEmptyFactory.addToBoard(4);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(3);
        unrevealedEmptyFactory.addToBoard(1);

        //Row 8
        unrevealedEmptyFactory.addToBoard(10);

        //Row 9
        mineFactory.addToBoard(1);
        unknownFactory.addToBoard(1);
        mineFactory.addToBoard(2);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(3);
        mineFactory.addToBoard(1);

        //Row 10
        mineFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);
        mineFactory.addToBoard(1);
        unknownFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(2);
        mineFactory.addToBoard(2);
        unknownFactory.addToBoard(1);
        unrevealedEmptyFactory.addToBoard(1);

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(externalCounterFactory.build(10));

        //HorizontalLines
        board.addHorizontalLine(externalCounterFactory.build(10));

        return board;
    }

    @Override public String toString(){
        return "122";
    }
}