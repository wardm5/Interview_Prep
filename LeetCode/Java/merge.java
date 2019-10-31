/*
    56. Merge Intervals
    https://leetcode.com/problems/merge-intervals/
*/

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) 
            return intervals;
        Arrays.sort(intervals, new java.util.Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });
        int min = intervals[0][0];
        int max = intervals[0][1];
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= max) {
                max = Math.max(max, intervals[i][1]);
            } else {
                helper(min, max, res);
                min = intervals[i][0];
                max = intervals[i][1];
            }
        }
        helper(min, max, res);
        int[][] finalRes = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++) {
            finalRes[i][0] = res.get(i).get(0);
            finalRes[i][1] = res.get(i).get(1);
        }
        return finalRes;
    }
    public void helper(int min, int max, List<List<Integer>> res) {
        List<Integer> tempList = new ArrayList<>();
        tempList.add(min);
        tempList.add(max);
        res.add(tempList);
    }
}

/*
    Runtime: 6 ms, faster than 88.62% of Java online submissions for Merge Intervals.
    Memory Usage: 37.8 MB, less than 98.55% of Java online submissions for Merge Intervals.
*/
