package DSALearning.MathsBasics2;


public class printingDivisorsOfN {

    public static void printDivisors(int n) {

        for(int i = 1; i*i <= n; i++) {
            if(n % i == 0) {
                System.out.println(i);
                if (n/i != i) System.out.println(n/i);
            }
        }
    }



    public static void main(String[] args) {
        int n = 30;
        printDivisors(n);
    }
}
