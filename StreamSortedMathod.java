import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employ {
    private int id;
    private String name;
    private String department;
    private double salary;
    private String gender;

    // Constructor
    public Employ(int id, String name, String department, double salary, String gender) {
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
class myComparator implements Comparator<Employ>{
    @Override
    public int compare(Employ o1, Employ o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
public class StreamSortedMathod {
    public static void main(String[]  args){
        List<Employ> emp = List.of(
                new Employ(1, "Somesh", "IT", 60000, "Male"),
                new Employ(2, "Riya", "HR", 45000, "Female"),
                new Employ(3, "Amit", "Finance", 70000, "Male"),
                new Employ(4, "Neha", "IT", 30000, "Female"),
                new Employ(5, "Amit", "IT", 80000, "Male")
        );

        // sort By Name
        List<Employ> customOrder = emp.stream().sorted(new myComparator()).collect(Collectors.toUnmodifiableList());
       // System.out.println(customOrder);

        // Use comparing method to compare two object by name
        List<Employ> comparing = emp.stream().sorted(Comparator.comparing(Employ::getSalary)).collect(Collectors.toUnmodifiableList());
        // System.out.println(comparing);

        // Use comparing method to compare two object by name and then reverse their order
        List<Employ> reverseByName = emp.stream().sorted(Comparator.comparing(Employ::getName).reversed()).collect(Collectors.toUnmodifiableList());
         // System.out.println(reverseByName);

        //thenComparing
        List<Employ> sortByNameAge = emp.stream().sorted(Comparator.comparing(Employ::getName).thenComparing(Employ::getId)).collect(Collectors.toUnmodifiableList());
       // System.out.println(sortByNameAge);

        // find distinct Name in the object
        List<String> UniqueEmp = emp.stream().map(Employ::getName).distinct().collect(Collectors.toUnmodifiableList());
        System.out.println(UniqueEmp);
        
        // find distinct from list
        List<Integer> list = List.of(1,2,3,4,4,3);
        List<Integer> list2 = list.stream().distinct().collect(Collectors.toUnmodifiableList());
        //System.out.println(list2);



    }
}
