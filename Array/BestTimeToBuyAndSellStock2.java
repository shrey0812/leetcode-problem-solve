// Problem: 122. Best Time to Buy and Sell Stock II
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
// Approach: Greedy - add profit from every local increase
// Time: O(n), Space: O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                sum += prices[i] - prices[i - 1];
            }
        }

        return sum;
    }
}
