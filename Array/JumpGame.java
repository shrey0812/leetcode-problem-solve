// Problem: 55. Jump Game
// Link: https://leetcode.com/problems/jump-game/
// Approach: Greedy - work backwards from the goal
// Time: O(n), Space: O(1)

class Solution {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }

        return goal == 0;
    }
}
