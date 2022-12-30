package javaDSAPrac.ArraysBasics;

public class removeDupl {

    static int removeDupli(int arr[], int n) {

        if(n == 0 || n == 1) return n;

        int temp[] = new int[n];

        int j = 0;
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] != arr[i+1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1]; //Adding last element

        for(int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

    //Optimised approach
    static int removeDupliOptimised(int arr[], int n) {

        if(n == 0 || n == 1) return n;

        int j = 0;

        for(int i = 0 ; i < n - 1; i++) {
            if(arr[i] != arr[i+1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n-1];
        return j;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,2,3,4,4,4,5,5};
        int n = arr.length;

        n = removeDupliOptimised(arr, n);

        for(int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
