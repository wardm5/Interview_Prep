/*
    575. Distribute Candies
    https://leetcode.com/problems/distribute-candies/
 */

class Solution {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0 ; i < candies.length; i++) {
            if (set.size() > candies.length /2)
                return candies.length/2;
            set.add(candies[i]);
        }
        if (set.size() > candies.length /2)
            return candies.length/2;
        return set.size();
    }
}

/*
    Runtime: 28 ms, faster than 94.07% of Java online submissions for Distribute Candies.
    Memory Usage: 41.1 MB, less than 100.00% of Java online submissions for Distribute Candies.
 */
