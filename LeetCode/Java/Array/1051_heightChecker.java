//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Students are asked to stand in non-decreasing order of heights for an annual photo.

Return the minimum number of students that must move in order for all students
to be standing in non-decreasing order of height.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create copy array, fill it with input array, create count
    2) sort copy array
    3) loop through both arrays, check if there numbers do not match
    4) if numbers do not match, increment count
    5) return count
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int heightChecker(int[] heights) {
        int[] copy = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            copy[i] = heights[i];
        }
        Arrays.sort(copy);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (copy[i] != heights[i])
                count++;
        }
        return count;
    }
}

/*
    Runtime: 1 ms, faster than 83.18% of Java online submissions for Height Checker.
    Memory Usage: 37.5 MB, less than 100.00% of Java online submissions for Height Checker.
*/
