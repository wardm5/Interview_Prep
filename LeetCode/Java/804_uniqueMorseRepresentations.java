//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
International Morse Code defines a standard encoding where each letter is mapped
to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...",
"c" maps to "-.-.", and so on.

For convenience, the full table for the 26 letters of the English alphabet is
given below:

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.",
 "---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]

Now, given a list of words, each word can be written as a concatenation of the
Morse code of each letter. For example, "cba" can be written as "-.-..--...",
(which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation,
the transformation of a word.

Return the number of different transformations among all words we have.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create a count variable that will keep track of parentheses (increment for '(' decrement for ')')
    2) loop through string
        3) if the count is 0, assuming the first will always be '(', add to count, continue
        4) if the count is greater than 0, decrement or increment the count based on the parentheses
        5) if the count is 0, then do not add to string builder, otherwise add to stringbuilder
    6) once loop is completed, return the string stored in the builder
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> res = new HashSet<>();
        fillMap(map);
        for (int i = 0 ; i < words.length; i++) {
            StringBuilder build = new StringBuilder();
            for (int j = 0; j < words[i].length(); j++)
                build.append(map.get(words[i].charAt(j)));
            res.add(build.toString());
        }
        return res.size();
    }

    public void fillMap(HashMap<Character, String> map) {
        map.put('a', ".-");
        map.put('b', "-...");
        map.put('c', "-.-.");
        map.put('d', "-..");
        map.put('e',".");
        map.put('f',"..-.");
        map.put('g',"--.");
        map.put('h',"....");
        map.put('i',"..");
        map.put('j',".---");
        map.put('k',"-.-");
        map.put('l',".-..");
        map.put('m',"--");
        map.put('n',"-.");
        map.put('o',"---");
        map.put('p',".--.");
        map.put('q',"--.-");
        map.put('r',".-.");
        map.put('s',"...");
        map.put('t',"-");
        map.put('u',"..-");
        map.put('v',"...-");
        map.put('w',".--");
        map.put('x',"-..-");
        map.put('y',"-.--");
        map.put('z',"--..");
    }
}

/*
    Runtime: 2 ms, faster than 67.35% of Java online submissions for Unique Morse Code Words.
    Memory Usage: 38 MB, less than 5.26% of Java online submissions for Unique Morse Code Words.
*/
