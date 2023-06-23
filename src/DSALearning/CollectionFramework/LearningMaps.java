package DSALearning.CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LearningMaps {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Ball", 2);
        map.put("Bat", 4);
        map.put("Wicket", 6);

        if(map.containsKey("Bat")) {
            map.put("Bat", 3);
        }
//        map.putIfAbsent("Bat", 3);

//        System.out.println(map.get("Ball"));
//        System.out.println(map);

        //For getting set of Entries
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for(Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
