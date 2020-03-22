//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------
Problem:
414. Third Maximum Number
Easy

Given a non-empty array of integers, return the third maximum number in this array. 
If it does not exist, return the maximum number. The time complexity must be in O(n).

Example 1:
Input: [3, 2, 1]
Output: 1
Explanation: The third maximum is 1.

Example 2:
Input: [1, 2]
Output: 2
Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
Example 3:

Input: [2, 2, 3, 1]
Output: 1
Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) using priority queue to keep track of items
    2) if the size of the set is less than 2, then return the first in the queue
    3) return the 3rd item in the queue
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int item : nums) {
            if (!set.add(item))
                continue;
            q.add(item);
        }
        int counter = 0;
        int res = 0;
        if (set.size() <= 2)
            return q.remove();
        while (!q.isEmpty() && counter < 3) {           
            res = q.remove();
            counter++;
        }
        return res;
    }
}
class Solution {
    public int thirdMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int res = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= max && set.add(nums[i])) {
                res = max2;
                max2 = max;
                max = nums[i];
            } else if (nums[i] > max2 && set.add(nums[i])) {
                res = max2;
                max2 = nums[i];
            } else if (nums[i] >= res && set.add(nums[i])) {
                res = nums[i];
            }
        }
        if (set.size() <= 2)
            return max;
        return res;
    }
}

/*
    Runtime: 3 ms, faster than 50.33% of Java online submissions for Third Maximum Number.
    Memory Usage: 41.4 MB, less than 8.70% of Java online submissions for Third Maximum Number.
*/
