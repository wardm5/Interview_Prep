//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you
climb to the top?

Note: Given n will be a positive integer.

Example 1:
Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:
Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) This problem is an application of the fibinacci problem
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int climbStairs(int n) {
        int a = 0;
        int b = 1;
        int c = a + b;

        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
    Memory Usage: 36.1 MB, less than 5.26% of Java online submissions for Climbing Stairs.
*/
