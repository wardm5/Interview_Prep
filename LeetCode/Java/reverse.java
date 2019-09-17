class Solution {
    public int reverse(int x) {
        int sign = 1;
        int val = 0;
        if (x < 0)  sign = -1;
        x = Math.abs(x);
        while (x > 0) {
            if(val>Integer.MAX_VALUE/10) return 0;
            val = (val * 10) + (x % 10);
            x /= 10;
        }
        return val * sign;
    }
}
