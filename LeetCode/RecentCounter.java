/*
    933. Number of Recent Calls
    https://leetcode.com/problems/number-of-recent-calls/
 */

class RecentCounter {
    private final Queue<Integer> requestQueue = new LinkedList<>();
    public RecentCounter() {}
    public int ping(int timeNow) {
        requestQueue.add(timeNow);
        while (requestQueue.peek() < (timeNow - 3000))
            requestQueue.poll();
        return requestQueue.size();
    }
}

/*
    Runtime: 70 ms, faster than 93.34% of Java online submissions for Number of Recent Calls.
    Memory Usage: 64.3 MB, less than 87.50% of Java online submissions for Number of Recent Calls.
 */
