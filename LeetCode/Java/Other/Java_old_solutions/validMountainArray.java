/*
    941. Valid Mountain Array
    https://leetcode.com/problems/valid-mountain-array/
 */

class Solution {
    public boolean validMountainArray(int[] A) {
        if (A.length <=1 || A[0] > A[1])
            return false;
        int curr =0;
        while (curr + 1 < A.length && A[curr] < A[curr + 1]) {
            curr++;
        }
        if (A[curr-1] == A[curr] || curr == A.length - 1)
            return false;
        while (curr + 1 < A.length && A[curr] > A[curr + 1]) {
            curr++;
        }
        return (curr == A.length - 1);
    }
}

/*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Valid Mountain Array.
    Memory Usage: 39.4 MB, less than 100.00% of Java online submissions for Valid Mountain Array.
 */
