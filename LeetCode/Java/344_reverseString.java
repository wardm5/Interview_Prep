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
    1) loop through string
    2) create start char
    3) set s[index] to s[index - 1 - i]
    4) set s[index - 1 - i] to start
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++) {
            char start = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = start;
        }
    }
}

/*
    Runtime: 1 ms, faster than 99.10% of Java online submissions for Reverse String.
    Memory Usage: 43.4 MB, less than 99.41% of Java online submissions for Reverse String.
*/
