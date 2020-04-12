//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
283. Move Zeroes
Easy

Given an array nums, write a function to move all 0's to the end of it while
maintaining the relative order of the non-zero elements.

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
    1) create variable for a,
    2) for each value, check if the value is zero, if not set that number to the current val
    3) while a is less than the length of the array, add 0's to the end of the array
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public void moveZeroes(int[] nums) {
        int a = 0 ;
        for (int val : nums)
            if(val != 0)
                nums[a++] = val;
        while(a < nums.length)
            nums[a++] = 0;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
    Memory Usage: 39.8 MB, less than 10.49% of Java online submissions for Move Zeroes.
*/
