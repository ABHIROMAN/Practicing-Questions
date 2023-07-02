package DSALearning.LinkedList;

public class FloydsCycleDetection {

    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    static Node isCycleAvailaible(Node head) {
        Node slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                return slow;
            }
        }
        return null;
    }

    static Node findCycleStartingNode(Node head) {
        Node meet = isCycleAvailaible(head);
        if(meet == null) return null;
        Node cur = head;
        while(cur != meet) {
            cur = cur.next;
            meet = meet.next;
        }
        return cur;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = head.next.next.next;

        Node meet = isCycleAvailaible(head);
        if(meet != null) {
            System.out.println("Cycle is present");
            Node firstNode = findCycleStartingNode(head);
            System.out.println(firstNode.data);
        }
        else {
            System.out.println("Cycle is not present");
        }
    }
}
