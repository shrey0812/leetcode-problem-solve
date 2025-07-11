#6. Zigzag Conversion
#Solved
#Medium
#The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
# P   A   H   N
# A P L S I I G
# Y   I   R
#And then read line by line: "PAHNAPLSIIGYIR"
#Write the code that will take a string and make this conversion given a number of rows:
#string convert(string s, int numRows);
#Example 1:
#Input: s = "PAYPALISHIRING", numRows = 3
#Output: "PAHNAPLSIIGYIR"
class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1: return s

        res = ""
        for r in range(numRows):
            increment = 2*(numRows-1)
            for i in range(r,len(s),increment):
                res += s[i]
                if(r>0 and r<numRows - 1 and i+increment-2*r<len(s)):
                    res += s[i+increment-2*r]
        return res
