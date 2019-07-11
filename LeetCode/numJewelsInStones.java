/*
    771. Jewels and Stones
    https://leetcode.com/problems/jewels-and-stones/
 */

class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }
        for (int i = 0; i < S.length(); i++) {
            if (set.contains(S.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}

/*
    Runtime: 1 ms, faster than 95.38% of Java online submissions for Jewels and Stones.
    Memory Usage: 34.7 MB, less than 99.76% of Java online submissions for Jewels and Stones.
 */
