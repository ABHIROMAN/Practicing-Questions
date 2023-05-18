package DSALearning.SortingAlgorithms;

public class insertionSortAlgorithm {

    static void insertionSort(int a[])
    {                                         // 0 1 2 3 4 5 6  (0 - based indexing)
                                              // 1 2 3 4 5 6 7 (1 - based indexing)
        for(int i = 0; i < a.length-1; i++) { // 1 2 6 7 8 6 5  Array

        }
        for(int i = 1; i < a.length; i++) {
            int j = i - 1 ;
            int temp = a[i];
            for(; j >= 0; j--) {
                if(temp < a[j]) {
                    a[j + 1] = a[j];
                }
                else {
                    break;
                }
            }
            a[j + 1] = temp;
        }
    }

    public static void main(String[] args) {

        int a[] = {9, 5, 2, 6, 3, 1, 3};
        insertionSort(a);

        for(int e : a) {
            System.out.print(e + " ");
        }
    }
}
