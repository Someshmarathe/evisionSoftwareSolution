import java.util.List;

class Student {
    private String name;
    private int id;
    private int age;
    private String gender;
    private String className;

    // Constructor
    public Student(String name, int id, int age, String gender, String className) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.className = className;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getClassName() {
        return className;
    }

    // toString method for printing
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}

public class ShortCircuitMethod {
    public  static void main(String[] args){
        List<Student> students = List.of(
                new Student("some", 101, 14, "Female", "8A"),
                new Student("hari", 102, 15, "Male", "9B"),
                new Student("krishn", 103, 14, "Male", "8A"),
                new Student("shiv", 104, 16, "Female", "10C"),
                new Student("gopal", 105, 15, "Male", "9B")
        );

        // Any Student age is 16
        boolean nameofStudenAgeIs16 = students.stream().anyMatch(s ->s.getAge() == 26);
        System.out.println(nameofStudenAgeIs16);

        // check All Student Male
        boolean allStudentNameSame = students.stream().allMatch(s ->s.getGender().equals("Male"));
        System.out.println(allStudentNameSame);

        // check All Student Is below 20
        boolean allStudent20 = students.stream().allMatch(s -> s.getAge() < 20);
        System.out.println(allStudent20);

        // check All Student Is  above 20
        boolean allStudentNot20 = students.stream().noneMatch(s -> s.getAge() > 20);
        System.out.println(allStudentNot20);



    }
}
