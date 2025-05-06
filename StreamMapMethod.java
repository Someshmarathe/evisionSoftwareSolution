import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employe {
    private int id;
    private String name;
    private String department;
    private double salary;
    private String gender;

    // Constructor
    public Employe(int id, String name, String department, double salary, String gender) {
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
 class NewEmpContainsIdAndName{
      private long id;
      private String name;
      private Double salary;
      public NewEmpContainsIdAndName(long id , String name , Double salary ){
           this.id = id;
           this.name = name;
           this.salary = salary;
      }

     public long getId() {
         return id;
     }
     public String getName() {
         return name;
     }
     public String toString(){
           return id+" "+name+" "+salary;
     }

     public Double getSalary() {
         return salary;
     }
 }
public class StreamMapMethod {
    public static void main(String[] atgs){
        List<Employe> emp = List.of(
                new Employe(1, "Somesh", "IT", 60000, "Male"),
                new Employe(2, "Riya", "HR", 45000, "Female"),
                new Employe(3, "Amit", "Finance", 70000, "Male"),
                new Employe(4, "Neha", "IT", 30000, "Female"),
                new Employe(5, "Rahul", "IT", 80000, "Male")
        );

        //get All Employe name is Upper Case

        List<String> empNameUpperCase = emp.stream().map(e->e.getName().toUpperCase()).collect(Collectors.toUnmodifiableList());
        System.out.println(empNameUpperCase);

        // getAll EmpSalary
        List<Double> empSalary = emp.stream().map(Employe::getSalary).collect(Collectors.toUnmodifiableList());
        System.out.println(empSalary);

        // get All EmpName and Their Departement
        List<String> getEmpNameAndDep = emp.stream().map(e->"["+e.getName()+" "+e.getDepartment()+"]").collect(Collectors.toUnmodifiableList());
        System.out.println(getEmpNameAndDep);

        // getNew List Object Contain Id and Name
        List<NewEmpContainsIdAndName> newEmp = emp.stream().map(e-> new NewEmpContainsIdAndName(e.getId(),e.getName(),(2* e.getSalary()))).collect(Collectors.toUnmodifiableList());
        //newEmp.forEach(e-> System.out.print(e.toString()+" "));
        System.out.println(newEmp);
    }
}
