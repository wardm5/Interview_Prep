//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given an integer array nums, find the contiguous subarray (containing at least one
number) which has the largest sum and return its sum.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create two variables tempMax and max
    2) loop through nums
        3) set tempMax to the max of the current number or tempMax + current num
        4) set max to max of max, or tempMax
    5) return max
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int maxSubArray(int[] nums) {
        int tempMax = nums[0];
        int max = nums[0];
        for (int i = 1 ; i < nums.length; i++) {
            tempMax = Math.max(nums[i], tempMax+nums[i]);
            max = Math.max(max, tempMax);
        }
        return max;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Subarray.
    Memory Usage: 41.2 MB, less than 5.16% of Java online submissions for Maximum Subarray.
*/
