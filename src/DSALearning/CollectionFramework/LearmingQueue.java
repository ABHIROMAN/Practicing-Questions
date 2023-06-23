package DSALearning.CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class LearmingQueue {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(12);
        q.add(23);
        q.add(45);
        q.offer(56);

        System.out.println("peek " + q.peek());
        System.out.println(q.remove());
        System.out.println(q);
    }
}
