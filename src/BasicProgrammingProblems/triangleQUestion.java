package BasicProgrammingProblems;

import java.util.*;
public class triangleQUestion {

    public static int triangleNumber(int[] arr, int n) {

        Arrays.sort(arr);
        int count = 0;
        for(int k=arr.length-1; k>1; k--){
            int i=0, j=k-1;
            while(i<j){
                if(arr[i] + arr[j] > arr[k]){
                    count += j-i;
                    j--;
                }
                else i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int a[] = {9, 19, 8, 10, 13};
        System.out.println(triangleNumber(a, a.length));

    }
}
