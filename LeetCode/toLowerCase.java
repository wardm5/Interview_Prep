//  709. To Lower Case
//  Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.

class Solution {
    public String toLowerCase(String str) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                ch += 'a' - 'A';
            }
            result.append(ch);
        }
        return result.toString();
    }
}
