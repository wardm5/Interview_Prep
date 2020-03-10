//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find
the one that is missing from the array.

Example 1:
Input: [3,0,1]
Output: 2

Example 2:
Input: [9,6,4,2,3,5,7,0,1]
Output: 8
Note:
Your algorithm should run in linear runtime complexity. Could you implement it
using only constant extra space complexity?

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create sum and numbers sum variable
    2) loop through each number, add the number in the list to the sum, add the index to the numers sum
    3) subtract sum from numsSum and add the length of the array, return this value as answer
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int numsSum = 0;
        for (int i = 0; i < nums.length; i++) {
            numsSum +=nums[i];
            sum+= i;
        }
        return sum - numsSum + nums.length;
    }
}

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Missing Number.
Memory Usage: 43.1 MB, less than 5.26% of Java online submissions for Missing Number.
*/
