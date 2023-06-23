package Placement_Training.LinkedList;

public class extractGreatestNumberFromString {

    static int extractMaximum(String s) {

        int num = 0, ans = 0;

        for(int i = 0; i < s.length(); i++) {

            if(Character.isDigit(s.charAt(i))) {
                ans = ans * 10 + (s.charAt(i)- '0');
            }
            else {
                ans = Math.max(ans, num);
            }
        }
        return Math.max(ans, num);
    }

    static int extractMaxMethod2(String s) {
        int i = 0, max = 0;
        while(i < s.length()) {

            String s1 = "";
            while(s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                s1 = s1 + s.charAt(i);
                i++;
            }
            max = Math.max(Integer.parseInt(s1), max);
            i++;
        }
        return max;
    }

    public static void main(String[] args) {

        String s = "875Hello@68217";
//
        System.out.println(extractMaxMethod2(s));
    }
}
