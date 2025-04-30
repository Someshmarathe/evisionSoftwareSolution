import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* 
class MyComparator implements Comparator<Student>{

    @Override
    public int compare(Student m, Student n) {
          return m.getName().compareTo(n.getName());
    }
}
    */
class Student{
     int i;
     String name;
     public Student(int i , String name){
        this.i = i;
        this.name = name;
     }
     public String getName(){
        return name;
     }
     public int getI(){
        return i;
     }
     public String toString(){
        return i+" : "+name;
     }
}
public class ComparatorwithObject {
    public static void main(String[] args) {
         List<Student> sb = new ArrayList<>();
         sb.add(new Student(1, "somesh"));
         sb.add(new Student(2, "muskan"));
         sb.add(new Student(4, "Krishna"));
         Collections.sort(sb,(m , n)->m.getName().compareTo(n.getName()));
         System.out.println(sb);
    }
}
