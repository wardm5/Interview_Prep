//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a set of candidate numbers (candidates) (without duplicates) and a target
number (target), find all unique combinations in candidates where the candidate
numbers sums to target.

The same repeated number may be chosen from candidates unlimited number of times.

Note:
All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
Example 1:

Input: candidates = [2,3,6,7], target = 7,
A solution set is:
[
  [7],
  [2,2,3]
]

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create list of lists of integers
    2) run recursive helper with candidates, target, position, sum, new array, and result array
        2.1) if the position is greater than or equal to the length of the candidates, then remove item from temp array
        2.2) if the sum is greater than the target, remove item from temp
        2.3) if the sum equals to the target, add temp array to the result array
        2.4) add to temp array of the candidate at the position
        2.5) recurse with helper with all values but with the sum + the candidate at the position
        2.6) recurse with helper but increment position
    3) return the result array
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        helper(candidates, target, 0, 0, new ArrayList<>(), res);
        return res;
    }
    public void helper(int[] candidates, int target, int position, int sum, List<Integer> temp, List<List<Integer>> res) {
        if (position >= candidates.length) {
            if (temp.size() >= 1)
                temp.remove(temp.size()-1);
            return;
        } else if (sum > target) {
            temp.remove(temp.size()-1);
            return;
        } else if (target == sum) {
            res.add(new ArrayList<>(temp));
            temp.remove(temp.size() - 1);
            return;
        }
        temp.add(candidates[position]);
        helper(candidates, target, position, sum + candidates[position], temp, res);
        helper(candidates, target, position + 1, sum, temp, res);
    }
}

/*

*/
