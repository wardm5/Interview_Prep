/*
    167. Two Sum II - Input array is sorted
    https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null) 
            return new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                arr[0] = map.get(target-numbers[i]) + 1;
                arr[1] = i + 1;
                return arr;
            } else {
                map.put(numbers[i], i);
            }
        }
        return new int[2];
    }
}

/*
    Runtime: 2 ms, faster than 29.82% of Java online submissions for Two Sum II - Input array is sorted.
    Memory Usage: 36.6 MB, less than 100.00% of Java online submissions for Two Sum II - Input array is sorted.
 */
