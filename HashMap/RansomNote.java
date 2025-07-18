/*
383. Ransom Note
Solved
Easy
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.
*/
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magaHash = new HashMap<>();

        for( char c : magazine.toCharArray()){
            magaHash.put(c,magaHash.getOrDefault(c,0) + 1);
        }
        for(char c: ransomNote.toCharArray()){
            if(!magaHash.containsKey(c) || magaHash.get(c)<=0){
                return false;
            }
            magaHash.put(c,magaHash.get(c)-1);
        }
        return true;
    }
}
