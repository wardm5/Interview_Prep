/*
    344. Reverse String
    https://leetcode.com/problems/reverse-string/
 */

class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }
}

/*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse String.
    Memory Usage: 47.9 MB, less than 91.12% of Java online submissions for Reverse String.
 */
