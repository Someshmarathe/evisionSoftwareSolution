import java.util.IdentityHashMap;
import java.util.PriorityQueue;
import java.util.WeakHashMap;

public class PriorityQueues {
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(1);
        pq.add(15);
        pq.add(6);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.element());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.remove());
        System.out.println(pq);
    }
}
