package without;

public class Developer implements Worker{
    @Override
    public void code() {
        System.out.println("Developing");
    }

    @Override
    public void manageTeam() {
        System.out.println("Not implemented");
    }
}
