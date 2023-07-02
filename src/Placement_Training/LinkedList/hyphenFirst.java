package Placement_Training.LinkedList;

    public class hyphenFirst {
        public static void main(String[] args) {
            String str = "h-e-ll-o";
            int length = str.length();

            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == '-') {
//                    str.replace('-',"");
                }
                System.out.print(str.charAt(i));
//                System.out.print("-");
            }
            System.out.println();
        }
    }


