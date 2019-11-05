/*
    682. Baseball Game
    https://leetcode.com/problems/baseball-game/
*/

class Solution {
    public int calPoints(String[] ops) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("C")) {
                sum -= stack.pop();
            } else if (ops[i].equals("D")) {
                int val = stack.peek() * 2;
                sum += val;
                stack.push(val);
            } else if (ops[i].equals("+")) {
                int val1 = stack.pop();
                int val2 = stack.peek();
                int temp = val1 + val2;
                sum += temp;
                stack.push(val1);
                stack.push(temp);
            } else {
                int val = Integer.valueOf(ops[i]);
                sum += val;
                stack.push(val);
            }
        }
        return sum;
    }
}

/*
    Runtime: 2 ms, faster than 94.73% of Java online submissions for Baseball Game.
    Memory Usage: 35.9 MB, less than 100.00% of Java online submissions for Baseball Game.
*/


// class Solution {
//     public int calPoints(String[] ops) {
//         List<Integer> list = new ArrayList<Integer>();
// 		int score = 0;
// 		for (int i = 0; i < ops.length; i++) {
// 			int currentScore = 0;
// 			if (ops[i].equals("C")) {
// 				score -= list.remove(list.size() - 1);
// 			} else if (ops[i].equals("D")) {
// 				currentScore = list.get(list.size() - 1) * 2;
// 				score += currentScore;
// 				list.add(currentScore);
// 			} else if (ops[i].equals("+")) {
// 				int temp = list.get(list.size() - 1) + list.get(list.size() - 2);
// 				score += temp;
// 				list.add(temp);
// 			} else {
// 				currentScore = Integer.valueOf(ops[i]);
// 				list.add(currentScore);
// 				score = score + currentScore;
// 			}
// 		}
// 		return score;    
//     }
// }

