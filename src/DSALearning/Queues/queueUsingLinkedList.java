package DSALearning.Queues;

public class queueUsingLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    private Node front, rear;

    void enqueue(int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    int dequeue() throws Exception {
        if(isEmpty()) throw new Exception("Queue is empty");
        int ans = front.data;
        front = front.next;

        return ans;
    }

    int getFront() throws Exception {
        if(isEmpty()) throw new Exception("Queue is empty");
        return front.data;
    }

    boolean isEmpty() {
        return front == null;
    }

    public static void main(String[] args) throws Exception {

        queueUsingLinkedList qLL = new queueUsingLinkedList();

        qLL.enqueue(10);
        qLL.enqueue(20);
        qLL.enqueue(30);
        qLL.enqueue(40);

        System.out.println(qLL.dequeue());
        System.out.println(qLL.dequeue());
        qLL.enqueue(50);
        System.out.println(qLL.dequeue());
        System.out.println(qLL.dequeue());
        System.out.println(qLL.dequeue());
    }

}
