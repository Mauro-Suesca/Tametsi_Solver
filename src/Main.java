import java.util.Scanner;

import levels.*;

public class Main{
    public static void main(String[] args){
        LevelHandler levelHandler = new LevelHandler();
        Scanner input = new Scanner(System.in);

        while(true){
            try{
                levelHandler.showAvailableLevels();
                System.out.print("Elige el nivel que quieres ver: ");
                levelHandler.runLevel(input.nextLine().trim());
                break;
            }catch(NumberFormatException e){
                System.out.println("\nNo se ingresó un número entero válido, intenta de nuevo");
            }catch(IndexOutOfBoundsException e){
                System.out.println("\nNo se ingresó un nivel disponible, intenta de nuevo");
            }
        }
        
        input.close();
    }
}