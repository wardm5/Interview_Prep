//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------
Problem:
283. Move Zeroes
Easy

Given an array nums, write a function to move all 0's to the end of it while maintaining 
the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) check length, if 0, then return
    2) create variable storing index
    3) loop through numbers
        3.1) if the number is not 0, then move the numbers to the index, increment index
    4) while the index is less than the length of the input array, add zeros to that index, increment
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 0) return;
        int a = 0 ;
        for (int val : nums) {
            if(val != 0) {
                nums[a++] = val;
            }
        }
        while(a < nums.length) {
            nums[a++] = 0;
        }
    }
}

/*
  Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
  Memory Usage: 42.3 MB, less than 5.59% of Java online submissions for Move Zeroes.
*/
