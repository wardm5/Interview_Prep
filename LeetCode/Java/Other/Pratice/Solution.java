import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int[] num1 = new int[] {};
        int[] num2 = new int[] {9,9,9,9};
        int[] res = addNums(num1, num2);
        print(res);
    }
    private static int[] addNums(int[] n1, int[] n2) {
        List<Integer> list = new ArrayList<>();
        int last1 = n1.length-1, last2 = n2.length-1, sum = 0;
        while (last1 >=0 || last2 >= 0 || sum > 0) {
            if (last1 >= 0)
                sum += n1[last1--];
            if (last2 >= 0)
                sum += n2[last2--];
            list.add(0, sum % 10);
            sum /= 10;
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            res[i] = list.get(i);
        return res;
    }
    public static void print(int[] arr) {
        for (int item : arr)
            System.out.print(item + "   ");
        System.out.println("\nDone!");
    }
}
