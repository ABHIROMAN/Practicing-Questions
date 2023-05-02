package DSALearning.BitManipulation;

public class findTheithBit {

    //5 --> 000000101
    // mask --> 1 << 2 ==> 000000100
    static int findIthBit(int n, int i) {

        int mask = 1 << i;

        int result = n & mask;

        if(result == 0) return 0;

        else return i;
    }

    public static void main(String[] args) {

        int n = 5;
        System.out.println(findIthBit(n, 2));
    }
}
