package DSALearning.Queues;
import java.util.Stack;

public class queueUsingTwoStacks {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        static void enqueue(int data) {

            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);

            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        static int dequeue() throws Exception{

            if(s1.isEmpty()) throw new Exception("Stack is Empty");

            int x = s1.peek();
            s1.pop();
            return x;
        }
    }

    public static void main(String[] args) throws Exception {

        Queue qe = new Queue();
        qe.enqueue(10);
        qe.enqueue(20);
        qe.enqueue(30);

        System.out.println(qe.dequeue());
        System.out.println(qe.dequeue());
        System.out.println(qe.dequeue());
    }
}
