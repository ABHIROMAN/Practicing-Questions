package DSALearning.BinarySearch;

public class searchRotatedSorted {

    static int searchRotated(int a[], int key) {

        int l = 0, r = a.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if(a[mid] == key) return mid;

            if(a[l] <= a[mid]) { // left part sorted
                if(key >= a[l] && key < a[mid]) { // left side present
                    r = mid - 1;
                }
                else { // right side present
                    l = mid + 1;
                }
            }
            else { // right part sorted
                if(key > a[mid] && key <= a[r]) { // right side present
                    l = mid + 1;
                }
                else { // left side present
                    r = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int a[] = {4, 5, 7, 8, 9, 1, 2, 3};
        int key = 7;
        System.out.println(searchRotated(a, key));

    }
}
