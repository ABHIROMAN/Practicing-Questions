package Placement_Training.LinkedList;

public class checkFor1and4and9 {
    public static void printNumbers(int lowerBound, int upperBound) {

        for (int i = lowerBound; i <= upperBound; i++) {
            if (containsOnly149(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean containsOnly149(int num) {
        while (num != 0) {
            int digit = num % 10;
            if (digit != 1 && digit != 4 && digit != 9) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        int lowerBound = 100;
        int upperBound = 200;

        System.out.println("Numbers containing only 1, 4, and 9:");
        printNumbers(lowerBound, upperBound);
    }
}