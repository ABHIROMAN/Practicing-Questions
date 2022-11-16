package CodeStudio;

import java.util.*;

public class singleNumber {

    static int occursOnce(int a[], int n) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i = 0; i < n; i++) {
            if(freq.containsKey(a[i])) {
                freq.put(a[i], freq.get(a[i]) + 1);
            } else {
                freq.put(a[i], 1);
            }
        }
        for(Integer key : freq.keySet()) {
            if(freq.get(key) == 1) {
                return key;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        int[] a = new int[0];
//        while (T > 0) {
//
//            int N = sc.nextInt();
//            a = new int[N];
//            for (int i = 0; i < N; i++) {
//                a[i] = sc.nextInt();
//            }
//            T--;
//        }
//        int ans[] = occursOnce(a, N);
//        for (int an : ans) {
//            System.out.println(an);
//        }
    }
}
