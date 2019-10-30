/*
    1047. Remove All Adjacent Duplicates In String
    https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
*/

class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == S.charAt(i))
                stack.pop();
            else 
                stack.push(S.charAt(i));
        }
        List<Character> list = new ArrayList(stack);
        String res = "";
        for (int i = 0; i < list.size(); i++)
            res += list.get(i);
        return res;
    }
}

/*
    Runtime: 36 ms, faster than 57.77% of Java online submissions for Remove All Adjacent Duplicates In String.
    Memory Usage: 38.6 MB, less than 100.00% of Java online submissions for Remove All Adjacent Duplicates In String.
*/
