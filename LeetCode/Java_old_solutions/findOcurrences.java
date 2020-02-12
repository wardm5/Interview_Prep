/*
    1078. Occurrences After Bigram
    https://leetcode.com/problems/occurrences-after-bigram/
 */

class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] temp = text.split(" ");
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < temp.length - 2; i++) {
            if (temp[i].equals(first) && temp[i + 1].equals(second)) {
                result.add(temp[i + 2]);
            }
        }
        
        return result.toArray(new String[0]);
    }
}

/*
    Runtime: 1 ms, faster than 95.38% of Java online submissions for Occurrences After Bigram.
    Memory Usage: 35 MB, less than 100.00% of Java online submissions for Occurrences After Bigram.
 */
