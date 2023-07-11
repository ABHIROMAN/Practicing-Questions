package Placement_Training.LinkedList;

import java.util.*;
public class sortHalfInAscenAnotherHalfDescen {

    static void check(int a[]) {

        int n = a.length;

        Arrays.sort(a, 0, n/2);
        Arrays.sort(a, n/2, n);

        int l = n/2, h = n-1;
        while(l < h) {

            int temp = a[l];
            a[l] = a[h];
            a[h] = temp;
            l++;
            h--;
        }
    }
    public static void main(String[] args) {

        int a[] = {5, 2, 4, 7, 9, 3, 1, 6, 8};
        check(a);
        System.out.printf(Arrays.toString(a));
    }
}