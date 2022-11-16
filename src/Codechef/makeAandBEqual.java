package Codechef;

import java.util.*;

public class makeAandBEqual {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T > 0) {

            int A = sc.nextInt();
            int B = sc.nextInt();

            if (A == B) System.out.println("YES");
            if (A < B) {
                while (A > 0) {
                    int ans = A * 2;
                    if (ans == B) {
                        System.out.println("YES");
                        break;
                    } else if (ans > B) {
                        System.out.println("NO");
                        break;
                    }
                }
            } else if(B > A) {
                while (B > 0) {
                    int ans = B * 2;
                    if(ans == A) {
                        System.out.println("YES");
                        break;
                    } else if (ans > A) {
                        System.out.println("NO");
                        break;
                    }
                }
            }
            T--;
        }
    }
}
