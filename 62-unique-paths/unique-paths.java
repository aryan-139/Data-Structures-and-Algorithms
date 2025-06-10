import java.util.Arrays;

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return solve(m, n, 0, 0, memo);
    }

    public int solve(int m, int n, int i, int j, int[][] memo) {
        if (i >= m || j >= n) return 0;
        if (i == m - 1 && j == n - 1) return 1;

        if (memo[i][j] != -1) return memo[i][j];

        int down = solve(m, n, i + 1, j, memo);
        int right = solve(m, n, i, j + 1, memo);

        return memo[i][j] = down + right;
    }
}
