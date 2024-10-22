class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        left=0
        right=left+1
        

        profit=0

        while right<len(prices):
            if prices[left]>prices[right] or prices[left]==prices[right]:
                left=right
                right+=1
            elif prices[left]<prices[right]:
                profit=max(profit,prices[right]-prices[left])
                right+=1

        return profit