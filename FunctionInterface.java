import java.util.Scanner;
import java.util.function.Function;

class Student{
      private String Amount;
      private String password;
      public Student(){

      };
      public  Student(String Amount , String password){ this.Amount = Amount; this.password = password;};
      public String getAmmount(){return Amount;};
      public String getPassword(){ return password;};
} 
public class FunctionInterface {
    public static void main(String[] args) {
        Student[] student = {
            new Student("2500", "2345"),
            new Student("50000", "2355"),
            new Student("60000", "2245")
        };
        Function<String,Student> std = (s)->{

              for(Student studentObject : student){
                    if(studentObject.getPassword().equals(s)){
                         return studentObject;
                    }
              }

              return null;
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Password");
        String  passd = sc.next();
        Student newstd = std.apply(passd);
        if (newstd != null) {
            System.out.println("Amount: " + newstd.getAmmount());
        } else {
            System.out.println("Invalid Password!");
        }
        sc.close();
    }
}
