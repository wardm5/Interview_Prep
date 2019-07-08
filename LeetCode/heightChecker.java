/*
    1051. Height Checker
    https://leetcode.com/problems/height-checker/
 */

class Solution {
    public int heightChecker(int[] heights) {
        int[] arr = heights.clone();
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != heights[i]) count++;
        }
        return count;
    }
}

/*
    Runtime: 1 ms, faster than 93.69% of Java online submissions for Height Checker.
    Memory Usage: 34.7 MB, less than 100.00% of Java online submissions for Height Checker.
 */
