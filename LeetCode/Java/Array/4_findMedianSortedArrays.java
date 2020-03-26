//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
4. Median of Two Sorted Arrays
Hard

There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should
be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.

Example 1:
nums1 = [1, 3]
nums2 = [2]
The median is 2.0

Example 2:
nums1 = [1, 2]
nums2 = [3, 4]
The median is (2 + 3)/2 = 2.5

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create temp array, pointers
    2) while the two pointers are less than the two lists, just place the items sorted into the new array
    3) once you have the completed list, then check if the size of two lists were even or odd, if odd, return mid
    4) else, just return the mid and the mid -1 divided by 2
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] resArr = new int[nums1.length + nums2.length];
        int mid = (nums1.length + nums2.length) / 2;
        int p1 = 0, p2 = 0, index = 0;
        while (p1 + p2 < nums1.length + nums2.length) {
            if (p1 < nums1.length && p2 < nums2.length) {
                if (nums1[p1] < nums2[p2])
                    resArr[index] = nums1[p1++];
                else
                    resArr[index] = nums2[p2++];
            } else if (p1 < nums1.length)
                resArr[index] = nums1[p1++];
            else
                resArr[index] = nums2[p2++];
            index++;
        }
        if (resArr.length == 1)
            return resArr[0];
        if ((nums1.length + nums2.length) % 2 == 0)
            return (double) (resArr[index/2] + resArr[(index/2)-1]) / 2.0;
        return resArr[index/2];
    }
}

/*
    Runtime: 2 ms, faster than 99.81% of Java online submissions for Median of Two Sorted Arrays.
    Memory Usage: 42.1 MB, less than 98.61% of Java online submissions for Median of Two Sorted Arrays.
*/
