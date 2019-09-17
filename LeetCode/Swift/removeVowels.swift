/*
    1119. Remove Vowels from a String
    https://leetcode.com/problems/remove-vowels-from-a-string/
 */

class Solution {
    func removeVowels(_ S: String) -> String {
        var res = "";
        for c in S {
            if (c != "a" && c != "e" && c != "i" && c != "o" && c != "u") {
                res.append(c)
            }
        }
        return res;
    }
}

/*
    Runtime: 4 ms, faster than 96.30% of Swift online submissions for Remove Vowels from a String.
    Memory Usage: 20.6 MB, less than 100.00% of Swift online submissions for Remove Vowels from a String.
 */
