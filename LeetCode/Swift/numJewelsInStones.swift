/*
    771. Jewels and Stones
    https://leetcode.com/problems/jewels-and-stones/
 */

class Solution {
    func numJewelsInStones(_ J: String, _ S: String) -> Int {
        var res = 0;
        for c in S {
            if (J.contains(c)) {
                res += 1;
            }
        }
        return res;
    }
}

/*
    Runtime: 8 ms, faster than 78.90% of Swift online submissions for Jewels and Stones.
    Memory Usage: 20.6 MB, less than 7.69% of Swift online submissions for Jewels and Stones.
 */
