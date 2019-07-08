/*
    709. To Lower Case
    https://leetcode.com/problems/to-lower-case/
 */

class Solution {
    public String toLowerCase(String str) {
        StringBuilder result = new StringBuilder();  // create StringBuilder for quick appending
        for(int i = 0; i < str.length(); i++) {  // for each char
            char ch = str.charAt(i);             // get char
            if(ch >= 'A' && ch <= 'Z') {         // if char is within than all capital letter values
                ch += 'a' - 'A';                 // update char to lowercase
            }
            result.append(ch);                   // append char
        }
        return result.toString();                // convert to string and return.
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for To Lower Case.
    Memory Usage: 34.3 MB, less than 99.80% of Java online submissions for To Lower Case.
 */
