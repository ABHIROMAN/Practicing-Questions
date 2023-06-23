package Placement_Training.LinkedList;

public class priorityQueueUsingLinkedList {

    static class Node {

        int data;
        Node next;
        int priority;

    }

    static Node node = new Node();

    static Node newNode(int d, int p) {
        Node temp = new Node();
        temp.data = d;
        temp.priority = p;
        temp.next = null;

        return temp;
    }

    static Node pop(Node head) {
        Node temp = head;
        (head) = (head).next;
        return head;
    }

    static Node push(Node head, int d, int p) {

        Node start = head;
        Node temp = newNode(d, p);

        if(head.priority < p) {
            temp.next = head;
            head = temp;
        }
        else {
            while(start.next != null && start.next.priority>p) {
                start = start.next;
            }
            temp.next = start.next;
            start.next = temp;
        }
        return head;
    }

    static int peek(Node head) {
        return head.data;
    }

    static boolean isEmpty(Node head) {
        if (head == null) return false;
        return true;
    }

    public static void main(String[] args) {

        Node a = newNode(10, 1);
        a = push(a, 20, 2);
        a = push(a, 30, 3);
        a = push(a, 40, 7);
        a = push(a, 50, 10);

        while(isEmpty(a)) {
            System.out.print(peek(a) + " ");
            a = pop(a);
        }
    }
}
