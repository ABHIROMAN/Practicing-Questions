package javaDSAPrac.General;

import java.util.*;

public class tcsRepeatedRangeNum {

    static int repeated_digits(int n) {

        HashSet<Integer> s = new HashSet<>();
        while(n != 0) {

            int d = n % 10;
            if (s.contains(d))
            {
                return 0;
            }
            s.add(d);
            n = n/10;
        }
        return 1;
    }
    static int calculate(int L, int R) {

        int answer = 0;
        for (int i = L; i < R + 1; ++i) {
            answer = answer + repeated_digits(i);
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();

        System.out.println(calculate(L, R));
    }
}