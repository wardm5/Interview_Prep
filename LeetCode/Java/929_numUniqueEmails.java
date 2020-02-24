//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Every email consists of a local name and a domain name, separated by the @ sign.

For example, in alice@leetcode.com, alice is the local name, and leetcode.com is
the domain name.

Besides lowercase letters, these emails may contain '.'s or '+'s.

If you add periods ('.') between some characters in the local name part of an
email address, mail sent there will be forwarded to the same address without dots
in the local name.  For example, "alice.z@leetcode.com" and "alicez@leetcode.com"
forward to the same email address.  (Note that this rule does not apply for domain
names.)

If you add a plus ('+') in the local name, everything after the first plus sign
will be ignored. This allows certain emails to be filtered, for example
m.y+name@email.com will be forwarded to my@email.com.  (Again, this rule does
not apply for domain names.)

It is possible to use both of these rules at the same time.

Given a list of emails, we send one email to each address in the list.  How many
different addresses actually receive mails?

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create set to keep track of how many uniqueue emails there are
    2) loop through each email
        2.1) create StringBuilder, boolean for at symbols, and boolean for plus sign
        2.2) loop through the email
            2.2.1) if the curr char is at symbol or atSymbol is true, append
            2.2.2) if the plus boolean is true, continue, do not append
            2.2.3) if the current letter is a plus, set plus to true, not not append
            2.2.4) if the value is a '.' then skip else just append to the builder
        2.3) add builder to the set of emails
    3) return size of the set
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> emailSet = new HashSet<>();
        for (String email : emails) {
            StringBuilder build = new StringBuilder();
            boolean atSymbol = false;
            boolean plus = false;
            for (int j = 0; j < email.length(); j++) {
                char temp = email.charAt(j);
                if (temp == '@' || atSymbol) {
                    build.append(temp);
                    atSymbol = true;
                    continue;
                } else if (plus)
                    continue;
                else if (temp == '+') {
                    plus = true;
                    continue;
                } else if (temp != '.')
                    build.append(temp);
            }
            emailSet.add(build.toString());
        }
        return emailSet.size();
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Two Sum II - Input array is sorted.
    Memory Usage: 42.4 MB, less than 5.22% of Java online submissions for Two Sum II - Input array is sorted.
*/
