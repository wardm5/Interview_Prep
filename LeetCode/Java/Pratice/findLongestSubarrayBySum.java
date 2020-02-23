import java.util.*;
public class findLongestSubarrayBySum {
    public static void main(String[] args) {
        int[] arr = new int[] {10,2,3,7,0,0,0,0,5};
        int target = 12;
        int[] result = findLongestSubarrayBySum(arr, target);
        System.out.println(result[0] + "   " + result[1]);

    }
    public static int[] findLongestSubarrayBySum(int[] input, int target) {
        int[] res = new int[2];
        helper(input, target, res);
        return res;
    }
    public static void helper(int[] input, int target, int[] res) {
        int sum = 0;
        int max = 0;
        int left = 0;
        for (int i = 0; i < input.length; i++) {
            if (sum == target && i-left > max) {
                max = i-left;
                sum += input[i] - input[left];
                res[0] = left;
                res[1] = i - 1;
                left++;
            } else if (sum < target) {
                sum += input[i];
            } else if (sum == target) {
                sum += input[i] - input[left];
                left++;
            } else {
                sum -= input[left];
                left++;
                i--;
            }
        }
        System.out.println(sum);
        if (sum == target && (input.length-left) > max) {
            res[0] = left;
            res[1] = input.length-1;
        }
    }
}
