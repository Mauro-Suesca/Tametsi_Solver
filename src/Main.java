import java.util.Scanner;

import levels.LevelHandler;

public class Main{
    public static void main(String[] args){
        LevelHandler levelHandler = new LevelHandler();
        Scanner input = new Scanner(System.in);

        while(true){
            try{
                levelHandler.showAvailableLevels();
                System.out.print("Choose the level you want to see: ");
                levelHandler.runLevel(input.nextLine().trim());
                break;
            }catch(NumberFormatException e){
                System.out.println("\nInput was not a valid integer, try again");
            }catch(IndexOutOfBoundsException e){
                System.out.println("\nInput was not an available level, try again");
            }
        }
        
        input.close();
    }
}