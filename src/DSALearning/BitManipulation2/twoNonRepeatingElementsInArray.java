package DSALearning.BitManipulation2;

public class twoNonRepeatingElementsInArray {

    public static int[] twoNonRepeatElem(int[] a) {

        int xor = 0;

        for(int e : a) {
            xor = xor ^ e;
        }

        int temp = xor;
        int mask = xor & (~(xor-1));

        for(int e : a) {
            if((mask & e) == 0) {
                temp = temp ^ e;
            }
        }
        int firstNumber = temp;
        int secondNumber = xor ^ firstNumber;

        int res[] = new int[2];
        res[0] = firstNumber;
        res[1] = secondNumber;

        return res;
    }

    public static void main(String[] args) {

        int a[] = {2, 1, 4,  1, 2, 3, 4, 7};

        int res[] = twoNonRepeatElem(a);

        for(int e : res) {
            System.out.println(e);
        }
    }
}
