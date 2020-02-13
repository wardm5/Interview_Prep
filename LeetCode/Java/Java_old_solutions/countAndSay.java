/*
    38. Count and Say
    https://leetcode.com/problems/count-and-say/
 */

class Solution {
    public String countAndSay(int n) {
        if (n == 1)
            return "1";
        String res = "1";
        for (int i = 1; i < n; i++)
            res = helper(res);
        return res;
    }
    public String helper(String res) {
        StringBuilder build = new StringBuilder();
        int count = 0;
        char val = res.charAt(res.length()-1);
        for (int i = res.length()-1; i >= 0; i--) {
            char temp = res.charAt(i);
            if (temp != val) {
                build.insert(0, val).insert(0, count);
                val = temp;
                count = 1;
            } else
                count++;
        }
        build.insert(0, val).insert(0, count);
        return build.toString();
    }
}

/*
    Runtime: 2 ms, faster than 64.04% of Java online submissions for Count and Say.
    Memory Usage: 35.4 MB, less than 98.25% of Java online submissions for Count and Say.
 */
