package DSALearning.Stacks;

import java.util.ArrayDeque;

public class minStackUsingOnSpace {

    ArrayDeque<Integer> stack  = new ArrayDeque<>();
    ArrayDeque<Integer> minStack = new ArrayDeque<>();

    void push(int e) {
        stack.push(e);
        if(minStack.isEmpty()) {
            minStack.push(e);
            return;
        }
        if(e <= minStack.peek()) {
            minStack.push(e);
        }
    }

    int pop() throws Exception {
        if(stack.isEmpty()) throw new Exception("Stack is Empty");
        int ans = stack.pop();
        if(ans == minStack.peek()) {
            minStack.pop();
        }
        return ans;
    }

    int min() throws Exception {
        if(stack.isEmpty()) throw new Exception("Stack is Empty");
        return minStack.peek();
    }

    public static void main(String[] args) throws Exception {

        minStackUsingOnSpace Stack = new minStackUsingOnSpace();

        Stack.push(10);
        Stack.push(2);
        System.out.println(Stack.min());
        Stack.push(1);
        System.out.println(Stack.min());
        Stack.pop();
        Stack.push(5);
        System.out.println(Stack.min());
        Stack.pop();
        System.out.println(Stack.min());
        Stack.push(2);
        System.out.println(Stack.min());
    }
}