/*
    1046. Last Stone Weight
    https://leetcode.com/problems/last-stone-weight/
 */

import java.util.*;
class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < stones.length; i++) 
            list.add(stones[i]);
        while (list.size() > 1) {
            int x = list.get(list.size()-1);
            int y = list.get(list.size()-2);
            if (x == y) {
                list.remove(list.size()-1);
                list.remove(list.size()-1);
            } else {
                list.remove(list.size()-1);
                list.remove(list.size()-1);
                list.add(Math.abs(y-x));
            }
            Collections.sort(list);
        }
        if (list.size() == 0)
            return 0;
        return list.get(0);
    }
}

/*
    Runtime: 2 ms, faster than 44.51% of Java online submissions for Last Stone Weight.
    Memory Usage: 34 MB, less than 100.00% of Java online submissions for Last Stone Weight.
 */
