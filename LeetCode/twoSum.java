//  1. Two Sum
//  Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//  You may assume that each input would have exactly one solution, and you may not use the same element twice.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> store = new HashMap<>();
        int i = 0;
        store.put(target - nums[i], i);
        i++;
        while (!store.containsKey(nums[i])) {
            store.put(target - nums[i], i);
            i++;
        }
        return new int[]{store.get(nums[i]), i};
    }
}
