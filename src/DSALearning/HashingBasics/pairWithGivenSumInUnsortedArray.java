package DSALearning.HashingBasics;

import java.util.*;
import java.util.HashSet;

public class pairWithGivenSumInUnsortedArray {
    static class Pair {
        int a,b;
        Pair(int a,int b) {
            this.a = a;
            this.b = b;
        }
    }

    static Pair pairWithGivenSum(int a[], int sum) {

        Set<Integer> set = new HashSet<>();
        for(int e : a) {
            int comp = sum - e;
            if(set.contains(comp)) return new Pair(e, comp);
            set.add(e);
        }
        return null;
    }

    public static void main(String[] args) {

        int a[] = {1, 2, 1, 3, 2};
        int sum = 5;
        Pair pair = pairWithGivenSum(a, sum);
        if (pair != null) {
            System.out.println(pair.a + " , " + pair.b);
        }
    }
}
