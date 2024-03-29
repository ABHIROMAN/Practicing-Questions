package DSALearning.Strings;

public class reversingWordsInString {

    static void reverseCharacters(char[] a, int i, int j) {

        while(i < j) {
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i++;
            j--;
        }
    }

    static String reverseWords(String s) {

        char[] c = s.toCharArray();

        int start = 0;
        int end = 0;

        for(; end < s.length(); end++ ) {
            if(c[end] == ' ') {
                reverseCharacters(c, start, end-1);
                start = end + 1;
            }
        }
        reverseCharacters(c, start, end-1); //This is for reversing the last word

        reverseCharacters(c, 0, s.length()-1);
        return new String(c);
    }

    public static void main(String[] args) {

        String s = "I am the boss";

        String ans = reverseWords(s);
        System.out.println(ans);
    }
}
