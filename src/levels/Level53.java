package levels;

import cellFactories.EmptyCellFactory;
import cellLogic.Board;
import cellLogic.BoardLineless;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;
import cellLogic.MineCell;

public class Level53 extends Level{
    @Override protected Board setup(){
        ColorCounter pink = new ColorCounter(1, "pink", ESC + "38;5;212m");
        ColorCounter red = new ColorCounter(0, "red", ESC + "31m");
        ColorCounter orange = new ColorCounter(1, "orange", ESC + "38;5;214m");
        ColorCounter yellow = new ColorCounter(1, "yellow", ESC + "33m");

        Board board = new BoardLineless(11, 11, false, pink, red, orange, yellow);
        
        EmptyCellFactory redUnrevealedEmptyFactory = new EmptyCellFactory(red, false, false, 3, 3);
        EmptyCellFactory orangeUnrevealedEmptyFactory = new EmptyCellFactory(orange, false, false, 2, 2);

        EmptyCellFactory pinkUnknownFactory = new EmptyCellFactory(pink, false, true, 4, 4);
        EmptyCellFactory yellowUnknownFactory = new EmptyCellFactory(yellow, false, true);

        //Line 1
        board.addCell(pinkUnknownFactory.build(1));
        board.addCell(new EmptyCell(red, false, true, 3, 3));
        board.addCell(pinkUnknownFactory.build(1));

        //Line 4
        board.addCell(new MineCell(orange, 2, 2));
        board.addCell(new EmptyCell(yellow, false, false));

        //Line 5
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(yellowUnknownFactory.build(1));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(1));

        //Line 6
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(new EmptyCell(yellow, true, true));

        //Line 7
        board.addCell(new EmptyCell(orange, true, false, 2, 2));
        board.addCell(new MineCell(yellow));

        //Line 8
        board.addCell(new MineCell(pink, 4, 4));
        board.addCell(yellowUnknownFactory.build(1));
        board.addCell(pinkUnknownFactory.build(1));

        //Line 9
        board.addCell(new EmptyCell(red, true, false, 3, 3));

        return board;
    }

    @Override public String toString(){
        return "53";
    }
}