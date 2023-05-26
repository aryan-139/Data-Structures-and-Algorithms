class Solution {
    public int uniquePaths(int m, int n) {
        // Create a 2D array to store the number of unique paths
        int[][] dp = new int[m][n];
        
        // Fill the first row with 1, as there is only one way to reach any cell in the first row
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        
        // Fill the first column with 1, as there is only one way to reach any cell in the first column
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        
        // Fill the remaining cells using dynamic programming
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                // The number of unique paths to a cell is the sum of the number of unique paths to the cell above it and the cell to its left
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        
        // The bottom-right cell will contain the number of unique paths from the top-left to the bottom-right
        return dp[m - 1][n - 1];
    }
}
