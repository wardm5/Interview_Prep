/*
    1180. Count Substrings with Only One Distinct Letter
    https://leetcode.com/problems/count-substrings-with-only-one-distinct-letter/submissions/
 */

class Solution {
    func countLetters(_ S: String) -> Int {
        var count = 1
        var tempCount = 1
        for n in 1..<S.count {
            if String(Array(S)[n]) == String(Array(S)[n-1]) {
                tempCount += 1
            } else {
                tempCount = 1
            }
            count += tempCount
        }
        return count;
    }
}

/*
    Runtime: 800 ms, faster than 6.67% of Swift online submissions for Count Substrings with Only One Distinct Letter.
    Memory Usage: 20.5 MB, less than 100.00% of Swift online submissions for Count Substrings with Only One Distinct Letter.
 */
