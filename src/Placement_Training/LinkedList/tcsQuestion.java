package Placement_Training.LinkedList;

import java.util.*;
public class tcsQuestion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for(int i = low; i < high; i++) {
            System.out.print("0"+i + " ");
        }
        System.out.print(high);
    }
}
