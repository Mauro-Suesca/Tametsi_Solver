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
                System.out.println("El test en el nivel " + this + " fue exitoso");
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