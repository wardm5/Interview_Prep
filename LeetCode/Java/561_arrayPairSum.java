//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given an array of 2n integers, your task is to group these integers into n pairs
of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi)
for all i from 1 to n as large as possible.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) sort input array
    2) create result
    3) loop through nums but increment by 2
        4) add nums[i] to result
    5) return result
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length; i+= 2) {
            res += nums[i];
        }
        return res;
    }
}

/*
    Runtime: 10 ms, faster than 94.57% of Java online submissions for Array Partition I.
    Memory Usage: 43.4 MB, less than 14.29% of Java online submissions for Array Partition I.
*/
