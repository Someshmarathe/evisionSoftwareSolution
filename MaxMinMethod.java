import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class  Employeee{
    private int id;
    private String name;
    private String department;
    private double salary;
    private String gender;

    // Constructor
    public Employeee(int id, String name, String department, double salary, String gender) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.gender = gender;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getGender() {
        return gender;
    }
    // toString for easy printing
    @Override
    public String toString() {
        return "Employeee [id=" + id + ", name=" + name + ", department=" + department +
                ", salary=" + salary + ", gender=" + gender + "]";
    }
}
public class MaxMinMethod {
    public static void main(String[] args) {
        List<Employeee> emp = List.of(
                new Employeee(1, "Somesh", "IT", 60000, "Male"),
                new Employeee(2, "Riya", "HR", 45000, "Female"),
                new Employeee(3, "Amit", "Finance", 70000, "Male"),
                new Employeee(4, "Neha", "IT", 30000, "Female"),
                new Employeee(5, "Amit", "IT", 80000, "Male")
        );

        // internally max call-> reduce -> reduce method call-> BinaryOperator.maxBy(comparator) -> it work return comparator.compare(a,b) >=0 ? a:b;
        Optional<Employeee> getMax = emp.stream().max(Comparator.comparing(Employeee::getSalary));
        System.out.println(getMax);

        // internally max call-> reduce -> reduce method call-> BinaryOperator.minBy(comparator) -> it work return comparator.compare(a,b) <= 0 ? a:b;
        Optional<Employeee> getMin = emp.stream().min(Comparator.comparing(Employeee::getSalary));
        System.out.println(getMin);
        
    }
}