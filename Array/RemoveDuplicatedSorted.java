// Problem: 26. Remove Duplicates from Sorted Array
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Approach: Two pointer technique to overwrite duplicates
// Time: O(n), Space: O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1)
            return nums.length;

        int uniqueIndex = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex++] = nums[i];
            }
        }

        return uniqueIndex;
    }
}
