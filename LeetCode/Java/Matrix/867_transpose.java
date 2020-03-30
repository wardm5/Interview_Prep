//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
867. Transpose Matrix
Easy

Given a matrix A, return the transpose of A.

The transpose of a matrix is the matrix flipped over it's main diagonal, switching
the row and column indices of the matrix.

Example 1:
Input: [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]

Example 2:
Input: [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) first, create new matrix
    2) for each row and col, just replace the row and col for the new matrix
    3) return new matrix
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int[][] transpose(int[][] A) {
        int[][] matrix = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                matrix[j][i] = A[i][j];
        return matrix;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Transpose Matrix.
    Memory Usage: 40.8 MB, less than 87.50% of Java online submissions for Transpose Matrix.
*/
