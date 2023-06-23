package Placement_Training.LinkedList;

class DNode {

    int data;
    DNode next;
    DNode previous;

    public DNode(int data) {
        this.data = data;
    }
}
public class doublyLinkedList {

    static DNode head,tail = null;

    static void  insertLL(int data) {

        DNode newNode = new DNode(data);
        if (head == null) {
            head = tail = newNode;
            head.previous =null;
            tail.next = null;
        }
        else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    static void printLL() {

        DNode curr = head;
        if(head == null) {
            System.out.println("List is Empty");
            return;
        }
        while(curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println(" end ");
    }

    public static void main(String[] args) {

        doublyLinkedList list = new doublyLinkedList();
        insertLL(10);
        insertLL(20);
        insertLL(30);
        insertLL(40);
        insertLL(50);

        printLL();
    }
}
