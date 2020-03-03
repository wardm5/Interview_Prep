//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a m x n grid filled with non-negative numbers, find a path from top left
to bottom right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

Example:

Input:
[
  [1,3,1],
  [1,5,1],
  [4,2,1]
]
Output: 7
Explanation: Because the path 1→3→1→1→1 minimizes the sum.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) loop through rows
    2) loop through cols
        2.1) if the i is zero and j is zero, then continue
        2.2) if the i is zero, then just add the items to the left
        2.3) if the j is zero, then add items above
        2.4) else just find min of items above or to the left
    3) return the last item in the last row
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int minPathSum(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0 && j == 0)
                    continue;
                else if (i == 0)
                    matrix[i][j] = matrix[i][j] + matrix[i][j-1];
                else if (j == 0)
                    matrix[i][j] = matrix[i][j] + matrix[i-1][j];
                else
                    matrix[i][j] = Math.min(matrix[i-1][j], matrix[i][j-1]) + matrix[i][j];
            }
        }
        return matrix[matrix.length - 1][matrix[0].length - 1];
    }
}

/*
    Runtime: 2 ms, faster than 88.48% of Java online submissions for Minimum Path Sum.
    Memory Usage: 42.3 MB, less than 82.43% of Java online submissions for Minimum Path Sum.
*/
