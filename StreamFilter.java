import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private String gender;

    // Constructor
    public Employee(int id, String name, String department, double salary, String gender) {
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
        return "Employee [id=" + id + ", name=" + name + ", department=" + department +
                ", salary=" + salary + ", gender=" + gender + "]";
    }
}

public class StreamFilter {
    public static void main(String[] args){

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Somesh", "IT", 60000, "Male"),
                new Employee(2, "Riya", "HR", 45000, "Female"),
                new Employee(3, "Amit", "Finance", 70000, "Male"),
                new Employee(4, "Neha", "IT", 30000, "Female"),
                new Employee(5, "Rahul", "IT", 80000, "Male")
        );

        // get  Employee whose Name is Somesh
        List<Employee> Emp = employees.stream().filter(e->e.getName().equals("Somesh")).collect(Collectors.toUnmodifiableList());
        System.out.println(Emp);

        //get All Employe Name whose salary Bigger 400000
        List<String> EmpNameSalaryGreater = employees.stream().filter(e-> e.getSalary() > 40000).map(Employee :: getName).collect(Collectors.toUnmodifiableList());
        System.out.println(EmpNameSalaryGreater);

        // Count How Many EMployee
        long howManyEmp = employees.stream().count();
        System.out.println(howManyEmp);

        // getAll Female Employee
        List<Employee> AllMaleEmploye = employees.stream().filter(e-> e.getGender().equals("Female")).collect(Collectors.toUnmodifiableList());
        System.out.println(AllMaleEmploye);
    }
}
