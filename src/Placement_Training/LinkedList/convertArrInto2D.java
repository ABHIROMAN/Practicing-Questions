package Placement_Training.LinkedList;


public class convertArrInto2D {
    public static void main(String[] args) {
        int[] oneDArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int rows = 3; // Number of rows in the 2D array
        int columns = 3; // Number of columns in the 2D array

        int[][] twoDArray = convertTo2DArray(oneDArray, rows, columns);


        // Print the 2D array
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] convertTo2DArray(int[] oneDArray, int rows, int columns) {
        if (oneDArray.length != rows * columns) {
            throw new IllegalArgumentException("Invalid array dimensions");
        }

        int[][] twoDArray = new int[rows][columns];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                twoDArray[i][j] = oneDArray[index];
                index++;
            }
        }
        return twoDArray;
    }
}