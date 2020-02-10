/*
    1281. Subtract the Product and Sum of Digits of an Integer
    https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/submissions/
 */

class Solution {
    public int subtractProductAndSum(int n) {
        int product =1;
        int sum = 0;
        while (n > 0) {
            product *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return product - sum;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
    Memory Usage: 36.6 MB, less than 100.00% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
 */

