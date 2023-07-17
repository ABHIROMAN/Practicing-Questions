package DSALearning.Stacks;

import java.util.ArrayDeque;

public class maximumAreaSubmatrix {

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
                int width = ns[i] - ps[i] - 1;  // r - l - 1
                int curArea = width * a[i];
                max = Math.max(max, curArea);
            }
            return max;
        }

        static int maxAreaSubmatrix(int a[][]) {

            int b[] = new int[a[0].length];
            int max = maxAreaInHistogramOptimised(b);

            for(int i = 1; i < a.length; i++) {
                for(int j = 0; j < b.length; j++) {
                    if(a[i][j] == 0) {
                        b[j] = 0;
                    }
                    else {
                        b[j]++;
                    }
                }
                int cur = maxAreaInHistogramOptimised(b);
                max = Math.max(max, cur);
            }
            return max;
        }
        public static void main(String[] args) {

            int a[][] = {
                    {1, 1, 0, 1},
                    {1, 1, 1, 1},
                    {1, 1, 1, 1},
                    {1, 1, 0, 0}
            };
            System.out.println(maxAreaSubmatrix(a));
        }
    }
