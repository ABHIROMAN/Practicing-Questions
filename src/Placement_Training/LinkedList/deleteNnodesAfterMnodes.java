package Placement_Training.LinkedList;

public class deleteNnodesAfterMnodes {
    static class Node {
        int data;
        Node next;
    }

    static Node push( Node head_ref, int new_data) {

        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = (head_ref);
        (head_ref) = new_node;
        return head_ref;
    }
    static void printList( Node head)
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.printf("\n");
    }
    static void skipMdeleteN(Node head, int m, int n) {

        Node cur = head, temp;
        int count;

        while(cur != null) {

            for(count = 1; count < m && cur != null; count++) {
                cur = cur.next;
            }
            if(cur == null) return;

            temp = cur.next;


            for(count = 1; count <= n && temp != null; count++) {

                Node t = temp;
                temp = temp.next;
            }

            cur.next = temp;
            cur = temp;
        }
    }
    public static void main(String[] args) {



    }
}
