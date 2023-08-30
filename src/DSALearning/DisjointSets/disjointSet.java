package DSALearning.DisjointSets;

public class disjointSet {

    int parent[];
    int rank[];
    //make elements from 0 to n-1
    public disjointSet(int n) {
        parent = new int[n];
        rank = new int[n];
        for(int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    // Find the captain/representative of the group
    int find(int x) {
        //1st method
//        if(x != parent[x]) {
//            return find(parent[x]);
//        }
//        return x;

        //2nd method
        if(x != parent[x]) {
             parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    // Union into one group if they are not in group already
    void union(int a, int b) {
        int captainA = find(a);
        int captainB = find(b);

        if(captainA == captainB) return;

        if(rank[captainA] < rank[captainB]) {
            parent[captainA] = captainB;
        }
        else if(rank[captainB] < rank[captainA]) {
            parent[captainB] = captainA;
        }
        else {
            parent[captainB] = captainA;
            rank[captainA]++;
        }
    }

    // Are in team
    boolean isConnected(int a, int b) {
        int captainA = find(a);
        int captainB = find(b);

        return captainA == captainB;
    }

    public static void main(String[] args) {

        int n = 8;
        disjointSet obj = new disjointSet(n);

        obj.union(0, 2);
        obj.union(3, 5);

        System.out.println(obj.isConnected(0, 3));

        obj.union(0, 5);
        System.out.println(obj.isConnected(0, 3));
    }
}