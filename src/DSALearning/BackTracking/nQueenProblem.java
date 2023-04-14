package DSALearning.BackTracking;

public class nQueenProblem {

    public static boolean helper(int a[][], int n, int row, int col) {

        //Checking in column
        for(int i = 0; i < n; i++) {
            if (a[i][col] == 1) return false;
        }

        //Checking for the left diagonal
        for(int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if(a[i][j] == 1) return false;
        }
        //Checking for the right diagonal
        for(int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if(a[i][j] == 1) return false;
        }

        return true;
    }

    public static boolean nQueen(int a[][], int n, int row) {

        if (row == n) return true;

        for (int col = 0; col < n; col++) {

            if(helper(a, n, row, col)) {
                a[row][col] = 1;
                if(nQueen(a, n, row + 1)) { //Chalaaki
                    return true;
                }
                a[row][col] = 0;
            }
        }
        return false;

    }

    public static void main(String[] args) {

        int n = 4;
        int a[][] = new int[n][n];
        nQueen(a, n, 0);

        for (int array[] : a) {
            for(int e : array) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
