/*
    1295. Find Numbers with Even Number of Digits
    https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/
 */
 
class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;
        for (int i =0; i < nums.length; i++) {
            int count = 0; 
            int val = nums[i];
            while (val > 0) {
                count++;
                val /= 10;
            }
            if (count  % 2 == 0)
                res++;
        }
        return res;
    }
}

/*
    Runtime: 1 ms, faster than 95.47% of Java online submissions for Find Numbers with Even Number of Digits.
    Memory Usage: 38.6 MB, less than 100.00% of Java online submissions for Find Numbers with Even Number of Digits.
 */
