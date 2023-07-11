package Placement_Training.LinkedList;

import java.util.*;
public class swapContentsAndIndexesOfArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n;
            int[] a = new int[20];
            int[] res = new int[20];

            System.out.print("Enter n: ");
            n = sc.nextInt();

            System.out.print("Enter array elements: ");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                res[a[i]] = i;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(res[i] + " ");
            }
        }
    }