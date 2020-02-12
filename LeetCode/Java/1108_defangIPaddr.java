//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create stringbuilder
    2) loop through string
    3) if you find a '.', then add '[.]'
    3) else add the value
    4) return string
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public String defangIPaddr(String address) {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.')
                build.append('[').append('.').append(']');
            else
                build.append(address.charAt(i));
        }
        return build.toString();
    }
}

/*
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Defanging an IP Address.
        Memory Usage: 37.4 MB, less than 100.00% of Java online submissions for Defanging an IP Address.
*/
