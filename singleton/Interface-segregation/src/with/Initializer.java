package with;

public class Initializer {
    public static void main(String[] args) {
        SpecialPerson dev= (SpecialPerson) new Developer();
        SpecialPerson leader= (SpecialPerson) new Manager();
        SpecialPerson sp=new SpeacialMember();
        dev.writeCode();
        leader.manageTeam();
        sp.manageTeam();
        sp.writeCode();
    }
}
