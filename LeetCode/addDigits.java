/*
    258. Add Digits
    https://leetcode.com/problems/add-digits/
 */

class Solution {
    public int addDigits(int num) {
        int result = Integer.MAX_VALUE; 
        while (result >= 10) {
            int temp = 0;
            while (num > 0) {
                if (result < 10)
                    return result;
                temp += num % 10;
                num /= 10;
            }
            num = temp;
            result = temp;
        }
        return result;
    }
}

/*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Digits.
    Memory Usage: 33.4 MB, less than 6.67% of Java online submissions for Add Digits.
 */
