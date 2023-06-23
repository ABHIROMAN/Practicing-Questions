package Placement_Training.LinkedList;

public class maxmAndMinmElementInLinkedList {

    static class Node {
        int data;
        Node next;
    }
    static Node head = null;

    static int largestElement(Node head) {
        int max = Integer.MIN_VALUE;
        while(head != null) {
            if(max < head.data) max = head.data;
            head = head.next;
        }
        return max;
    }

    static int smallestElement(Node head) {
        int min = Integer.MAX_VALUE;
        while(head != null) {
            if(min > head.data) min = head.data;
            head = head.next;
        }
        return min;
    }

    static void push(int data) {

    }
}
