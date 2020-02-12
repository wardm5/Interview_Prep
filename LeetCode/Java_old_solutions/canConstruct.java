/*
    383. Ransom Note
    https://leetcode.com/problems/sum-root-to-leaf-numbers/discuss/365541/Java-Solution
 */

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for (char ran : ransomNote.toCharArray()) {
            if (!map.containsKey(ran))
                return false;
            if (map.get(ran) == 0)
                return false;
            map.put(ran, map.get(ran) - 1);
        }
        return true;
    }
}

/*
    Runtime: 30 ms, faster than 10.39% of Java online submissions for Ransom Note.
    Memory Usage: 37.9 MB, less than 100.00% of Java online submissions for Ransom Note.
 */
