package Placement_Training.LinkedList;

import java.util.Arrays;

public class columnSumMatrix {

    static int[] columnSum(int a[][]) {
        int rows = a.length;
        int cols = a[0].length;
        int colSum[] = new int[cols];

        for(int i = 0; i < cols; i++) {
            int sum = 0;
            for(int j = 0; j < rows; j++) {
                sum += a[j][i];
            }
            colSum[i] = sum;
        }
        return colSum;
    }

    public static void printMat(int a[][]) {
        for(int e[]: a) {
            System.out.println(Arrays.toString(e));
        }
    }
    public static void main(String[] args) {

        int a[][] = {{1, 2}, {3, 4}, {5, 6}};

        printMat(a);
        int colSum[] = columnSum(a);
        for(int e : colSum) {
            System.out.print(e + " ");
        }

    }
}
