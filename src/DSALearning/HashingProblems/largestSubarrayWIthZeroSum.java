package DSALearning.HashingProblems;

import java.util.*;

public class largestSubarrayWIthZeroSum {

    static int largestSubarray(int a[]) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int ans = 0;
        int cs = 0;
        for(int i = 0; i < a.length; i++) {
            int e = a[i];
            cs += e;
            if(map.containsKey(cs)) {
                int prev = map.get(cs);
                ans = Math.max(ans, i - prev);
            }
            else {
                map.put(cs, i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[] = {1, 1, 5, -3, -4, 3, 4, 1};
        System.out.println(largestSubarray(a));
    }
}
