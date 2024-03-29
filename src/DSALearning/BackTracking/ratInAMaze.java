package DSALearning.BackTracking;

public class ratInAMaze {

    public static boolean ratMaze(int a[][], boolean vis[][], int i, int j) {

        //Base conditions
        if (i == a.length || j == a.length || a[i][j] == 0 || vis[i][j]) {
            return false;
        }
        //Base condition for successfully reached
        if (i == a.length - 1 && j == a.length - 1) return true;

        //Mark this cell as visited
        vis[i][j]  = true;
        //Check if path is possible from down
        if (ratMaze(a, vis, i+1, j)) return true;
        //Check if path is possible from right
        if (ratMaze(a, vis, i, j+1)) return true;
        //Mark this cell as unvisited & BackTrack
        vis[i][j] = false;

        return false;
    }

    public static void main(String[] args) {

        int a[][] = {
                {1, 1, 0, 1},
                {1, 1, 1, 0},
                {0, 0, 1, 0},
                {1, 1, 1, 1}
        };

        boolean vis[][] = new boolean[a.length][a.length];

        boolean isPathPossible = ratMaze(a, vis, 0, 0);

        System.out.println(isPathPossible);
    }
}
