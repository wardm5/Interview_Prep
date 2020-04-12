//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
695. Max Area of Island
Medium

Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's
(representing land) connected 4-directionally (horizontal or vertical.) You may
assume all four edges of the grid are surrounded by water.

Find the maximum area of an island in the given 2D array. (If there is no island,
the maximum area is 0.)

Example 1:
[[0,0,1,0,0,0,0,1,0,0,0,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,1,1,0,1,0,0,0,0,0,0,0,0],
 [0,1,0,0,1,1,0,0,1,0,1,0,0],
 [0,1,0,0,1,1,0,0,1,1,1,0,0],
 [0,0,0,0,0,0,0,0,0,0,1,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,0,0,0,0,0,0,1,1,0,0,0,0]]

Given the above grid, return 6. Note the answer is not 11, because the island must
be connected 4-directionally.

Example 2:
[[0,0,0,0,0,0,0,0]]
Given the above grid, return 0.

Note: The length of each dimension in the given grid does not exceed 50.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create result array
    2) loop through grid, call helper
        2.1) if the index is out of bounds or 0, then return
        2.2) if grid at position is one, then increment count, set position to 0
        2.3) if count is greater than res, set res to count
        2.4) call helper for up, down, right, left
    3) return res
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int[] res = new int[1];
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[i].length; j++)
                helper(i, j, res, new int[1], grid);
        return res[0];
    }
    public void helper(int i, int j, int[] res, int[] count, int[][] grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == 0)
            return;
        if (grid[i][j] == 1) {
            count[0] = count[0] + 1;
            grid[i][j] = 0;
        }
        if (count[0] > res[0])
            res[0] = count[0];
        helper(i+1, j, res, count, grid);
        helper(i-1, j, res, count, grid);
        helper(i, j+1, res, count, grid);
        helper(i, j-1, res, count, grid);
    }
}

/*
    Runtime: 2 ms, faster than 99.32% of Java online submissions for Max Area of Island.
    Memory Usage: 39.7 MB, less than 96.30% of Java online submissions for Max Area of Island.
*/
