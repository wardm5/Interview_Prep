/*
    868. Binary Gap
    https://leetcode.com/problems/binary-gap/
 */
 
class Solution {
    public int binaryGap(int n) {
        int min = 0;
        boolean firstOne = false;
        int count = 0;
        while (n > 0) {
            if (n % 2 != 0 && !firstOne)
                firstOne = true;
            if (n % 2 != 0 && firstOne) {
                if (min < count)
                    min = count;
                count = 1;
            } else if (firstOne) {
                count++;
            }
            n /= 2;
        }
        return min;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Gap.
    Memory Usage: 33.2 MB, less than 7.14% of Java online submissions for Binary Gap.
 */
