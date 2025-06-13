// Problem: 80. Remove Duplicates from Sorted Array II
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
// Approach: Count duplicates and allow at most 2 occurrences
// Time: O(n), Space: O(1)

import java.lang.Math;

class Solution {
    public int removeDuplicates(int[] nums) {
        int r = 0, l = 0;

        while (r < nums.length) {
            int count = 1;

            while ((r + 1) < nums.length && nums[r] == nums[r + 1]) {
                r++;
                count++;
            }

            for (int i = 0; i < Math.min(2, count); i++) {
                nums[l++] = nums[r];
            }

            r++;
        }

        return l;
    }
}
