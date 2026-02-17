package levels;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import cellLogic.*;

public abstract class Level{

    protected abstract Board setup();

    public void start(){
        this.setup().start();
    }

    public void test(){
        try{
            Board setup = this.setup();

            Instant start = Instant.now();

            boolean testResult = setup.startTest();

            long testTime = start.until(Instant.now(), ChronoUnit.MILLIS);

            if(testResult){
                System.out.println("Test on level " + this + " successful after " + testTime + " milliseconds");
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