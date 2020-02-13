//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given n and m which are the dimensions of a matrix initialized by zeros and given
an array indices where indices[i] = [ri, ci]. For each pair of [ri, ci] you have
to increment all cells in row ri and column ci by 1.

Return the number of cells with odd values in the matrix after applying the
increment to all indices.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create result matrix, count
    2) loop through indices
    3) for each indicie, add 1's to the result row and column
    4) in the helper methods, check to see if the value you added a 1 to made it odd or even
    5) if even, then subtract from count, otherwise add to count, pass these counts back to main method
    6) finally, return count once out of indicie loop
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

// Slightly Optimized:
class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int[][] matrix = new int[n][m];
        int[] count = new int[1];
        for (int i = 0; i < indices.length; i++) {
            rows(matrix, indices[i][0], count);
            cols(matrix, indices[i][1], count);
        }
        return count[0];
    }
    public void rows(int[][] matrix, int row, int[] count) {
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[row][i] = matrix[row][i] + 1;
            if (matrix[row][i] % 2 != 0)
                count[0]++;
            else
                count[0]--;
        }
    }
    public void cols(int[][] matrix, int col, int[] count) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = matrix[i][col] + 1;
            if (matrix[i][col] % 2 != 0)
                count[0]++;
            else
                count[0]--;
        }
    }
}

// Original Solution:
class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int[][] matrix = new int[n][m];
        int count = 0;
        for (int i = 0; i < indices.length; i++) {
            count += rows(matrix, indices[i][0]);
            count += cols(matrix, indices[i][1]);
        }
        return count;
    }
    public int rows(int[][] matrix, int row) {
        int count = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[row][i] = matrix[row][i] + 1;
            if (matrix[row][i] % 2 != 0)
                count++;
            else
                count--;
        }
        return count;
    }
    public int cols(int[][] matrix, int col) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = matrix[i][col] + 1;
            if (matrix[i][col] % 2 != 0)
                count++;
            else
                count--;
        }
        return count;
    }
}

/*
    Runtime: 1 ms, faster than 88.65% of Java online submissions for Cells with Odd Values in a Matrix.
    Memory Usage: 37.5 MB, less than 100.00% of Java online submissions for Cells with Odd Values in a Matrix.
*/
