//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
You are given a phone number as a string number. number consists of digits, spaces ' ', and/or dashes '-'.

You would like to reformat the phone number in a certain manner. Firstly, remove all spaces and dashes. Then, group the digits from left to right into blocks of length 3 until there are 4 or fewer digits. The final digits are then grouped as follows:

2 digits: A single block of length 2.
3 digits: A single block of length 3.
4 digits: Two blocks of length 2 each.
The blocks are then joined by dashes. Notice that the reformatting process should never produce any blocks of length 1 and produce at most two blocks of length 2.

Return the phone number after formatting.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public String reformatNumber(String number) {
        return reformat(cleanString(number));
    }

    public String reformat(String s) {
        if (s.length() == 4)
            return new StringBuilder().append(s.substring(0,2)).append("-").append(s.substring(2,4)).toString();
        else if (s.length() < 4)
            return s;
        else
            return new StringBuilder().append(s.substring(0,3)).append("-").append(reformat(s.substring(3, s.length()))).toString();
    }

    public String cleanString(String word) {
        StringBuilder build = new StringBuilder();
        for (char c: word.toCharArray())
            if (Character.isDigit(c))
                build.append(c);
        return build.toString();
    }
}


/*
    Runtime: 1 ms, faster than 98.15% of Java online submissions for Reformat Phone Number.
    Memory Usage: 38.9 MB, less than 24.54% of Java online submissions for Reformat Phone Number.
*/
