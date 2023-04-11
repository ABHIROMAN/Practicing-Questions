package DSALearning.Arrays;

import java.util.Arrays;

public class Arrays4 {

    static int trappingRainWater(int a[]) {

        int ans = 0;

        int leftMax = 0;
        int rightMax = 0;

        int left = 0;
        int right = a.length - 1;

        while(left < right) {
            if (a[left] <= a[right]) {
                if (a[left] > leftMax) leftMax = a[left];
                else ans += (leftMax - a[left]);
                left++;
            }
            else {
                if(a[right] > rightMax) rightMax = a[right];
                else ans += (rightMax - a[right]);
                right--;
            }
        }
        return ans;
    }

    static boolean twoSum(int a[], int sum, int left) {

        int right = a.length - 1;

        while(left < right) {
            int curSum = a[left] + a[right];

            if(curSum > sum) {
                right--;
            }
            else if(curSum < sum) {
                left++;
            }
            else {
                return true;
            }
        }
        return false;
    }

    static boolean threeSum(int a[], int sum) {

        int n = a.length;
        Arrays.sort(a);
        for(int i = 0; i < n; i++) {
            boolean check = twoSum(a, sum-a[i], i+1);
            if(check) return true;
        }
        return false;
    }


}
