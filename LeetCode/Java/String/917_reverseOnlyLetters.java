//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a string S, return the "reversed" string where all characters that are not
a letter stay in the same place, and all letters reverse their positions.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create start and end variables
    2) convert String to char array
    3) while start less than end
        4) if the starting letter is not a letter, then increment start`
        5) if the ending letter is not a letter, then decrement end
        6) else swap chars at start and end, increment start and decrement end
    7) return string with char array as value
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public String reverseOnlyLetters(String S) {
        int start = 0;
        int end = S.length() - 1;
        char[] str = S.toCharArray();
        while (start < end) {
            if (!Character.isLetter(str[start])) {
                start++;
                continue;
            } else if (!Character.isLetter(str[end])) {
                end--;
                continue;
            }
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(str);
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Only Letters.
    Memory Usage: 37.7 MB, less than 8.70% of Java online submissions for Reverse Only Letters.
*/
