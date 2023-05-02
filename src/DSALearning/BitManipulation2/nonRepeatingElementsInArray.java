package DSALearning.BitManipulation2;

public class nonRepeatingElementsInArray {

    public static int oneNonRepeatingElement(int a[]) {

        int ans = 0;

        for(int e : a) {
            ans = ans ^ e;
        }
        return ans;
    }

    public static void main(String[] args) {

        int a[] = {2, 1, 4, 1, 2, 3, 4};
        System.out.println(oneNonRepeatingElement(a));
    }
}
