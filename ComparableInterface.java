import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparableInterface {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(4);
        l.add(2);
        l.add(1);
        Collections.sort(l);
        System.out.println(l);
    }
}
