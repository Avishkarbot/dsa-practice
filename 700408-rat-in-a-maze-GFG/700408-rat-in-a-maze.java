class Solution {
    public ArrayList < String > ratInMaze(int[][] maze) {
        if (maze[0][0] == 0) return new ArrayList < > ();
        ArrayList < String > pathList = new ArrayList < > ();
        int n = maze.length;
        int m = maze[0].length;

        boolean vis[][] = new boolean[n][m];
        vis[0][0] = true;
        ratInMaze(maze, 0, 0, n, m, vis, "", pathList);
        return pathList;
    }

    public static void ratInMaze(int[][] maze, int i, int j, int n, int m, boolean[][] vis, String path, ArrayList < String > pathList) {
        if (i == n - 1 && j == m - 1) {
            pathList.add(path);
            path = "";
            return;
        }

        if (isValid(maze, i + 1, j, n, m, vis)) {
            vis[i + 1][j] = true;
            ratInMaze(maze, i + 1, j, n, m, vis, path + 'D', pathList);
            vis[i + 1][j] = false;
        }

        if (isValid(maze, i, j - 1, n, m, vis)) {
            vis[i][j - 1] = true;
            ratInMaze(maze, i, j - 1, n, m, vis, path + 'L', pathList);
            vis[i][j - 1] = false;
        }

        if (isValid(maze, i, j + 1, n, m, vis)) {
            vis[i][j + 1] = true;
            ratInMaze(maze, i, j + 1, n, m, vis, path + 'R', pathList);
            vis[i][j + 1] = false;
        }

        if (isValid(maze, i - 1, j, n, m, vis)) {
            vis[i - 1][j] = true;
            ratInMaze(maze, i - 1, j, n, m, vis, path + 'U', pathList);
            vis[i - 1][j] = false;
        }

    }

    public static boolean isValid(int[][] maze, int i, int j, int n, int m, boolean[][] vis) {
        if (i < n && i >= 0 && j < m && j >= 0 && maze[i][j] == 1 && !vis[i][j]) {
            return true;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna