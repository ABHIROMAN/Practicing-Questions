package DSALearning.BinarySearch;

public class squareRootOfInteger {

    static int sqrt(int n) {

        int ans = 1;
        int l =1 , r = n;
        while(l <= r) {
            int mid = (l + r)/2;
            int midSq = mid * mid;
            if(midSq == n) return mid;
            if(midSq > n) r = mid - 1;
            else {
                ans = mid;
                l = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int n = 37;
        System.out.println(sqrt(n));
    }
}
