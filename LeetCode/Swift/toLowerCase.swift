/*
    709. To Lower Case
    https://leetcode.com/problems/to-lower-case/
 */
 
class Solution {
    func toLowerCase(_ str: String) -> String {
        var res = "";
        for char in str {
            res.append(Character(String(char).lowercased()))
        }
        return res;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Swift online submissions for To Lower Case.
    Memory Usage: 20.6 MB, less than 20.00% of Swift online submissions for To Lower Case.
 */
