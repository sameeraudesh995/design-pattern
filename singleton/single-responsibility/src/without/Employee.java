package without;

import java.io.FileWriter;
import java.io.IOException;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    //Responsibility 1: salary calculation
    public double calculateSalary(){
        return salary+(salary*0.5);
    }
    public void saveData(){
        try (FileWriter writer = new FileWriter("Database.txt")) {
            writer.write(id+","+name+","+calculateSalary());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
