package DSALearning.Stacks;

public class implementStackUsingArray {

    int a[];
    int capacity;
    int top;

    public implementStackUsingArray(int capacity) {
        this.capacity = capacity;
        a = new int[capacity];
        top = -1;
    }

    boolean push(int element) throws Exception {
        if(top == capacity - 1) throw new Exception("Array is full");
        top++;
        a[top] = element;
        return true;
    }

    int pop() throws Exception {
        if(top == -1) throw new Exception("Array/Stack is Empty");
        int ans = a[top];
        top--;
        return ans;
    }

    int peek() throws Exception {
        if(top == -1) throw new Exception("Stack is Empty");
        return a[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    int size() {
        return top + 1;
    }

    public static void main(String[] args) throws Exception {

        implementStackUsingArray stack = new implementStackUsingArray(3);

        stack.push(2);
        stack.push(3);
        stack.push(4);

//        stack.push(1);

        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
