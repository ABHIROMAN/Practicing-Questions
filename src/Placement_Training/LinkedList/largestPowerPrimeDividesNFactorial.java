package Placement_Training.LinkedList;

public class largestPowerPrimeDividesNFactorial {

    static int getPowerPrime(int fact , int p) {

        int ans = 0;
        while(fact > 0) {
            ans += fact/p;
            fact/=p;
        }
        return ans;
    }

    public static void main(String[] args) {

        int fact = 5, n = 2;
        System.out.println(getPowerPrime(fact, n));
    }
}


















//    static int sumOfAllFactors(int fact, int n) {
//
//        int ans = Integer.MAX_VALUE;
//
//        for(int i = 2; i <= Math.sqrt(n); i++) {
//
//            int count = 0;
//            if (n % i == 0) {
//                count++;
//                n = n/i;
//            }
//            if(count > 0) {
//                int currentPower = getPowerPrime(fact, i)/count;
//                ans = Math.min(ans, currentPower);
//            }
//        }
//        if(n >= 2) {
//            int currentPower = getPowerPrime(fact, n);
//            ans = Math.min(ans, currentPower);
//        }
//        return ans;
//    }


//fact = 146, n=15
//        First find the prime factor of 15 that are 3
//        and 5 then first divide with 3 and add i.e.
//
//        Applying Legendre’s formula for prime
//        factor 3.
//        [146/3]+[48/3]+[16/3]+[5/3]+[1/3] = 70
//        48  +   16  +  5  +  1  +  0   = 70
//        There is 70 is maximum power of 3 prime number.
//        146! is divisible by 3^70 which is maximum.
//
//        Applying Legendre’s formula for prime
//        factor 5.
//        [146/5]+[29/5]+[5/5]+[1/5] = 35
//        29  +   5  +  1  +  0   = 35
//        There is 35 is maximum power of 5 prime
//        number.