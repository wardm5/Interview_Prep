/*
    989. Add to Array-Form of Integer
    https://leetcode.com/problems/add-to-array-form-of-integer/
 */

class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        LinkedList<Integer> result = new LinkedList<>();
        int i = A.length - 1, carry = 0;
        while (i >= 0  ||  K > 0  ||  carry > 0) {
            if (i >= 0)   // if int array still has items
                carry += A[i];  // add the value into carry
            if (K > 0) {  // if K still has value
                carry += K % 10;  // add the value to carry
                K/=10;            // reduce K by factor of 10
            }
            result.addFirst(carry % 10);   // add result of 
            carry /= 10;
            i--;
        }
        return result;
    }
}

/*
    Runtime: 3 ms, faster than 99.56% of Java online submissions for Add to Array-Form of Integer.
    Memory Usage: 40.6 MB, less than 98.55% of Java online submissions for Add to Array-Form of Integer.
 */
