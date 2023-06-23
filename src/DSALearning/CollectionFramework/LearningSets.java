package DSALearning.CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearningSets {

    public static void main(String[] args) {

//        Set<String> set = new HashSet<>();
//        Set<String> set = new TreeSet<>(); //returns in Sorted format
        Set<String> set = new LinkedHashSet<>(); //maintains the order of Inserting

        set.add("Kiwi");
        set.add("Apple");
        set.add("Mango");
        set.add("Orange");

//        set.add(10);
//        set.add(45);
//        set.add(20);
        System.out.println(set);
    }
}
