package DSALearning.BinarySearch;

public class countOccurence {

    static int totalOccurences(int a[], int key, int n) {

        int i, j;

        i = firstOccur(a, 0, n-1, key, n);

        if(i == -1) return i;

        j = lastOccur(a, i, n-1, key, n);

        return j - i + 1;
    }

    static int firstOccur(int a[], int l, int r, int key, int n) {
        
        if (r >= l) {

            int mid = (l + r)/2;
            if ((mid == 0 || key > a[mid - 1]) && a[mid] == key) {
                return mid;
            }
            else if(key > a[mid]) {
                return firstOccur(a, mid+1, r, key, n);
            }
            else {
                return firstOccur(a, l, mid-1, key, n);
            }
        }
        return -1;
    }

    static int lastOccur(int a[], int l, int r, int key, int n) {

        if (r >= l) {

            int mid = (l + r)/2;
            if ((mid == n-1 || key < a[mid + 1]) && a[mid] == key) {
                return mid;
            }
            else if(key < a[mid]) {
                return lastOccur(a, l, mid-1, key, n);
            }
            else {
                return lastOccur(a, mid+1, r, key, n);
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int a[] = {1, 1, 1, 2, 3, 3, 3, 3, 4, 6};
        int key = 3;
        int n = a.length;
        int total = totalOccurences(a, key, n);

        System.out.println(key+ " occurs " + total + " times");
    }

}
