/*
    442. Find All Duplicates in an Array
    https://leetcode.com/problems/find-all-duplicates-in-an-array/
 */

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] > 0)
                nums[Math.abs(nums[i]) - 1] *= -1;
            else 
                list.add(Math.abs(nums[i]));
        }
        return list;
    }
}

/*
    Runtime: 6 ms, faster than 89.89% of Java online submissions for Find All Duplicates in an Array.
    Memory Usage: 48.2 MB, less than 36.11% of Java online submissions for Find All Duplicates in an Array.
 */
