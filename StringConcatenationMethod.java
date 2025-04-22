public class StringConcatenationMethod{
   public static void main(String[] args){
       String str = new String("Day");
       String str2 = str.concat(" "+"is");
       String str3 = str2 +" "+"good";
       String str4 = String.format("Every %s", str3);
       System.out.println(str +" "+ "Good");
       System.out.println(str4);
   }
}