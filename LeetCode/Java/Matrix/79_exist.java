//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
79. Word Search
Medium

Given a 2D board and a word, find if the word exists in the grid.

The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

Example:
board =
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]

Given word = "ABCCED", return true.
Given word = "SEE", return true.
Given word = "ABCB", return false.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) loop through matrix, if the first char in the word matches the char in the index, call recusion function
        2) if the position for the word is past or equal to the word, return true
        3) check bounds of the indexes
        4) if the word at the point is not the next letter in the word or a '.', return false
        5) recusively call going up, down, left and right
    6) return false if you did not find anything s
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[i].length; j++)
                if (board[i][j] == word.charAt(0) && helper(board, i, j, word, 0))
                    return true;
        return false;
    }
    public boolean helper(char[][] board, int i, int j, String word, int position) {
        if (position >= word.length())
            return true;
        if (i < 0 || j < 0 || i >= board.length || j >= board[i].length)
            return false;
        if (word.charAt(position) != board[i][j] || board[i][j]=='.')
            return false;
        char temp = board[i][j];
        board[i][j] = '.';
        boolean res = helper(board, i+1, j, word, position+1)
            || helper(board, i-1, j, word, position+1)
            || helper(board, i, j+1, word, position+1)
            || helper(board, i, j-1, word, position+1);
        board[i][j] = temp;
        return res;
    }
}

/*
    Runtime: 4 ms, faster than 98.78% of Java online submissions for Word Search.
    Memory Usage: 42.9 MB, less than 20.41% of Java online submissions for Word Search.
*/
