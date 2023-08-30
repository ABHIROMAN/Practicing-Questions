package DSALearning.PriorityQueue;

import java.util.*;
public class kthLargestElement {
    static int findKthLargest(int a[], int k) {
        if(k > a.length) return -1;
        Queue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < k; i++) {
            pq.offer(a[i]);
        }

        for(int i = k; i < a.length; i++) {
            System.out.println(pq); //checking iteration
            if(pq.peek() < a[i]) {
                pq.poll();
                pq.offer(a[i]);
            }
        }
        System.out.println(pq); //checking for extra last iteration
        return pq.peek();
    }
    public static void main(String[] args) {

        int a[] = {1, 4, 9, 2, 5, 6, 7};
        int k = 3;
        System.out.println(findKthLargest(a, k));
    }
}


