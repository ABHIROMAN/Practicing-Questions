package Placement_Training.LinkedList;


public class deleteAlternateNode {

    static Node head;
    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static void deleteAlternate() {

        if(head == null) return;

        Node node = head;

        while(node != null && node.next != null) {

            node.next = node.next.next;
            node = node.next;
        }
    }

    static void push(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    static void printList()
    {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        deleteAlternateNode llist = new deleteAlternateNode();


        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        System.out.println("Linked List before calling deleteAlt() ");
        printList();

        deleteAlternate();

        System.out.println("Linked List after calling deleteAlt() ");
        printList();

    }
}
