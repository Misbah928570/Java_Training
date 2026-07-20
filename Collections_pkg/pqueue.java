package Collections_pkg;

import java.util.Collections;
import java.util.PriorityQueue;

public class pqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> rpq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(9);
        pq.add(100);
        System.out.println(pq); //min heap
        System.out.println(pq.peek());
        rpq.add(9);
        rpq.add(100);
        rpq.add(30);
        System.out.println(rpq);
        rpq.poll();
        System.out.println(rpq); //maxheap
    }
}
