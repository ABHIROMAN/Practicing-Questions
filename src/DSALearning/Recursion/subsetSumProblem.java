package DSALearning.Recursion;

public class subsetSumProblem {

    static boolean subsetSum(int sum, int a[], int N) {

        if (N < 0) return false;
        if (sum < 0) return false;

        if (sum == 0) return true;

        return subsetSum(sum-a[N], a, N-1) || subsetSum(sum, a, N-1);
    }

    public static void main(String[] args) {

        int a[] = {3, 34, 4, 12, 5, 2};
        int sum  = 9;
        System.out.println(subsetSum(sum, a, a.length-1));
    }
}
