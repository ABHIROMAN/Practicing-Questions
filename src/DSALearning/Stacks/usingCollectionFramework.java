package DSALearning.Stacks;

import java.util.ArrayDeque;
import java.util.Stack;

public class usingCollectionFramework {

    public static void main(String[] args) {

        //Stack<Integer> stack = new Stack<>(); //Internally uses Vector means Array

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(5);
        stack.push(4);
        stack.push(1);
        stack.push(8);

        System.out.println("Size of the stack "+stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
