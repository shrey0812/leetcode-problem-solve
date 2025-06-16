/*125. Valid Palindrome
Solved
Easy

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise. */
class Solution {
    public boolean isPalindrome(String s) {
        String string= "";
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                string=string+s.charAt(i);
            }
        }
        string=string.toLowerCase();
    for(int i=0;i<string.length();i++){
        if(string.charAt(i)!=string.charAt(string.length()-1-i)){
            return false;
        }
    }
    return true;
    }
}