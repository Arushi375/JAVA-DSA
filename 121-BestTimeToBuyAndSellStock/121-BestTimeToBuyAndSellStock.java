// Last updated: 7/28/2026, 5:10:55 PM
class Solution {
    public int maxProfit(int[] prices) {
        int min=9999,profit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];
            }
            if(profit<prices[i]-min)
            {
                profit=prices[i]-min;
            }
        }
        return profit;
    }
}