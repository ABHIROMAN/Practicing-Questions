package Codechef;
import java.util.*;

public class dominatingNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T > 0) {

            int N = sc.nextInt();

            int A[] = new int[N];
            for(int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            boolean flag = false;

            for (int i = 0; i < N; i++) {
                int count = 0;
                for (int j = 1; j < i; j++) {
                    if (A[i] == A[j]) count++;
                }
                if (count >= 1) {
                    flag = true;
                }
            }
            if (flag) {
                System.out.println("YES");
            } else System.out.println("NO");

            T--;
        }
    }
}

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t != 0){
            int l = in.nextInt();
            int[] arr = new int[l];
            for (int i = 0; i < l; i++) {
                arr[i] = in.nextInt();
            }
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < l; i++) {
                if (map.containsKey(arr[i])){
                    map.put(arr[i], map.get(arr[i]) + 1);
                }
                else {
                    map.put(arr[i], 1);
                }
            }
            int[] values = new int[map.size()];
            int a = 0;
            for(int v: map.values()){
                values[a++] = v;
            }
            Arrays.sort(values);
            // System.out.println(Arrays.toString(values));

            int n = map.size() - 1;

            if( map.size() > 1 && values[n] - values[n-1] == 0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            t--;
        }
    }
}
