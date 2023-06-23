package Placement_Training.LinkedList;

import java.util.*;
public class sortingQueueWIthoutExtraSpace {

    public static int minimum_Index(Queue<Integer> qe, int index) {

        int minIndex = -1;
        int minValue = Integer.MAX_VALUE;

        int n = qe.size();
        for(int i = 0; i < n; i++) {

            int curr = qe.peek();

            //performing dequeue
            qe.poll();

            if(curr <= minValue && i <= index) {
                minIndex = i;
                minValue = curr;
            }
            qe.add(curr);
        }
        return minIndex;
    }

    public static void insertMinToRear(Queue<Integer> qe, int minIndex) {

        int minValue = 0;
        int n = qe.size();

        for(int i = 0; i < n; i++) {
            int curr = qe.peek();
            qe.poll();

            if(i != minIndex) {
                qe.add(curr);
            }
            else minValue = curr;
        }
        qe.add(minValue);
    }

    public static void sortQueue(Queue<Integer> qe) {
        for(int i = 0; i < qe.size(); i++) {
            int minIndex = minimum_Index(qe, qe.size() - i);
            insertMinToRear(qe, minIndex);
        }
    }

    public static void main(String[] args) {

        Queue<Integer> qe = new LinkedList<Integer>();
        qe.add(20);
        qe.add(5);
        qe.add(4);
        qe.add(1);
        qe.add(22);
        qe.add(42);

        sortQueue(qe);

        while(qe.isEmpty() == false) {
            System.out.print(qe.peek() + " ");
            qe.poll();
        }
    }
}