import java.util.*;

public class main {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>(3);
        // q.offer(5);
        // q.offer(6);
        // q.offer(2);
        // q.offer(1);
        // q.offer(18);
        // // System.out.println(q.peek());
        // System.out.println("q size before " +q.size());
        // System.out.println(q.poll());
        // System.out.println("q size after " +q.size());
        int k = 2;

        q.add(5);
        q.add(6);
        q.add(2);
        q.add(1);
        q.add(29);
        q.add(59);
        q.add(18);
        while (q.size() > k)
            q.poll();

        System.out.println(q.peek());
        System.out.println(q);

        // System.out.println(q.peek());
        // System.out.println("q size before " +q.size());
        // System.out.println(q.poll());
        // System.out.println("q size after " +q.size());
        // System.out.println(q);
    }
}
