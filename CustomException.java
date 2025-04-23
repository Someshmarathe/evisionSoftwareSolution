import java.util.Scanner;

class UnderAgeException extends RuntimeException
{
     public UnderAgeException(String error){
        super(error);
     }
}

public class CostemException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = sc.nextInt();
        if(age < 18){
            try{
                throw new UnderAgeException("Youm Cannot Vote");
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
         
        }
        else{
            System.out.println("You Can Vote");
        }
    } 
}
