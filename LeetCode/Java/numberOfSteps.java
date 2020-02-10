 /*
    258. Add Digits
    https://leetcode.com/problems/add-digits/
 */

class Solution {
    public int numberOfSteps (int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) 
                num /= 2;
            else
                num -= 1;
            steps++;
        }
        return steps;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Steps to Reduce a Number to Zero.
    Memory Usage: 36.3 MB, less than 100.00% of Java online submissions for Number of Steps to Reduce a Number to Zero.
*/
