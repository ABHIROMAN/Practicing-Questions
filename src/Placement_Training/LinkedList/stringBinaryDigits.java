package Placement_Training.LinkedList;

import java.util.Scanner;

public class stringBinaryDigits {

    static int checkString(String s) {

        if(s == null) return -1;
        int ans = s.charAt(0) - '0';

        for(int i = 1; i < s.length();) {

            char prev = s.charAt(i);
            i++;
            if(prev == 'A') {
                ans = ans & (s.charAt(i) - '0');
            }
            else if(prev == 'B') {
                ans = ans | (s.charAt(i) - '0');
            }
            else
                ans = ans ^ (s.charAt(i) - '0');
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(checkString(s));
    }
}