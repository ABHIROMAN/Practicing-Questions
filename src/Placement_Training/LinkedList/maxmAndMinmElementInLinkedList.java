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
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }
    static void printLL(Node head) {
        while(head != null) {
            System.out.print(head.data + "-->");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        push(10);
        push(20);
        push(30);
        push(40);

        printLL(head);

        System.out.println("Maximum element is " + largestElement(head));
        System.out.println("Smallest element is " + smallestElement(head));
    }
}