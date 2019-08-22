/*
    704. Binary Search
    https://leetcode.com/problems/binary-search/
 */

class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = end / 2;
        while (start <= end) {
            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target) {
                end = mid -1;
                mid = (mid - start) / 2 + start;
            } else {
                start = mid + 1;
                mid = (end - start) / 2 + start;
            }
        }
        return -1;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search.
    Memory Usage: 39.1 MB, less than 97.30% of Java online submissions for Binary Search.
 */
