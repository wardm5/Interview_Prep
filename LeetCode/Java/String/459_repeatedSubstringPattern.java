//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
459. Repeated Substring Pattern
Easy

Given a non-empty string check if it can be constructed by taking a substring of
it and appending multiple copies of the substring together. You may assume the
given string consists of lowercase English letters only and its length will not
exceed 10000.

Example 1:
Input: "abab"
Output: True
Explanation: It's the substring "ab" twice.

Example 2:
Input: "aba"
Output: False
Example 3:

Input: "abcabcabcabc"
Output: True
Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) loop through the string till half the string length
        1.1) if the current index can mod into the length...
            1.1.1) set the temporary length of the string of the substring
            1.1.2) create the substring
            1.1.3) create StringBuilder
            1.1.4) for each substring that fits in the string, append the string to StringBuilder
            1.1.5) if the stringbuilder equals the input string, return true
    2) return false if there was an issue
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public boolean repeatedSubstringPattern(String str) {
        int l = str.length();
        for (int i = l/2; i >= 1; i--) {
            if (l % i == 0) {
                int m = l/i;
                String subS = str.substring(0,i);
                StringBuilder sb = new StringBuilder();
                for (int j=0;j<m;j++)
                    sb.append(subS);
                if(sb.toString().equals(str))
                    return true;
            }
        }
        return false;
    }
}

/*
    Runtime: 16 ms, faster than 65.50% of Java online submissions for Repeated Substring Pattern.
    Memory Usage: 42.3 MB, less than 9.52% of Java online submissions for Repeated Substring Pattern.
*/
