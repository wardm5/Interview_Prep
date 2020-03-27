//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
171. Excel Sheet Column Number
Easy

797

138

Add to List

Share
Given a column title as appear in an Excel sheet, return its corresponding column
number.

For example:
    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28
    ...
Example 1:
Input: "A"
Output: 1

Example 2:
Input: "AB"
Output: 28

Example 3:
Input: "ZY"
Output: 701

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1)  create variable for sum, multiple
    2) for each letter starting from the end
        2.1) get the temp value of the char
        2.2) increment sum by the temp by the multiple
        2.3) multiply multiple by 26
    3) return sum
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int titleToNumber(String s) {
        int sum = 0;
        int mult = 1;
        for (int i = s.length()-1; i>=0; i--) {
            sum += mult * (s.charAt(i)-64);
            mult *= 26;
        }
        return sum;
    }
}

/*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Excel Sheet Column Number.
    Memory Usage: 39.8 MB, less than 5.88% of Java online submissions for Excel Sheet Column Number.
*/
