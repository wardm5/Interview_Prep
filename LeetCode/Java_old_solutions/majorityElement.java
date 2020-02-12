/*
    169. Majority Element
    https://leetcode.com/problems/majority-element/
 */

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i :nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : map.keySet()) {
            int val = map.get(i);
            if (val > nums.length / 2)
                return i;
        }
        return -1;
    }
}

/*
    Runtime: 11 ms, faster than 39.84% of Java online submissions for Majority Element.
    Memory Usage: 40.9 MB, less than 99.26% of Java online submissions for Majority Element.
 */
