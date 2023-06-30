package Placement_Training.LinkedList;

import java.util.*;
public class SieveOfEratosthenes {
    public static void sieveEratosthenes(int n){
        boolean checkPrime[] = new boolean[n+1];
        Arrays.fill(checkPrime, true);

        for(int i = 2; i*i <= n; i++) {
            if(checkPrime[i]) {
                for(int j = i*i; j<=n; j+=i) {
                    checkPrime[j] = false;
                }
            }
        }
        for(int i = 2; i<=n; i++) {
            if(checkPrime[i]) System.out.println(i);
        }
    }

    public static void main(String[] args) {

        sieveEratosthenes(20);
    }
}
