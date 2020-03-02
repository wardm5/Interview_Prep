//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given the array nums, for each nums[i] find out how many numbers in the array
are smaller than it. That is, for each nums[i] you have to count the number of
valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.

Example 1:
Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation:
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1).
For nums[3]=2 there exist one smaller number than it (1).
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).

Example 2:
Input: nums = [6,5,4,8]
Output: [2,1,0,3]

Example 3:
Input: nums = [7,7,7,7]
Output: [0,0,0,0]

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) sort input list
    2) create temp variable to store current number
    3) create map
    4) loop through the input array
        4.1) if the index is at 0, then add the value at that index to the map with zero as value
        4.2) if the index is the end, then set tempVal
        4.3) if the tempVal equals the current number, continue
        4.4) else add the tempVal and the index + 1 to the map
    5) create array to store result
    6) for each item in the numbers, check map and place the count into res array at the index
    7) return result array
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] tempArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            tempArr[i] = nums[i];
        Arrays.sort(tempArr);
        int tempVal = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = nums.length-1; i >= 0; i--) {
            if (i == 0)
                map.put(tempArr[i], 0);
            if (i == nums.length-1)
                tempVal = tempArr[i];
            if (tempArr[i] == tempVal)
                continue;
            else {
                map.put(tempVal, i + 1);
                tempVal = tempArr[i];
            }
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            res[i] = map.get(nums[i]);
        return res;
    }
}

/*
    Runtime: 3 ms, faster than 87.44% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
    Memory Usage: 41.8 MB, less than 100.00% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
*/
