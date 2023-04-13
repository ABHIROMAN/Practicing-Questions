package BasicProgrammingProblems;

import java.util.*;
public class sumTriangleInArray {

    public static void printTriangle(int a[]) {

        if (a.length < 1) return;

        int temp[] = new int[a.length - 1];

        for(int i = 0; i < a.length - 1; i++) {

            int x = a[i] + a[i + 1];
            temp[i] = x;

        }

        printTriangle(temp);

        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5};
        printTriangle(a);
    }
}
