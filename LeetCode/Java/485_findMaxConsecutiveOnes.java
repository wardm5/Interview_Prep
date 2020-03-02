//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create max and temp max variables
    2) loop through binary array
        2.1) if the number is currently 1, then increment tempMax
        2.2) else set temp max to zero
        2.3) check if tempMax is greater than max, if so, set max to tempMax
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int tempMax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                tempMax++;
                if (tempMax > max)
                    max = tempMax;
            }
            else
                tempMax = 0;

        }
        return max;
    }
}

/*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Max Consecutive Ones.
    Memory Usage: 42.5 MB, less than 5.88% of Java online submissions for Max Consecutive Ones.
*/
