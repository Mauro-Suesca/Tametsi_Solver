public class NonExistentCell extends ExternalCounter{
    NonExistentCell(){
        super(0);
        this.unknown = true;
    }

    @Override public String toString(){
        return "  ";
    }
}