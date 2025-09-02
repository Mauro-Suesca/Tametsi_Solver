package cellLogic;

public class NonExistentCell extends ExternalCounter{
    public NonExistentCell(){
        super(0);
        this.unknown = true;
    }

    @Override public String toString(){
        return "  ";
    }
}