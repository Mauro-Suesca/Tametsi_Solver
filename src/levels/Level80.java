package levels;

import cellFactories.EmptyCellFactory;
import cellFactories.ExternalCounterFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardWithLines;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;

public class Level80 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(17, "gray", ESC + "0m");
        ColorCounter purple = new ColorCounter(10, "purple", ESC + "35m");
        ColorCounter cyan = new ColorCounter(19, "cyan", ESC + "36m");
        ColorCounter orange = new ColorCounter(6, "orange", ESC + "38;5;214m");
        ColorCounter red = new ColorCounter(11, "red", ESC + "31m");
        ColorCounter green = new ColorCounter(11, "green", ESC + "32m");
        
        BoardWithLines board = new BoardWithLines(14, 17, true, gray, purple, cyan, orange, red, green);

        ExternalCounterFactory externalCounterFactory = new ExternalCounterFactory();
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory purpleMineFactory = new MineCellFactory(purple);
        MineCellFactory cyanMineFactory = new MineCellFactory(cyan);
        MineCellFactory orangeMineFactory = new MineCellFactory(orange);
        MineCellFactory greenMineFactory = new MineCellFactory(green);
        MineCellFactory redMineFactory = new MineCellFactory(red);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory purpleUnrevealedEmptyFactory = new EmptyCellFactory(purple, false, false);
        EmptyCellFactory cyanUnrevealedEmptyFactory = new EmptyCellFactory(cyan, false, false);
        EmptyCellFactory orangeUnrevealedEmptyFactory = new EmptyCellFactory(orange, false, false);
        EmptyCellFactory redUnrevealedEmptyFactory = new EmptyCellFactory(red, false, false);
        EmptyCellFactory greenUnrevealedEmptyFactory = new EmptyCellFactory(green, false, false);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        board.setAddsCellsHorizontally(false);

        //Column 1
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(6));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(5));

        board.setAddsCellsHorizontally(true);

        //Row 1
        board.addCell(grayRevealedFactory.build(12));

        board.setAddsCellsHorizontally(false);

        //Column 14
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(6));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(4));

        board.setAddsCellsHorizontally(true);

        //Row 2
        board.addCell(grayRevealedFactory.build(12));

        //Row 3
        board.addCell(grayRevealedFactory.build(12));

        //Row 4
        board.addCell(grayRevealedFactory.build(4));
        board.addCell(greenMineFactory.build(2));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(greenMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(4));

        //Row 5
        board.addCell(grayRevealedFactory.build(3));
        board.addCell(redMineFactory.build(3));
        board.addCell(grayRevealedFactory.build(6));

        //Row 6
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(2));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(redMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(6));

        board.setAddsCellsHorizontally(false);

        //Column 2
        board.addCell(greenMineFactory.build(3));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(orangeUnrevealedEmptyFactory.build(2));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(redMineFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(1));

        board.setAddsCellsHorizontally(true);

        //Row 17
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(4));

        //Row 7
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(2));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(4));

        //Row 8
        board.addCell(grayRevealedFactory.build(2));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(2));
        board.addCell(cyanMineFactory.build(2));
        board.addCell(grayRevealedFactory.build(2));
        board.addCell(purpleMineFactory.build(1));

        //Row 9
        board.addCell(cyanMineFactory.build(1));
        board.addCell(redMineFactory.build(2));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(orangeMineFactory.build(1));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(purpleMineFactory.build(2));

        //Row 10
        board.addCell(cyanMineFactory.build(1));
        board.addCell(greenMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(orangeMineFactory.build(2));
        board.addCell(orangeUnrevealedEmptyFactory.build(2));
        board.addCell(redMineFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(redMineFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));

        //Row 11
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(orangeUnrevealedEmptyFactory.build(2));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(2));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));

        //Row 12
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(greenMineFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(2));
        board.addCell(greenMineFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(2));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(1));

        //Row 13
        board.addCell(orangeMineFactory.build(1));
        board.addCell(greenMineFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(greenMineFactory.build(1));
        board.addCell(new EmptyCell(gray, true, true));
        board.addCell(cyanMineFactory.build(4));
        board.addCell(grayRevealedFactory.build(1));

        //Row 14
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(redMineFactory.build(1));
        board.addCell(redUnrevealedEmptyFactory.build(1));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));

        //Row 15
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(orangeMineFactory.build(1));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(2));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(purpleMineFactory.build(1));

        //Row 16
        board.addCell(redMineFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(2));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(orangeMineFactory.build(1));
        board.addCell(orangeUnrevealedEmptyFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(purpleMineFactory.build(1));
        board.addCell(grayRevealedFactory.build(1));

        board.resetCurrentRowAndColumn();

        //VerticalLines
        board.addVerticalLine(nonExistentCellFactory.build(1));
        board.addVerticalLine(externalCounterFactory.build(12));
        board.addVerticalLine(nonExistentCellFactory.build(1));
        
        //HorizontalLines
        board.addHorizontalLine(nonExistentCellFactory.build(17));
        
        return board;
    }

    @Override public String toString(){
        return "80";
    }
}