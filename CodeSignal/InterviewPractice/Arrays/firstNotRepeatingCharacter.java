/*
Problem:
Given a string s consisting of small English letters, find and return the first
instance of a non-repeating character in it. If there is no such character,
return '_'.

Example

For s = "abacabad", the output should be
firstNotRepeatingCharacter(s) = 'c'.

There are 2 non-repeating characters in the string: 'c' and 'd'. Return c since
it appears in the string first.

For s = "abacabaabacaba", the output should be
firstNotRepeatingCharacter(s) = '_'.

There are no characters in this string that do not repeat.
*/

char firstNotRepeatingCharacter(String s) {
    LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
    for (int i = 0; i < s.length(); i++)
        map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
    for (char c : map.keySet()) {
        if (map.get(c) == 1)
            return c;
    }
    return '_';
}
