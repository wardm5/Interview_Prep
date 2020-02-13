/*
    171. Excel Sheet Column Number
    https://leetcode.com/problems/excel-sheet-column-number/
*/

class Solution {
    public int titleToNumber(String s) {
        int mult = 1;
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int temp = (int) s.charAt(i) - 65 + 1;
            sum += mult * temp;
            mult *= 26;
        }
        return sum;
    }
}

/*
    Runtime: 1 ms, faster than 99.98% of Java online submissions for Excel Sheet Column Number.
    Memory Usage: 36 MB, less than 100.00% of Java online submissions for Excel Sheet Column Number.
*/
