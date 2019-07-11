/*
    1089. Duplicate Zeros
    https://leetcode.com/problems/duplicate-zeros/
 */

class Solution {
    public void duplicateZeros(int[] arr) {
        int[] num = arr.clone();
        int index = 0; //index of arr clone
        int start = 0;
        int end = arr.length -1;
        while(start <= end) {
            if(num[index] == 0 && start < end){
                arr[start++] = 0;
            } 
            arr[start++] = num[index++];
        }
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Duplicate Zeros.
    Memory Usage: 37.2 MB, less than 100.00% of Java online submissions for Duplicate Zeros.
 */
