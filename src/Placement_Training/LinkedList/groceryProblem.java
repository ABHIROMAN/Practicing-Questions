package Placement_Training.LinkedList;

import java.util.ArrayList;
import java.util.Scanner;

public class groceryProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> secondArr = new ArrayList<>();

        while (sc.hasNextInt()) {
            int i = sc.nextInt();
            arr.add(i);
        }

        int time = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int item = i; item < arr.size(); item++) {

                if (arr.get(i) > 5) {
                    time += 7;
                    item = item - 6;
                    arr.add(item);
                    arr.remove(i);
                }
                else if (item < 5) {
                    time += 2;
                    secondArr.add(i*2);
                    arr.remove(i);
                }
            }
            System.out.println(time);
        }
    }
}