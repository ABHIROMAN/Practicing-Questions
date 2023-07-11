package Placement_Training.LinkedList;
public class rowsWithMaximum1s {
    static int row = 3;
    static int col = 3;
    static int first(int a[], int low, int high) {

        if(high >= low) {

            int mid = low + (high - low)/2;

            if((mid == 0) || a[mid - 1] == 0 && a[mid] == 1) {
                return mid;
            }
            else if(a[mid] == 0) {
                return first(a, (mid + 1), high);
            }
            else {
                return first(a, low, mid-1);
            }
        }
        return -1;
    }
    static int rowIntMatrix(int a[][]) {

        int max_row = 0, max = 0;

        int i, index;
        for (i = 0; i < row; i++) {
            index = first(a[i], 0, col - 1);
            if (index != -1 && col - index > max) {
                max = col - index;
                max_row = i;
            }
        }
        return max_row;
    }
    public static void main(String[] args) {

        int a[][] = {{1, 0, 1},
                {1, 1, 1},
                {1, 0, 1}};

        System.out.println(rowIntMatrix(a) + 1);
    }
}