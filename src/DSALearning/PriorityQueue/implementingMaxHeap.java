package DSALearning.PriorityQueue;

import java.util.*;

public class implementingMaxHeap {
    public static void main(String[] args) {

        //mETHOD - 1
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        //mETHOD - 2
        Queue<Integer> pqe = new PriorityQueue<>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

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
    }
}
