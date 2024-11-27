package with;

public class Initializer {
    public static void main(String[] args) {
        Employee e1=new Employee(1001, "Kamal",5000);
        CalculateSalary c1= new CalculateSalary();
        c1.calculateSalary(e1);
        FileHandler fh= new FileHandler();
        fh.saveData(e1,c1);

    }
}
