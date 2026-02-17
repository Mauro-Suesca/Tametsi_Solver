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
                System.out.println("El test en el nivel " + this + " fue exitoso después de " + testTime + " milisegundos");
            }else{
                System.out.println("El nivel " + this + " no fue completado");
            }
        }catch(Exception e){
            System.out.println("Ocurrió una excepción en el nivel " + this + ", stack trace: ");

            e.printStackTrace();
        }
    }

    @Override public abstract String toString();
}