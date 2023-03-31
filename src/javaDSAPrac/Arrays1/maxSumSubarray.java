package javaDSAPrac.Arrays1;

public class maxSumSubarray {

    static int largestSumSubarray(int a[]) {

        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < a.length; i++) {
            curSum += a[i];
            if(curSum > maxSum) maxSum = curSum;
            if(curSum < 0) curSum = 0;
        }
        return maxSum;
    }

    public static void main(String[] args) {

        int a[] = {6, -7, 4, -2, 1, 5, -4};
        int ans = largestSumSubarray(a);

        System.out.println(ans);
    }
}
