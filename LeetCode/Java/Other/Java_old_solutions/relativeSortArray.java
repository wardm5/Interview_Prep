/*
    1122. Relative Sort Array
    https://leetcode.com/problems/relative-sort-array/
 */

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            int temp = map.getOrDefault(arr1[i], 0);
            map.put(arr1[i], temp + 1);
        }
        int resultIndex = 0;
        for (int i = 0; i < arr2.length; i++) {
            int temp = arr2[i];
            int val = map.get(temp);
            while (val > 0) {
                arr1[resultIndex] = temp;
                resultIndex++;
                val--;
            }
            map.remove(temp);
        }
        for (int num : map.keySet()) {
            int val = map.get(num);
            while (val > 0) {
                arr1[resultIndex] = num;
                resultIndex++;
                val--;
            }
        }
        return arr1;
    }
}

/*
    Runtime: 2 ms, faster than 69.90% of Java online submissions for Relative Sort Array.
    Memory Usage: 36.4 MB, less than 100.00% of Java online submissions for Relative Sort Array.
 */
