class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        
        // Create a dp array to store the minimum cost to reach each step
        int[] dp = new int[n];
        
        // Base cases
        dp[0] = cost[0];
        dp[1] = cost[1];
        
        // Iterate through the remaining steps and calculate minimum cost
        for (int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }
        
        // Return the minimum cost of reaching the top step
        return Math.min(dp[n - 1], dp[n - 2]);
    }
}