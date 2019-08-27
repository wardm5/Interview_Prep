/*
    64. Minimum Path Sum
    https://leetcode.com/problems/minimum-path-sum/
 */
 
class Solution {
    public int minPathSum(int[][] grid) {
        int[][] matrix = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i > 0 && j > 0)  {
                    matrix[i][j] = Math.min(matrix[i - 1][j], matrix[i][j - 1]) + grid[i][j];
                    continue;
                }
                if (i > 0)
                    matrix[i][j] += matrix[i - 1][j];
                else if (j > 0)
                    matrix[i][j] += matrix[i][j-1];
                matrix[i][j] += grid[i][j];
                
            }
        }
        return matrix[grid.length - 1][grid[0].length - 1];
    }
}

/*
    Runtime: 2 ms, faster than 90.17% of Java online submissions for Minimum Path Sum.
    Memory Usage: 42.7 MB, less than 68.92% of Java online submissions for Minimum Path Sum.
 */
