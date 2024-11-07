package November_2024._04112024_Collections_Hash;

import java.util.PriorityQueue;

public class QueueEx {
    public static void main(String[] args) {
        // In Automation Queue is used - < 0.01%.
        PriorityQueue pq= new PriorityQueue();
        pq.offer("1"); // add
        pq.offer("3");
        pq.offer("2");
        pq.offer("4");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
