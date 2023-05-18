package DSALearning.Strings;

public class checkingAnagramsOfStrings {

    static boolean anagrams(String s1, String s2) {

        int a[]  = new int[256];

        for(int i = 0; i < s1.length(); i++) {
            a[s1.charAt(i)]++;
        }

        for(int i = 0; i < s2.length(); i++) {
            a[s2.charAt(i)]--;
        }

        for(int e : a) {
            if(e != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String s1 = "abcda";
        String s2 = "adabc";

        System.out.println(anagrams(s1, s2));
//        anagrams(s1, s2);
    }
}
