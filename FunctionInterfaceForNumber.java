import java.util.function.Function;

public class FunctionInterfaceForNumber {
    public static void main(String[] args) {
         Function<Integer , Integer> f = (num)-> num*2;
         Function<Integer , Integer> f2 = (num)-> num + 1;
         System.out.println(f.andThen(f2).apply(3));
         System.out.println(f.compose(f2).apply(3));

    }
}
