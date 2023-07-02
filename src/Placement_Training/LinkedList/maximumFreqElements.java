package Placement_Training.LinkedList;

import java.util.*;
class maximumFreqElements {

    private static void findMajority(int[] arr)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]) +1;
                if (count > arr.length /2) {
                    System.out.println("Element is :- " + arr[i]);
                    return;
                } else
                    map.put(arr[i], count);
            }
            else
                map.put(arr[i],1);
        }
        System.out.println(" No such element");
    }

    public static void main(String[] args)
    {
        int a[] = {1,1,2,3,5,5,5,5,5,5};

        findMajority(a);
    }
}