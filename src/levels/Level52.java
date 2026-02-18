package levels;

import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.ColorCounter;

public class Level52 extends Level{
    @Override protected Board setup(){
        ColorCounter purple = new ColorCounter(54, "moradas", ESC + "35m");
        
        BoardWithLines board = new BoardWithLines(20, 20, true, purple);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory mineFactory = new MineCellFactory(purple);
                
        EmptyCellFactory unrevealedEmptyFactory = new EmptyCellFactory(purple, false, false);

        EmptyCellFactory unknownFactory = new EmptyCellFactory(purple, false, true);

        EmptyCellFactory revealedFactory = new EmptyCellFactory(purple, true, false);

        //Line 1
        board.addCell(mineFactory.build(3));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(6));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(revealedFactory.build(2));

        //Line 2
        board.addCell(unrevealedEmptyFactory.build(4));
        board.addCell(unknownFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(4));
        board.addCell(revealedFactory.build(2));

        //Line 3
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(11));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(2));

        //Line 4
        board.addCell(nonExistentCellFactory.build(7));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(unknownFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(8));

        //Line 5
        board.addCell(nonExistentCellFactory.build(7));
        board.addCell(unrevealedEmptyFactory.build(6));
        board.addCell(mineFactory.build(2));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));

        //Line 6
        board.addCell(nonExistentCellFactory.build(7));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(1));

        //Line 7
        board.addCell(nonExistentCellFactory.build(7));
        board.addCell(unrevealedEmptyFactory.build(4));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(4));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(3));

        //Line 8
        board.addCell(nonExistentCellFactory.build(7));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(2));
        board.addCell(unrevealedEmptyFactory.build(3));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));

        //Line 9
        board.addCell(nonExistentCellFactory.build(9));
        board.addCell(unrevealedEmptyFactory.build(6));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(3));
        board.addCell(mineFactory.build(1));

        //Line 10
        board.addCell(nonExistentCellFactory.build(9));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));

        //Line 11
        board.addCell(nonExistentCellFactory.build(9));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(unknownFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));

        //Line 12
        board.addCell(nonExistentCellFactory.build(12));
        board.addCell(unrevealedEmptyFactory.build(3));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(2));

        //Line 13
        board.addCell(nonExistentCellFactory.build(12));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(unknownFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));

        //Line 14
        board.addCell(nonExistentCellFactory.build(17));
        board.addCell(unrevealedEmptyFactory.build(3));

        //Line 15
        board.addCell(nonExistentCellFactory.build(17));
        board.addCell(unknownFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));

        //Line 16
        board.addCell(nonExistentCellFactory.build(17));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));

        //Line 17
        board.addCell(nonExistentCellFactory.build(17));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(1));

        //Line 18
        board.addCell(nonExistentCellFactory.build(17));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(1));

        //Line 19
        board.addCell(nonExistentCellFactory.build(17));
        board.addCell(unrevealedEmptyFactory.build(3));

        //Line 20
        board.addCell(nonExistentCellFactory.build(17));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(1));

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(nonExistentCellFactory.build(17));
        board.addVerticalLine(externalCounterFactory.build(3));
        
        //HorizontalLines
        board.addHorizontalLine(externalCounterFactory.build(3));
        board.addHorizontalLine(nonExistentCellFactory.build(17));
        
        return board;
    }

    @Override public String toString(){
        return "52";
    }
}