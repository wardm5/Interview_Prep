//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a binary matrix A, we want to flip the image horizontally, then invert it,
and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.
For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].

To invert an image means that each 0 is replaced by 1, and each 1 is replaced
by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) loop through rows of matrix
    2) loop check to see if column length is even or not
    3) if it is even, loop through and flip the front and end indexes but include i
    4) if it is not, loop through and flip the front and end indexes but not equal to i
    5) return A
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0 ; i < A.length; i++) {
            if (A[0].length % 2 == 0)
                flipAndReverseEven(A, i);
            else
                flipAndReverseOdd(A, i);
        }
        return A;
    }
    public void flipAndReverseOdd(int[][] matrix, int row) {
        for (int i = 0; i <= matrix[row].length / 2; i++) {
            int front = reverse(matrix[row][i]);
            int back = reverse(matrix[row][matrix[row].length - i- 1]);
            matrix[row][i] = back;
            matrix[row][matrix[row].length - i- 1] = front;
        }
    }
    public void flipAndReverseEven(int[][] matrix, int row) {
        for (int i = 0; i < matrix[row].length / 2; i++) {
            int front = reverse(matrix[row][i]);
            int back = reverse(matrix[row][matrix[row].length - i- 1]);
            matrix[row][i] = back;
            matrix[row][matrix[row].length - i- 1] = front;
        }
    }
    public int reverse(int val) {
        if (val == 0)
            return 1;
        return 0;

    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Flipping an Image.
    Memory Usage: 41 MB, less than 50.00% of Java online submissions for Flipping an Image.
*/
