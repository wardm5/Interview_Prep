/*
    349. Intersection of Two Arrays
    https://leetcode.com/problems/intersection-of-two-arrays/
 */

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        if (nums1.length > nums2.length)
            return helper(nums1, nums2, set);
        else
            return helper(nums2, nums1, set);
    }
    public int[] helper(int[] nums1, int[] nums2, HashSet<Integer> set) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            set.add(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            if (set.contains(nums1[i]))
                list.add(nums1[i]);
            set.remove(nums1[i]);
            
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}

/*
    Runtime: 2 ms, faster than 98.42% of Java online submissions for Intersection of Two Arrays.
    Memory Usage: 36.4 MB, less than 89.19% of Java online submissions for Intersection of Two Arrays.
 */
