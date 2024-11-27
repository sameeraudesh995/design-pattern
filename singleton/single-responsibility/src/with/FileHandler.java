package with;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    public void saveData(Employee e, CalculateSalary c){
        try(FileWriter writer=
                new FileWriter("Database.txt")){
            writer.write(e.getId()+","+e.getName()+","+c.calculateSalary(e));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
