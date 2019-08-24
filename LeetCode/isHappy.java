/*
    202. Happy Number
    https://leetcode.com/problems/happy-number/
 */
 
class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        int count = 0;
        while (n != 1 && count < 10) {
            while (n > 0) {
                sum += (n %10) * (n %10);
                n /= 10;
            }
            n = sum;
            sum = 0;
            count++;
        }
        return (count < 10);
    }
}

/*
    Runtime: 1 ms, faster than 94.71% of Java online submissions for Happy Number.
    Memory Usage: 33.1 MB, less than 12.12% of Java online submissions for Happy Number.
 */
