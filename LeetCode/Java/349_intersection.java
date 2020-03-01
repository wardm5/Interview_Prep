//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create set to store the items
    2) loop through nums1 array, store in set
    3) create intersection set`
    4) loop through second array, check if the item is in the orginal set, if so, add to the intersection set
    5) create result array and then fill the result with the items in the set
    6) return result array
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i =0 ;i < nums1.length; i++)
            set.add(nums1[i]);
        HashSet<Integer> resSet = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i]))
                resSet.add(nums2[i]);
        }
        int[] res = new int[resSet.size()];
        int count = 0;
        for (int key : resSet) {
            res[count] = key;
            count++;
        }
        return res;
    }
}

/*
    Runtime: 3 ms, faster than 55.32% of Java online submissions for Intersection of Two Arrays.
    Memory Usage: 40 MB, less than 6.75% of Java online submissions for Intersection of Two Arrays.
*/
