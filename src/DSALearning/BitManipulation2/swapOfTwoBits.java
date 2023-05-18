package DSALearning.BitManipulation2;

public class swapOfTwoBits {

    static int swapTwoBit(int n, int i, int j) {

        int ith = (n >> i) & 1;
        int jth = (n >> j) & 1;

        int xor = ith ^ jth;

        if(xor == 0) return n;

        int mask = (1 << i) | (1 << j);
        return n ^ mask;
    }

    public static void main(String[] args) {

        System.out.println(swapTwoBit(10, 1, 2));
    }
}
