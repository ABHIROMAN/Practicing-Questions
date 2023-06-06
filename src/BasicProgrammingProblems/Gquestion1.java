package BasicProgrammingProblems;

//import java.util.Scanner;
import java.util.*;

public class Gquestion1 {

    static int solve(int N, String S) {

//        int count=0;
//
//        char ch[] = S.toCharArray();
//
//        for(int i=0; i<ch.length; i++) {
//
//            int start = i;
//
//            int flag = 0;
//
//            for(int j=0;j<ch.length;j++) {
//                if(ch[(start+j)%ch.length]=='(') {
//                    flag++;
//                }
//                else {
//                    flag--;
//                    if(flag<0)
//                        break;
//                }
//            }
//
//            if(flag==0)
//            {
//                count++;
//            }
//        }
//        return count;

        int count = 0;  // Count of '+' insertions
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    stack.peek();
                }
                count++;
            }

        }
        return count;
//        String s = sc.nextLine();
//
//        int open= 0 ,close=0;
//
//        for(int i = 0;i<s.length();++i)
//
//        {
//
//            if(s.charAt(i)=='(')
//
//                ++open;
//
//            else if(s.charAt(i)==')')
//
//                ++close;
//
//        }
//
//        if(open>=close)
//
//            System.out.println(close);
//
//        else if(open<close)
//
//            System.out.println(open);
//
//    }

    }

        public static void  main(String[] args) {

//            Scanner sc = new Scanner(System.in);
            int n = 6;
            String s = "()(())";

            System.out.println(solve(n, s));
        }


}
