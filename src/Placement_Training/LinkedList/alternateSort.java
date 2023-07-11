package Placement_Training.LinkedList;

import java.util.ArrayList;
import java.util.*;
public class alternateSort {

        static void alternateSorting(int arr[], int n)
        {
            ArrayList<Integer> temp = new ArrayList<>();

            for(int i = 0; i < arr.length; i++) {
                if(i % 2 == 0) {
                    temp.add(arr[i]);
                }
            }
            Collections.sort(temp);

            System.out.println(temp);
        }

        public static void main (String[] args)
        {
            int a[] = {5, 1, 4, 7, 9};
            int n = a.length;
            alternateSorting(a, n);
        }
    }