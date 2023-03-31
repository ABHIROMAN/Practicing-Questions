package javaDSAPrac.ArraysBasics;

public class removeDuplicateSortedArray {
    public static int removeDuplicates(int a[]) {

        int j = 0;
        for(int i = 1; i < a.length; i++) {
            if(a[i] != a[j]) {
                a[j+1] = a[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {

        int a[] = {2, 2, 3, 4, 4, 7, 7, 7};

        int index = removeDuplicates(a);
        System.out.println(index);
        for(int e : a) {
            System.out.print(e);
        }
    }
}