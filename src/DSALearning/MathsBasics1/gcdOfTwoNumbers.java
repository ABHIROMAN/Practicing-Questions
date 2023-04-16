package DSALearning.MathsBasics1;

public class gcdOfTwoNumbers {

    static int gcd(int a, int b) {

        if (a == b) return a;

        if (a < b) return gcd(b, a);

        return gcd(a - b, b);
    }

    static int gcdModified(int a, int b) {

        if (a < b) return gcdModified(b, a);

        if (a % b == 0) return b;

        return gcdModified(a % b, b);
    }

    static int lcm(int a, int b) {

        int ans;
        ans = (a * b) / gcdModified(a, b);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(gcdModified(24, 36));
        System.out.println(lcm(24, 36));
    }
}
