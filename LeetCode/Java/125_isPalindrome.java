//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
125. Valid Palindrome
Easy

Given a string, determine if it is a palindrome, considering only alphanumeric
characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:
Input: "A man, a plan, a canal: Panama"
Output: true

Example 2:
Input: "race a car"
Output: false

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create right and left variables
    2) while the left is less or equal to the right
        2.1) check if the character at left index is number or letter, otherwise increment
        2.2) check if the character at the right index is the number or letter, otherwise decrement
        2.3) check if the characters match, if not, then return false, else increment left and decrement right
    3) return true
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while (left <= right) {
            if (!Character.isLetter(s.charAt(left)) && !Character.isDigit(s.charAt(left)))
                left++;
            else if (!Character.isLetter(s.charAt(right)) && !Character.isDigit(s.charAt(right)))
                right--;
            else if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                return false;
            else {
                left++;
                right--;
            }
        }
        return true;
    }
}

/*
    Runtime: 3 ms, faster than 73.14% of Java online submissions for Valid Palindrome.
    Memory Usage: 38.8 MB, less than 69.64% of Java online submissions for Valid Palindrome.
*/
