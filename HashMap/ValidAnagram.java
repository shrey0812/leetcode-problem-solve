/*
242. Valid Anagram
Solved
Easy
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
*/
class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!= t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()){
            if(!map.containsKey(c)) return false;

            map.put(c,map.get(c)-1);
            if(map.get(c)<0) return false;
        }
        return true;

    }
}
