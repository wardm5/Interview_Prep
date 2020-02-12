/*
    1221. Split a String in Balanced Strings
    https://leetcode.com/problems/split-a-string-in-balanced-strings/submissions/
 */

class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int left = 0;
        int right = 0;
        for (int i =0; i < s.length(); i++) {
            char val = s.charAt(i);
            if (val == 'L' && right == 0)
                left++;
            else if (val == 'L' && right > 0)
                right--;
            else if (val == 'R' && left == 0)
                right++;
            else 
                left--;
            if (left == 0 && right == 0)
                count++;
        }
        return count;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Split a String in Balanced Strings.
    Memory Usage: 37.6 MB, less than 100.00% of Java online submissions for Split a String in Balanced Strings.
 */
