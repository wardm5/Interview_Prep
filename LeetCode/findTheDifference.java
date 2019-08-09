/*
    389. Find the Difference
    https://leetcode.com/problems/find-the-difference/submissions/
 */

class Solution {
    public char findTheDifference(String s, String t) {
        int s1 = 0;
        int s2 = 0;
        for (int i = 0; i < t.length(); i++) {
            if (i < s.length())
                s1 += (int) s.charAt(i);
            s2 += (int) t.charAt(i);
        }
        // System.out.println((s1-s2) + "  " + s1 + "  " + s2);
        return (char) (Math.abs(s1-s2));
    }
}

/*
    Runtime: 1 ms, faster than 98.85% of Java online submissions for Find the Difference.
    Memory Usage: 35.7 MB, less than 100.00% of Java online submissions for Find the Difference.
 */
