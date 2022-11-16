package CodeStudio;

import java.util.*;

public class diffPrimeFactor {
    public static int check(int n) {

        Set<Integer> a = new HashSet<>();
        int save = n;
        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                a.addAll(Arrays.asList(i));
                n /= i;
            }
            else
                i++;
        }

        Object r = Collections.min(a);
        int min = (int) r;
        return (save - min);

    }

    public static void main(String[] args) {
        int n = 350;
        System.out.println(check(n));
    }
}
