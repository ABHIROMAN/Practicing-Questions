package DSALearning.LinkedList;

public class creatingNode {

    static Node insertInLinkedList(int data, int position, Node head) {

        Node newNode = new Node(data);

        if(position == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node curr = head;
        for(int i = 0; i < position - 1; i++) {
            curr = curr.next;
            if(curr == null) return head;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }

    static Node deleteInLinkedList(int position, Node head) {

        if(head == null) return null;
        if(position == 0) {
            head = head.next;
            return head;
        }
        Node curr = head;
        for(int i = 0; i < position - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }

    static void printLinkedList(Node head) {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("end");
    }

    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        printLinkedList(head);
//        insertInLinkedList(100, 3, head);
        deleteInLinkedList(5, head);
        printLinkedList(head);
    }
}
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}