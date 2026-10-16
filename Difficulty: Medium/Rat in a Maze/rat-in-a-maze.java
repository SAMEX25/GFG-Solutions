import java.util.*;

class Solution {
public ArrayList<String> ratInMaze(int[][] maze) {
ArrayList<String> result = new ArrayList<>();
int n = maze.length;

    if (n == 0 || maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
        return result;
    }

    boolean[][] visited = new boolean[n][n];
    StringBuilder path = new StringBuilder();

    dfs(0, 0, maze, visited, path, result, n);

    return result;
}

private void dfs(int row, int col, int[][] maze,
                 boolean[][] visited, StringBuilder path,
                 ArrayList<String> result, int n) {

    // Destination reached
    if (row == n - 1 && col == n - 1) {
        result.add(path.toString());
        return;
    }

    visited[row][col] = true;

    // Directions in lexicographical order: D, L, R, U
    int[] dr = {1, 0, 0, -1};
    int[] dc = {0, -1, 1, 0};
    char[] direction = {'D', 'L', 'R', 'U'};

    for (int i = 0; i < 4; i++) {
        int newRow = row + dr[i];
        int newCol = col + dc[i];

        if (newRow >= 0 && newRow < n &&
            newCol >= 0 && newCol < n &&
            maze[newRow][newCol] == 1 &&
            !visited[newRow][newCol]) {

            path.append(direction[i]);

            dfs(newRow, newCol, maze, visited, path, result, n);

            // Backtrack: remove the last move
            path.deleteCharAt(path.length() - 1);
        }
    }

    visited[row][col] = false;
}


}
