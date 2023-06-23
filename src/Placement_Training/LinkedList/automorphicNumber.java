package Placement_Training.LinkedList;

public class automorphicNumber {
    static boolean automorphic(int n) {

        int square = n * n;

        while(n > 0) {

            if(n % 10 != square % 10) {
                return false;
            }
            n/=10;
            square/=10;
        }
        return true;
    }
    public static void main(String[] args) {

        int n = 5;
        System.out.println(automorphic(n));
    }
}