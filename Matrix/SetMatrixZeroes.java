/*73. Set Matrix Zeroes
Solved
Medium
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
*/
class Solution {
    public void setZeroes(int[][] matrix) {
    Set<Integer> zeroRows = new HashSet<>();
    Set<Integer> zeroCols = new HashSet<>();
    int rows = matrix.length;
    int cols = matrix[0].length;

    for(int i = 0;i<rows;i++){
        for(int j = 0;j<cols;j++){
            if(matrix[i][j]==0){
                zeroRows.add(i);
                zeroCols.add(j);
            }
        }
    } 
    for(int i : zeroRows){
        for(int j = 0;j<cols;j++){
            matrix[i][j]= 0;
        }
    }
    for(int i : zeroCols){
        for(int j = 0;j<rows;j++){
            matrix[j][i]= 0;
        }
    }
    
    }
}
