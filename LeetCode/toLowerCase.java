/*
    709. To Lower Case
    https://leetcode.com/problems/to-lower-case/
 */

class Solution {
    public String toLowerCase(String str) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                ch += 'a' - 'A';
            }
            result.append(ch);
        }
        return result.toString();
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for To Lower Case.
    Memory Usage: 34.3 MB, less than 99.80% of Java online submissions for To Lower Case.
 */
