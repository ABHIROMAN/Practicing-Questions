package Placement_Training.LinkedList;

public class comparetwoLinkedList {

    Node head;
    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }


    boolean check(comparetwoLinkedList list2) {

        Node a = this.head;
        Node b = list2.head;

        while(a != null && b != null) {
            if (a.data != b.data) return false;
            a = a.next;
            b = b.next;
        }

        return (a == null && b == null);
    }

    void addData(int data) {

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {

        comparetwoLinkedList list1 = new comparetwoLinkedList();
        comparetwoLinkedList list2 = new comparetwoLinkedList();

        list1.addData(10);
        list1.addData(20);
        list1.addData(30);

        list2.addData(10);
        list2.addData(20);
        list2.addData(30);

        if (list1.check(list2)) System.out.println("Same");
        else System.out.println("Not Same");
    }
}
