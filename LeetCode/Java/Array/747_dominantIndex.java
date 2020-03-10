//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
747. Largest Number At Least Twice of Others
Easy

In a given integer array nums, there is always exactly one largest element.

Find whether the largest element in the array is at least twice as much as every
other number in the array.

If it is, return the index of the largest element, otherwise return -1.

Example 1:
Input: nums = [3, 6, 1, 0]
Output: 1
Explanation: 6 is the largest integer, and for every other number in the array x,
6 is more than twice as big as x.  The index of value 6 is 1, so we return 1.

Example 2:
Input: nums = [1, 2, 3, 4]
Output: -1
Explanation: 4 isn't at least as big as twice the value of 3, so we return -1.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) check if the length is less than or equal to 1, if not return 0
    2) create variables
    3) loop through input values
        3.1) if the max is less than the current number, then set second max to max, max to curr
        3.2) if the second max is greater than the current, then replace second max with current
    4) if the second max is equal to 0, return the result (-1)
    5) if the max divided by the second max is greater than or equal to 2, return res
    6) otherwise -1
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int dominantIndex(int[] nums) {
        if (nums.length <= 1)
            return 0;
        int res = -1;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                secondMax = max;
                max =nums[i];
                res = i;
                continue;
            }
            if (secondMax < nums[i])
                secondMax = nums[i];
        }
        if (secondMax == 0 && max >=1)
            return res;
        if (max / secondMax >= 2)
            return res;
        return -1;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Largest Number At Least Twice of Others.
    Memory Usage: 38.1 MB, less than 54.29% of Java online submissions for Largest Number At Least Twice of Others.
*/
