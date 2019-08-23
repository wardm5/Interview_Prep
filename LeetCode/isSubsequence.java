/*
    392. Is Subsequence
    https://leetcode.com/problems/is-subsequence/
 */

class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        int val = 0, i = 0;
        while (val1 < s.length() && i < t.length()) {
            if (s.charAt(val) == t.charAt(i))
                val++;
            i++;
        }
        return !(val < s.length());
    }
}

/*
    Runtime: 17 ms, faster than 49.41% of Java online submissions for Is Subsequence.
    Memory Usage: 49.6 MB, less than 100.00% of Java online submissions for Is Subsequence.
 */
