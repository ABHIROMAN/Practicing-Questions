package javaDSAPrac.Arrays2;

import java.util.HashSet;
import java.util.Set;

public class subArrWithZeroSum {

    static boolean subArrayWithZeroSum(int a[]) {

        int n  = a.length;

        Set<Integer> set = new HashSet<>();
        int sum = 0;

        for(int i = 1; i < n; i++) {

            sum += a[i];

            if(set.contains(sum)) {
                return true;
            }
            set.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {

        int a[] = {2, 3, 1, -4, 4, -2};

        System.out.println(subArrayWithZeroSum(a));
    }
}