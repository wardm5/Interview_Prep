/*
    852. Peak Index in a Mountain Array
    https://leetcode.com/problems/peak-index-in-a-mountain-array/
 */

class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int height = 0;
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > height) {
                height = A[i];
                index = i;
            }
        }
        return index;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Peak Index in a Mountain Array.
    Memory Usage: 38.4 MB, less than 100.00% of Java online submissions for Peak Index in a Mountain Array.
 */
