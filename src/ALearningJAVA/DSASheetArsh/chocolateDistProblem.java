package ALearningJAVA.DSASheetArsh;

import java.util.*;
public class chocolateDistProblem {

    static int findMinDifference(int a[], int n, int m) {

        if(m == 0 || n == 0) return 0;

        Arrays.sort(a);
        if(n < m) return -1;

        int min_diff = Integer.MAX_VALUE;

        for(int i = 0; i < n - m + 1; i++) {
            int diff = a[i + m - 1] - a[i];
            if(diff < min_diff) {
                min_diff = diff;
            }
        }
        return min_diff;
    }

    public static void main(String[] args) {

        int a[] = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;
        int n = a.length;

        System.out.println("Minm difference: "+ findMinDifference(a, n, m));
    }
}
