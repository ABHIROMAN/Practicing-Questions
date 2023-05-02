package DSALearning.BitManipulation;

public class checkPowerOfTwo {

    static boolean isPowerOfTwo(int n) {

        int res = n & (n - 1);

        if (res == 0) {
            System.out.println("Power of 2");
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {

        isPowerOfTwo(16);
    }
}
