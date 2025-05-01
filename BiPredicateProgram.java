import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateProgram {
     public static void main(String[] args) {
         BiPredicate<Integer , Integer> bip =(a,b)-> (a - b) >= 18;
         BiFunction<Integer , Integer , Integer> bif = (a,b)->  (a-b) >=18 ? (a-b) : 0;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Your DOP :");
         int dob = sc.nextInt();
         System.out.println("Enter Current Year :");
         int curryear = sc.nextInt();
         if(bip.test(curryear, dob)){
             
             System.out.println("You Can Ovte :"+bif.apply(curryear,dob));
         }
         else{
            System.out.println("You Cannot Vote");
         }
         

     }
}
