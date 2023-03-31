package javaDSAPrac.Arrays1;

public class trappingRainWater {

    static int trapRainWater(int a[]) {

        int ans = 0;

        int leftMax = 0, rightMax = 0;
        int left = 0, right = a.length - 1;

        while(left < right) {

            if(a[left] <= a[right]) {
                if(a[left] > leftMax) leftMax = a[left];
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

    public static void main(String[] args) {

        int a[] = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(trapRainWater(a));
    }
}