//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
557. Reverse Words in a String III
Easy

Given a string, you need to reverse the order of characters in each word within
a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not
be any extra space in the string.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create StringBuilder and index for spaces
    2) for each character in the string
        2.1) if the character is a space, then add space to the builder, set index to length of builder
        2.2) otherwise, place the current character at the index
    3) return string of the StringBuilder
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public String reverseWords(String s) {
        StringBuilder build = new StringBuilder();
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                build.append(' ');
                index = build.length();
            } else
                build.insert(index, s.charAt(i));
        }
        return build.toString();
    }
}

/*
    Runtime: 10 ms, faster than 37.80% of Java online submissions for Reverse Words in a String III.
    Memory Usage: 42.2 MB, less than 7.02% of Java online submissions for Reverse Words in a String III.
*/
