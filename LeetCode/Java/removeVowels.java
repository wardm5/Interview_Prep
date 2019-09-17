/*
    1119. Remove Vowels from a String
    https://leetcode.com/problems/remove-vowels-from-a-string/
 */

class Solution {
    public String removeVowels(String S) {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u')
                build.append(c);
        }
        return build.toString();
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Vowels from a String.
    Memory Usage: 34.4 MB, less than 100.00% of Java online submissions for Remove Vowels from a String.
 */
