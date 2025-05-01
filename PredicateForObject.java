import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employe{
      public String name;
      public int salary;
      public int age;
      public Employe(String name , int salary , int age){
          this.name = name;
          this.salary  = salary;
          this.age = age;
      }
      public String toString(){
           return name+" : "+salary+" : "+age;
      }
}


public class PredicateForObject {
    public static void main(String[] args) {
         List<Employe> l = new ArrayList<>();
         l.add(new Employe("somesh", 20000 , 22));
         l.add(new Employe("Ramesh", 25000 , 23));
         l.add(new Employe("somesh", 30000 , 25));
         Predicate<Employe> emp1 = (e)-> e.salary > 20000;
         Predicate<Employe> emp2 = (e)-> e.age >= 20;
        
         for(Employe e : l){
             if(emp1.test(e) && emp2.test(e)){
                  System.out.println(e);
             }
         }

    }
}
