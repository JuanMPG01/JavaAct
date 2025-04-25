package employes;
import java.util.ArrayList;
import java.util.List;

public class EmployeeAges {
    private List<Integer> ages;

        // Constructor
        public EmployeeAges() {
            this.ages = new ArrayList<>();
        }

    public void addAge(int age) {
        if (age >= 0) {
            ages.add(age);
            System.out.println("Age " + age + " added successfully.");
        } else {
            System.out.println("Invalid age. Age must be non-negative.");
        }
    }

    public void removeAge(int age) {
        if (ages.remove(Integer.valueOf(age))) {
            System.out.println("Age " + age + " removed successfully.");
        } else {
            System.out.println("Age " + age + " not found.");
        }
    }

    public void displayAges() {
        if (ages.isEmpty()) {
            System.out.println("No ages available.");
        } else {
            System.out.println("Employee Ages: " + ages);
        }
    }

    public double getAverageAge() {
        if (ages.isEmpty()) {
            return 0;
        }

        //nuevo metodo
        return ages.stream().mapToInt(Integer::intValue).average().orElse(0);
    }
}





