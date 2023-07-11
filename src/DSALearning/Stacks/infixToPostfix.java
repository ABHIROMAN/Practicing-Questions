package DSALearning.Stacks;

import java.util.*;
public class infixToPostfix {

    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
    static int precedance(char e) {
        if (e == '+' || e == '-') return 1;
        else if (e == '*' || e == '/') return 2;
        else return -1;
    }

    static String infixToPostfixConversion(String s) {

        StringBuilder sb = new StringBuilder();
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if(cur == '(') {
                stack.push(cur);
            }
            else if(cur == ')') {
                while(stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop();
            }
            else if(isOperator(cur)) {
                while(!stack.isEmpty() && precedance(cur) <= precedance(stack.peek())) {
                    sb.append(stack.pop());
                }
                stack.push(cur);
            }
            else {
                sb.append(cur); // For appending operand
            }
        }
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String input = "(2*3)-(4/5-6+7)";
        String output = infixToPostfixConversion(input);

        System.out.println(output);
    }
}
