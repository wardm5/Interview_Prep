/*
    728. Self Dividing Numbers
    https://leetcode.com/problems/self-dividing-numbers/submissions/
 */

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfNums = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (check(i))
                selfNums.add(i);
        }
        return selfNums;
    }
    public boolean check(int n) {
        int num = n;
        if (n / 10 == 0)
            return true;
        while (num > 0) {
            int temp = num % 10;
            if (temp == 0 || n % temp != 0)
                return false;
            num /= 10;
        }
        return true;
    }
}

/*
    Runtime: 2 ms, faster than 72.10% of Java online submissions for Self Dividing Numbers.
    Memory Usage: 33.8 MB, less than 33.33% of Java online submissions for Self Dividing Numbers.
 */
