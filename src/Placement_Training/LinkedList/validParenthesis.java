package Placement_Training.LinkedList;

import java.util.ArrayDeque;

public class validParenthesis {

    static boolean matchingParenthesis(String s) {

        ArrayDeque<Character> stack = new ArrayDeque<>();

        for(int i=0; i<s.length(); i++) {
            char cur = s.charAt(i);
            if(cur == '(' || cur == '{' || cur == '[') {
                stack.push(cur);
                continue;
            }
            if(cur == ')' || cur == '}' || cur == ']' ) {
                if(stack.isEmpty()) return false;
            }
            char top = 'a';
            switch(cur) {
                case ')':
                    top = stack.pop();
                    if(top != '(') return false;
                    break;
                case '}':
                    top = stack.pop();
                    if(top != '{') return false;
                    break;
                case ']':
                    top = stack.pop();
                    if(top != '[') return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {

        String s = "a()b[]({})";
        System.out.println(matchingParenthesis(s));
    }
}