//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a m * n matrix grid which is sorted in non-increasing order both row-wise
and column-wise.

Return the number of negative numbers in grid.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create count variable
    2) loop through grid
        3) increment res with the count from submethod
            4) for every item in row, go from right to left
            5) if the item is not negative, return the count, else increment count
    6) return result
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int countNegatives(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            res += countLeft(grid, i);
        }
        return res;
    }
    public int countLeft(int[][] matrix, int i) {
        int count = 0;
        for (int j = matrix[i].length - 1; j >= 0; j--) {
            if (matrix[i][j] >= 0)
                return count;
            count++;
        }
        return count;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Count Negative Numbers in a Sorted Matrix.
    Memory Usage: 41.8 MB, less than 100.00% of Java online submissions for Count Negative Numbers in a Sorted Matrix.
*/
