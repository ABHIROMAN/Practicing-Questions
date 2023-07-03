package DSALearning.Stacks;

public class implementationUSingLinkedList {

    Node head;
    int size = 0;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    void push(int element) {
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    int pop() throws Exception {
        if(isEmpty()) throw new Exception("Stack is Empty");
        int ans = head.data;
        head = head.next;
        size--;
        return ans;
    }

    int peek() throws Exception {
        if(isEmpty()) throw new Exception("Stack is Empty");
        return head.data;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) throws Exception {

        implementationUSingLinkedList stack = new implementationUSingLinkedList();

        stack.push(5);
        stack.push(4);
        stack.push(1);
        stack.push(3);

        System.out.println("Size of the stack " + stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}