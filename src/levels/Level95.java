package levels;

import cellFactories.CellFactory;
import cellFactories.EmptyCellFactory;
import cellFactories.MineCellFactory;
import cellLogic.Board;
import cellLogic.BoardLineless;
import cellLogic.ColorCounter;

public class Level95 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(27, "gray", ESC + "0m");
        ColorCounter cyan = new ColorCounter(14, "cyan", ESC + "36m");
        ColorCounter green = new ColorCounter(18, "green", ESC + "32m");
        ColorCounter yellow = new ColorCounter(15, "yellow", ESC + "33m");
        
        Board board = new BoardLineless(21, 11, true, gray, cyan, green, yellow);

        CellFactory.setBoard(board);
        
        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory cyanMineFactory = new MineCellFactory(cyan);
        MineCellFactory greenMineFactory = new MineCellFactory(green);
        MineCellFactory yellowMineFactory = new MineCellFactory(yellow);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory cyanUnrevealedEmptyFactory = new EmptyCellFactory(cyan, false, false);
        EmptyCellFactory greenUnrevealedEmptyFactory = new EmptyCellFactory(green, false, false);
        EmptyCellFactory yellowUnrevealedEmptyFactory = new EmptyCellFactory(yellow, false, false);

        EmptyCellFactory grayUnknownRevealedFactory = new EmptyCellFactory(gray, true, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        //Row 1 (Part 1)
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        
        board.addCellsVertically();

        //Column 5
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(9);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 6
        grayUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(2);
        cyanMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 7
        grayRevealedFactory.addToBoard(11);

        //Column 8
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(3);
        cyanUnrevealedEmptyFactory.addToBoard(2);
        cyanMineFactory.addToBoard(2);

        //Column 9
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(3);
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(2);
        greenMineFactory.addToBoard(1);

        //Column 10
        grayRevealedFactory.addToBoard(11);

        //Column 11
        greenUnrevealedEmptyFactory.addToBoard(2);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(3);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);

        //Column 12
        grayRevealedFactory.addToBoard(11);

        //Column 13
        greenMineFactory.addToBoard(2);
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(5);
        greenUnrevealedEmptyFactory.addToBoard(2);
        greenMineFactory.addToBoard(1);

        //Column 14
        yellowMineFactory.addToBoard(2);
        yellowUnrevealedEmptyFactory.addToBoard(2);
        yellowMineFactory.addToBoard(1);
        yellowUnrevealedEmptyFactory.addToBoard(1);
        yellowMineFactory.addToBoard(1);
        yellowUnrevealedEmptyFactory.addToBoard(1);
        yellowMineFactory.addToBoard(1);
        yellowUnrevealedEmptyFactory.addToBoard(1);
        yellowMineFactory.addToBoard(1);

        //Column 15
        grayRevealedFactory.addToBoard(11);

        //Column 16
        grayUnrevealedEmptyFactory.addToBoard(1);
        yellowUnrevealedEmptyFactory.addToBoard(1);
        yellowMineFactory.addToBoard(4);
        yellowUnrevealedEmptyFactory.addToBoard(1);
        yellowMineFactory.addToBoard(1);
        yellowUnrevealedEmptyFactory.addToBoard(1);
        yellowMineFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Column 17
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(6);
        grayMineFactory.addToBoard(1);

        board.addCellsHorizontally();

        //Row 1 (Part 2)
        grayMineFactory.addToBoard(4);

        //Row 2
        grayRevealedFactory.addToBoard(8);

        //Row 3
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 4 (Part 1)
        grayRevealedFactory.addToBoard(2);

        board.addCellsVertically();

        //Column 3
        grayRevealedFactory.addToBoard(5);

        board.skipLines(1);

        //Column 4
        cyanUnrevealedEmptyFactory.addToBoard(2);
        cyanMineFactory.addToBoard(2);
        cyanUnrevealedEmptyFactory.addToBoard(1);

        board.skipLines(1);

        //Column 18
        yellowMineFactory.addToBoard(1);
        yellowUnrevealedEmptyFactory.addToBoard(2);
        yellowMineFactory.addToBoard(1);
        yellowUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        board.skipLines(1);

        //Column 19
        grayRevealedFactory.addToBoard(5);

        board.skipLines(1);
        board.addCellsHorizontally();

        //Row 4 (Part 2)
        grayRevealedFactory.addToBoard(2);

        //Row 5
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 6
        grayRevealedFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        yellowMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);

        //Row 7
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);

        //Row 8
        grayRevealedFactory.addToBoard(4);

        //Row 9
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 10
        grayRevealedFactory.addToBoard(6);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);

        //Row 11
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(4);

        return board;
    }

    @Override public String toString(){
        return "95";
    }
}