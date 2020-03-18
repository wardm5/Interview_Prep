//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------
Problem:
378. Kth Smallest Element in a Sorted Matrix
Medium

Given a n x n matrix where each of the rows and columns are sorted in ascending 
order, find the kth smallest element in the matrix.

Note that it is the kth smallest element in the sorted order, not the kth distinct 
element.

Example:
matrix = [
   [ 1,  5,  9],
   [10, 11, 13],
   [12, 13, 15]
],
k = 8,

return 13.
Note:
You may assume k is always valid, 1 ≤ k ≤ n2.
-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create priority queue
    2) loop through matrix, place items in priority queue
    3) iterate through queue, get kth item
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0 ; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                q.add(matrix[i][j]);
            }
        }
        int res = q.remove();
        while (k>1) {
            res = q.remove();
            k--;
        }
        return res;
    }
}

/*
    Runtime: 23 ms, faster than 18.25% of Java online submissions for Kth Smallest Element in a Sorted Matrix.
    Memory Usage: 46 MB, less than 13.51% of Java online submissions for Kth Smallest Element in a Sorted Matrix.
*/
