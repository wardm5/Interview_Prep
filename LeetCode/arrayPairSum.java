/*
    561. Array Partition I
    https://leetcode.com/problems/array-partition-i/
 */

class Solution {
    public int arrayPairSum(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int val = Math.min(nums[i], nums[i + 1]);
            // System.out.println(val);
            result+= val;
            i++;
        }
        return result;
    }
}

/*
    Runtime: 15 ms, faster than 41.19% of Java online submissions for Array Partition I.
    Memory Usage: 39.4 MB, less than 100.00% of Java online submissions for Array Partition I.
 */
