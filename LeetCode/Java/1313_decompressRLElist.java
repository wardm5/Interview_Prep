//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
We are given a list nums of integers representing a list compressed with run-length
encoding.

Consider each adjacent pair of elements [a, b] = [nums[2*i], nums[2*i+1]] (with
i >= 0).  For each such pair, there are a elements with value b in the decompressed
list.

Return the decompressed list.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create temp result array list to store values
    2) loop through input array
    3) use helper method to add the amount of values to the temp result array
    4) once looping through input array is complete, create final result int array
    5) place items from ArrayList to final result int array and return final result
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i+=2) {
            addToList(nums[i+1], nums[i], res);
        }
        int[] finalRes = new int[res.size()];
        for (int i = 0; i < res.size(); i++)
            finalRes[i] = res.get(i);
        return finalRes;
    }
    private void addToList(int value, int amount, List<Integer> res) {
        for (int i = 0; i < amount; i++) {
            res.add(value);
        }
    }
}

/*
    Runtime: 4 ms, faster than 48.75% of Java online submissions for Decompress Run-Length Encoded List.
    Memory Usage: 41.4 MB, less than 100.00% of Java online submissions for Decompress Run-Length Encoded List.
*/
