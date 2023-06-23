package Placement_Training.LinkedList;

public class segregate0sAnd1s {

    static void check0sand1s(int[] a, int n) {

        n = a.length;
        int left = 0, right = n-1;
        while(left <= right) {

            while(a[left]  == 0 && left < right) {
                left++;
            }
            while(a[right] == 1 && left < right) {
                right--;
            }

            if(left < right) {
                a[left] = 0;
                a[right] = 1;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {

        int a[] = {1, 1, 0, 0, 1};
        int n = a.length;
        System.out.print("Initial array is ");
        for(int e : a) {
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.print("Final array is ");
        check0sand1s(a, n);
        for(int e : a) {
            System.out.print(e + " ");
        }
    }
}
