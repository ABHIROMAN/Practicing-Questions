package BasicProgrammingProblems;

import java.util.*;
public class iterationcount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 1;
        int fact = 1;

        while(fact != n) {
            fact = fact * a;
            a++;
            if(fact > n) {
                System.out.println("-1"); //if never equals
                return;
            }
        }
        System.out.println(n + " " +(a-1));
    }

}
