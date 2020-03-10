//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
657. Robot Return to Origin
Easy

There is a robot starting at position (0, 0), the origin, on a 2D plane. Given
a sequence of its moves, judge if this robot ends up at (0, 0) after it completes
its moves.

The move sequence is represented by a string, and the character moves[i] represents
its ith move. Valid moves are R (right), L (left), U (up), and D (down). If the
robot returns to the origin after it finishes all of its moves, return true.
Otherwise, return false.

Note: The way that the robot is "facing" is irrelevant. "R" will always make
the robot move to the right once, "L" will always make it move left, etc.
Also, assume that the magnitude of the robot's movement is the same for each move.

Example 1:
Input: "UD"
Output: true
Explanation: The robot moves up once, and then down once. All moves have the same
magnitude, so it ended up at the origin where it started. Therefore, we return true.


Example 2:
Input: "LL"
Output: false
Explanation: The robot moves left twice. It ends up two "moves" to the left of
the origin. We return false because it is not at the origin at the end of its moves.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create variables for verticle and horizontal moves
    2) loop through moves
        2.1) if the character is up, then increment vert by one, else if down, decrement
        2.2) if the character is right, then increment horz by one, other wise decrement
    3) return if the vert is zero and the hort is zero
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public boolean judgeCircle(String moves) {
        int vert = 0;
        int horz = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'U')
                vert++;
            if (c == 'D')
                vert--;
            if (c == 'L')
                horz++;
            if (c == 'R')
                horz--;
        }
        return (vert == 0 && horz == 0);
    }
}

/*
    Runtime: 4 ms, faster than 90.42% of Java online submissions for Robot Return to Origin.
    Memory Usage: 41.4 MB, less than 5.40% of Java online submissions for Robot Return to Origin.
*/
