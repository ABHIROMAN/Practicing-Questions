package DSALearning.Queues;

public class circularTour {

    static int circularTourProblem(int p[], int d[]) {

        int n = p.length;
        int start = 0;
        int cur = 0;
        int prev = 0;

        for(int i = 0; i < n; i++) {
            cur += (p[i] - d[i]);
            if(cur < 0) {
                prev += cur;
                cur = 0;
                start = i + 1;
            }
        }
        if(cur + prev >= 0) return start;
        return -1;
    }

    public static void main(String[] args) {

        int p[] = {6, 10, 2, 3, 20};
        int d[] = {5, 8, 4, 5, 6};

        System.out.println(circularTourProblem(p, d));
    }
}
