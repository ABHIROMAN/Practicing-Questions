package DSALearning.Heaps;

public class heapSortAlgorithm {

    int a[];
    int capacity;
    int n;

    public heapSortAlgorithm(int a[]) {
        this.a = a;
        this.capacity = a.length - 1;
        this.n = a.length - 1;
        buildHeap();
    }

    public heapSortAlgorithm(int capacity) { //MinHeap
        this.capacity = capacity;
        n = 0;
        a = new int[capacity + 1];
    }

    private void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    int extractMin() throws Exception {
        if(n == 0) throw new Exception("Heap is Empty");
        int result = a[1];
        a[1] = a[n];
        n--;

        //heapify()
        int i = 1;
        while(i <= n) {
            int left = 2 * i;
            int right = 2 * i + 1;

            int smallest = i;
            if(left <= n && a[left] < a[smallest]) {
                smallest = left;
            }
            if(right <= n && a[right] < a[smallest]) {
                smallest = right;
            }
            if(smallest != i) {
                swap(smallest, i);
                i = smallest;
            }
            else break;
        }
        return result;
    }

    void heapify(int i) {
        while(i <= n) {
            int left = 2 * i;
            int right = 2 * i + 1;

            int smallest = i;
            if(left <= n && a[left] < a[smallest]) {
                smallest = left;
            }
            if(right <= n && a[right] < a[smallest]) {
                smallest = right;
            }
            if(smallest != i) {
                swap(smallest, i);
                i = smallest;
            }
            else break;
        }
    }

    //O(n) builds a heap from a given array
    void buildHeap() {
        for(int i = n; i>0; i--) {
            heapify(i);
        }
    }

    void heapSort() throws Exception {
        int newN = n;
        for(int i = 1; i <= newN; i++) {
            int x = extractMin();
            System.out.print(x + " ");
        }
    }

    void printHeap() {

        for(int e : a) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {

        int a[] = {0, 2, 9, 4, 7, 1, 6, 8};
        heapSortAlgorithm minHeap = new heapSortAlgorithm(a);
        minHeap.printHeap();
        minHeap.heapSort();
    }
}
