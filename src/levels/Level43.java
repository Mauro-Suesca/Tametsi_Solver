package levels;

import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.EmptyCell;


public class Level43 extends Level{
    @Override protected Board setup(){
        BoardWithLines board = new BoardWithLines(17, 6, 6, true);

        EmptyCellFactory emptyCellFactory = new EmptyCellFactory(false, false);
        MineCellFactory mineCellFactory = new MineCellFactory();
        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();

        //Line 1
        board.addCell(emptyCellFactory.build(1));
        board.addCell(mineCellFactory.build(3));
        board.addCell(emptyCellFactory.build(1));
        board.addCell(mineCellFactory.build(1));

        //Line 2
        board.addCell(emptyCellFactory.build(2));
        board.addCell(mineCellFactory.build(4));

        //Line 3
        board.addCell(mineCellFactory.build(1));
        board.addCell(emptyCellFactory.build(1));
        board.addCell(mineCellFactory.build(1));
        board.addCell(emptyCellFactory.build(2));
        board.addCell(mineCellFactory.build(1));

        //Line 4
        board.addCell(emptyCellFactory.build(1));
        board.addCell(new EmptyCell(false, true));
        board.addCell(emptyCellFactory.build(4));

        //Line 5
        board.addCell(emptyCellFactory.build(1));
        board.addCell(mineCellFactory.build(1));
        board.addCell(emptyCellFactory.build(2));
        board.addCell(mineCellFactory.build(1));
        board.addCell(new EmptyCell(false, true));

        //Line 6
        board.addCell(emptyCellFactory.build(1));
        board.addCell(mineCellFactory.build(1));
        board.addCell(emptyCellFactory.build(1));
        board.addCell(mineCellFactory.build(3));

        board.resetCurrentRowAndColumn();

        //ExternalCounters
        board.addVerticalLine(externalCounterFactory.build(6));
        board.addHorizontalLine(externalCounterFactory.build(6));

        return board;
    }

    @Override public String toString(){
        return "43";
    }
}