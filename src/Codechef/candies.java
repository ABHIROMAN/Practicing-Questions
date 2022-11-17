package Codechef;

import java.util.*;

public class candies {

    public static void main (String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T --> 0) {

            int n = sc.nextInt();

            HashMap<Integer, Integer> hm = new HashMap<>();

            for(int i = 0; i < 2 * n; i++) {

                int val = sc.nextInt();
                if(hm.containsKey(val)) {

                    int v = hm.get(val);
                    ++v;
                    hm.put(val, v);
                }
                else {
                    hm.put(val, 1);
                }
            }
            int check = 0;
            for(int i : hm.keySet())
                if(hm.get(i) > 2) {
                    check = 1;
                    break;
                }
            if(check == 0) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
