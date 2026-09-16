class Solution {
    public int uniquePaths(int m, int n) {
        int a[][] = new int[m + 1][n + 1];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = -1;
            }
        }
        return solve(m, n, a);

    }

    public static int solve(int m, int n, int[][] a) {
        if (m == 1 || n == 1)
            return 1;
        if (a[m][n] != -1) {
            return a[m][n];
        }
        a[m][n] = solve(m - 1, n, a) + solve(m, n - 1, a);

        return a[m][n];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna