package DSALearning.Heaps;

public class insertingInHeaps {

    int a[];
    int capacity;
    int n;

    public insertingInHeaps(int capacity) {

        this.capacity = capacity;
        n = 0;
        a = new int[capacity + 1];
    }

    private void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void insert(int key) throws Exception {

        if (n == capacity) throw  new Exception("Heap is full");

        n = n + 1;
        a[n] = key;

        int i = n;
        while(i > 1) {
            int parent = i/2;
            if(a[parent] > a[i]) {
                swap(parent, i);
                i = parent;
            }
            else return;
        }
    }

    //delete and return the minimum element
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

    void printHeap() {

        for(int e : a) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    int size() {
        return n;
    }

    public static void main(String[] args) throws Exception {

        insertingInHeaps minHeap = new insertingInHeaps(4);
        minHeap.insert(2);
        minHeap.insert(10);
        minHeap.printHeap();

        System.out.println(minHeap.extractMin());
        minHeap.printHeap();

        minHeap.insert(16);
        minHeap.insert(1);
        minHeap.printHeap();

        System.out.println(minHeap.extractMin());
        minHeap.printHeap();
    }
}