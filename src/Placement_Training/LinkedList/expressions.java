package Placement_Training.LinkedList;

import java.util.*;
public class expressions {
    static int evaluatePostfix(String s) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int value1 = stack.pop();
                int value2 = stack.pop();

                switch (c) {

                    case '+':
                        stack.push(value2 + value1);
                        break;

                    case '-':
                        stack.push(value2 - value1);
                        break;

                    case '/':
                        stack.push(value2 / value1);
                        break;

                    case '*':
                        stack.push(value2 * value1);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {

        String expression = "234*+";
        System.out.println("Evaluation of postfix :- " + evaluatePostfix(expression));
    }
}