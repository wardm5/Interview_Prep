//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------
Problem:
215. Kth Largest Element in an Array
Medium

Find the kth largest element in an unsorted array. Note that it is the kth largest 
element in the sorted order, not the kth distinct element.

Example 1:
Input: [3,2,1,5,6,4] and k = 2
Output: 5

Example 2:
Input: [3,2,3,1,2,4,5,5,6] and k = 4
Output: 4

Note:
You may assume k is always valid, 1 ≤ k ≤ array's length.
-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create priority queue
    2) loop through numbers, put into priority queue
    3) while k is greater than 0, then subtract k, set res to that number
    4) return result integer
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            q.add(nums[i]);
        }
        int res = 0;
        while(k > 0) {
            k--;
            res = q.remove();
        }
        return res;
    }
}

/*
    Runtime: 5 ms, faster than 44.42% of Java online submissions for Kth Largest Element in an Array.
    Memory Usage: 41 MB, less than 5.18% of Java online submissions for Kth Largest Element in an Array.
*/
