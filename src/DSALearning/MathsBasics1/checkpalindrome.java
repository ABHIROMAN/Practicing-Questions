package DSALearning.MathsBasics1;

public class checkpalindrome {
    static boolean palindrome(int n) {

        int rev = 0;
        int temp = n;

        while (temp > 0) {
            int ld = temp % 10;
            rev = rev * 10 + ld;
            temp /= 10;
        }
        return n == rev;
    }
    public static void main(String[] args) {

        int n = 1441;

        System.out.println(palindrome(n));
    }
}
