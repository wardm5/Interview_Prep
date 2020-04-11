//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
168. Excel Sheet Column Title

Given a positive integer, return its corresponding column title as appear in an
Excel sheet.

For example:
    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB
    ...
Example 1:
Input: 1
Output: "A"

Example 2:
Input: 28
Output: "AB"

Example 3:
Input: 701
Output: "ZY"

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create StringBuilder
    2) while the input is greater than n
        2.1) if n mod 26 equals 0, then inesrt z, divide number by 26, subtract n by 1
        2.2) else get the char of the value, insert into builder, divide number by 26
    3) return build's to string
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public String convertToTitle(int n) {
        StringBuilder build = new StringBuilder();
        while (n > 0) {
            if (n % 26 == 0) {
                build.insert(0, 'Z');
                n /= 26;
                n -= 1;
            } else {
                char temp = (char) ((n % 26) +64);
                build.insert(0, temp);
                n /= 26;
            }
        }
        return build.toString();
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Excel Sheet Column Title.
    Memory Usage: 36.7 MB, less than 5.13% of Java online submissions for Excel Sheet Column Title.
*/
