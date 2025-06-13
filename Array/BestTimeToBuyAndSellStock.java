// Problem: 121. Best Time to Buy and Sell Stock
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Approach: Track min price and max profit
// Time: O(n), Space: O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int price : prices) {
            min = Math.min(price, min);
            max = Math.max(max, price - min);
        }

        return max;
    }
}
