package Placement_Training.LinkedList;

import java.util.*;
public class stroboGrammaticNumber {
    public static boolean checkNumber(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        HashMap < Character, Character > map = new HashMap < Character, Character > ();
        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');
        map.put('6', '9');
        map.put('9', '6');
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (!map.containsKey(s.charAt(right)) || s.charAt(left) != map.get(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String n = "10801";
        System.out.println("Is " + n + " is Strobogrammatic? " + checkNumber(n));
    }
}
