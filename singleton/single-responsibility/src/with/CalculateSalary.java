package with;

public class CalculateSalary {
        // responsibility 01 : salary calculate
        public double calculateSalary (Employee e){
            return e.getSalary() + (e.getSalary() * 0.5);
        }

    }

