/*167. Two Sum II - Input Array Is Sorted
Solved
Medium
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.
Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
The tests are generated such that there is exactly one solution. You may not use the same element twice.
Your solution must use only constant extra space.*/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int[] arr = new int[2];
        for(int i =0;i<numbers.length;i++){
            if(numbers[left]+numbers[right]>target){
                right--;
            }
            if(numbers[left]+numbers[right]<target){
                left++;
            }if(numbers[left]+numbers[right]==target){
                arr[0] = left+1;
                arr[1] = right+1;
                break;
            }
        }
        return arr;
    }
}
