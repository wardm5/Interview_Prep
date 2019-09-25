/*
    821. Shortest Distance to a Character
    https://leetcode.com/problems/shortest-distance-to-a-character/
 */
 
class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] forwards = new int[S.length()];
        int[] backwards = new int[S.length()];
        int end = S.length() - 1;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C)
                forwards[i] = 0;
            else if (i >= 1 && forwards[i-1] != Integer.MAX_VALUE)
                forwards[i] = forwards[i-1] + 1;
            else 
                forwards[i] = Integer.MAX_VALUE;
        }
        for (int i = S.length()-1; i >= 0; i--) {
            if (S.charAt(i) == C)
                backwards[i] = 0;
            else if (i < S.length()-1 && backwards[i+1] != Integer.MAX_VALUE)
                backwards[i] = backwards[i+1] + 1;
            else 
                backwards[i] = Integer.MAX_VALUE;
            forwards[i] = Math.min(forwards[i], backwards[i]);
        }
        return forwards;
    }
}

/*
    Runtime: 1 ms, faster than 98.62% of Java online submissions for Shortest Distance to a Character.
    Memory Usage: 36.7 MB, less than 100.00% of Java online submissions for Shortest Distance to a Character.
 */
