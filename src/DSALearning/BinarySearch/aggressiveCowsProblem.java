package DSALearning.BinarySearch;

public class aggressiveCowsProblem {

    static boolean canAccomodate(int a[], int k, int dis) {
        int prev = a[0];
        int cows = 1;
        for(int i = 1; i < a.length; i++) {
            if(a[i] - prev >= dis) {
                cows++;
                prev = a[i];
                if(cows == k) return true;
            }
        }
        return false;
    }

    static int aggressiveCows(int a[], int k) {

        if(a.length < k) return -1;
        int l = 1;
        int r = a[a.length - 1];
        int ans = -1;
        while(l <= r) {
            int mid = (l + r) / 2;
            if(canAccomodate(a, k, mid)) {
                ans = mid;
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int a[] = {1, 2, 4, 8, 9};
        int k = 3;

        System.out.println(aggressiveCows(a, k));
    }
}
