package DSALearning.Arrays;

public class Arrays3 {

    static boolean searchInMatrix(int a[][], int key) {
        int row = 0;
        int col = a.length - 1;

        while (row < a.length && col >= 0) {
            if (a[row][col] == key) {
                return true;
            }
            else if(key > a[row][col]) {
                row++;
            }
            else col--;
        }
        return false;
    }

    static void transposeOfMatrix(int a[][]) {
        int n = a.length;

        for(int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int swap = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = swap;
            }
        }
    }

    static void rotateMatrix(int a[][]) {
        int n = a.length;
        transposeOfMatrix(a);

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n/2; j++) {
                int swap = a[i][j];
                a[i][j] = a[i][n-j-1];
                a[i][n-j-1] = swap;
            }
        }
    }



    static void printMatrix(int a[][]) {
        int n = a.length;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

//        int a[][] = {
//                {1, 4, 5, 7},
//                {2, 5, 6, 9},
//                {6, 10, 11, 13},
//                {8, 12, 15, 18}
//        };

        int a[][] = {{1, 2, 3}, {3, 5, 7}};

//        int key = 2;
//        System.out.println(searchInMatrix(a, key));

//        printMatrix(a);

        transposeOfMatrix(a);
//        rotateMatrix(a);

//        System.out.println("******************");

        printMatrix(a);

    }

}

