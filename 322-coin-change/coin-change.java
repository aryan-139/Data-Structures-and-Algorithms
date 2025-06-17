class Solution {
    public int coinChange(int[] coins, int amount) { 
        Integer[][] memo = new Integer[coins.length][amount + 1];
        int res = s(coins, amount, coins.length - 1, memo);
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    public int s(int[] coins, int target, int i, Integer[][] memo) {
        if (target == 0) return 0;
        if (i < 0) return Integer.MAX_VALUE;
        if (memo[i][target] != null) return memo[i][target];

        int skip = s(coins, target, i - 1, memo);
        int take = Integer.MAX_VALUE;

        if (coins[i] <= target) {
            int res = s(coins, target - coins[i], i, memo);
            if (res != Integer.MAX_VALUE) take = 1 + res;
        }

        return memo[i][target] = Math.min(take, skip);
    }
}
