//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
62. Unique Paths
Medium

A robot is located at the top-left corner of a m x n grid (marked 'Start' in the
diagram below).

The robot can only move either down or right at any point in time. The robot is
trying to reach the bottom-right corner of the grid (marked 'Finish' in the
diagram below).

How many possible unique paths are there?

Above is a 7 x 3 grid. How many possible unique paths are there?

Example 1:
Input: m = 3, n = 2
Output: 3
Explanation:
From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Right -> Down
2. Right -> Down -> Right
3. Down -> Right -> Right

Example 2:
Input: m = 7, n = 3
Output: 28

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create matrix to store board info
    2) iterate through matrix
        2.1) if the i and j values are zero, set matrix value to 1
        2.2) if the value for i is zero, set to the number above
        2.3) if the value for j is zero, set to value to the left
        2.4) else have the value add the above and left values
    3) return matrix of n and m
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0)
                    matrix[i][j] = 1;
                else if (i == 0)
                    matrix[i][j] = matrix[i][j-1];
                else if (j == 0)
                    matrix[i][j] = matrix[i-1][j];
                else
                    matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
            }
        }
        return matrix[m-1][n-1];
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Unique Paths.
    Memory Usage: 36.6 MB, less than 5.10% of Java online submissions for Unique Paths.
*/
