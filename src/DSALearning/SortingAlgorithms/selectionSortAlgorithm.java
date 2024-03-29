package DSALearning.SortingAlgorithms;

public class selectionSortAlgorithm {

    static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void selectionSort(int a[]) {

        for(int i = 0; i < a.length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < a.length; j++) {
                if(a[j] < a[min]) {
                    min = j;
                }
            }
            swap(a, min, i);
        }
    }

    static void printArray(int a[]) {
        for(int e : a) {
            System.out.print(e + " ");
        }
    }


    public static void main(String[] args) {

        int a[] = {9, 5, 2, 6, 1, 3, 1, 3};
        selectionSort(a);
        printArray(a);
    }
}
