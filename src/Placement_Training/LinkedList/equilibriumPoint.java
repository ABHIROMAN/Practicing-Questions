package Placement_Training.LinkedList;

public class equilibriumPoint {
    static int equilibriumIndex(int a[], int n) {
        int sum = 0;

        for(int i = 0; i<n; i++) {
            sum+= a[i];
        }

        int left = 0;
        for(int i = 0; i<n; i++) {
            int right = sum - left - a[i];

            if(right == left){
                return i;
            }

            left+= a[i];
        }
        return -1;
    }
    public static void main(String[] args) {

        int a[] = {10, 2, 8, 4, -2, 0};
        System.out.println("Equilibrium Index : " + equilibriumIndex(a, a.length));
    }
}
