//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
The Tribonacci sequence Tn is defined as follows:

T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

Given n, return the value of Tn.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create array of the size + 1
    2) if n equals 0, then return 0
    3) if n equals 1, then return 1
    4) if n equals 2, then return 1
    5) if n equals 3, then return 2
    6) create values in the array
    7) loop through 4 to n and add values, place into array
    8) return result array at nth position

*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int tribonacci(int n) {
        int[] res = new int[n + 1];
        if (n <= 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;
        res[0] = 0;
        res[1] = 1;
        res[2] = 1;
        res[3] = 2;
        for (int i = 4; i <= n; i++) {
            res[i] = res[i-1] + res[i-2] + res[i-3];
        }
        return res[n];
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for N-th Tribonacci Number.
    Memory Usage: 36.2 MB, less than 100.00% of Java online submissions for N-th Tribonacci Number.
*/
