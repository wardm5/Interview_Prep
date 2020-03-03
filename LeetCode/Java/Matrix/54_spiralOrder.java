//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a matrix of m x n elements (m rows, n columns), return all elements of the
matrix in spiral order.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create variables for start row, end row, start col, end col
    2) loop through matrix, go right on row, then down on col, then left on row, and up on col
    3) update the start col, end col, start row, end row after each iteration of the row or col
    4) print each value as you loop through the row or col
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int startCol = 0;
        int startRow = 0;
        int endCol = matrix[0].length - 1;
        int endRow = matrix.length - 1;
        while (startCol <= endCol || startRow <= endRow) {
            right(startCol, endCol, startRow, res, matrix);
            startRow++;
            if (check(startRow, startCol, endRow, endCol))
                break;
            down(startRow, endRow, endCol, res, matrix);
            endCol--;
            if (check(startRow, startCol, endRow, endCol))
                break;
            left(endCol, startCol, endRow, res, matrix);
            endRow--;
            if (check(startRow, startCol, endRow, endCol))
                break;
            up(endRow, startRow, startCol, res, matrix);
            startCol++;
        }
        return res;
    }
    public boolean check(int sr, int sc, int er, int ec) {
        return (sc > ec || sr > er);
    }
    public void right(int start, int end, int row, List<Integer> res, int[][] matrix) {
        int i;
        for (i = start; i <= end; i++) {
            res.add(matrix[row][i]);
        }
    }
    public void down(int start, int end, int col, List<Integer> res, int[][] matrix) {
        int i;
        for (i = start; i <= end; i++) {
            res.add(matrix[i][col]);
        }
    }
    public void left(int start, int end, int row, List<Integer> res, int[][] matrix) {
        int i;
        for (i = start; i >= end; i--) {
            res.add(matrix[row][i]);
        }
    }
    public void up(int start, int end, int col, List<Integer> res, int[][] matrix) {
        int i;
        for (i = start; i >= end; i--) {
            res.add(matrix[i][col]);
        }
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Spiral Matrix.
    Memory Usage: 37.1 MB, less than 5.21% of Java online submissions for Spiral Matrix.
*/
