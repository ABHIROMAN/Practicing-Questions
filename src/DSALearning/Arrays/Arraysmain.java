package DSALearning.Arrays;

import java.util.Scanner;

public class Arraysmain {

    public static  int linearSearch(int arr[], int key) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int delete(int arr[], int key) {

        int i = 0;
        int n = arr.length;

        for(; i < n; i++) {
            if (arr[i] == key) {
                break;
            }
        }
        if (i == n) return -1;

        for(int j = i; j < n-1; j++) {
            arr[j] = arr[j + 1];
        }
        return n - 1;
    }

    public static int largest(int arr[]) {

        int large = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > large) {
                large = arr[i];
            }
        }
        return large;
    }

    public static int secondLargest(int arr[]) {

        if(arr.length < 2) return -1;

        int largest = 0;
        int secondLargest = -1;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[largest]) {
                secondLargest = largest;
                largest = i;
            }
            else if(arr[i] < a[largest]) {
                if(secondLargest == -1 || arr[i] > arr[secondLargest]) {
                    secondLargest = i;
                }
            }
        }
        return secondLargest;

    }







    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int key = 6;
        int arr[] = {1, 6, 7, 5, 4};

//        System.out.println(key + " is found at: "+ linearSearch(arr, key));

        delete(arr, key);

        for(int e : arr) {
            System.out.println(e);
        }

        System.out.println("Largest number "+ largest(arr));
    }
}
