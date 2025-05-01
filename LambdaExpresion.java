interface FindStringLength{
    public int getLength(String s);
}
public class LambdaExpresion {
    public static void main(String[] args) {
         FindStringLength fsl = (s)-> s.length();
         String[] str = {"red" , "blue" , "yellow" , "green"};
         for(String s : str){
               if(fsl.getLength(s) >=4){
                  System.out.print(s+" ");
               }
         }
    }
}
