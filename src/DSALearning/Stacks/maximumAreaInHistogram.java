package DSALearning.Stacks;

import java.util.ArrayDeque;

public class maximumAreaInHistogram {

    //BRUTE FORCE APPROACH
    static int maxAreaHistogram(int a[]) {

        int n = a.length;
        int max = 0;

        for(int i = 0; i < n; i++) {
            int l = i, r = i;
            while(l >= 0 && a[l] >= a[i]) l--;
            while(r < n && a[r] >= a[i]) r++;

            int width = r - l - 1;
            int curArea = a[i] * width;

            max = Math.max(max, curArea);
        }
        return max;
    }

    //OPTIMIZED APPROACH
    static int[] previousSmaller(int a[]) {
        int ans[] = new int[a.length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i = 0 ; i < a.length; i++) {
            int e = a[i];
            while(!stack.isEmpty() && a[stack.peek()] >= e) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                ans[i] = -1;
            }
            else {
                ans[i] = stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }

    static int[] nextSmaller(int a[]) {
        int ans[] = new int[a.length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i = a.length-1 ; i >= 0; i--) {
            int e = a[i];
            while(!stack.isEmpty() && a[stack.peek()] >= e) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                ans[i] = a.length;
            }
            else {
                ans[i] = stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }

    static int maxAreaInHistogramOptimised(int a[]) {

        int ps[] = previousSmaller(a);
        int ns[] = nextSmaller(a);

        int max = 0;
        for(int i = 0; i < a.length; i++) {
            int width = ns[i] - ps[i] - 1;
            int curArea = width * a[i];
            max = Math.max(max, curArea);
        }
        return max;
    }
    public static void main(String[] args) {

        int a[] = {4, 2, 1, 4, 3, 0, 2, 3};
//        System.out.println(maxAreaHistogram(a));
        System.out.println(maxAreaInHistogramOptimised(a));
    }
}
