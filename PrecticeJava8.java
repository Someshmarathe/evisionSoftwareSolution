package com;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// Employee class
class Employee {
    private String name;
    private int age;
    private String department;
    private double salary;

    public Employee(){

    }
    // Constructor
    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // toString method to display employee details
    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + name + '\'' +
                ", Age=" + age +
                ", Department='" + department + '\'' +
                ", Salary=" + salary +
                '}';
    }
}
public class PrecticeJava8 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        // Creating and adding 5 Employee objects
        employeeList.add(new Employee("Alice", 30, "HR", 45000));
        employeeList.add(new Employee("Bob", 25, "IT", 55000));
        employeeList.add(new Employee("Charlie", 28, "Finance", 48000));
        employeeList.add(new Employee("David", 35, "Marketing", 50000));
        employeeList.add(new Employee("Eve", 32, "Operations", 47000));


        /*  List<Employee> emp = employeeList.stream().filter(e-> e.getAge() > 30).collect(Collectors.toUnmodifiableList());
        System.out.println(emp);

        List<Employee> emp2 = employeeList.stream().filter((e)-> e.getDepartment().equals("HR")).toList();
        System.out.println(emp2);

        Long count = employeeList.stream().count();
        System.out.println(count);

        Boolean status = employeeList.stream().anyMatch((e)-> e.getName().equals("Bob"));
        System.out.println(status);

        Boolean status1 = employeeList.stream().allMatch((e)-> e.getName().equals("Bob"));
        System.out.println(status1);

        Boolean status2 = employeeList.stream().noneMatch((e)-> e.getName().equals("Intern"));
        System.out.println(status);

        List<String> emp4 = employeeList.stream().map(Employee::getName).collect(Collectors.toUnmodifiableList());
        System.out.println(emp4);

        List<String> empl5 = employeeList.stream().map((e)-> e.getName().toUpperCase()).collect(Collectors.toUnmodifiableList());
        System.out.println(empl5);

        List<Employee> emp6 = employeeList.stream().sorted((a,b)-> a.getName().compareTo(b.getName())).collect(Collectors.toUnmodifiableList());
        System.out.println(emp6);

        List<Employee> emp7 = employeeList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toUnmodifiableList());
        System.out.println(emp7);

        List<Employee> emp8 = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toUnmodifiableList());
        System.out.println(emp8);

        List<String> emp9 = employeeList.stream().sorted(Comparator.comparing(Employee::getAge)).map(Employee::getName).collect(Collectors.toUnmodifiableList());
        System.out.println(emp9);

        List<String> emp10 = employeeList.stream().sorted(Comparator.comparing(Employee::getAge)).map(Employee::getName).collect(Collectors.toUnmodifiableList());
        System.out.println(emp10);

        List<Employee> emp11 = employeeList.stream().limit(2).collect(Collectors.toUnmodifiableList());
        System.out.println(emp11);

        List<String> emp12 = employeeList.stream().skip(2).map(Employee::getName).collect(Collectors.toUnmodifiableList());
        System.out.println(emp12);

        List<String> emp13 = employeeList.stream().map(Employee::getName).distinct().collect(Collectors.toUnmodifiableList());
        System.out.println(emp13);


        Optional<Double> emp14 = employeeList.stream().map(Employee::getSalary).reduce((a,b)-> a+b);
        System.out.println(emp14.get());


        Double emp15 = employeeList.stream().mapToDouble(Employee::getSalary).max().getAsDouble();
        System.out.println(emp15);

        Double emp16 = employeeList.stream().mapToDouble(Employee::getSalary).min().getAsDouble();
        System.out.println(emp16);

      */

    }
}
