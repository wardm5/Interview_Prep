/*
    739. Daily Temperatures
    https://leetcode.com/problems/daily-temperatures/submissions/
 */
 
import javafx.util.Pair; 
class Solution {
    public int[] dailyTemperatures(int[] T) {
        Pair <Integer, Integer> pair = new Pair<>(T[0], 0);
        Stack<Pair> s = new Stack<>();
        int[] res = new int[T.length];
        s.push(pair);
        for (int i = 1; i < T.length; i++) {
            while (!s.isEmpty() && (int) s.peek().getKey() < T[i]) {
                int index = (int) s.peek().getValue();
                s.pop();
                res[index] = i-index;
            }
            Pair temp = new Pair(T[i], i);
            s.push(temp);
        }
        return res;
    }
}

/*
    Runtime: 52 ms, faster than 50.66% of Java online submissions for Daily Temperatures.
    Memory Usage: 43.7 MB, less than 42.37% of Java online submissions for Daily Temperatures.
 */
