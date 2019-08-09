/*
    66. Plus One
    https://leetcode.com/problems/plus-one/
 */

class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length - 1;
        if (digits[length] + 1 < 10) {
            digits[length] = digits[length] + 1;
            return digits;
        }
        while (length > 0) {
            digits[length] = 0;
            if (digits[length - 1] + 1 < 10) {
                digits[length - 1] = digits[length - 1] + 1;
                return digits;
            }
            length--;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
    Memory Usage: 35 MB, less than 99.19% of Java online submissions for Plus One.
 */
