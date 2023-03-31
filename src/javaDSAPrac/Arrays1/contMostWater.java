package javaDSAPrac.Arrays1;

public class contMostWater {

    static int containerWithMostWater(int a[]) {

        int maxArea = 0;

        int left = 0;

        int right = a.length - 1;

        while(left < right) {

            int height = Math.min(a[left], a[right]);
            int distance = right - left;

            int area = height * distance;
            maxArea = Math.max(maxArea, area);

            if(a[left] < a[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {

        int a[] = {1,8,6,2,5,4,8,3,7};

        System.out.println(containerWithMostWater(a));
    }
}
