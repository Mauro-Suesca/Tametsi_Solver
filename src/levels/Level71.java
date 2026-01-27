package levels;

import cellFactories.EmptyCellFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardLineless;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;

public class Level71 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(0, "gray", "\u001B[0m");
        ColorCounter blue = new ColorCounter(6, "blue", "\u001B[34m");
        ColorCounter orange = new ColorCounter(9, "orange", "\u001B[38;5;214m");
        ColorCounter green = new ColorCounter(8, "green", "\u001B[32m");
        
        Board board = new BoardLineless(15, 15, true, blue, orange, green);

        board.setMaxMineDifferenceForImaginaryCells(5);

        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();
        
        MineCellFactory blueMineFactory = new MineCellFactory(blue);
        MineCellFactory orangeMineFactory = new MineCellFactory(orange);
        MineCellFactory greenMineFactory = new MineCellFactory(green);
        
        EmptyCellFactory blueUnrevealedEmptyFactory = new EmptyCellFactory(blue, false, false);
        EmptyCellFactory orangeUnrevealedEmptyFactory = new EmptyCellFactory(orange, false, false);
        EmptyCellFactory greenUnrevealedEmptyFactory = new EmptyCellFactory(green, false, false);

        EmptyCellFactory grayUnknownFactory = new EmptyCellFactory(gray, true, true);
        EmptyCellFactory blueUnknownFactory = new EmptyCellFactory(blue, false, true);
        EmptyCellFactory orangeUnknownFactory = new EmptyCellFactory(orange, false, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        //Row 1 (Part 1)
        board.addCell(blueMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(2));
        board.addCell(blueMineFactory.build(2));

        board.setAddsCellsHorizontally(false);

        //Column 6
        board.addCell(blueUnrevealedEmptyFactory.build(6));
        board.addCell(blueUnknownFactory.build(1));
        board.addCell(blueMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(2));
        board.addCell(blueUnknownFactory.build(1));
        board.addCell(nonExistentCellFactory.build(4));

        //Column 7
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(greenMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(5));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(4));

        //Column 8
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(orangeMineFactory.build(1));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(orangeMineFactory.build(1));
        board.addCell(orangeUnknownFactory.build(1));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(orangeMineFactory.build(2));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(orangeUnknownFactory.build(1));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));

        //Column 9
        board.addCell(nonExistentCellFactory.build(4));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(5));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(orangeUnknownFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));

        //Column 10
        board.addCell(nonExistentCellFactory.build(4));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(greenMineFactory.build(2));
        board.addCell(greenUnrevealedEmptyFactory.build(3));
        board.addCell(greenMineFactory.build(1));
        board.addCell(greenUnrevealedEmptyFactory.build(4));

        board.setAddsCellsHorizontally(true);

        //Row 1 (Part 2)
        board.addCell(nonExistentCellFactory.build(5));

        //Row 2
        board.addCell(grayRevealedFactory.build(5));
        board.addCell(nonExistentCellFactory.build(5));

        //Row 3
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(orangeUnknownFactory.build(1));
        board.addCell(orangeMineFactory.build(1));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(orangeMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(5));

        //Row 4
        board.addCell(grayRevealedFactory.build(5));
        board.addCell(nonExistentCellFactory.build(5));

        //Row 5
        board.addCell(greenMineFactory.build(1));
        board.addCell(greenUnrevealedEmptyFactory.build(2));
        board.addCell(greenMineFactory.build(1));
        board.addCell(new EmptyCell(green, false, true));
        board.addCell(nonExistentCellFactory.build(5));

        //Row 6
        board.addCell(nonExistentCellFactory.build(10));

        //Row 7
        board.addCell(nonExistentCellFactory.build(10));

        //Row 8
        board.addCell(nonExistentCellFactory.build(10));

        //Row 9
        board.addCell(nonExistentCellFactory.build(10));

        //Row 10
        board.addCell(nonExistentCellFactory.build(10));

        //Row 11
        board.addCell(nonExistentCellFactory.build(5));
        board.addCell(blueMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(1));
        board.addCell(blueMineFactory.build(1));
        board.addCell(blueUnrevealedEmptyFactory.build(2));

        //Row 12
        board.addCell(nonExistentCellFactory.build(5));
        board.addCell(grayUnknownFactory.build(1));
        board.addCell(grayRevealedFactory.build(3));
        board.addCell(grayUnknownFactory.build(1));

        //Row 13
        board.addCell(nonExistentCellFactory.build(5));
        board.addCell(orangeMineFactory.build(1));
        board.addCell(orangeUnknownFactory.build(1));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(orangeMineFactory.build(2));

        //Row 14
        board.addCell(nonExistentCellFactory.build(5));
        board.addCell(grayRevealedFactory.build(3));
        board.addCell(grayUnknownFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));

        //Row 15
        board.addCell(nonExistentCellFactory.build(5));
        board.addCell(greenMineFactory.build(1));
        board.addCell(greenUnrevealedEmptyFactory.build(2));
        board.addCell(greenMineFactory.build(1));
        board.addCell(greenUnrevealedEmptyFactory.build(1));

        return board;
    }

    @Override public String toString(){
        return "71";
    }
}