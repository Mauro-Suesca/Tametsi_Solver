package levels;

import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;

public class Level65 extends Level{
    @Override protected Board setup(){
        BoardWithLines board = new BoardWithLines(134, 22, 22, true);

        board.setMaxMineDifferenceForImaginaryCells(5);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory mineFactory = new MineCellFactory();
                
        EmptyCellFactory unrevealedEmptyFactory = new EmptyCellFactory(false, false);
        
        EmptyCellFactory unknownFactory = new EmptyCellFactory(false, true);

        EmptyCellFactory revealedFactory = new EmptyCellFactory(true, false);

        board.setAddsCellsHorizontally(false);

        //Column 1 (Part 1)
        board.addCell(mineFactory.build(2));
        board.addCell(unrevealedEmptyFactory.build(4));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(4));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));

        board.setAddsCellsHorizontally(true);

        //Row 17
        board.addCell(nonExistentCellFactory.build(6));
        board.addCell(unrevealedEmptyFactory.build(4));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(unrevealedEmptyFactory.build(3));
        board.addCell(unknownFactory.build(1));
        board.addCell(nonExistentCellFactory.build(6));

        //Row 18
        board.addCell(nonExistentCellFactory.build(6));
        board.addCell(unrevealedEmptyFactory.build(3));
        board.addCell(mineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(6));

        board.setAddsCellsHorizontally(false);

        //Column 1 (Part 2)
        board.addCell(revealedFactory.build(4));

        //Column 2
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(10));
        board.addCell(mineFactory.build(1));
        board.addCell(revealedFactory.build(4));
        
        //Column 3
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(6));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(7));
        board.addCell(mineFactory.build(3));

        //Column 4
        board.addCell(unrevealedEmptyFactory.build(3));
        board.addCell(mineFactory.build(2));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(2));
        board.addCell(unrevealedEmptyFactory.build(3));
        board.addCell(mineFactory.build(3));
        board.addCell(unrevealedEmptyFactory.build(4));
        board.addCell(mineFactory.build(2));

        //Column 5 (Part 1)
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(6));

        board.setAddsCellsHorizontally(true);

        //Row 11
        board.addCell(nonExistentCellFactory.build(14));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));

        //Row 12
        board.addCell(nonExistentCellFactory.build(14));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(3));

        board.setAddsCellsHorizontally(false);

        //Column 5 (Part 2)
        board.addCell(unknownFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(6));

        //Column 6
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(6));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(unknownFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(unknownFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));

        //Column 7
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(unknownFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(4));
        board.addCell(unknownFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(unknownFactory.build(1));

        //Column 8
        board.addCell(unrevealedEmptyFactory.build(3));
        board.addCell(mineFactory.build(2));
        board.addCell(unknownFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(3));
        board.addCell(mineFactory.build(2));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(1));

        //Column 9
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(2));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(2));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(3));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(2));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));

        //Column 10
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(3));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(3));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(unknownFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));

        //Column 11
        board.addCell(nonExistentCellFactory.build(6));
        board.addCell(unrevealedEmptyFactory.build(4));
        board.addCell(nonExistentCellFactory.build(8));

        //Column 12
        board.addCell(nonExistentCellFactory.build(6));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(8));

        //Column 13
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(2));
        board.addCell(unrevealedEmptyFactory.build(4));
        board.addCell(mineFactory.build(1));

        //Column 14
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(7));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(6));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));

        //Column 15
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(3));
        board.addCell(mineFactory.build(4));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(3));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));

        //Column 16
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(2));
        board.addCell(unrevealedEmptyFactory.build(3));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(4));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(4));

        //Column 17
        board.addCell(unrevealedEmptyFactory.build(3));
        board.addCell(mineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(6));
        board.addCell(unrevealedEmptyFactory.build(3));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(2));

        //Column 18
        board.addCell(unrevealedEmptyFactory.build(4));
        board.addCell(nonExistentCellFactory.build(6));
        board.addCell(mineFactory.build(1));
        board.addCell(unknownFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(2));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));

        //Column 19
        board.addCell(mineFactory.build(2));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(3));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(4));
        board.addCell(unrevealedEmptyFactory.build(4));
        board.addCell(mineFactory.build(1));
        board.addCell(unknownFactory.build(1));
        board.addCell(mineFactory.build(1));

        //Column 20
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(3));
        board.addCell(mineFactory.build(2));
        board.addCell(unrevealedEmptyFactory.build(2));
        board.addCell(mineFactory.build(2));
        board.addCell(unrevealedEmptyFactory.build(8));

        //Column 21
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unknownFactory.build(1));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(3));
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(4));
        board.addCell(mineFactory.build(1));

        //Column 22
        board.addCell(mineFactory.build(1));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(2));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(5));
        board.addCell(unrevealedEmptyFactory.build(3));
        board.addCell(mineFactory.build(3));
        board.addCell(unrevealedEmptyFactory.build(1));
        board.addCell(mineFactory.build(1));
        
        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(externalCounterFactory.build(22));
        
        //HorizontalLines
        board.addHorizontalLine(externalCounterFactory.build(22));

        return board;
    }

    @Override public String toString(){
        return "65";
    }
}