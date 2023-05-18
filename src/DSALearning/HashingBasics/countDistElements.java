package DSALearning.HashingBasics;

import java.util.*;
public class countDistElements {

    static int countDist(int a[]) {

        Set<Integer> set = new HashSet<>();
        for(int e : a) {
            set.add(e);
        }
        System.out.println(set);
        return set.size();
    }

    public static void main(String[] args) {

        int a[] = {1, 2, 1, 3, 2, 4, 2, 5, 7, 5, 4, 2};
        System.out.println(countDist(a));
    }
}
