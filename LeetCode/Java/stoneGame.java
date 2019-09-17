    
/*
    877. Stone Game
    https://leetcode.com/problems/stone-game/
 */
 
class Solution {
    int start = 0, end;
    int alex = 0, lee = 0;
    public boolean stoneGame(int[] piles) {
        end = piles.length - 1;
        boolean turn = true;
        while (start <= end) {
            if (turn)
                alex = helper(alex, piles);
            else
                lee = helper(lee, piles);
            turn = !turn;
            System.out.println(alex + "     " + lee);
        }
        return (alex > lee);
    }
    public int helper(int person, int[] piles) {
        if (piles[start] > piles[end]) {
            person = person + piles[start];
            start++;
        } else {
            person = person + piles[end];
            end--;
        }
        return person;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Stone Game.
    Memory Usage: 34.3 MB, less than 100.00% of Java online submissions for Stone Game.
 */
