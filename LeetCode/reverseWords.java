/*
    557. Reverse Words in a String III
    https://leetcode.com/problems/reverse-words-in-a-string-iii/
 */

class Solution {
    public String reverseWords(String s) {
        StringBuilder build = new StringBuilder();
        String[] arr = s.split("[ ]+");
        for (String word : arr) {
            for (int i = word.length()-1; i >= 0; i--) {
                build.append(word.charAt(i));
            }
            build.append(" ");
        }
        return build.toString().trim();
    }
}

/*
    Runtime: 18 ms, faster than 22.24% of Java online submissions for Reverse Words in a String III.
    Memory Usage: 38.3 MB, less than 100.00% of Java online submissions for Reverse Words in a String III.
 */
