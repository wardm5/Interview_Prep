/*
    771. Jewels and Stones
    https://leetcode.com/problems/jewels-and-stones/
 */

class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            String temp = Character.toString(S.charAt(i));
            if (J.contains(temp))
                count++;
        }
        return count;
    }
}

/*
    Runtime: 1 ms, faster than 93.41% of Java online submissions for Jewels and Stones.
    Memory Usage: 35 MB, less than 97.47% of Java online submissions for Jewels and Stones.
 */
