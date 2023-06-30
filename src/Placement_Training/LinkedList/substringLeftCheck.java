package Placement_Training.LinkedList;

public class substringLeftCheck {
    static String isSafe(String s1, String s2) {

        int index = s1.indexOf(s2);

        if(index != -1) {
            return s1.substring(index + s2.length());
        }
        else {
            return s1;
        }
    }


    public static void main(String[] args) {


        String ans = isSafe("Tiger", "Ti");
        System.out.println(ans);
    }
}
