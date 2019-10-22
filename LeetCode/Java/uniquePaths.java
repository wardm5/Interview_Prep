    
/*
    62. Unique Paths
    https://leetcode.com/problems/unique-paths/
 */
 
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0)
                    matrix[i][j] = 1;
                else 
                    matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
            }
        }
        return matrix[m - 1][n - 1];
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Unique Paths.
    Memory Usage: 33.2 MB, less than 5.10% of Java online submissions for Unique Paths.
 */

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j  = 0; j < arr[0].length; j++) {
                if (i == 0 || j == 0)
                    arr[i][j] = 1;
                else 
                    arr[i][j] = arr[i-1][j]+ arr[i][j-1];
            }
        }
        return arr[m - 1][n- 1];
    }
}
