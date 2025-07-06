// Problem: 88. Merge Sorted Array
// Link: https://leetcode.com/problems/merge-sorted-array/
// Approach: Start merging from the end using 3 pointers
// Time: O(m + n), Space: O(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n - 1;

        while (m > 0 && n > 0){
            if(nums1[m - 1] > nums2[n - 1]){
                nums1[last] = nums1[m - 1];
                m--;
            } else {
                nums1[last] = nums2[n - 1];
                n--;
            }
            last--;
        }

        // Fill nums1 with leftover nums2 elements
        while (n > 0){
            nums1[last] = nums2[n - 1];
            n--;
            last--;
        }
    }
}
