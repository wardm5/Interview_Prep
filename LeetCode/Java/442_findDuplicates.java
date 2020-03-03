//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear
twice and others appear once.

Find all the elements that appear twice in this array.

Could you do it without extra space and in O(n) runtime?

Example:
Input:
[4,3,2,7,8,2,3,1]

Output:
[2,3]

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create list for results
    2) loop through input
        2.1) create index for number to make negative or check
        2.2) if the number at that index is negative, add the current absolute number to the list
        2.3) else make that number negative at that index
    3) return list
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0)
                list.add(Math.abs(nums[i]));
            else
                nums[index] = -nums[index];
        }
        return list;
    }
}

/*
    Runtime: 5 ms, faster than 95.29% of Java online submissions for Find All Duplicates in an Array.
    Memory Usage: 48.3 MB, less than 36.11% of Java online submissions for Find All Duplicates in an Array.
*/
