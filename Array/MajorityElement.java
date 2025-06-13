// Problem: 169. Majority Element
// Link: https://leetcode.com/problems/majority-element/
// Approach: Sort the array — majority element will always be at the middle
// Time: O(n log n), Space: O(1)

import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
