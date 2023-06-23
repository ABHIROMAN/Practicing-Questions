package Placement_Training.LinkedList;

public class priorityQueueUsingDoublyLinkedList {

    static class Node {
        int data;
        Node next;
        int priority;
        Node prev;
    }
    static Node front, rear;
//    static Node node = new Node();

    static Node newNode(int d, int p) {
        Node temp = new Node();
        temp.data = d;
        temp.priority = p;
        temp.next = null;

        return temp;
    }

    static void push(Node fr, Node rr, int d, int p) {

        Node newNode = new Node();
        newNode.data = d;
        newNode.priority = p;

        if(fr == null) {
            fr = newNode;
            rr = newNode;
            newNode.next = null;
        }

        else {
            if(p <= fr.priority) {
                newNode.next = fr;
                fr.prev  = newNode.next;
                fr = newNode;
            }
            else if(p > rr.priority) {
                newNode.next = null;
                rr.next = newNode;
                newNode.prev = rr.next;
                rr = newNode;
            }
            else {
                Node start = fr.next;
                while(start.priority > p) {
                    start = start.next;
                }
                start.prev.next = newNode;
                newNode.next = start.prev;
                newNode.prev = start.prev.next;
                fr.prev = newNode.next;
            }
            front = fr;
            rear = rr;
        }
    }

    static int peek(Node fr) { return fr.data; }

    static boolean isEmpty(Node fr) { return (fr == null); }

    static int pop(Node fr, Node rr)
    {
        Node temp = fr;
        int res = temp.data;
        (fr) = (fr).next;
        if (fr == null)
            rr = null;

        front = fr;
        rear = rr;
        return res;
    }

    public static void main(String[] args) {

//        Node a = newNode(10, 1);
//        a = push(a, 20, 2);
//        a = push(a, 30, 3);
//        a = push(a, 40, 7);
//        a = push(a, 50, 10);
//
//        while(isEmpty(a)) {
//            System.out.print(peek(a) + " ");
//            a = pop(a);
//        }
    }
}
