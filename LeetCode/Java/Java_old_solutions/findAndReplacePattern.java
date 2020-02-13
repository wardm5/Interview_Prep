/*
    890. Find and Replace Pattern
    https://leetcode.com/problems/find-and-replace-pattern/
 */

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        String code = createCode(pattern);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            // if (words[i].length() != code.length())
            //     continue;
            String temp = createCode(words[i]);
            if (code.equals(temp))
                list.add(words[i]);
        }
        return list;
    }
    public String createCode(String pattern) {
        StringBuilder code = new StringBuilder();
        code.append(0);
        HashMap<Character, Integer> map = new HashMap<>();
        map.put(pattern.charAt(0), 0);
        int count = 0;
        for (int i = 1; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i)))
                code.append(map.get(pattern.charAt(i)));
            else {
                count++;
                code.append(count);
                map.put(pattern.charAt(i), count);
            }
        }
        return code.toString();
    }
}

/*
    Runtime: 2 ms, faster than 79.71% of Java online submissions for Find and Replace Pattern.
    Memory Usage: 36.3 MB, less than 100.00% of Java online submissions for Find and Replace Pattern.
 */
