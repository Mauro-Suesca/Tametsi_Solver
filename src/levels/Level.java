package levels;

import java.util.Scanner;

import cellLogic.*;

public abstract class Level{

    protected abstract Board setup();

    public void start(){
        this.setup().start();
    }

    public void test(){
        try{
            if(this.setup().startTest()){
                System.out.println("Test on level " + this + " successful");
            }else{
                System.out.println("Level " + this + " was not completed");
            }
        }catch(Exception e){
            System.out.println("Level " + this + " had an exception occur, press 'ENTER' to see stack trace");

            Scanner input = new Scanner(System.in);
            input.nextLine();

            e.printStackTrace();

            System.out.println("\nPress 'ENTER' to continue the tests");
            input.nextLine();

            input.close();
        }
    }

    @Override public abstract String toString();
}