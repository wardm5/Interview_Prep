/*
    217. Contains Duplicate
    https://leetcode.com/problems/contains-duplicate/
 */

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return (set.size() != nums.length);
    }
}

/*
    Runtime: 8 ms, faster than 68.04% of Java online submissions for Contains Duplicate.
    Memory Usage: 43 MB, less than 96.55% of Java online submissions for Contains Duplicate.
 */
