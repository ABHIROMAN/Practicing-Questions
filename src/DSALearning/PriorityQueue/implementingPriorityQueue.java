package DSALearning.PriorityQueue;

import java.util.*;
public class implementingPriorityQueue {
    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(5);
        pq.offer(10);
        pq.offer(9);
        pq.offer(1);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());

        //Implementing MaxHeap using Farzi way

        pq.offer(-5);
        pq.offer(-10);
        pq.offer(-9);
        pq.offer(-1);

        System.out.println(pq);
        System.out.println(-pq.poll());
        System.out.println(pq);
        System.out.println(-pq.poll());
        System.out.println(pq);
        System.out.println(-pq.poll());
        System.out.println(pq);
        System.out.println(-pq.poll());
    }
}
