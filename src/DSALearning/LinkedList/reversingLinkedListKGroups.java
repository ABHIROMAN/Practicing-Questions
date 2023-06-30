package DSALearning.LinkedList;

public class reversingLinkedListKGroups {

    static Node reverseK(Node head, int k) {

        Node cur = head, prevFirst = null, newHead = null;
        while(cur != null) {
            int count = 0;
            Node prev = null, first = cur;

            while(cur != null && count < k) {
                Node temp = cur.next;
                cur.next = prev;
                prev = cur;
                cur = temp;
                count++;
            }
            if(newHead == null) {
                newHead = prev;
            }
            else {
                prevFirst.next = prev;
            }
            prevFirst = first;
        }
        return newHead;
    }

    static void printLL(Node head) {
        Node cur = head;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);

        printLL(head);
        int k = 3;
        Node newHead = reverseK(head, k);
        printLL(newHead);
    }
}
