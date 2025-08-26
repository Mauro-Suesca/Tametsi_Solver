import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int level;
        Scanner input = new Scanner(System.in);

        while(true){
            try{
                System.out.print("Elige el nivel que quieres ver: ");
                level = Integer.parseInt(input.nextLine());
                break;
            }catch(NumberFormatException e){
                System.out.println("\nNo se ingresó un número válido, intenta de nuevo");
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
        }else if(level == 20){
            level20();
        }else if(level == 21){
            level21();
        }else if(level == 23){
            level23();
        }else if(level == 25){
            level25();
        }else if(level == 27){
            level27();
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
        ColorCounter gray = new ColorCounter(6, "grises", "\u001B[0m");
        ColorCounter red = new ColorCounter(5, "rojas", "\u001B[31m");
        ColorCounter blue = new ColorCounter(4, "azules", "\u001B[34m");

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

    private static void level20(){
        ColorCounter gray = new ColorCounter(52, "grises", "\u001B[0m");
        ColorCounter red = new ColorCounter(5, "rojas", "\u001B[31m");
        ColorCounter blue = new ColorCounter(3, "azules", "\u001B[34m");

        BoardWithLines board = new BoardWithLines(15, 15, true, gray, red, blue);

        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));

        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));

        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 6, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 6, false, false));
        board.addCell(new EmptyCell(gray, 6, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));

        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));

        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 3, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 4, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(gray, 2, false, false));

        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 3, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 3, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new EmptyCell(gray, 3, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));

        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new MineCell(gray));

        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, true, false));
        board.addCell(new EmptyCell(gray, 2, false, false));

        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 5, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 4, true, false));
        board.addCell(new MineCell(gray));

        board.addCell(new EmptyCell(red, 0, false, true));
        board.addCell(new EmptyCell(red, 1, true, false));
        board.addCell(new EmptyCell(red, 1, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(red));
        board.addCell(new EmptyCell(red, 4, true, false));
        board.addCell(new MineCell(red));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(red, 0, false, false));
        board.addCell(new EmptyCell(red, 2, true, false));
        board.addCell(new MineCell(red));
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(red));
        board.addCell(new EmptyCell(red, 3, true, false));
        board.addCell(new MineCell(red));

        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 4, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));

        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 0, false, false));

        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 0, false, true));
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, true, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(gray, 0, false, false));

        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, true, false));
        board.addCell(new EmptyCell(gray, 0, false, false));

        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(blue, 1, true, false));
        board.addCell(new EmptyCell(blue, 0, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(blue, 0, false, false));
        board.addCell(new EmptyCell(blue, 1, true, false));
        board.addCell(new MineCell(blue));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(blue, 0, false, false));
        board.addCell(new EmptyCell(blue, 1, true, false));
        board.addCell(new EmptyCell(blue, 1, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(blue, 2, true, false));
        board.addCell(new EmptyCell(blue, 0, false, false));

        board.resetCurrentRowAndColumn();

        board.addVerticalLine(new ExternalCounter(7));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(5));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(5));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(9));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(4));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(8));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(6));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(5));

        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new NonExistentCell());

        board.start();
    }

    private static void level21(){
        ColorCounter gray = new ColorCounter(8, "grises", "\u001B[0m");
        ColorCounter red = new ColorCounter(4, "rojas", "\u001B[31m");

        Board board = new BoardLineless(8, 8, true, gray, red);

        board.addCell(new EmptyCell(gray, 0, true, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(red, 2, false, false));
        board.addCell(new EmptyCell(red, 2, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 0, false, false));

        board.addCell(new EmptyCell(gray, 0, true, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(red));
        board.addCell(new MineCell(red));
        board.addCell(new EmptyCell(gray, 2, false, true));
        board.addCell(new EmptyCell(gray, 0, false, false));

        board.addCell(new EmptyCell(gray, 0, true, false));
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(red));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 1, false, true));
        
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(red, 1, false, false));
        board.addCell(new EmptyCell(red, 2, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 1, false, false));

        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));

        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(red, 1, false, false));
        board.addCell(new EmptyCell(red, 1, false, false));
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new NonExistentCell());

        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, true));
        board.addCell(new MineCell(red));
        board.addCell(new EmptyCell(red, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new NonExistentCell());

        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(red, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new MineCell(gray));

        board.start();
    }

    private static void level23(){
        ColorCounter gray = new ColorCounter(28, "gray", "\u001B[0m");
        ColorCounter blue = new ColorCounter(0, "blue", "\u001B[34m");
        ColorCounter purple = new ColorCounter(3, "purple", "\u001B[35m");
        ColorCounter yellow = new ColorCounter(6, "yellow", "\u001B[33m");

        Board board = new BoardLineless(12, 12, false, gray, blue, purple, yellow);

        board.addCell(new EmptyCell(blue, 3, false, false, 2, 2));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 1, false, false, 2, 2));
        board.addCell(new EmptyCell(purple, 1, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray, 2, 2));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(yellow, 0, false, false));

        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new MineCell(purple));
        board.addCell(new MineCell(yellow));
        board.addCell(new EmptyCell(gray, 1, false, false));

        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(blue, 2, false, false, 2, 2));
        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 4, false, false, 2, 2));
        board.addCell(new EmptyCell(purple, 2, false, false));
        board.addCell(new MineCell(yellow));
        board.addCell(new EmptyCell(gray, 3, false, false, 2, 2));

        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(yellow, 0, false, false));
        board.addCell(new EmptyCell(purple, 1, false, false));

        board.addCell(new EmptyCell(gray, 4, false, false, 2, 2));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(blue, 4, false, false, 2, 2));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(yellow));
        board.addCell(new EmptyCell(gray, 1, false, false, 2, 2));
        board.addCell(new EmptyCell(purple, 1, false, false));
        board.addCell(new MineCell(gray));

        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(yellow, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(purple, 2, false, false));

        board.addCell(new MineCell(purple));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray, 2, 2));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(yellow));
        board.addCell(new EmptyCell(blue, 5, false, false, 2, 2));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray, 2, 2));

        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(purple, 1, true, false));
        board.addCell(new MineCell(yellow));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));

        board.addCell(new EmptyCell(gray, 0, true, false, 2, 2));
        board.addCell(new EmptyCell(purple, 2, true, false));
        board.addCell(new MineCell(yellow));
        board.addCell(new EmptyCell(gray, 7, false, false, 2, 2));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(blue, 7, false, false, 2, 2));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));

        board.addCell(new EmptyCell(yellow, 0, true, false));
        board.addCell(new EmptyCell(purple, 1, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, false, true));

        board.addCell(new EmptyCell(gray, 0, true, false));
        board.addCell(new EmptyCell(yellow, 0, true, false));
        board.addCell(new EmptyCell(gray, 2, true, false, 2, 2));
        board.addCell(new MineCell(purple));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray, 2, 2));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(blue, 1, false, false, 2, 2));

        board.addCell(new EmptyCell(yellow, 0, true, false));
        board.addCell(new EmptyCell(gray, 0, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(purple, 3, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));

        board.start();
    }

    private static void level25(){
        ColorCounter gray = new ColorCounter(15, "gray", "\u001B[0m");
        ColorCounter blue = new ColorCounter(10, "blue", "\u001B[34m");

        BoardWithLines board = new BoardWithLines(9, 9, false, gray, blue);

        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new EmptyCell(blue, 0, false, false));
        board.addCell(new EmptyCell(blue, 1, false, false));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(blue, 1, false, false));
        board.addCell(new EmptyCell(blue, 0, false, false));
        board.addCell(new EmptyCell(blue, 1, false, false));
        board.addCell(new EmptyCell(blue, 0, false, false));
        board.addCell(new EmptyCell(gray, 0, false, false));

        board.addCell(new EmptyCell(gray, 0, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(blue, 0, false, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(blue, 0, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));

        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(blue, 1, false, true));
        board.addCell(new EmptyCell(blue, 0, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new MineCell(gray));

        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(blue, 0, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 4, true, true));
        board.addCell(new MineCell(gray));

        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));

        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(blue, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));

        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(blue, 1, false, false));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(blue, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 1, false, false));
        
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, true, false));
        board.addCell(new EmptyCell(blue, 1, false, false));
        board.addCell(new EmptyCell(gray, 4, true, true));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(blue, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 1, false, false));

        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(blue));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(blue, 2, false, false));
        board.addCell(new MineCell(blue));
        board.addCell(new MineCell(blue));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(blue, 2, false, false));
        board.addCell(new MineCell(gray));

        board.resetCurrentRowAndColumn();

        board.addVerticalLine(new ExternalCounter(3));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(2));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(3));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(3));
        board.addVerticalLine(new NonExistentCell());
        board.addVerticalLine(new ExternalCounter(4));

        board.addHorizontalLine(new ExternalCounter(1));
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new ExternalCounter(3));
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new ExternalCounter(7));
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new ExternalCounter(3));
        board.addHorizontalLine(new NonExistentCell());
        board.addHorizontalLine(new ExternalCounter(7));

        board.start();
    }

    private static void level27(){
        ColorCounter gray = new ColorCounter(15, "gray", "\u001B[0m");
        ColorCounter cyan = new ColorCounter(3, "cyan", "\u001B[36m");
        ColorCounter blue = new ColorCounter(4, "blue", "\u001B[34m");
        ColorCounter pink = new ColorCounter(1, "pink", "\u001B[38;5;212m");
        ColorCounter purple = new ColorCounter(4, "purple", "\u001B[35m");

        Board board = new BoardLineless(12, 12, true, gray, cyan, blue, pink, purple);

        board.addCell(new EmptyCell(gray, 0, true, false));
        board.addCell(new EmptyCell(gray, 0, true, false));
        board.addCell(new EmptyCell(gray, 0, true, false));
        board.addCell(new EmptyCell(cyan, 0, true, false));
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(purple, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));

        board.addCell(new EmptyCell(gray, 1, true, false));
        board.addCell(new EmptyCell(gray, 2, true, false));
        board.addCell(new EmptyCell(gray, 3, true, false));
        board.addCell(new EmptyCell(cyan, 2, true, false));
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(purple));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));

        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(cyan));
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(purple, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));

        board.addCell(new EmptyCell(pink, 2, false, false));
        board.addCell(new MineCell(pink));
        board.addCell(new EmptyCell(pink, 5, false, false));
        board.addCell(new EmptyCell(cyan, 3, false, false));
        board.addCell(new EmptyCell(pink, 2, false, false));
        board.addCell(new EmptyCell(pink, 0, false, false));
        board.addCell(new EmptyCell(pink, 0, false, false));
        board.addCell(new EmptyCell(pink, 1, false, false));
        board.addCell(new EmptyCell(pink, 1, false, false));
        board.addCell(new EmptyCell(pink, 1, false, false));
        board.addCell(new EmptyCell(pink, 0, false, false));
        board.addCell(new EmptyCell(pink, 0, false, false));

        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(cyan));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(purple));
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());

        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(cyan, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(purple, 2, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());

        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(cyan, 2, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(purple, 2, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());

        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(cyan));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new MineCell(purple));
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());

        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(blue, 2, false, false));
        board.addCell(new EmptyCell(blue, 1, false, false));
        board.addCell(new EmptyCell(blue, 3, false, false));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(blue, 2, false, false));
        board.addCell(new EmptyCell(blue, 0, false, false));
        board.addCell(new EmptyCell(blue, 1, false, false));
        board.addCell(new EmptyCell(purple, 2, false, false));
        board.addCell(new MineCell(blue));
        board.addCell(new EmptyCell(blue, 3, false, false));
        board.addCell(new MineCell(blue));

        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 4, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(cyan, 2, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(purple, 1, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 3, false, false));
        
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 5, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(cyan, 1, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new EmptyCell(purple, 1, false, false));
        board.addCell(new EmptyCell(gray, 3, false, false));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));

        board.addCell(new MineCell(gray));
        board.addCell(new MineCell(gray));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(cyan, 1, false, false));
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new NonExistentCell());
        board.addCell(new MineCell(purple));
        board.addCell(new EmptyCell(gray, 2, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));
        board.addCell(new EmptyCell(gray, 1, false, false));

        board.start();
    }
}