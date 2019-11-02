  /*
    137. Single Number II
    https://leetcode.com/problems/single-number-ii/
 */

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Integer res : map.keySet() ) {
            if (map.get(res) == 1) 
                return res;
        }
        return -1; 
    }
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if (nums[i-1] != nums[i] && count == 1)  
                return nums[i-1];
            else if (nums[i - 1] != nums[i])
                count = 1;
            else 
                count++;
        }
        return nums[nums.length - 1];
    }
}

/*
    Runtime: 2 ms, faster than 62.78% of Java online submissions for Single Number II.
    Memory Usage: 37.2 MB, less than 100.00% of Java online submissions for Single Number II.
 */
