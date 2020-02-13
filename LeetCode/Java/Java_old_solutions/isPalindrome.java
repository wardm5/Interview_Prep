/*
    125. Valid Palindrome
    https://leetcode.com/problems/valid-palindrome/submissions/
 */

class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0)
            return true;
        int left = 0;
        int right = s.length()-1;
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left)))
                left++;
            else if (!Character.isLetterOrDigit(s.charAt(right)))
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
    Runtime: 2 ms, faster than 99.18% of Java online submissions for Valid Palindrome.
    Memory Usage: 38.7 MB, less than 72.32% of Java online submissions for Valid Palindrome.
 */
