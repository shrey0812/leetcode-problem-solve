// Problem: 189. Rotate Array
// Link: https://leetcode.com/problems/rotate-array/
// Approach: Copy last k elements to front using temp array
// Time: O(n), Space: O(n)

class Solution {
    public void rotate(int[] nums, int k) {
        int[] nums1 = new int[nums.length];
        k = k % nums.length;
        int c = 0;

        for (int i = nums.length - k; i < nums.length; i++) {
            nums1[c++] = nums[i];
        }

        int b = 0;
        for (int i = k; i < nums.length; i++) {
            nums1[i] = nums[b++];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums1[i];
        }
    }
}
