//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
1232. Check If It Is a Straight Line

You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents
the coordinate of a point. Check if these points make a straight line in the XY plane.

Example 1:
Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
Output: true

Example 2:
Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
Output: false

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) if there are two or less points, then return true
    2) create m value, b value
    3) for each cordinate, check to see if the y matches the line formula y value
        3.1) if it does not match, then return false
    4) return true
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public boolean checkStraightLine(int[][] cords) {
        if (cords.length <= 2)
            return true;
        double m = (double) (cords[1][1] - cords[0][1]) / (double) (cords[1][0] - cords[0][0]);
        double b = - (m * (double) cords[0][0]) + (double) cords[0][1];
        for (int[] cord : cords)
            if (cord[1] != m * cord[0] + b)
                return false;
        return true;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Check If It Is a Straight Line.
    Memory Usage: 39.2 MB, less than 100.00% of Java online submissions for Check If It Is a Straight Line.
*/
