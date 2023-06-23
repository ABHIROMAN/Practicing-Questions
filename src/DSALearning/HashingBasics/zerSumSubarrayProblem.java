package DSALearning.HashingBasics;

import java.util.*;
public class zerSumSubarrayProblem {

    static boolean zerSumSubarray(int a[]) {
        Set<Integer> set = new HashSet<>();
        int cs = 0;
        set.add(0);
        for (int e : a) {
            cs += e;
            if(set.contains(cs)) return true;
            set.add(cs);
        }
        return false;
    }
    public static void main(String[] args) {

        int a[] = {1, 4, -3, 2, 1, 2};
        System.out.println(zerSumSubarray(a));
    }
}