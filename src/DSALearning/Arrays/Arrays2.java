package DSALearning.Arrays;

import java.util.*;

public class Arrays2 {

    static void leadersInArray(int a[]) {

        int largest = Integer.MIN_VALUE;
        int n = a.length;
        for (int i = n-1; i >= 0; i--) { //looping from back
            if (a[i] > largest) {
                largest = a[i];
                System.out.println(a[i] + " ");
            }
        }
    }

    static int maxmSumSubarray(int a[]) {

        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            curSum += a[i];
            if (maxSum < curSum) {
                maxSum = curSum;
//                System.out.println(curSum);
//                System.out.println(maxSum);
            }
            if (curSum < 0) {
                curSum = 0;
            }
        }
        return maxSum;
    }

    static int containerWithMostWater(int a[]) {

        int maxArea = 0;
        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            int height = Math.min(a[left], a[right]);
            int distance = right - left;

            int area = height * distance;
            maxArea = Math.max(maxArea, area);

            if (a[left] < a[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;
    }

    static boolean subarrayWithZeroSum(int a[]) {

        int n = a.length;
        Set<Integer> set = new HashSet<>();
        //Set is basically used for unique elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if(set.contains(sum)) {
                return true;
            }
            set.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {

//        int a[] = {16,17,4,3,5,2};
//        leadersInArray(a);
//        int a[] = {6, -3, 4, -2, 1, 5, -4};
//        System.out.println(maxmSumSubarray(a));

//        int a[] = {1,8,6,2,5,4,8,3,7};
//        System.out.println(containerWithMostWater(a));

        int a[]  = {2, 3, 1, -4, 4, -2};
        System.out.println(subarrayWithZeroSum(a));
    }
}



//a[] = {6, -3, 4, -2, 1, 5, -4};
//
//subarray = sub part of an array
//        (6, -3), {6, -3, 4}, {-3, 4};
