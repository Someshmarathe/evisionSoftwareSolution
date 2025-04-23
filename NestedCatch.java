import java.util.Scanner;

class UnderAgeException extends RuntimeException
{
     public UnderAgeException(String error){
        super(error);
     }
}

public class NestedCatch {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = sc.nextInt();
        if(age < 18){
            try{
               // int sum = 1/0;
                throw new UnderAgeException("Youm Cannot Vote");
            }
            catch(ArithmeticException e){
                System.out.println(e.toString());
               
            }
            catch(IllegalArgumentException e){
               System.out.println(e.toString());
            }
            catch(Exception e){
                System.out.println(e.toString());
                System.out.println("i am executed");
            }
        }
        else{
            System.out.println("You Can Vote");
        }
    }
}
