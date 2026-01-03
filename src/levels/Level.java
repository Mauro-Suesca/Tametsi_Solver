package levels;

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
            System.out.println("Level " + this + " had an exception occur, stack trace: ");

            e.printStackTrace();
        }
    }

    @Override public abstract String toString();
}