package PlacementPrep;

import java.util.*;

public class MinimumRailwayTracks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] railwayTrack = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                railwayTrack[i][j] = scanner.nextInt();
            }
        }

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int minRailwayTracks = 0;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});

        while (!queue.isEmpty()) {
            int[] currentPosition = queue.poll();

            if (currentPosition[0] == x && currentPosition[1] == y) {
                break;
            }

            for (int[] direction : new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}}) {
                int newX = currentPosition[0] + direction[0];
                int newY = currentPosition[1] + direction[1];

                if (newX >= 0 && newX < n && newY >= 0 && newY < m && railwayTrack[newX][newY] == 1) {
                    queue.add(new int[]{newX, newY});
                    minRailwayTracks++;
                }
            }
        }

        System.out.println(minRailwayTracks);
    }
}
