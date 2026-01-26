package levels;

import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.EmptyCell;

public class Level70 extends Level{
    @Override protected Board setup(){
        BoardWithLines board = new BoardWithLines(24, 8, 8, true);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();

        MineCellFactory mineFactory = new MineCellFactory();
                
        EmptyCellFactory unrevealedEmptyFactory = new EmptyCellFactory(false, false);
        
        EmptyCellFactory unknownFactory = new EmptyCellFactory(false, true);

        board.setAddsCellsHorizontally(false);

        //Column 1
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(unknownFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(1));
        board.addCell(unknownFactory.build(2));
        board.addCell(new EmptyCell(true, true));

        //Column 2 (Part 1)
        board.addCell(mineFactory.build(3));

        board.setAddsCellsHorizontally(true);

        //Row 4
        board.addCell(unrevealedEmptyFactory.build(3));
        board.addCell(unknownFactory.build(2));
        board.addCell(unrevealedEmptyFactory.build(2));
        
        board.setAddsCellsHorizontally(false);

        //Column 2 (Part 2)
        board.addCell(unrevealedEmptyFactory.build(3));
        board.addCell(mineFactory.build(1));

        //Column 3
        board.addCell(unknownFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(3));

        //Column 4
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(2));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(2));
        board.addCell(unrevealedEmptyFactory.build(1));

        //Column 5
        board.addCell(mineFactory.build(4));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        
        //Column 6
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(2));

        //Column 7
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(2));
        board.addCell(unrevealedEmptyFactory.build(3));
        board.addCell(mineFactory.build(1));

        //Column 8
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(3));

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(externalCounterFactory.build(8));
        
        //HorizontalLines
        board.addHorizontalLine(externalCounterFactory.build(8));

        return board;
    }

    @Override public String toString(){
        return "70";
    }
}