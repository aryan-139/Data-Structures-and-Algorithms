class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0; 
        for(int p: prices){
            minPrice=Math.min(minPrice, p);
            maxProfit=Math.max(maxProfit, (p-minPrice));
            System.out.println(p + " " + maxProfit);
        }
        return maxProfit; 
    }
}