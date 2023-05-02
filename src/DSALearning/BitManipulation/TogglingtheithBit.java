package DSALearning.BitManipulation;

public class TogglingtheithBit {

    static int toggleBit(int n, int i) {

        int mask = 1 << i;
        return n ^ mask;
    }

    public static void main(String[] args) {

        System.out.println(toggleBit(21, 4));
    }
}
