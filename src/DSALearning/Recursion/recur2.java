package DSALearning.Recursion;

public class recur2 {

    static void towerOfHanoi(int n, char from, char to, char aux) {

        if (n == 0) return;

        towerOfHanoi(n-1, from, aux, to);
        System.out.println("Move "+n+" from "+from+" to "+to);
        towerOfHanoi(n-1, aux, to, from);
    }

    static int powerUsingRecur(int n, int p) {

        if (p == 0) return 1;
        if (p == 1) return n;

        else return n * powerUsingRecur(n, p-1);
    }

    public static void main(String[] args) {

//        towerOfHanoi(3, 'A','C','B');

        System.out.println(powerUsingRecur(2, 3));
    }
}
