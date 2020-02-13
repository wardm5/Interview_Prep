//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Implement function ToLowerCase() that has a string parameter str, and returns
the same string in lowercase.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create stringbuilder
    2) traverse string
    3) add lower case character to builder
    4) once loop is completed, return stringbuilder.toString()
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public String toLowerCase(String str) {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char lower = Character.toLowerCase(str.charAt(i));
            build.append(lower);
        }
        return build.toString();
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for To Lower Case.
    Memory Usage: 37.7 MB, less than 6.49% of Java online submissions for To Lower Case.
*/
