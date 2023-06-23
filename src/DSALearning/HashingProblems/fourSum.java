package DSALearning.HashingProblems;

import java.util.*;
public class fourSum {

    static class Pair {
        int i, j;
        public Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    static void quadruple(int a[], int x) {
        Map<Integer, Pair> map = new HashMap<>();
        int n = a.length;
        for(int i = 0; i < n-1; i++) {
            for(int j = i + 1; j < n; j++) {
                map.put(a[i]+a[j], new Pair(i, j));
            }
        }
        for(Map.Entry<Integer, Pair> entry : map.entrySet()) {
            int firstSum = entry.getKey();
            Pair firstPair = entry.getValue();
            int secondSum = x - firstSum;
            if(map.containsKey(secondSum)) {
                Pair secondPair = map.get(secondSum);
                if(firstPair.i != secondPair.i && firstPair.i != secondPair.j &&
                firstPair.j != secondPair.i && firstPair.j != secondPair.j) {
                    System.out.println(firstPair.i + " " + firstPair.j + " " + secondPair.i + " " + secondPair.j);
                    return;
                }
            }
        }
        System.out.println("Not found");
    }

    public static void main(String[] args) {

        int a[] = {2, 3, 4, 6, 8};
        int x = 19;

        quadruple(a, x);
    }
}
