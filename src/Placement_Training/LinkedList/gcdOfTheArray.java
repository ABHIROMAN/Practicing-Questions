package Placement_Training.LinkedList;

public class gcdOfTheArray {

    static int gcd(int a, int b) {
        if(a == 0) return b;

        return gcd(b%a, a);
    }

    static int findGcd(int a[], int n) {

        int ans = a[0];
        for(int e : a) {
            ans = gcd(ans, e);

            if(ans == 1) return 1;
        }
        return ans;
    }

    public static void main(String[] args) {

        int a[] = {2, 4, 8, 10};
        int n = a.length;

        System.out.println(findGcd(a, n));
    }
}
