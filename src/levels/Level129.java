package levels;

import cellFactories.CellFactory;
import cellFactories.EmptyCellFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardLineless;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;

public class Level129 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(30, "gray", ESC + "0m");
        ColorCounter green = new ColorCounter(23, "green", ESC + "32m");
        ColorCounter blue = new ColorCounter(41, "blue", ESC + "34m");

        Board board = new BoardLineless(19, 19, true, gray, green, blue);

        board.setMaxMineDifferenceForImaginaryCells(5);

        CellFactory.setBoard(board);

        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();
    
        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory greenMineFactory = new MineCellFactory(green);
        MineCellFactory blueMineFactory = new MineCellFactory(blue);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory greenUnrevealedEmptyFactory = new EmptyCellFactory(green, false, false);
        EmptyCellFactory blueUnrevealedEmptyFactory = new EmptyCellFactory(blue, false, false);

        EmptyCellFactory grayUnknownUnrevealedFactory = new EmptyCellFactory(gray, false, true);
        EmptyCellFactory greenUnknownFactory = new EmptyCellFactory(green, false, true);

        EmptyCellFactory grayUnknownRevealedFactory = new EmptyCellFactory(gray, true, true);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        board.addCellsVertically();

        //Column 1
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);

        //Column 2
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(12);
        grayUnknownRevealedFactory.addToBoard(2);
        grayRevealedFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);

        board.skipLines(7);

        //Column 10
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(3);
        blueMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        board.addCell(new EmptyCell(blue, false, true));
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);

        board.skipLines(7);

        //Column 18
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(5);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(4); 
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(6);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 19
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayUnknownUnrevealedFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);

        board.addCellsHorizontally();

        //Row 1
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(4);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(2);

        //Row 2
        grayRevealedFactory.addToBoard(14);

        //Row 3
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenUnknownFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        greenUnknownFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(3);
        blueUnrevealedEmptyFactory.addToBoard(2);

        //Row 4
        greenUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(5);
        greenMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(5);
        blueMineFactory.addToBoard(1);

        //Row 5
        greenMineFactory.addToBoard(2);
        greenUnrevealedEmptyFactory.addToBoard(3);
        greenMineFactory.addToBoard(2);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);

        //Row 6
        grayRevealedFactory.addToBoard(12);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);

        //Row 7
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(3);
        blueUnrevealedEmptyFactory.addToBoard(4);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        greenMineFactory.addToBoard(2);
        greenUnrevealedEmptyFactory.addToBoard(1);

        //Row 8
        blueUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(8);
        blueUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);

        //Row 9
        blueMineFactory.addToBoard(4);
        blueUnrevealedEmptyFactory.addToBoard(2);
        blueMineFactory.addToBoard(3);
        blueUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(2);

        //Row 10
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(10);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        
        //Row 11
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(2);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(3);

        //Row 12
        greenMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(8);
        blueMineFactory.addToBoard(1);

        //Row 13
        greenMineFactory.addToBoard(3);
        grayRevealedFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(2);
        blueMineFactory.addToBoard(2);
        blueUnrevealedEmptyFactory.addToBoard(1);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(3);
        blueMineFactory.addToBoard(1);

        //Row 14
        grayUnknownRevealedFactory.addToBoard(2);
        grayRevealedFactory.addToBoard(7);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(4);

        //Row 15
        blueUnrevealedEmptyFactory.addToBoard(2);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(2);
        blueMineFactory.addToBoard(1);
        blueUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(3);
        greenMineFactory.addToBoard(1);
        greenUnknownFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(1);

        //Row 16
        blueMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(5);
        blueUnrevealedEmptyFactory.addToBoard(1);
        greenMineFactory.addToBoard(1);
        nonExistentCellFactory.addToBoard(5);
        greenMineFactory.addToBoard(1);
        
        //Row 17
        blueMineFactory.addToBoard(2);
        blueUnrevealedEmptyFactory.addToBoard(2);
        blueMineFactory.addToBoard(3);
        greenMineFactory.addToBoard(1);
        greenUnrevealedEmptyFactory.addToBoard(2);
        greenMineFactory.addToBoard(2);
        greenUnrevealedEmptyFactory.addToBoard(2);

        //Row 18
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(4);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(2);
        grayRevealedFactory.addToBoard(2);
        grayUnknownRevealedFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnknownRevealedFactory.addToBoard(1);

        //Row 19
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(3);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        
        return board;
    }

    @Override public String toString(){
        return "129";
    }
}