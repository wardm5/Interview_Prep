import java.util.*;
public class Pratice_mode {
    public static void main(String[] args) {
        int[] test1 = new int[] {1,2,3,3};
        int[] test2 = new int[] {1,2,3};
        int[] test3 = new int[] {3,1,4,57,4};
        System.out.println(mode(test1));  // 3
        System.out.println(mode(test2));  // 1
        System.out.println(mode(test3));  // 4
    }
    public static int mode(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = -1;
        int count = 0;
        for (int i = 0 ; i < arr.length; i++) {
            int temp = map.getOrDefault(arr[i], 0) + 1;
            if (temp > count) {
                max = arr[i];
                count = temp;
            }
            map.put(arr[i], temp);
        }
        return max;
    }
}
