/*274. H-Index
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return the researcher's h-index.

According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times.*/

class Solution {
    public int hIndex(int[] citations) {
       int n = citations.length;
       int[] paper_counts = new int[n+1];

       for(int i = 0; i<n;i++){
        paper_counts[Math.min(n,citations[i])] += 1;
       } 

      int h = n;
       int papers = paper_counts[n];

       while(papers<h){
        h -=1;
       papers += paper_counts[h];
       }
       return h;
        
    }
}
