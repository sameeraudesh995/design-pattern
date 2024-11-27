package without;

public class Manager implements Worker{
    @Override
    public void code() {
        System.out.println("Cant Code");
    }

    @Override
    public void manageTeam() {
        System.out.println("manage Team");
    }
}
