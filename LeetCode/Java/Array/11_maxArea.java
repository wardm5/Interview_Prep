//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
11. Container With Most Water
Medium

Given n non-negative integers a1, a2, ..., an , where each represents a point
at coordinate (i, ai). n vertical lines are drawn such that the two endpoints
of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis
forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.

The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this
case, the max area of water (blue section) the container can contain is 49.

Example:
Input: [1,8,6,2,5,4,8,3,7]
Output: 49

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create variables for left, right, and result
    2) while the left is less than right pointer
        2.1) if the min of the values at the left and right pointers times the space between then is greater than res, set res to that value
        2.2) if the value in the left is less than the value on the right, then increment left
        2.3) else increment right
    3) return result
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1, res = 0;
        while (left < right) {
            if (res < (Math.min(height[left], height[right]) * (right - left)))
                res = Math.min(height[left], height[right]) * (right - left);
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return res;
    }
}

/*
    Runtime: 2 ms, faster than 94.65% of Java online submissions for Container With Most Water.
    Memory Usage: 39.6 MB, less than 96.15% of Java online submissions for Container With Most Water.
*/
