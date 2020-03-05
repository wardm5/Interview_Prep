//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a non-negative integer num, repeatedly add all its digits until the result
has only one digit.

Example:
Input: 38
Output: 2
Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
             Since 2 has only one digit, return it.
Follow up:
Could you do it without any loop/recursion in O(1) runtime?

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1)  if the number is negative, store negative
    2) while number is greater than call helper
        2.1) create temp int
        2.2) while the number is greater than 0, add the mod of the number to the temp, divide number by 10
        2.3) return temp
    3) return num * res
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int addDigits(int num) {
        int mult = 1;
        if (num < 0)
            mult = -1;
        while (num > 9) {
            num = helper(num);
        }
        return num * mult;
    }
    public int helper(int num) {
        int temp = 0;
        while (num > 0) {
            temp += num % 10;
            num /=10;
        }
        return temp;
    }
}

/*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Digits.
    Memory Usage: 36.8 MB, less than 6.67% of Java online submissions for Add Digits.
*/
