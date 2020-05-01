//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
999. Available Captures for Rook
Easy

On an 8 x 8 chessboard, there is one white rook.  There also may be empty squares,
white bishops, and black pawns.  These are given as characters 'R', '.', 'B', and
'p' respectively. Uppercase characters represent white pieces, and lowercase characters
represent black pieces.

The rook moves as in the rules of Chess: it chooses one of four cardinal directions
(north, east, west, and south), then moves in that direction until it chooses to stop,
reaches the edge of the board, or captures an opposite colored pawn by moving to the
same square it occupies.  Also, rooks cannot move into the same square as other
friendly bishops.

Return the number of pawns the rook can capture in one move.

Example 1:
Input: [[".",".",".",".",".",".",".","."],
        [".",".",".","p",".",".",".","."],
        [".",".",".","R",".",".",".","p"],
        [".",".",".",".",".",".",".","."],
        [".",".",".",".",".",".",".","."],
        [".",".",".","p",".",".",".","."],
        [".",".",".",".",".",".",".","."],
        [".",".",".",".",".",".",".","."]]
Output: 3
Explanation:
In this example the rook is able to capture all the pawns.
Example 2:
Input: [[".",".",".",".",".",".",".","."],
        [".","p","p","p","p","p",".","."],
        [".","p","p","B","p","p",".","."],
        [".","p","B","R","B","p",".","."],
        [".","p","p","B","p","p",".","."],
        [".","p","p","p","p","p",".","."],
        [".",".",".",".",".",".",".","."],
        [".",".",".",".",".",".",".","."]]
Output: 0
Explanation:
Bishops are blocking the rook to capture any pawn.
Example 3:
Input: [[".",".",".",".",".",".",".","."],
        [".",".",".","p",".",".",".","."],
        [".",".",".","p",".",".",".","."],
        ["p","p",".","R",".","p","B","."],
        [".",".",".",".",".",".",".","."],
        [".",".",".","B",".",".",".","."],
        [".",".",".","p",".",".",".","."],
        [".",".",".",".",".",".",".","."]]
Output: 3
Explanation:
The rook can capture the pawns at positions b5, d6 and f5.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) iterate through matrix to find the rook, call helper method
        2.1) check boundries once rook is found
        2.2) if the item is a p, then return 1
        2.3) create temp char
        2.4) set the current item to 'B'
        2.5) recursively call other items nearby and return sum
        2.6) set board item to temp
        2.7)
    3) return count
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int numRookCaptures(char[][] board) {
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[i].length; j++)
                if (board[i][j] == 'R')
                    return check(board, i, j, i, j);
        return -1;
    }
    public int check(char[][] board, int i, int j, int rookI, int rookJ) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[i].length || i != rookI && j != rookJ || board[i][j] == 'B')
            return 0;
        if (board[i][j] == 'p')
            return 1;
        char temp = board[i][j];
        board[i][j] = 'B';
        int count = check(board, i - 1, j, rookI, rookJ) +
            check(board, i + 1, j, rookI, rookJ) +
            check(board, i, j + 1, rookI, rookJ) +
            check(board, i, j - 1, rookI, rookJ);
        board[i][j] = temp;
        return count;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Available Captures for Rook.
    Memory Usage: 36.9 MB, less than 13.33% of Java online submissions for Available Captures for Rook.
*/
