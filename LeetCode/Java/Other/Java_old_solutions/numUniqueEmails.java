/*
    929. Unique Email Addresses
    https://leetcode.com/problems/unique-email-addresses/
 */

class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> emailSet = new HashSet<>();
        for (String email : emails) {
            int i = 0;
            StringBuilder build = new StringBuilder();
            String[] parts = email.split("@");
            String part1 = parts[0];
            while (part1.length() > i) {
                if (email.charAt(i) == '+')
                    break;
                if (email.charAt(i) != '.') 
                    build.append(email.charAt(i));
                i++;
            }
            build.append('@').append(parts[1]);
            emailSet.add(build.toString());
        }
        return  emailSet.size();
    }
}

/*
    Runtime: 12 ms, faster than 76.68% of Java online submissions for Unique Email Addresses.
    Memory Usage: 37.5 MB, less than 98.73% of Java online submissions for Unique Email Addresses.
 */
