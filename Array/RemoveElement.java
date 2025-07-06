// Problem: 27. Remove Element
// Link: https://leetcode.com/problems/remove-element/
// Approach: Two pointer - overwrite values not equal to val
// Time: O(n), Space: O(1)

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
