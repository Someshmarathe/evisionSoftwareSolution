import java.util.function.Consumer;
import java.util.function.Supplier;

public class SuppilerWithOtpGenerator {
    public static void main(String[] args) {
       Consumer<String> con = (s)-> System.out.println(s);
       con.accept("Somes");
       Supplier<String> sup = ()->{
           String otp = "";
           for(int i=0;i<4;i++){
                otp += (int)(Math.random()*10);
           }  
           return otp;
     };
         System.out.println(sup.get());

    }

}
