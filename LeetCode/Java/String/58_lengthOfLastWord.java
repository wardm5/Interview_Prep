//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
58. Length of Last Word
Easy

Given a string s consists of upper/lower-case alphabets and empty space
characters ' ', return the length of last word (last word means the last
appearing word if we loop from left to right) in the string.

If the last word does not exist, return 0.

Note: A word is defined as a maximal substring consisting of non-space characters only.

Example:
Input: "Hello World"
Output: 5

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create index variable
    2) while index is greater than or equal to 0 and the character is a space, decrement i
    3) create count varaible
    4) while index is greater than or equal to 0, check if the character is not a space, otherwise increase count
    5) return count
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0, i = s.length()-1;
        while (i >= 0 && s.charAt(i) == ' ')
            i--;
        int count = 0;
        while (i >= 0 && s.charAt(i--) != ' ') {
            count++;
            i--;
        }
        return count;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Length of Last Word.
    Memory Usage: 37.5 MB, less than 76.86% of Java online submissions for Length of Last Word.
*/
