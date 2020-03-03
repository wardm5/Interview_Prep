/*
    912. Sort an Array
    https://leetcode.com/problems/sort-an-array/
*/

class Solution {
    public List<Integer> sortArray(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for(Integer integer : nums)
            list.add(integer);
        return list;
    }
}

/*
    Runtime: 7 ms, faster than 50.17% of Java online submissions for Sort an Array.
    Memory Usage: 45 MB, less than 69.39% of Java online submissions for Sort an Array.
*/
