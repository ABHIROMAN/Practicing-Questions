package DSALearning.HashingBasics;

import java.util.HashMap;
//import java.util.Map;

public class freqOfElementsInArray {

    static void freqOfEle(int a[]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int e : a) {
            if(map.containsKey(e)) {
                int temp = map.get(e);
                map.put(e, temp+1);
            }
            else {
                map.put(e, 1);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {

        int a[] = {1, 1, 2, 3, 1, 2, 3, 4};
        freqOfEle(a);
    }
}
