//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
42. Trapping Rain Water
Hard

Given n non-negative integers representing an elevation map where the width of
each bar is 1, compute how much water it is able to trap after raining.


The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In
this case, 6 units of rain water (blue section) are being trapped. Thanks Marcos
for contributing this image!

Example:
Input: [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create variable for first and last varaibles, then first and last highs, then result
    2) while the first is less than or equal to last
        2.1) create temp heights storing first and last heights
        2.2) if the temp heights are greater than the max heights
        2.3) if the first is higher than the last, then add the potential vally, increment first
        2.4) if the last high is greater than first, then add the potential valley, increment last
        2.5) if the last equals last, calculate valleys, return result
        2.6) else just calculate valleys and then increment and decerement left and first
    3) return result
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int trap(int[] height) {
        int first = 0;
        int last = height.length-1;
        int firstHigh = 0;
        int lastHigh = 0;
        int result = 0;

        while (first <= last) {
            // setting up temp variables
            int firstTempHeight = height[first];
            int lastTempHeight = height[last];
            // updating the max heights
            if (firstHigh < firstTempHeight)
                firstHigh = firstTempHeight;
            if (lastHigh < lastTempHeight)
                lastHigh = lastTempHeight;
            // different height
            if (firstHigh < lastHigh) {
                result += firstHigh - height[first];
                first++;
                continue;
            }
            if (lastHigh < firstHigh) {
                result += lastHigh - height[last];
                last--;
                continue;
            }
            if (last == first) {
                result += lastHigh - height[last];
                return result;
            }
            // same height
            result += lastHigh - height[last];
            result += firstHigh - height[first];
            first++;
            last--;
        }
        return result;
    }
}

/*
    Runtime: 1 ms, faster than 94.21% of Java online submissions for Trapping Rain Water.
    Memory Usage: 38.7 MB, less than 58.91% of Java online submissions for Trapping Rain Water.
*/
