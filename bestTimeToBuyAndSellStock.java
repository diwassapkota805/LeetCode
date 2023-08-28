class Solution {
    public int maxProfit(int[] prices) {    
        int min = Integer.MAX_VALUE;

        int profit = 0;

        // iterate through the prices
        for(int i = 0; i < prices.length; i++)
        {
            // compare current index with min
            min = Math.min(prices[i], min);

            // compare current profit with (current index - min val)
            profit = Math.max(profit, prices[i] - min);
        }
        
        return profit;
        
    }
}

// 121
// Arrays
