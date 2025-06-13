class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()][word2.length()];
        for (int[] row : dp) Arrays.fill(row, -1);
        return helper(word1, word2, 0, 0, dp);
    }

    private int helper(String w1, String w2, int i, int j, int[][]dp) {
        if (i == w1.length()) return w2.length() - j; 
        if (j == w2.length()) return w1.length() - i; 
         if (dp[i][j] != -1) return dp[i][j];

        if (w1.charAt(i) == w2.charAt(j)) {
            dp[i][j] = helper(w1, w2, i + 1, j + 1, dp);
        } else {
            int insert = 1 + helper(w1, w2, i, j + 1, dp);
            int delete = 1 + helper(w1, w2, i + 1, j, dp);
            int replace = 1 + helper(w1, w2, i + 1, j + 1, dp);
            dp[i][j] = Math.min(insert, Math.min(delete, replace));
        }

        return dp[i][j];
    }
}
