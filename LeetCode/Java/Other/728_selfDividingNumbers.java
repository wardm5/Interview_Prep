//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0,
and 128 % 8 == 0.

Also, a self-dividing number is not allowed to contain the digit zero.

Given a lower and upper number bound, output a list of every possible self dividing
number, including the bounds if possible.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create result ArrayList
    2) loop through starting at left, to right
    3) create helper method that checks the number
    4) while that number is greater than 0
    5) get the mod of the number
    6) divide mod number by the mod
        6.1) if the number does not equals 0, then return false
        6.2) else return true after the while is done
    7) if true for the helper method, then add the value to the result ArrayList
    8) return ArrayList
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (helper(i))
                res.add(i);
        }
        return res;
    }
    public boolean helper(int num) {
        int temp = num;
        while (temp > 0) {
            int mod = temp % 10;
            if (mod == 0 || num % mod != 0)
                return false;
            temp/=10;
        }
        return true;
    }
}

/*
    Runtime: 2 ms, faster than 78.19% of Java online submissions for Self Dividing Numbers.
    Memory Usage: 37.2 MB, less than 6.67% of Java online submissions for Self Dividing Numbers.
*/
