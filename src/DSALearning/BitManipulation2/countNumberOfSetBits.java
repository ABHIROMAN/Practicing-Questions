package DSALearning.BitManipulation2;

public class countNumberOfSetBits {

    static int countSetBits(int n) {

        int count = 0;
        while(n > 0) {

            if((n & 1) == 1) {
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    static int countSetBitOptimised(int n) {

        int count = 0;

        while(n > 0) {
            count++;
            n = (n & (n - 1));
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(countSetBitOptimised(10)); //1010 --> ans = 2
    }
}
