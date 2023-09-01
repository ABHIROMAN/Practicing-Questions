package DSALearning.Graphs;
public class implementingGraph {
    int a[][];
    int v;

    public implementingGraph(int v) {
        this.v = v;
        a = new int[v][v];
    }

    public void addEdge(int src, int dest) {
        a[src][dest] = 1;
        a[dest][src] = 1;
        // As it is undirected graph so we are putting both 1
        // as A[1,0] = 1 and also A[0,1] = 1
    }
    public static void main(String[] args) {

        int v = 5;
        implementingGraph graph = new implementingGraph(v);
        graph.addEdge(0, 1);
        graph.addEdge(2, 3);
        graph.addEdge(4, 3);
        graph.addEdge(2, 4);
    }
}
