package Placement_Training.LinkedList;

public class sqaureMatrixPattern {
        public static void main(String[] args) {
            int[][] matrix = {{1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};

            int n = matrix.length;

            // Printing the main diagonal
            for (int i = 0; i < n; i++) {
                System.out.println(matrix[i][i]);
            }

            // Printing the secondary diagonal
            for (int i = 0; i < n; i++) {
                System.out.println(matrix[(n - 1) - i][i]);
            }
        }
    }