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
                System.out.println("El test en el nivel " + this + " fue exitoso");
            }else{
                System.out.println("El nivel " + this + " no fue completado");
            }
        }catch(Exception e){
            System.out.println("Ocurrió una excepción en el nivel " + this + ", presiona 'ENTER' para ver el stack trace");

            Scanner input = new Scanner(System.in);
            input.nextLine();

            e.printStackTrace();

            System.out.println("\nPresiona 'ENTER' para continuar los tests");
            input.nextLine();

            input.close();
        }
    }

    @Override public abstract String toString();
}
