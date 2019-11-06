/*
    760. Find Anagram Mappings
    https://leetcode.com/problems/find-anagram-mappings/
 */

class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++)
            map.put(B[i], i);
        int[] res = new int[A.length];
        for (int i = 0; i < B.length; i++)
            res[i] = map.get(A[i]);
        return res;
    }
}

/*
    Runtime: 1 ms, faster than 97.78% of Java online submissions for Find Anagram Mappings.
    Memory Usage: 36 MB, less than 92.31% of Java online submissions for Find Anagram Mappings.
 */
