package levels;

import cellFactories.CellFactory;
import cellFactories.EmptyCellFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardLineless;
import cellLogic.ColorCounter;

public class Level85 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(0, "gray", ESC + "0m");
        ColorCounter green = new ColorCounter(42, "green", ESC + "32m");
        ColorCounter purple = new ColorCounter(47, "purple", ESC + "35m");

        Board board = new BoardLineless(19, 19, true, gray, green, purple);

        CellFactory.setBoard(board);

        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory greenMineFactory = new MineCellFactory(green);
        MineCellFactory purpleMineFactory = new MineCellFactory(purple);
        
        EmptyCellFactory greenUnrevealedEmptyFactory = new EmptyCellFactory(green, false, false);
        EmptyCellFactory purpleUnrevealedEmptyFactory = new EmptyCellFactory(purple, false, false);

        EmptyCellFactory grayUnknownRevealedFactory = new EmptyCellFactory(gray, true, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        board.addCellsVertically();

        //Column 1
        greenUnrevealedEmptyFactory.addToBoard(3);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(3);
        nonExistentCellFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(2);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(2);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(4);

        //Column 2
        greenMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(5);
        greenUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(5);
        greenMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(4);

        board.addCellsHorizontally();

        //Row 1
        greenUnrevealedEmptyFactory.addToBoard(2);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(2);
        greenMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(4);

        //Row 2
        grayRevealedFactory.addToBoard(4);
        greenUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(5);
        greenMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(4);

        //Row 3 (Part 1)
        purpleUnrevealedEmptyFactory.addToBoard(3);

        board.addCellsVertically();

        //Column 6
        grayRevealedFactory.addToBoard(2);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(5);
        purpleMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(3);
        purpleMineFactory.addToBoard(1);

        //Column 7
        greenUnrevealedEmptyFactory.addToBoard(2);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(5);
        greenMineFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);

        //Column 8
        nonExistentCellFactory.addToBoard(2);
        purpleMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);

        //Column 9
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(3);
        grayRevealedFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(2);
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);

        //Column 10
        grayRevealedFactory.addToBoard(6);
        greenMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(7);
        purpleMineFactory.addToBoard(1);

        //Column 11
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(2);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(3);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(3);

        //Column 12
        purpleUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(4);

        board.addCellsHorizontally();

        //Row 3 (Part 2)
        purpleMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(4);

        //Row 4
        purpleMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        purpleMineFactory.addToBoard(2);
        grayRevealedFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(4);

        //Row 5
        purpleUnrevealedEmptyFactory.addToBoard(2);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        purpleMineFactory.addToBoard(1);

        //Row 6
        grayRevealedFactory.addToBoard(9);
        purpleMineFactory.addToBoard(1);

        //Row 7
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(2);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(2);

        board.addCellsVertically();

        //Column 18
        grayRevealedFactory.addToBoard(4);
        purpleMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(5);
        purpleUnrevealedEmptyFactory.addToBoard(1);

        //Column 19
        purpleUnrevealedEmptyFactory.addToBoard(5);
        nonExistentCellFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);

        //Column 3
        nonExistentCellFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(3);
        grayRevealedFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(4);

        //Column 4
        nonExistentCellFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(4);

        //Column 5
        purpleMineFactory.addToBoard(4);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        grayRevealedFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);

        //Column 13
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(2);
        purpleUnrevealedEmptyFactory.addToBoard(2);

        //Column 14
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(3);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(3);
        purpleMineFactory.addToBoard(1);

        //Column 15
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(2);
        greenMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        greenMineFactory.addToBoard(2);
        greenUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);

        board.addCellsHorizontally();

        //Row 8
        nonExistentCellFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);

        //Row 9
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);

        //Row 10
        grayRevealedFactory.addToBoard(2);

        //Row 11
        purpleUnrevealedEmptyFactory.addToBoard(2);

        //Row 12
        nonExistentCellFactory.addToBoard(2);

        //Row 13
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);

        //Row 14
        grayRevealedFactory.addToBoard(2);

        //Row 15
        greenUnrevealedEmptyFactory.addToBoard(2);

        //Row 16
        nonExistentCellFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);

        //Row 17
        greenMineFactory.addToBoard(2);

        //Row 18
        grayRevealedFactory.addToBoard(2);

        //Row 19
        purpleUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);

        return board;
    }

    @Override public String toString(){
        return "85";
    }
}