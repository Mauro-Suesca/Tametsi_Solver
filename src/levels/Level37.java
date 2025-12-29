package levels;

import cellFactories.EmptyCellFactory;
import cellFactories.MineCellFactory;
import cellLogic.Board;
import cellLogic.BoardLineless;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;

public class Level37 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(8, "grises", "\u001B[0m");
        ColorCounter red = new ColorCounter(11, "rojas", "\u001B[31m");

        Board board = new BoardLineless(6, 10, true, gray, red);

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory redMineFactory = new MineCellFactory(red);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory redUnrevealedEmptyFactory = new EmptyCellFactory(red, false, false);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        //Line 1
        board.addCell(grayRevealedFactory.build(6));

        //Line 2
        board.addCell(redMineFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(redMineFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(redMineFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(1));

        //Line 3
        board.addCell(redMineFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(2));
        board.addCell(redMineFactory.build(2));
        board.addCell(redUnrevealedEmptyFactory.build(1));

        //Line 4
        board.addCell(redMineFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(3));
        board.addCell(redMineFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(1));

        //Line 5
        board.addCell(redMineFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(2));
        board.addCell(redMineFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(redMineFactory.build(1));

        //Line 6
        board.addCell(grayMineFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(3));

        //Line 7
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(4));

        //Line 8
        board.addCell(grayUnrevealedEmptyFactory.build(5));
        board.addCell(grayMineFactory.build(1));

        //Line 9
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));

        //Line 10
        board.addCell(new EmptyCell(gray, true, true));
        board.addCell(grayRevealedFactory.build(4));
        board.addCell(new EmptyCell(gray, true, true));
        
        return board;
    }

    @Override public String toString(){
        return "37";
    }
}