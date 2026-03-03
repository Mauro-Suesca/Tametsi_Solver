package levels;

import cellFactories.CellFactory;
import cellFactories.EmptyCellFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardLineless;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;

public class Level131 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(37, "gray", ESC + "0m");
        ColorCounter red = new ColorCounter(20, "red", ESC + "31m");
        ColorCounter yellow = new ColorCounter(11, "yellow", ESC + "33m");
        ColorCounter orange = new ColorCounter(18, "orange", ESC + "38;5;214m");

        Board board = new BoardLineless(17, 17, true, gray, red, yellow, orange);

        board.setMaxMineDifferenceForImaginaryCells(5);

        CellFactory.setBoard(board);

        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();
    
        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory redMineFactory = new MineCellFactory(red);
        MineCellFactory yellowMineFactory = new MineCellFactory(yellow);
        MineCellFactory orangeMineFactory = new MineCellFactory(orange);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory redUnrevealedEmptyFactory = new EmptyCellFactory(red, false, false);
        EmptyCellFactory yellowUnrevealedEmptyFactory = new EmptyCellFactory(yellow, false, false);
        EmptyCellFactory orangeUnrevealedEmptyFactory = new EmptyCellFactory(orange, false, false);

        EmptyCellFactory grayUnknownUnrevealedFactory = new EmptyCellFactory(gray, false, true);

        EmptyCellFactory grayUnknownRevealedFactory = new EmptyCellFactory(gray, true, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        board.addCellsVertically();

        //Column 1
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayUnknownUnrevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Column 2
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(2);
        grayRevealedFactory.addToBoard(4);
        grayUnknownRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 3
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        redUnrevealedEmptyFactory.addToBoard(5);
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(3);
        grayRevealedFactory.addToBoard(1);
        yellowUnrevealedEmptyFactory.addToBoard(1);
        yellowMineFactory.addToBoard(2);
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        board.addCellsHorizontally();

        //Row 1
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(4);

        //Row 2
        grayRevealedFactory.addToBoard(5);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(3);
        grayUnknownRevealedFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);

        //Row 3
        redMineFactory.addToBoard(4);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        yellowMineFactory.addToBoard(3);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 4
        nonExistentCellFactory.addToBoard(3);
        redUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        yellowUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        yellowMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 5
        nonExistentCellFactory.addToBoard(3);
        redMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        orangeMineFactory.addToBoard(3);
        grayRevealedFactory.addToBoard(1);
        yellowMineFactory.addToBoard(3);
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Row 6
        nonExistentCellFactory.addToBoard(3);
        redMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(2);
        grayRevealedFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);

        //Row 7
        redMineFactory.addToBoard(3);
        redUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(2);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);

        //Row 8
        grayRevealedFactory.addToBoard(4);
        grayUnknownRevealedFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(3);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(2);

        //Row 9
        grayRevealedFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(3);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(4);
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
    
        //Row 10
        grayUnknownRevealedFactory.addToBoard(1);
        board.addCell(new EmptyCell(orange, false, true));
        nonExistentCellFactory.addToBoard(3);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(7);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 11 (Part 1)
        grayRevealedFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(2);
        nonExistentCellFactory.addToBoard(1);
        
        board.addCellsVertically();

        //Column 9
        orangeMineFactory.addToBoard(2);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(2);

        //Column 10
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(2);
        grayRevealedFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 11
        redMineFactory.addToBoard(2);
        redUnrevealedEmptyFactory.addToBoard(1);
        redMineFactory.addToBoard(1);
        redUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        board.skipLines(3);

        //Column 15
        redUnrevealedEmptyFactory.addToBoard(1);
        redMineFactory.addToBoard(1);
        redUnrevealedEmptyFactory.addToBoard(1);
        redMineFactory.addToBoard(2);
        grayRevealedFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Column 16
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 17
        grayMineFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        board.addCellsHorizontally();

        //Row 11 (Part 2)
        redUnrevealedEmptyFactory.addToBoard(1);
        redMineFactory.addToBoard(2);

        //Row 12
        grayRevealedFactory.addToBoard(3);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(4);
        
        //Row 13
        yellowMineFactory.addToBoard(1);
        board.addCell(new EmptyCell(yellow, false, true));
        grayUnknownRevealedFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(3);

        //Row 14
        nonExistentCellFactory.addToBoard(1);
        yellowUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(3);
        nonExistentCellFactory.addToBoard(3);

        //Row 15
        yellowUnrevealedEmptyFactory.addToBoard(1);
        yellowMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        redMineFactory.addToBoard(3);

        //Row 16
        grayRevealedFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(3);

        //Row 17
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(1);

        return board;
    }

    @Override public String toString(){
        return "131";
    }
}