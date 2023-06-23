package Placement_Training.LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class creatingNode {

    static Node insertLL(int data, int position, Node head) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node curr = head;
        for (int i = 0; i < position - 1; i++) {
            curr = curr.next;
            if (curr == null) return head;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }

    static Node deleteLL(int position, Node head) {
        if (head == null) return null;
        if (position == 0) {
            head = head.next;
            return head;
        }
        Node curr = head;
        for (int i = 0; i < position - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }

    static void printLL(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println(" end");
    }
    static void countLL(Node head) {
        int count = 0;
        Node curr = head;
        while(curr != null) {
            count ++;
            curr = curr.next;
        }
        System.out.println("Length of Linked List " + count);
    }


    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        Node n6 = new Node(60);

        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        printLL(head);
        insertLL(100, 3, head);
        printLL(head);
        head = insertLL(100, 0, head);
        printLL(head);
        head = deleteLL(3, head);
        printLL(head);
        countLL(head);
    }
}