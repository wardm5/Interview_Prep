/*
    566. Reshape the Matrix
    https://leetcode.com/problems/reshape-the-matrix/
 */
 
class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length * nums[0].length != r * c)
            return nums;
        int m = nums[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r*c; i++) {
            res[i/c][i%c] = nums[i/m][i%m];
        }
        return res;
    }
}

/*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Reshape the Matrix.
    Memory Usage: 41.2 MB, less than 38.89% of Java online submissions for Reshape the Matrix.
 */
