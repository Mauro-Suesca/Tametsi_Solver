package cellLogic;

public class GameOver extends RuntimeException{
    GameOver(String message){
        super("Game Over: " + message);
    }
}