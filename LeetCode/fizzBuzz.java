/*
    412. Fizz Buzz
    https://leetcode.com/problems/fizz-buzz/
 */

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }
}

/*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Fizz Buzz.
    Memory Usage: 37.2 MB, less than 99.96% of Java online submissions for Fizz Buzz.
 */
