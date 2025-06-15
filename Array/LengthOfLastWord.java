/*58. Length of Last Word
Solved
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
*/
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int count = 0;
        int i= s.length()-1;
        while(i>=0 && s.charAt(i)!=' '){
            count++;
            i--;
        }
        return count;
    }
}
