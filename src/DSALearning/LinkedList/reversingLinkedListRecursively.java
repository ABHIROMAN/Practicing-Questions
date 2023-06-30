package DSALearning.LinkedList;

public class reversingLinkedListRecursively {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    static Node reverseRecursively(Node head) {

        if(head == null || head.next == null) return head;
        Node temp = head.next;
        Node newHead = reverseRecursively(head.next);
        temp.next = head;
        head.next = null;
        return newHead;

    }

    static void printLL(Node head) {
        Node cur = head;
        while(cur != null) {
            System.out.print(cur.data+"->");
            cur = cur.next;
        }
        System.out.println("end");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        printLL(head);
        Node newHead = reverseRecursively(head);
        printLL(newHead);
    }
}
