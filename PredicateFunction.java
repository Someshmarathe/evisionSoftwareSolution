import java.util.function.Predicate;
public class PredicateFunction{
     public static void main(String[] args) {
         Predicate<String> ps = (s)-> Character.toUpperCase(s.charAt(0)) == s.charAt(0);
         String[] str = {"somesh" , "Somesh" , "Yellow"};
         for(String s : str){
              if(ps.test(s)){
                  System.out.println(s);
              }
         }
     }
}