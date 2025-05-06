import java.util.List;
class Worker {
    private String name;
    private int salary;

    // Constructor
    public Worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter for salary
    public int getSalary() {
        return salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " earns " + salary;
    }
}
public class SumMethod {
    public static void main(String[] args){
        List<Worker>  worker = List.of(
                new Worker("John", 50000),
                new Worker("Jane", 60000),
                new Worker("Alex", 55000)
        );

        List<Integer> list = List.of(1,2,3,4,5,6,7);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        int totalSalary = worker.stream().mapToInt(Worker::getSalary).sum();
        System.out.println(totalSalary);

        

    }
}
