package levels;

import cellFactories.CellFactory;
import cellFactories.EmptyCellFactory;
import cellFactories.MineCellFactory;
import cellLogic.Board;
import cellLogic.BoardLineless;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;

public class Level88 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(0, "gray", ESC + "0m");
        ColorCounter orange = new ColorCounter(24, "orange", ESC + "38;5;214m");
        ColorCounter green = new ColorCounter(13, "green", ESC + "32m");
        ColorCounter red = new ColorCounter(14, "red", ESC + "31m");
        ColorCounter yellow = new ColorCounter(16, "yellow", ESC + "33m");
        
        Board board = new BoardLineless(18, 18, true, gray, orange, green, red, yellow);

        CellFactory.setBoard(board);
        
        MineCellFactory orangeMineFactory = new MineCellFactory(orange);
        MineCellFactory greenMineFactory = new MineCellFactory(green);
        MineCellFactory redMineFactory = new MineCellFactory(red);
        MineCellFactory yellowMineFactory = new MineCellFactory(yellow);
        
        EmptyCellFactory orangeUnrevealedEmptyFactory = new EmptyCellFactory(orange, false, false);
        EmptyCellFactory greenUnrevealedEmptyFactory = new EmptyCellFactory(green, false, false);
        EmptyCellFactory redUnrevealedEmptyFactory = new EmptyCellFactory(red, false, false);
        EmptyCellFactory yellowUnrevealedEmptyFactory = new EmptyCellFactory(yellow, false, false);

        EmptyCellFactory greenUnknownFactory = new EmptyCellFactory(green, false, true);
        EmptyCellFactory redUnknownFactory = new EmptyCellFactory(red, false, true);

        EmptyCellFactory grayUnknownRevealedFactory = new EmptyCellFactory(gray, true, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        //Row 1
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(3);
        board.addCell(new EmptyCell(orange, false, true));
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(2);

        board.skipLines(1);

        //Row 2
        grayRevealedFactory.addToBoard(9);

        board.skipLines(1);

        //Row 3
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(2);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(2);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);

        board.skipLines(1);

        //Row 4
        orangeUnrevealedEmptyFactory.addToBoard(3);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);

        board.skipLines(1);

        //Row 5
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(8);

        board.skipLines(1);

        //Row 6
        orangeMineFactory.addToBoard(2);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(2);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(2);

        board.skipLines(1);

        //Row 7
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(2);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(2);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);

        board.skipLines(1);

        //Row 8
        grayRevealedFactory.addToBoard(9);

        board.skipLines(1);

        //Row 9
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(2);
        orangeMineFactory.addToBoard(1);
        orangeUnrevealedEmptyFactory.addToBoard(1);
        orangeMineFactory.addToBoard(2);

        board.skipLines(1);

        board.setAddsCellsHorizontally(false);

        //Column 1
        redUnrevealedEmptyFactory.addToBoard(1);
        redMineFactory.addToBoard(2);
        redUnrevealedEmptyFactory.addToBoard(2);
        redMineFactory.addToBoard(1);
        redUnknownFactory.addToBoard(1);
        redUnrevealedEmptyFactory.addToBoard(2);

        //Column 2
        grayRevealedFactory.addToBoard(5);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(3);

        //Column 3
        redUnrevealedEmptyFactory.addToBoard(2);
        redMineFactory.addToBoard(1);
        redUnrevealedEmptyFactory.addToBoard(4);
        redMineFactory.addToBoard(1);
        redUnrevealedEmptyFactory.addToBoard(1);

        //Column 4
        redUnrevealedEmptyFactory.addToBoard(1);
        redMineFactory.addToBoard(2);
        redUnrevealedEmptyFactory.addToBoard(2);
        redMineFactory.addToBoard(1);
        redUnrevealedEmptyFactory.addToBoard(2);
        redUnknownFactory.addToBoard(1);

        //Column 5
        grayRevealedFactory.addToBoard(4);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);

        //Column 6
        redUnrevealedEmptyFactory.addToBoard(7);
        redMineFactory.addToBoard(1);
        redUnrevealedEmptyFactory.addToBoard(1);

        //Column 7
        redUnrevealedEmptyFactory.addToBoard(2);
        redMineFactory.addToBoard(1);
        redUnrevealedEmptyFactory.addToBoard(3);
        redMineFactory.addToBoard(1);
        redUnrevealedEmptyFactory.addToBoard(2);

        //Column 8
        grayRevealedFactory.addToBoard(9);

        //Column 9
        redUnrevealedEmptyFactory.addToBoard(2);
        redMineFactory.addToBoard(1);
        redUnrevealedEmptyFactory.addToBoard(2);
        redMineFactory.addToBoard(1);
        redUnknownFactory.addToBoard(1);
        redUnrevealedEmptyFactory.addToBoard(1);
        redMineFactory.addToBoard(1);

        //Column 10
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(2);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(2);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);

        board.setAddsCellsHorizontally(true);

        //Row 10
        yellowMineFactory.addToBoard(1);
        yellowUnrevealedEmptyFactory.addToBoard(1);
        yellowMineFactory.addToBoard(1);
        yellowUnrevealedEmptyFactory.addToBoard(2);
        yellowMineFactory.addToBoard(1);
        yellowUnrevealedEmptyFactory.addToBoard(1);
        board.addCell(new EmptyCell(yellow, false, true));
        yellowMineFactory.addToBoard(1);

        //Row 11
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(4);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(3);

        //Row 12
        yellowUnrevealedEmptyFactory.addToBoard(9);

        //Row 13
        yellowMineFactory.addToBoard(2);
        yellowUnrevealedEmptyFactory.addToBoard(1);
        yellowMineFactory.addToBoard(1);
        yellowUnrevealedEmptyFactory.addToBoard(3);
        yellowMineFactory.addToBoard(1);
        yellowUnrevealedEmptyFactory.addToBoard(1);

        //Row 14
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(5);

        //Row 15
        yellowMineFactory.addToBoard(1);
        yellowUnrevealedEmptyFactory.addToBoard(4);
        yellowMineFactory.addToBoard(2);
        yellowUnrevealedEmptyFactory.addToBoard(2);

        //Row 16
        yellowUnrevealedEmptyFactory.addToBoard(2);
        yellowMineFactory.addToBoard(2);
        yellowUnrevealedEmptyFactory.addToBoard(1);
        yellowMineFactory.addToBoard(1);
        yellowUnrevealedEmptyFactory.addToBoard(1);
        yellowMineFactory.addToBoard(1);
        yellowUnrevealedEmptyFactory.addToBoard(1);

        //Row 17
        grayRevealedFactory.addToBoard(9);

        //Row 18
        yellowUnrevealedEmptyFactory.addToBoard(6);
        yellowMineFactory.addToBoard(1);
        yellowUnrevealedEmptyFactory.addToBoard(2);

        board.setAddsCellsHorizontally(false);
        
        //Column 11
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(8);

        //Column 12
        greenUnrevealedEmptyFactory.addToBoard(9);

        //Column 13
        greenUnrevealedEmptyFactory.addToBoard(3);
        greenMineFactory.addToBoard(2);
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(2);

        //Column 14
        grayRevealedFactory.addToBoard(9);

        //Column 15
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(3);
        greenUnknownFactory.addToBoard(2);
        greenUnrevealedEmptyFactory.addToBoard(2);
        greenUnknownFactory.addToBoard(1);

        //Column 16
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(2);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(3);

        //Column 17
        grayRevealedFactory.addToBoard(7);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);

        //Column 18
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(2);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(2);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);

        return board;
    }

    @Override public String toString(){
        return "88";
    }
}