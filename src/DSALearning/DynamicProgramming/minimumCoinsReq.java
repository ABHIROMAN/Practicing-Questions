package DSALearning.DynamicProgramming;

public class minimumCoinsReq {

    static int minCoins(int a[], int n) {
        if(n == 0) return 0;
        if(n < 0) return Integer.MAX_VALUE;

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < a.length; i++) {
            min = Math.min(min, minCoins(a, n-a[i]));
        }
        return min + 1;
    }

    public static void main(String[] args) {

        int a[] = {8, 6, 1};
        int n = 13;

        System.out.println(minCoins(a, n));
    }

}
