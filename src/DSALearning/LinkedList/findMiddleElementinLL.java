package DSALearning.LinkedList;

public class findMiddleElementinLL {

    static int findMiddle(CNode<Integer> head) {

        CNode<Integer> slow = head;
        CNode<Integer> fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    static void printLL(CNode<Integer> head) {
        CNode<Integer> curr = head;
        while(curr != null) {
            System.out.print(curr.data+ " -> ");
            curr = curr.next;
        }
        System.out.println(" end");
    }

    public static void main(String[] args) {

        CNode<Integer> n1 = new CNode<>(10);
        CNode<Integer> n2 = new CNode<>(20);
        CNode<Integer> n3 = new CNode<>(30);
        CNode<Integer> n4 = new CNode<>(40);
        CNode<Integer> n5 = new CNode<>(50);
        CNode<Integer> n6 = new CNode<>(60);

        CNode<Integer> head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        printLL(head);
        System.out.println(findMiddle(head));
    }
}

class CNode<T> {
    T data;
    CNode<T> next;

    public CNode(T data) {
        this.data = data;
    }
}
