/*
    389. Find the Difference
    https://leetcode.com/problems/find-the-difference/submissions/
 */

class Solution {
    public char findTheDifference(String s, String t) {
        int sum = 0;
        for (int i = 0; i < t.length(); i++) {
            if (i < s.length())
                sum += (int) s.charAt(i);
            sum -= (int) t.charAt(i);
        }
        return (char) Math.abs(sum);
    }
}

/*
    Runtime: 1 ms, faster than 98.85% of Java online submissions for Find the Difference.
    Memory Usage: 35.7 MB, less than 100.00% of Java online submissions for Find the Difference.
 */
