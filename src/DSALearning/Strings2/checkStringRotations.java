package DSALearning.Strings2;

public class checkStringRotations {

    static boolean rotationsString(String s1, String s2) {

        if(s1.length() != s2.length()) return false;

        String doubleString = s1 + s1;

        return doubleString.contains(s2);
    }

    public static void main(String[] args) {

        String s1 = "abcd";
        String s2 = "dabc";

        System.out.println(rotationsString(s1, s2));
    }
}
