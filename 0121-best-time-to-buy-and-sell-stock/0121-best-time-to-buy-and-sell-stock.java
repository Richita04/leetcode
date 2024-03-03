class Solution {
    public int maxProfit(int[] prices) {

        int profit = 0;

        int minCostToBuyAt = prices[0];
    
        for(int i=1; i< prices.length; i++){
            minCostToBuyAt = Math.min(minCostToBuyAt,prices[i]);
            profit = Math.max(profit,prices[i] - minCostToBuyAt);
        }
        return profit;
        
        
    }
}
