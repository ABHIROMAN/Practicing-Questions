package DSALearning.Queues;
public class queueUsingCircularArray {
    int front, rear;
    int a[];
    int n;

    public queueUsingCircularArray(int n) {
        front = rear = -1;
        a = new int[n];
        this.n = n;
    }

    void enqueue(int data) throws Exception {
        if(isFull()) throw new Exception("Queue array is full");
        if(isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % n;
        a[rear] = data;
    }

    int dequeue() throws Exception {
        if(isEmpty()) throw new Exception("Queue array is empty");
        if(front == rear) { // to check id one element is there
            int ans = a[front];
            front = -1;
            rear = -1;
            return ans;
        }
        int ans = a[front];
        front = (front + 1) % n;
        return ans;
    }

    private boolean isFull() {
        return (rear+1) % n == front;
    }

    boolean isEmpty() {
        return front == -1;
    }

    int getSize() {
        return isEmpty() ? 0 : (n - front + rear) % n + 1;
    }

    public static void main(String[] args) throws Exception {

        queueUsingCircularArray q = new queueUsingCircularArray(4);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue(50);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
