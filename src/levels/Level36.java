package levels;

import cellFactories.EmptyCellFactory;
import cellLogic.Board;
import cellLogic.BoardLineless;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;
import cellLogic.MineCell;
import cellLogic.logicalOperations.StartOperation;

public class Level36 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(6, "gray", "\u001B[0m");
        ColorCounter purple = new ColorCounter(1, "purple", "\u001B[35m");
        ColorCounter pink = new ColorCounter(1, "pink", "\u001B[38;5;212m");
        ColorCounter yellow = new ColorCounter(1, "yellow", "\u001B[33m");
        ColorCounter green = new ColorCounter(6, "green", "\u001B[32m");

        Board board = new BoardLineless(16, 16, false, gray, purple, pink, yellow, green);
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory yellowUnrevealedEmptyFactory = new EmptyCellFactory(yellow, false, false, 2, 2);
        EmptyCellFactory pinkUnrevealedEmptyFactory = new EmptyCellFactory(pink, false, false, 4, 4);
        EmptyCellFactory greenUnrevealedEmptyFactory = new EmptyCellFactory(green, false, false);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        //Line 1
        board.addCell(new EmptyCell(purple, false, true, 8, 8));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(gray));

        //Line 2
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(green));

        //Line 3
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));

        //Line 4
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(green));

        //Line 5
        board.addCell(yellowUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(green));
        board.addCell(new MineCell(gray));
        board.addCell(pinkUnrevealedEmptyFactory.build(1));

        //Line 6
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(greenUnrevealedEmptyFactory.build(1));

        //Line 7
        board.addCell(new MineCell(green));
        board.addCell(new EmptyCell(gray, false, true));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));

        //Line 8
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(greenUnrevealedEmptyFactory.build(1));

        //Line 9
        board.addCell(pinkUnrevealedEmptyFactory.build(1));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(purple, 8, 8));

        //Line 10
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(greenUnrevealedEmptyFactory.build(1));

        //Line 11
        board.addCell(new EmptyCell(green, false, true));
        board.addCell(new MineCell(gray));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));

        //Line 12
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(new EmptyCell(green, false, true));

        //Line 13
        board.addCell(new MineCell(yellow, 2, 2));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(pink, 4, 4));

        //Line 14
        board.addCell(new MineCell(gray));  
        board.addCell(greenUnrevealedEmptyFactory.build(1));

        //Line 15
        board.addCell(new MineCell(green));
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(yellowUnrevealedEmptyFactory.build(1));

        //Line 16
        board.addCell(grayRevealedFactory.build(1));
        board.addCell(new MineCell(green));
        
        board.addOperationToProcess(new StartOperation(yellow));
        board.addOperationToProcess(new StartOperation(gray));
        board.addOperationToProcess(new StartOperation(purple));
        board.addOperationToProcess(new StartOperation(pink));
        board.addOperationToProcess(new StartOperation(green));

        return board;
    }

    @Override public String toString(){
        return "36";
    }
}