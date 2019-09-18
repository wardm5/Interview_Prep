/*
    760. Find Anagram Mappings
    https://leetcode.com/problems/find-anagram-mappings/
 */

class Solution {
    func anagramMappings(_ A: [Int], _ B: [Int]) -> [Int] {
        var map = [Int : Int]()
        for n in 0..<B.count {
            map[B[n]] = n;
        }
        var res: [Int] = [];
        for n in 0..<A.count {
            res.append(map[A[n]]!);
        }
        return res;
    }
}

/*
    Runtime: 1 ms, faster than 97.78% of Java online submissions for Find Anagram Mappings.
    Memory Usage: 36 MB, less than 92.31% of Java online submissions for Find Anagram Mappings.
 */
