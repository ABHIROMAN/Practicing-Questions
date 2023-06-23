package Placement_Training.LinkedList;

import java.util.Scanner;

public class trendyNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int num, count=0;

        num = Math.abs(n);

        for(int i = num; i != 0; i--) {
            count++;
        }
        if (count % 2 == 1) {

            for(int i = 1; i <= count/2; i++) {

                num = num/10;
            }
            int mid = num % 10;
            System.out.println("Middle number is " + mid);
        }
    }
}
