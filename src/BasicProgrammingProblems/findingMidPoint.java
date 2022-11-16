package BasicProgrammingProblems;

import java.util.Scanner;

class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point mid(Point p) {
        double ax = (p.x + x)/2;
        double by = (p.y + y)/2;
        return new Point(ax, by);
    }
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

public class findingMidPoint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Point<Integer> p1 = new Point<Integer>(sc.nextInt(), sc.nextInt());
//        Point<Double> p2 = new Point<Double>(sc.nextDouble(), sc.nextDouble());
//        Point<Double> p3 = p1.mid(p2);
//        System.out.println(p3);
    }
}
