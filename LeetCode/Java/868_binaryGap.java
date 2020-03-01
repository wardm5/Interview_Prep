//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a positive integer N, find and return the longest distance between two
consecutive 1's in the binary representation of N.

If there aren't two consecutive 1's, return 0.



Example 1:

Input: 22
Output: 2
Explanation:
22 in binary is 0b10110.
In the binary representation of 22, there are three ones, and two consecutive pairs of 1's.
The first consecutive pair of 1's have distance 2.
The second consecutive pair of 1's have distance 1.
The answer is the largest of these two distances, which is 2.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create count, tempCount and firstOne varaibles
    2) while N is greater than zero:
        2.1) if you hit the first one, set first one variable to true
        2.2) if the number goes from a one to a zero, start incrementing tempCount
        2.3) if the value hits a one and the first one variable is true, then check if the temp count is greater than count
            2.3.1) if the count is greater, then set count to temp count
            2.3.2) reset the tempCount to one
        2.4) divide the input number by 2
    3) return count
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int binaryGap(int N) {
        int count = 0;
        int tempCount = 1;
        boolean firstOne = false;
        while (N > 0) {
            if (N % 2 != 0 && !firstOne)
                firstOne = true;
            else if (N % 2 == 0 && firstOne)
                tempCount++;
            else if (N % 2 != 0 && firstOne) {
                if (tempCount > count)
                    count = tempCount;
                tempCount = 1;
            }
            N /= 2;
        }
        return count;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Gap.
    Memory Usage: 36.3 MB, less than 7.14% of Java online submissions for Binary Gap.
*/
