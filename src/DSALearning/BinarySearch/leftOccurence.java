package DSALearning.BinarySearch;

public class leftOccurence {

    static int leftOccur(int a[], int key) {
        int l = 0;
        int r = a.length - 1;
        int ans = -1;

        while (l <= r) {
            int mid = (l + r)/2;
            if(a[mid] == key) {
                ans = mid;
                r = mid - 1;
            }
            if(key > a[mid]) l = mid + 1;
            else r = mid - 1;
        }
        return ans;
    }

    public static void main(String[] args) {

        int a[] = {1, 1, 2,  2, 4, 5, 9, 9, 9,  11, 13};
        int key = 9;
        System.out.println(leftOccur(a, key));
    }
}
