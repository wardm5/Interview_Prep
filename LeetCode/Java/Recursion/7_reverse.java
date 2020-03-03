//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a 32-bit signed integer, reverse digits of an integer.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) first create sign, check what the sign is of the int passed in
    2) create long array with one value
    3) call recursive method with abs value of input, result array, and count
        4) if number is less than 0 or 0, then return 0
        5) set temp num
        6) divide num by 10
        7) get the power by calling a recurisve call
        8) update answer by adding the temp num * math pow(10 ^ pow)
        9) return power
    10) return 0 if long is greater or less than int size
    11) return reversed number * sign
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int reverse(int x) {
        int sign = 1;
        if (x < 0)
            sign = -1;
        long[] res = new long[1];
        helper(Math.abs(x), res, 0);
        res[0] *= sign;
        if (res[0] > 2147483647 || res[0] < -2147483648)
            return 0;
        else
            return (int)res[0];
    }
    public int helper(int num, long[] res, int count) {
        if (num <= 0)
            return 0;
        int temp = num;
        num /= 10;
        int pow = helper(num, res, count + 1);
        res[0] += temp % 10 * Math.pow(10, pow);
        return pow + 1;
    }
}

/*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse Integer.
    Memory Usage: 36.4 MB, less than 5.55% of Java online submissions for Reverse Integer.
*/
