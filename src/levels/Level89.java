package levels;

import cellFactories.CellFactory;
import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;

public class Level89 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(35, "gray", ESC + "0m");
        ColorCounter cyan = new ColorCounter(12, "cyan", ESC + "36m");
        ColorCounter purple = new ColorCounter(10, "purple", ESC + "35m");
        
        BoardWithLines board = new BoardWithLines(14, 14, false, gray, cyan, purple);

        board.setMaxMineDifferenceForImaginaryCells(5);

        CellFactory.setBoard(board);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory cyanMineFactory = new MineCellFactory(cyan);
        MineCellFactory purpleMineFactory = new MineCellFactory(purple);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory purpleUnrevealedEmptyFactory = new EmptyCellFactory(purple, false, false);
        EmptyCellFactory cyanUnrevealedEmptyFactory = new EmptyCellFactory(cyan, false, false);
        
        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        EmptyCellFactory gray2x2Factory = new EmptyCellFactory(gray, true, false, 2, 2);
        EmptyCellFactory grayVerticalFactory = new EmptyCellFactory(gray, true, false, 1, 2);
        EmptyCellFactory grayHorizontalFactory = new EmptyCellFactory(gray, true, false, 2, 1);

        board.addCellsVertically();

        //Column 1
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        cyanMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        board.addCellsHorizontally();

        //Row 1
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(3);
        grayUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        
        //Row 2
        gray2x2Factory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        board.addCell(new EmptyCell(gray, true, true, 1, 2));
        purpleMineFactory.addToBoard(1);
        gray2x2Factory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        grayVerticalFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        gray2x2Factory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 3
        purpleUnrevealedEmptyFactory.addToBoard(4);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Row 4
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);

        //Row 5
        grayHorizontalFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayHorizontalFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayHorizontalFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Row 6
        purpleMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        board.addCellsVertically();

        //Column 2
        gray2x2Factory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        board.addCell(new EmptyCell(gray, true, true, 2, 1));
        purpleMineFactory.addToBoard(1);
        board.addCell(new EmptyCell(gray, true, true, 2, 2));
        grayMineFactory.addToBoard(1);

        //Column 3
        purpleUnrevealedEmptyFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 4
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(2);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);
        
        //Column 5
        grayVerticalFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayVerticalFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Column 6
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 7
        gray2x2Factory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        grayHorizontalFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);
        gray2x2Factory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);

        //Column 8
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        cyanUnrevealedEmptyFactory.addToBoard(1);

        //Column 9
        cyanMineFactory.addToBoard(2);
        grayMineFactory.addToBoard(3);
        purpleUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(1);

        //Column 10
        grayVerticalFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);
        grayRevealedFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayVerticalFactory.addToBoard(1);
        grayMineFactory.addToBoard(1);

        //Column 11
        cyanMineFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);
        grayMineFactory.addToBoard(2);
        purpleMineFactory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 12
        gray2x2Factory.addToBoard(1);
        purpleUnrevealedEmptyFactory.addToBoard(1);
        grayHorizontalFactory.addToBoard(1);
        purpleMineFactory.addToBoard(1);
        gray2x2Factory.addToBoard(1);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 13
        purpleUnrevealedEmptyFactory.addToBoard(2);
        grayUnrevealedEmptyFactory.addToBoard(1);

        //Column 14
        cyanUnrevealedEmptyFactory.addToBoard(1);
        cyanMineFactory.addToBoard(1);
        board.addCell(new EmptyCell(gray, false, true));
        grayUnrevealedEmptyFactory.addToBoard(2);
        grayMineFactory.addToBoard(3);
        
        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(2));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(2));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(1));
        board.addVerticalLine(nonExistentCellFactory.build(2));
        board.addVerticalLine(externalCounterFactory.build(1));
        
        //HorizontalLines
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(2));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(2));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(1));
        board.addHorizontalLine(externalCounterFactory.build(1));
        board.addHorizontalLine(nonExistentCellFactory.build(2));
        board.addHorizontalLine(externalCounterFactory.build(1));
        
        return board;
    }

    @Override public String toString(){
        return "89";
    }
}