class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int l = 0; // Buy day

        for (int r = 1; r < prices.length; r++) { // Sell day
            if (prices[r] > prices[l]) {
                maxProfit = Math.max(maxProfit, prices[r] - prices[l]);
            } else {
                // Found a lower price to buy
                l = r;
            }
        }

        return maxProfit;
    }
}
