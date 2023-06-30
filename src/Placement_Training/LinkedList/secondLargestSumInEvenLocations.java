package Placement_Training.LinkedList;

import java.util.*;

public class secondLargestSumInEvenLocations {

    static int secondlargestSum(int a[]) {

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        even.add(a[0]);

        for(int i = 1; i < a.length; i++) {
            if(i % 2 == 0) even.add(a[i]);
            else odd.add(a[i]);
            }
        Collections.sort(even);
        Collections.sort(odd);

        return even.get(even.size()-2) + odd.get(odd.size()-2);

        }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(secondlargestSum(arr));
    }


}

