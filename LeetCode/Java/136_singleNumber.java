//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a non-empty array of integers, every element appears twice except for one.
Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it
without using extra memory?

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    Orginal Approach:
    1) create set
    2) loop through nums
    3) if the set continas the number, remove it
    4) if not, add to set
    5) once loop ends, return only item in set

    Updated Approach:
    1) create res int value
    2) loop through nums
    3) xor the value from res
    4) return res after loop completes
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
        // HashSet<Integer> set = new HashSet<>();
        // int res = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     if (set.contains(nums[i]))
        //         res-= nums[i];
        //     else
        //         res += nums[i];
        //     set.add(nums[i]);
        // }
        // return res;
        // for (int i = 0; i < nums.length; i++) {
        //     if (set.contains(nums[i]))
        //         set.remove(nums[i]);
        //     else
        //         set.add(nums[i]);
        // }
        // return set.iterator().next();
    }
}
/*
    Orginal Approach:
    Runtime: 5 ms, faster than 41.97% of Java online submissions for Single Number.
    Memory Usage: 41.6 MB, less than 62.22% of Java online submissions for Single Number.

    Updated Approach:
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Single Number.
    Memory Usage: 42.3 MB, less than 5.19% of Java online submissions for Single Number.
*/
