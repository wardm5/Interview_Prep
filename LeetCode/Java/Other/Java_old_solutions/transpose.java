/*
    867. Transpose Matrix
    https://leetcode.com/problems/transpose-matrix/
 */

class Solution {
    public int[][] transpose(int[][] A) {
        int[][] matrix = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                matrix[j][i] = A[i][j];
            }
        }
        return matrix;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Transpose Matrix.
    Memory Usage: 37.5 MB, less than 100.00% of Java online submissions for Transpose Matrix.
 */
