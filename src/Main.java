import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int level;
        Scanner input = new Scanner(System.in);

        while(true){
            try{
                System.out.print("Choose the level you want to see: ");
                level = Integer.parseInt(input.nextLine());
                break;
            }catch(NumberFormatException e){
                System.out.println("\nInput was not a valid number, try again");
            }
        }

        if(level == 6){
            level6();
        }else if(level == 9){
            level9();
        }else if(level == 12){
            level12();
        }else if(level == 13){
            level13();
        }else if(level == 18){
            level18();
        }
        
        input.close();
    }

    private static void level6(){
        Board board = new BoardLineless(6, 5, 5, true);

        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new EmptyCell(1, true, false));
        board.addCell(new EmptyCell(0, true, false));
        board.addCell(new EmptyCell(2, true, false));
        board.addCell(new MineCell());

        board.addCell(new MineCell());
        board.addCell(new EmptyCell(1, true, false));
        board.addCell(new EmptyCell(1, true, false));
        board.addCell(new EmptyCell(3, true, false));
        board.addCell(new MineCell());

        board.addCell(new EmptyCell(3, false, false));
        board.addCell(new EmptyCell(3, false, false));
        board.addCell(new EmptyCell(2, false, true));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(2, false, false));

        board.addCell(new MineCell());
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new EmptyCell(1, false, false));
        
        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new EmptyCell(1, false, true));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(0, false, false));

        board.start();
    }

    private static void level9(){
        BoardWithLines board = new BoardWithLines(12, 6, 6, true);

        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new EmptyCell(0, false, true));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(0, false, false));

        board.addCell(new EmptyCell(3, false, false));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(4, false, false));
        board.addCell(new EmptyCell(3, false, true));
        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new EmptyCell(1, false, false));

        board.addCell(new MineCell());
        board.addCell(new EmptyCell(5, false, false));
        board.addCell(new MineCell());
        board.addCell(new MineCell());
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(1, false, true));

        board.addCell(new MineCell());
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(4, false, false));
        board.addCell(new EmptyCell(5, false, true));
        board.addCell(new EmptyCell(3, false, false));
        board.addCell(new EmptyCell(2, false, false));

        board.addCell(new MineCell());
        board.addCell(new EmptyCell(4, false, true));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(3, false, false));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(1, false, false));

        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new EmptyCell(1, false, true));

        board.resetCurrentRowAndColumn();

        board.addVerticalLine(new ExternalCounter(3));
        board.addVerticalLine(new ExternalCounter(3));
        board.addVerticalLine(new ExternalCounter(2));
        board.addVerticalLine(new ExternalCounter(2));
        board.addVerticalLine(new ExternalCounter(2));
        board.addVerticalLine(new ExternalCounter(0));

        board.addHorizontalLine(new ExternalCounter(1));
        board.addHorizontalLine(new ExternalCounter(1));
        board.addHorizontalLine(new ExternalCounter(4));
        board.addHorizontalLine(new ExternalCounter(2));
        board.addHorizontalLine(new ExternalCounter(3));
        board.addHorizontalLine(new ExternalCounter(1));
        
        board.start();
    }

    private static void level12(){
        Board board = new BoardLineless(18, 10, 10, false);

        board.addCell(new EmptyCell(1, true, false));
        board.addCell(new MineCell());
        board.addCell(new MineCell(2, 2));
        board.addCell(new MineCell(2, 2));
        board.addCell(new EmptyCell(1, true, false));
        board.addCell(new EmptyCell(1, false, false, 2, 2));
        board.addCell(new MineCell());

        board.addCell(new EmptyCell(3, true, false, 2, 2));
        board.addCell(new EmptyCell(1, true, false));
        board.addCell(new EmptyCell(2, true, false));

        board.addCell(new EmptyCell(1, false, false, 2, 2));
        board.addCell(new EmptyCell(2, false, true, 2, 2));
        board.addCell(new EmptyCell(1, false, false, 2, 2));
        board.addCell(new EmptyCell(1, false, true));
        board.addCell(new MineCell());

        board.addCell(new MineCell());
        board.addCell(new EmptyCell(1, true, true));
        board.addCell(new EmptyCell(4, true, false, 2, 2));

        board.addCell(new EmptyCell(3, true, false, 2, 2));
        board.addCell(new EmptyCell(1, true, true));
        board.addCell(new EmptyCell(1, true, false));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(2, true, false));
        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new MineCell());

        board.addCell(new MineCell());
        board.addCell(new EmptyCell(3, false, false, 2, 2));
        board.addCell(new MineCell(2, 2));
        board.addCell(new MineCell(2, 2));
        board.addCell(new MineCell());

        board.addCell(new MineCell());
        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new EmptyCell(1, true, false));
        board.addCell(new EmptyCell(1, false, true));

        board.addCell(new MineCell());
        board.addCell(new EmptyCell(2, true, false, 2, 2));
        board.addCell(new EmptyCell(2, false, true, 2, 2));
        board.addCell(new EmptyCell(1, true, false, 2, 2));
        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(1, true, false));

        board.addCell(new MineCell());
        board.addCell(new EmptyCell(2, false, false, 2, 2));
        board.addCell(new EmptyCell(1, false, false));
        
        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(1, true, false));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new MineCell());

        board.start();
    }

    private static void level13(){
        ColorCounter gray = new ColorCounter(6, "gray", "\u001B[0m");
        ColorCounter red = new ColorCounter(5, "red", "\u001B[31m");
        ColorCounter blue = new ColorCounter(4, "blue", "\u001B[34m");

        BoardWithLines board = new BoardWithLines(6, 6, true, gray, red, blue);

        board.addCell(new EmptyCell(red, 1, false, true));
        board.addCell(new EmptyCell(red, 1, false, true));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(blue, 1, false, false));

        board.addCell(new MineCell(red));
        board.addCell(new EmptyCell(red, 2, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new EmptyCell(blue, 3, false, false));
        board.addCell(new EmptyCell(blue, 2, false, false));

        board.addCell(new EmptyCell(gray, 3, false, true));
        board.addCell(new EmptyCell(gray, 5, false, false));
        board.addCell(new MineCell(red));
        board.addCell(new EmptyCell(blue, 4, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));

        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(red, 6, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, false, false));

        board.addCell(new EmptyCell(blue, 4, true, false));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(red));
        board.addCell(new MineCell(red));

        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(blue, 2, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 3, false, true));
        board.addCell(new MineCell(red));
        board.addCell(new EmptyCell(red, 3, false, false));

        board.resetCurrentRowAndColumn();

        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(2));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(5));
        board.addVerticalLine(new NonExistentCell());

        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new ExternalCounter(1));
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new ExternalCounter(4));
        board.addHorizontalLine(new NonExistentCell());

        board.start();
    }

    private static void level18(){
        BoardWithLines board = new BoardWithLines(30, 10, 10, false);

        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new MineCell());

        board.addCell(new MineCell());
        board.addCell(new EmptyCell(5, true, false, 2, 2));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(3, true, false, 2, 2));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(3, true, false, 2, 2));
        board.addCell(new MineCell());

        board.addCell(new MineCell());
        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new EmptyCell(1, false, false));

        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(3, false, false));
        board.addCell(new MineCell());
        board.addCell(new MineCell());
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(2, true, false));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(2, false, false));

        board.addCell(new MineCell());
        board.addCell(new EmptyCell(6, true, false, 2, 2));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(5, true, false, 2, 2));
        board.addCell(new EmptyCell(2, true, false));
        board.addCell(new EmptyCell(4, true, false, 2, 2));
        board.addCell(new MineCell());

        board.addCell(new MineCell());
        board.addCell(new MineCell());
        board.addCell(new MineCell());
        board.addCell(new MineCell());

        board.addCell(new EmptyCell(3, false, false));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new EmptyCell(2, false, false));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(2, false, true));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(1, true, false));
        board.addCell(new MineCell());

        board.addCell(new MineCell());
        board.addCell(new EmptyCell(4, true, false, 2, 2));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(3, true, false, 2, 2));
        board.addCell(new MineCell());
        board.addCell(new EmptyCell(4, true, false, 2, 2));
        board.addCell(new MineCell());

        board.addCell(new MineCell());
        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new MineCell());
        board.addCell(new MineCell());

        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(1, false, true));
        board.addCell(new EmptyCell(0, false, false));
        board.addCell(new EmptyCell(1, true, false));
        board.addCell(new MineCell());

        board.resetCurrentRowAndColumn();

        board.addVerticalLine(new ExternalCounter(6));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(5));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(4));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(8));

        board.addHorizontalLine(new ExternalCounter(4));
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new ExternalCounter(5));
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new ExternalCounter(2));
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new ExternalCounter(1));

        board.start();
    }
}