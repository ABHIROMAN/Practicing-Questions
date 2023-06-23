package DSALearning.HashingProblems;

import java.util.*;

public class longestConsecutiveSubsequence {

    static int longestconsecSubsequence(int a[]) {

        Set<Integer> set = new HashSet<>();
        for(int e : a) {
            set.add(e);
        }
        int ans = 0;

        for(int e : set) {                                   // 2 1 9 4 3 5 7 8
            if(!set.contains(e - 1)) {                       //
                int len = 1;
                while(set.contains(++e)) {
                    len++;
                }
                ans = Math.max(ans, len);
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        int a[] = {2, 1, 9, 3, 5, 4, 8, 7, 2, 1, 3};
        System.out.println(longestconsecSubsequence(a));
    }
}
