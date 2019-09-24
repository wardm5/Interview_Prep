/*
    1200. Minimum Absolute Difference
    https://leetcode.com/problems/minimum-absolute-difference/
 */
 
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int min = Integer.MAX_VALUE;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i] - arr[i -1])
                min = arr[i] - arr[i -1];
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i-1] == min)  {
                List<Integer> list = new ArrayList<>();
                list.add(arr[i-1]);
                list.add(arr[i]);
                res.add(list);
            }   
        }
        return res;
    }
}

/*
    Runtime: 20 ms, faster than 96.05% of Java online submissions for Minimum Absolute Difference.
    Memory Usage: 51.4 MB, less than 100.00% of Java online submissions for Minimum Absolute Difference.
 */
