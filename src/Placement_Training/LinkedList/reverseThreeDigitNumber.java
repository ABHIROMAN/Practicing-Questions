package Placement_Training.LinkedList;

import java.util.Scanner;

public class reverseThreeDigitNumber {

    static int reverse(int a) {
        int rev = 0;
        int remainder;
        while(a > 0) {
            remainder = a % 10;
            rev = (rev * 10)  + remainder;
            a = a/10;
        }
        return rev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Reverse of the number is "+ reverse(a));
    }
}
