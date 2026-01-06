package levels;

import cellFactories.EmptyCellFactory;
import cellFactories.MineCellFactory;
import cellFactories.NonExistentCellFactory;
import cellLogic.Board;
import cellLogic.BoardLineless;
import cellLogic.ColorCounter;
import cellLogic.EmptyCell;
import cellLogic.MineCell;

public class Level46 extends Level{
    @Override protected Board setup(){
        ColorCounter gray = new ColorCounter(42, "grises", "\u001B[0m");
        ColorCounter cyan = new ColorCounter(6, "cian", "\u001B[36m");
        ColorCounter green = new ColorCounter(3, "verdes", "\u001B[32m");
        ColorCounter purple = new ColorCounter(6, "moradas", "\u001B[35m");

        Board board = new BoardLineless(15, 15, true, gray, cyan, green, purple);

        MineCellFactory grayMineFactory = new MineCellFactory(gray);
        MineCellFactory cyanMineFactory = new MineCellFactory(cyan);
        NonExistentCellFactory nonExistentCellFactory = new NonExistentCellFactory();
        
        EmptyCellFactory grayUnrevealedEmptyFactory = new EmptyCellFactory(gray, false, false);
        EmptyCellFactory cyanUnrevealedEmptyFactory = new EmptyCellFactory(cyan, false, false);
        EmptyCellFactory greenUnrevealedEmptyFactory = new EmptyCellFactory(green, false, false);
        EmptyCellFactory purpleUnrevealedEmptyFactory = new EmptyCellFactory(purple, false, false);

        EmptyCellFactory grayRevealedFactory = new EmptyCellFactory(gray, true, false);

        //Line 1
        board.addCell(grayMineFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(new EmptyCell(gray, true, true));
        board.addCell(grayRevealedFactory.build(1));

        //Line 2
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(purple));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayRevealedFactory.build(2));

        //Line 3
        board.addCell(grayMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(new EmptyCell(gray, false, true));

        //Line 4
        board.addCell(nonExistentCellFactory.build(3));
        board.addCell(greenUnrevealedEmptyFactory.build(2));
        board.addCell(new MineCell(green));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(4));
        board.addCell(new EmptyCell(gray, false, true));
        board.addCell(grayUnrevealedEmptyFactory.build(2));

        //Line 5
        board.addCell(grayMineFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(new EmptyCell(gray, false, true));
        board.addCell(cyanMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(5));
        board.addCell(grayMineFactory.build(2));

        //Line 6
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(new MineCell(purple));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(3));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 7
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(cyanUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(3));
        board.addCell(new EmptyCell(gray, false, true));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(grayMineFactory.build(1));

        //Line 8
        board.addCell(nonExistentCellFactory.build(7));
        board.addCell(cyanMineFactory.build(2));
        board.addCell(cyanUnrevealedEmptyFactory.build(5));
        board.addCell(cyanMineFactory.build(1));

        //Line 9
        board.addCell(grayMineFactory.build(1));
        board.addCell(new MineCell(purple));
        board.addCell(grayMineFactory.build(1));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(green));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 10
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(2));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(purple));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 11
        board.addCell(grayMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(2));

        //Line 12
        board.addCell(nonExistentCellFactory.build(3));
        board.addCell(greenUnrevealedEmptyFactory.build(4));
        board.addCell(nonExistentCellFactory.build(4));
        board.addCell(greenUnrevealedEmptyFactory.build(1));
        board.addCell(new MineCell(green));
        board.addCell(new EmptyCell(green, false, true));
        board.addCell(greenUnrevealedEmptyFactory.build(1));

        //Line 13
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));

        //Line 14
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(new MineCell(purple));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(new MineCell(purple));
        board.addCell(purpleUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(purpleUnrevealedEmptyFactory.build(2));
        board.addCell(nonExistentCellFactory.build(2));
        board.addCell(purpleUnrevealedEmptyFactory.build(2));

        //Line 15
        board.addCell(new EmptyCell(gray, false, true));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayMineFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        board.addCell(nonExistentCellFactory.build(1));
        board.addCell(grayUnrevealedEmptyFactory.build(1));
        
        return board;
    }

    @Override public String toString(){
        return "46";
    }
}