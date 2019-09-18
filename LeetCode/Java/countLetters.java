/*
    1180. Count Substrings with Only One Distinct Letter
    https://leetcode.com/problems/count-substrings-with-only-one-distinct-letter/submissions/
 */

class Solution {
    public int countLetters(String S) {
        // int count = 0;
        // for (int i = 0; i < S.length(); i++) {
        //     count++;
        //     char temp = S.charAt(i);
        //     int j = i + 1;
        //     while (j < S.length() && temp == S.charAt(j)) {
        //         count++;
        //         j++;
        //     }
        // }
        // return count;
        
        int count = 1;
        int tempCount = 1;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == S.charAt(i - 1))
                tempCount++;
            else
                tempCount = 1;
            count += tempCount;
        }
        return count;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Count Substrings with Only One Distinct Letter.
    Memory Usage: 34.1 MB, less than 100.00% of Java online submissions for Count Substrings with Only One Distinct Letter.
 */
