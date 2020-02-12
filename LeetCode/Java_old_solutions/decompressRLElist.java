/*
    1313. Decompress Run-Length Encoded List
    https://leetcode.com/problems/decompress-run-length-encoded-list/
 */

class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int amountToAdd = nums[i];
            for (int j = 0; j < amountToAdd; j++)
                list.add(nums[i+1]);
            i++;
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) 
            res[i] = list.get(i);
        return res;
    }
}

/*
    Runtime: 3 ms, faster than 64.35% of Java online submissions for Decompress Run-Length Encoded List.
    Memory Usage: 41.7 MB, less than 100.00% of Java online submissions for Decompress Run-Length Encoded List.
 */
