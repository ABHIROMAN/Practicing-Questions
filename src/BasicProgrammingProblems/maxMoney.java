package BasicProgrammingProblems;

import java.util.Scanner;

public class maxMoney {

    int bSearch(int arr[], int l, int r, int x) {
        if(r >= 1) {
            int mid = l + (r-1)/2;
            if(arr[mid] == x) return mid;

            if(arr[mid] > x) return bSearch(arr, l, mid+1, x);

            return bSearch(arr, mid+1, r, x);
        }
        return -1;
    }
    public static void main(String[] args) {




//        Scanner sc = new Scanner(System.in);
//
//        int totalPlaces = sc.nextInt();
//        int totalRoutes = sc.nextInt();
//
//        int N = sc.nextInt();
//
//        int cost = 0;
//        while (N-- > 0) {
//            int pickupPosn = sc.nextInt();
//            int destPosn = sc.nextInt();
//            cost = sc.nextInt();
//
//            for (int i = 0; i < N; i++) {
//                int ans = pickupPosn - destPosn;
//                cost += ans;
//            }
//
//        }
//        System.out.println(cost);

//        int x = 1;
//        for(int i = 1; i<=128; i+=i) {
//            x += x;
//        }
//        System.out.println(x);


    }
}
