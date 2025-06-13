// Problem: 45. Jump Game II
// Link: https://leetcode.com/problems/jump-game-ii/
// Approach: Greedy level-wise traversal (BFS style)
// Time: O(n), Space: O(1)

class Solution {
    public int jump(int[] nums) {
        int res = 0;
        int l = 0, r = 0;

        while (r < nums.length - 1) {
            int farthest = 0;
            for (int i = l; i <= r; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }
            l = r + 1;
            r = farthest;
            res++;
        }

        return res;
    }
}
