package Placement_Training.LinkedList;

public class busTicket {

    static int check(int a[], int fare) {

        int start = 0;
        int rear = a.length;
        int sum = 0;
        for(int i = 0; i < rear; i++) {
            sum += a[i] * fare;
        }
        return sum;
    }



    public static void main(String[] args) {

        int a[] = {1, 2, 8, 4};
        int fare = 5;

        System.out.println(check(a, fare));
    }
}
