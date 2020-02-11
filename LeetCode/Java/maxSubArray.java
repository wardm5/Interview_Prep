/*
    53. Maximum Subarray
    https://leetcode.com/problems/maximum-subarray/
 */

class Solution {
    public int maxSubArray(int[] nums) {
        int tempSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            tempSum = Math.max(nums[i], tempSum + nums[i]);
            maxSum = Math.max(tempSum, maxSum);
        }
        return maxSum;
    }
}

// class Solution {
//     public int maxSubArray(int[] nums) {
//         int max = Integer.MIN_VALUE;
//         for (int i = 0; i < nums.length; i++) {
//             int tempSum = 0;
//             for (int j = i; j < nums.length; j++) {
//                 tempSum += nums[j];
//                 if (tempSum > max)
//                     max = tempSum;
//             }
//         }
//         return max;
//     }
// }

/*
    Runtime: 45 ms, faster than 6.08% of Java online submissions for Maximum Subarray.
    Memory Usage: 39.8 MB, less than 7.04% of Java online submissions for Maximum Subarray.
 */
