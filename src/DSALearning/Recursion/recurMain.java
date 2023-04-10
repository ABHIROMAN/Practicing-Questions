package DSALearning.Recursion;

import java.util.*;

public class recurMain {


    static void generateAllSubsets(String s) {

        Set<String> set = new HashSet<>();
        genAllSubHelper(s, 0, "", set);

        for (String st : set) {
            System.out.println(st);
        }

    }
    static void genAllSubHelper(String s, int i, String cur, Set<String> set) {

        if (i == s.length()) {
            set.add(cur);
            return;
        }
        genAllSubHelper(s, i+1, cur, set);
        genAllSubHelper(s, i+1, cur + s.charAt(i), set);
    }
    static int sumOfNNaturalNumber(int N) {

        if(N == 0) return 0; // Base case

        int subProblem  = sumOfNNaturalNumber(N - 1);

        return subProblem + N;
    }

    static int countPathInMatrix(int n, int m) {

        if (n == 1 || m == 1) return 1;

        int rightSideAnswer = countPathInMatrix(n, m-1);
        int downSideAnswer = countPathInMatrix(n-1, m);

        return rightSideAnswer + downSideAnswer;
    }

    static int sumOfDigits(int n) {

        if (n == 0) return 0;

        int lastDigit = n % 10;

        return lastDigit + sumOfDigits(n/10);
    }


    public static void main(String[] args) {

//        int N = 5;
//        System.out.println(sumOfNNaturalNumber(N));

//        System.out.println(countPathInMatrix(4, 3));
//        System.out.println(sumOfDigits(123456));
        generateAllSubsets("Happiness");
    }
}
