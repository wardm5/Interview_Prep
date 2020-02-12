//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given an integer number n, return the difference between the product of its
digits and the sum of its digits.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create variable for sum, product
    2) have a while loop that runs when n is greater than 0
    3) for product, multiply the current number % 10
    4) for sum, sum the current number % 10
    5) at the end, subtract sum from prodcut and return

*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while (n > 0) {
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }
        return product - sum;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
    Memory Usage: 36.6 MB, less than 100.00% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
*/
