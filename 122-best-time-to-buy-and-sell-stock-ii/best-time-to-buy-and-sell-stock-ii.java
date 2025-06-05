class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        //whichever day profit, collect it 
        for (int i = 1; i < prices.length; i++) {
            // Accumulate profit on every upward slope
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }
}
