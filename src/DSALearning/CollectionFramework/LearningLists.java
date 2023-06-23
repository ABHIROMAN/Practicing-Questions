package DSALearning.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class LearningLists {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> list2 = new Stack<>();

        list.add(10);
        list.add(20);
        list.add(30); // O(1)
        list.add(40);

        System.out.println(list);

        list2.add(300);
        list2.add(400);

        list.addAll(list2);
        list.set(1, 12); // O(1)
        list.remove(4); // O(n)
        list.add(0, 23);

        System.out.println(list);
        System.out.println(list.contains(null));

        for(int i =0; i < list.size(); i++) {
            System.out.print(list.get(i) * 2 + " ");
        }
        System.out.println();

        for(int e : list) {
            System.out.print(e * 2 + " ");
        }

        Iterator<Integer> lt = list.iterator();
        while(lt.hasNext()) {
            System.out.print(lt.next() + " ");
        }

        System.out.println(list.get(0));
    }
}
