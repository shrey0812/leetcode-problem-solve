/*42. Trapping Rain Water
Solved
Hard
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
In this case, 6 units of rain water (blue section) are being trapped.*/
class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int sum = 0;
        int[] left = new int[len];
        left[0] = height[0];
        for(int i =1;i<len;i++){
            left[i]=Math.max(height[i],left[i-1]);
        }
        int[] right = new int[len];
        right[len-1]= height[len-1];
        for(int i = len-2;i>=0;i--){
            right[i]= Math.max(height[i],right[i+1]);
        }
        for(int i = 0;i<len;i++){
            sum += (Math.min(left[i],right[i])-height[i]);
        }
        return sum;
    }
}
