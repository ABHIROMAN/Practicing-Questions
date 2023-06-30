package Placement_Training.LinkedList;

public class searchElementInKWindow {
    public static boolean searchInWindows(int[] a, int k, int element) {
        int n = a.length;
        for (int i = 0; i <= n - k; i++) {
            boolean found = false;
            for (int j = i; j < i + k; j++) {
                if (a[j] == element) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 4, 4, 5, 6, 4, 8};
        int k = 3;
        int element = 4;

        boolean foundInAllWindows = searchInWindows(a, k, element);
        System.out.println("Element " + element + " found in all windows of size " + k + ": " + foundInAllWindows);
    }
}
