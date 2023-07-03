package DSALearning.LinkedList;

public class palindromeLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    static Node findMiddle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static Node reverseLL(Node head) {

        Node cur = head, prev = null;
        while (cur != null) {
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

    static boolean ispalindrome(Node head) {

        if (head == null || head.next == null) return true;

        Node mid = findMiddle(head); //getting the middle
        Node rev = reverseLL(mid); // reversed linked list from mid

        Node left = head;
        Node right = rev;

        while (right != null) {
            if (left.data != right.data) return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }

    static void printLL(Node head) {

        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node head1 = new Node(3);
        head1.next = new Node(4);
        head1.next.next = new Node(4);
        head1.next.next.next = new Node(3);

        printLL(head1);
        System.out.println(ispalindrome(head1));
    }
}