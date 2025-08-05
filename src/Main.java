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
        }
        
        input.close();
    }

    private static void level6(){
        Board board = new BoardLineless(6, 5, 5);

        board.addCell(new EmptyCell(1, false, false));
        board.addCell(new EmptyCell(1, true, false));
        board.addCell(new EmptyCell(0, true, false));
        board.addCell(new EmptyCell(2, true, false));
        board.addCell(new MineCell());

        board.addCell(new MineCell());
        EmptyCell firstStep = new EmptyCell(1, true, false);
        board.addCell(firstStep);
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

        board.start(firstStep);
    }

    private static void level9(){
        BoardWithLines board = new BoardWithLines(12, 6, 6);

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
        ExternalCounter firstStep = new ExternalCounter(0);
        board.addVerticalLine(firstStep);

        board.addHorizontalLine(new ExternalCounter(1));
        board.addHorizontalLine(new ExternalCounter(1));
        board.addHorizontalLine(new ExternalCounter(4));
        board.addHorizontalLine(new ExternalCounter(2));
        board.addHorizontalLine(new ExternalCounter(3));
        board.addHorizontalLine(new ExternalCounter(1));
        
        board.start(firstStep);
    }
}