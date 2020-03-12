//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
461. Hamming Distance
Easy

The Hamming distance between two integers is the number of positions at which
the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:

Input: x = 1, y = 4
Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create count variable
    2) while x or y is greater than 0
        2.1) check to see if the value mod 2 for x and y do not equal each other, else increment count
        2.2) divide x and y by two
    3) return count
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        while (x > 0 || y > 0) {
            if (x % 2  != y % 2)
                count++;
            x /= 2;
            y /= 2;
        }
        return count;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Hamming Distance.
    Memory Usage: 36.4 MB, less than 5.09% of Java online submissions for Hamming Distance.
*/
