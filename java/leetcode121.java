class Solution {
    public int maxProfit(int[] prices) {
        int left=0,right=1,profit=0;

        while(right<prices.length){
            if(prices[left]<prices[right]){
                profit= Math.max(profit,prices[right]-prices[left]);
                right++;
            }else{
                left=right;
                right++;
            }
        }

        return profit;

    }
}