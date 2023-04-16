package DSALearning.MathsBasics2;

import java.util.Arrays;

public class sieveOfEratosthenes {

    public static void sieveEratosthenes(int n) {

        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                // updating all multiples of i greater then or equal to the square of it's numbers
                // which are multiple of i and are less the i square are already been marked.
                for (int j = i*i; j <= n; j += i) { //
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 2; i <= n; i++) {
            if(isPrime[i]) System.out.println(i);
        }
    }

    public static void main(String[] args) {
        sieveEratosthenes(20);
    }
}
