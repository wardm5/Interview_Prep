/*
    268. Missing Number
    https://leetcode.com/problems/missing-number/
 */

class Solution {
    public int missingNumber(int[] nums) {
        int result = 0, sum = 0, i = 0;
        while (i < nums.length) {
            result += nums[i];
            sum += i;
            i++;
        }
        return (sum + i) - result;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Missing Number.
    Memory Usage: 39.1 MB, less than 100.00% of Java online submissions for Missing Number.
 */
