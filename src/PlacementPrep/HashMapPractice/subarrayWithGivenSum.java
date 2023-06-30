package PlacementPrep.HashMapPractice;

import java.util.*;
public class subarrayWithGivenSum {
    static List<Integer> subarraySum(List<Integer> a, int target) {

        int sum = 0;
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);

            if(sum == target) {
                return a.subList(0, i+1);
            }
            if(set.contains(sum - target)) {

                int start = a.indexOf(sum - target) + 1;

                return a.subList(start, i+1);
            }
            set.add(sum);
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(15, 2, 4, 8, 9, 5, 10, 23);
        List<Integer> subarray = subarraySum(arr, 23);

        if(subarray.isEmpty()) {
            System.out.println("No subarray found");
        }
        else {
            System.out.print("Subarray :- ");

            for(int i : subarray) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}