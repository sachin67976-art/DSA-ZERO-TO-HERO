
import java.util.*;

public class  Leedcode35{

    public static int trapRainWater(int[][] height) {

        int m = height.length;
        int n = height[0].length;

        boolean[][] visited = new boolean[m][n];

        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> a[0] - b[0]
        );

        // Add boundary cells
        for (int i = 0; i < m; i++) {
            pq.offer(new int[]{height[i][0], i, 0});
            pq.offer(new int[]{height[i][n - 1], i, n - 1});

            visited[i][0] = true;
            visited[i][n - 1] = true;
        }

        for (int j = 1; j < n - 1; j++) {
            pq.offer(new int[]{height[0][j], 0, j});
            pq.offer(new int[]{height[m - 1][j], m - 1, j});

            visited[0][j] = true;
            visited[m - 1][j] = true;
        }

        int water = 0;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while (!pq.isEmpty()) {

            int[] curr = pq.poll();

            int h = curr[0];
            int x = curr[1];
            int y = curr[2];

            for (int k = 0; k < 4; k++) {

                int nx = x + dx[k];
                int ny = y + dy[k];

                if (nx >= 0 && nx < m &&
                        ny >= 0 && ny < n &&
                        !visited[nx][ny]) {

                    visited[nx][ny] = true;

                    water += Math.max(0,
                            h - height[nx][ny]);

                    pq.offer(new int[]{
                            Math.max(h, height[nx][ny]),
                            nx, ny
                    });
                }
            }
        }

        return water;
    }

    public static void main(String[] args) {

        int[][] height = {
                {1, 4, 3, 1, 3, 2},
                {3, 2, 1, 3, 2, 4},
                {2, 3, 3, 2, 3, 1}
        };

        int result = trapRainWater(height);

        System.out.println("Trapped Water: " + result);
    }
}
