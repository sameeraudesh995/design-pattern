package with;

public class SpeacialMember implements SpecialPerson {
    @Override
    public void writeCode() {
        System.out.println("Can Code");
    }

    @Override
    public void manageTeam() {
        System.out.println("Can manage");
    }
}
