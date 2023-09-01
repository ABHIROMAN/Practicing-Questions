package DSALearning.Graphs;

import java.util.*;
public class implementingGraphusingArrList {

    static ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
    int v;

    public implementingGraphusingArrList(int v) {
        this.v = v;
        for(int i = 0; i < v; i++) {
            a.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int src, int dest) {
        a.get(src).add(dest);
        a.get(dest).add(src);
    }
    public static void main(String[] args) {

        int v = 5;
        implementingGraphusingArrList graph = new implementingGraphusingArrList(v);
        graph.addEdge(0, 1);
        graph.addEdge(2, 3);
        graph.addEdge(4, 3);
        graph.addEdge(2, 4);
    }
}
