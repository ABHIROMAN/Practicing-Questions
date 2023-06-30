package Placement_Training.LinkedList;

public class possibleHandshakes {

    static int fact(int n) {

        if(n == 0) return 1;

        return n * fact(n - 1);
    }


    public static void main(String[] args) {

        int n = 1;
        int r = 2;

        if(n == 1) System.out.println(0);
        else {
            System.out.println(fact(n) / (fact(n - r) * fact(r)));
        }
    }
}
