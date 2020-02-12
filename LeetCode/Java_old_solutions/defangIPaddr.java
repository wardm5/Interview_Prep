/*
    1108. Defanging an IP Address
    https://leetcode.com/problems/defanging-an-ip-address/
 */

class Solution {
    public String defangIPaddr(String address) {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.')
                build.append("[.]");
            else
                build.append(address.charAt(i));
        }
        return build.toString();
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Defanging an IP Address.
    Memory Usage: 34.4 MB, less than 100.00% of Java online submissions for Defanging an IP Address.
 */
