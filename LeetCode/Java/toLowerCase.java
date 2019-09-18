/*
    709. To Lower Case
    https://leetcode.com/problems/to-lower-case/
 */

class Solution {
    public String toLowerCase(String str) {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            build.append(Character.toLowerCase(temp));
        }
        return build.toString();
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for To Lower Case.
    Memory Usage: 33.9 MB, less than 98.70% of Java online submissions for To Lower Case.
 */
