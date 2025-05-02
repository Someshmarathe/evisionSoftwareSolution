import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethod {
    public static void main(String[] args){
        List<String> name = List.of("hello" , "somesh" , "how" , "are" , "you");
        List<String> l = name.stream().map(String::toUpperCase).toList();
        System.out.println(l);

        List<Integer> allStringObjectLength = name.stream().map(String :: length).toList();
        System.out.println(allStringObjectLength);
    }
}
