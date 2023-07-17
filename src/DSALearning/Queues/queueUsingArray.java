package DSALearning.Queues;

public class queueUsingArray {

    int front, rear;
    int a[];
    int n; //capacity

    public queueUsingArray(int n) {
        front = rear = -1;
        a = new int[n];
        this.n = n;
    }

    void enqueue(int data) throws Exception {
        if(isFull()) throw new Exception("Queue array is full");
        if(isEmpty()) {
            front = 0;
        }
        rear++;
        a[rear] = data;
    }

    int dequeue() throws Exception {
        if(isEmpty()) throw new Exception("Queue array is empty");
        int ans = a[front]; //front is always 0
        for(int i = 0; i < rear; i++) {
            a[i] = a[i + 1];
        }
        rear--;
        return ans;
    }

    boolean isEmpty() {
        return rear == -1;
    }

    public boolean isFull() {
        return rear == n-1;
    }

    public static void main(String[] args) throws Exception {

        queueUsingArray qAA = new queueUsingArray(4);

        qAA.enqueue(10);
        qAA.enqueue(20);
        qAA.enqueue(30);
        qAA.enqueue(40);

        System.out.println(qAA.dequeue());
        System.out.println(qAA.dequeue());
        qAA.enqueue(50);
        System.out.println(qAA.dequeue());
        System.out.println(qAA.dequeue());
        System.out.println(qAA.dequeue());
    }
}
