package levels;

import cellFactories.EmptyCellFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardLineless;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;
import cellLogic.MineCell;

public class Level69 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(29, "gray", ESC + "0m");
        ColorCounter red = new ColorCounter(3, "red", ESC + "31m");
        ColorCounter purple = new ColorCounter(6, "purple", ESC + "35m");
        ColorCounter blue = new ColorCounter(2, "blue", ESC + "34m");

        Board board = new BoardLineless(15, 23, false, gray, red, purple, blue);

        board.setMaxMineDifferenceForImaginaryCells(5);

        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayVerticalMineFactory = new MineCellFactory(gray, 1, 3);
        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory purpleVerticalMineFactory = new MineCellFactory(purple, 1, 3);
        
        EmptyCellFactory grayVerticalUnrevealedFactory = new EmptyCellFactory(gray, false, false, 1, 3);
        EmptyCellFactory grayUnrevealedFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory redVerticalUnrevealedFactory = new EmptyCellFactory(red, false, false, 1, 3);
        EmptyCellFactory redUnrevealedFactory = new EmptyCellFactory(red, false, false);
        EmptyCellFactory purpleVerticalUnrevealedFactory = new EmptyCellFactory(purple, false, false, 1, 3);
        EmptyCellFactory purpleUnrevealedFactory = new EmptyCellFactory(purple, false, false);
        EmptyCellFactory blueVerticalUnrevealedFactory = new EmptyCellFactory(blue, false, false, 1, 3);
        EmptyCellFactory blueUnrevealedFactory = new EmptyCellFactory(blue, false, false);

        EmptyCellFactory grayVerticalUnknownFactory = new EmptyCellFactory(gray, false, true, 1, 3);
        EmptyCellFactory grayUnknownFactory = new EmptyCellFactory(gray, false, true);
      
        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        //Row 1
        board.addCell(nonExistentCellFactory.build(6));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(nonExistentCellFactory.build(6));

        //Row 2
        board.addCell(nonExistentCellFactory.build(13));

        //Row 3
        board.addCell(nonExistentCellFactory.build(5));
        board.addCell(redVerticalUnrevealedFactory.build(1));
        board.addCell(purpleVerticalUnrevealedFactory.build(1));
        board.addCell(new MineCell(blue, 1, 3));
        board.addCell(nonExistentCellFactory.build(5));

        //Row 4
        board.addCell(nonExistentCellFactory.build(5));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedFactory.build(1));
        board.addCell(nonExistentCellFactory.build(5));

        //Row 5
        board.addCell(nonExistentCellFactory.build(4));
        board.addCell(grayVerticalUnrevealedFactory.build(3));
        board.addCell(grayVerticalMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(4));

        //Row 6
        board.addCell(nonExistentCellFactory.build(4));
        board.addCell(new MineCell(red));
        board.addCell(new MineCell(purple));
        board.addCell(blueUnrevealedFactory.build(1));
        board.addCell(nonExistentCellFactory.build(4));

        //Row 7
        board.addCell(nonExistentCellFactory.build(3));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(redVerticalUnrevealedFactory.build(1));
        board.addCell(purpleVerticalUnrevealedFactory.build(1));
        board.addCell(blueVerticalUnrevealedFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(nonExistentCellFactory.build(3));

        //Row 8
        board.addCell(nonExistentCellFactory.build(3));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedFactory.build(3));
        board.addCell(nonExistentCellFactory.build(3));

        //Row 9
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(grayVerticalMineFactory.build(2));
        board.addCell(grayVerticalUnrevealedFactory.build(2));
        board.addCell(grayVerticalUnknownFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));

        //Row 10
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(new MineCell(red));
        board.addCell(new MineCell(purple));
        board.addCell(blueUnrevealedFactory.build(1));
        board.addCell(grayUnrevealedFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));

        //Row 11
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(grayVerticalMineFactory.build(1));
        board.addCell(redVerticalUnrevealedFactory.build(1));
        board.addCell(purpleVerticalMineFactory.build(1));
        board.addCell(blueVerticalUnrevealedFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(2));
        board.addCell(nonExistentCellFactory.build(1));

        //Row 12
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(3));
        board.addCell(grayUnrevealedFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));

        //Row 13
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(grayVerticalMineFactory.build(2));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(grayVerticalUnknownFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(grayVerticalMineFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));

        //Row 14
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedFactory.build(1));
        board.addCell(redUnrevealedFactory.build(1));
        board.addCell(new MineCell(purple));
        board.addCell(blueUnrevealedFactory.build(1));
        board.addCell(grayMineFactory.build(2));

        //Row 15
        board.addCell(grayVerticalUnrevealedFactory.build(2));
        board.addCell(redVerticalUnrevealedFactory.build(1));
        board.addCell(purpleVerticalMineFactory.build(1));
        board.addCell(blueVerticalUnrevealedFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(2));

        //Row 16
        board.addCell(grayUnrevealedFactory.build(3));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedFactory.build(1));

        //Row 17
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(grayVerticalMineFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(3));
        board.addCell(grayVerticalMineFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(2));

        //Row 18
        board.addCell(grayUnknownFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(new MineCell(red));
        board.addCell(purpleUnrevealedFactory.build(1));
        board.addCell(blueUnrevealedFactory.build(1));
        board.addCell(grayUnrevealedFactory.build(2));

        //Row 19
        board.addCell(new EmptyCell(gray,true, false, 1, 3));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(redVerticalUnrevealedFactory.build(1));
        board.addCell(purpleVerticalUnrevealedFactory.build(1));
        board.addCell(blueVerticalUnrevealedFactory.build(1));
        board.addCell(grayVerticalUnrevealedFactory.build(1));
        board.addCell(grayVerticalMineFactory.build(1));

        //Row 20
        board.addCell(grayUnknownFactory.build(1));
        board.addCell(grayUnrevealedFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedFactory.build(3));
        board.addCell(grayRevealedFactory.build(1));

        board.addCellsVertically();

        //Column 1
        board.addCell(nonExistentCellFactory.build(3));

        //Column 2
        board.addCell(grayUnrevealedFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));

        //Column 3
        board.addCell(grayVerticalUnknownFactory.build(1));

        //Column 4
        board.addCell(grayMineFactory.build(2));

        //Column 5
        board.addCell(grayVerticalUnrevealedFactory.build(1));

        //Column 6
        board.addCell(redUnrevealedFactory.build(2));

        //Column 7
        board.addCell(grayVerticalMineFactory.build(1));

        //Column 8
        board.addCell(purpleUnrevealedFactory.build(1));
        board.addCell(new MineCell(purple));

        //Column 9
        board.addCell(grayVerticalUnrevealedFactory.build(1));

        //Column 10
        board.addCell(new MineCell(blue));
        board.addCell(blueUnrevealedFactory.build(1));

        //Column 11
        board.addCell(grayVerticalUnrevealedFactory.build(1));

        //Column 12
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedFactory.build(1));
        
        //Column 13
        board.addCell(grayVerticalMineFactory.build(1));

        //Column 14
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));

        //Column 15
        board.addCell(nonExistentCellFactory.build(3));
        
        return board;
    }

    @Override public String toString(){
        return "69";
    }
}