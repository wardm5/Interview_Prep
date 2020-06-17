public class Solution {

    public static void main(String[] args) {
        List<String> dic = new ArrayList<>();
        List<String> query = new ArrayList<>();
        dic.add("heater");
        dic.add("cold");
        dic.add("clod");
        dic.add("reheat");
        dic.add("docl");
        query.add("codl");
        query.add("heater");
        query.add("abcd");

        System.out.println(stringAnagram(dic, query));  // works perfectly

    }

    /*
     * Complete the 'minOperations' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER threshold
     *  3. INTEGER d
     */

    public static int minOperations(List<Integer> arr, int threshold, int d) {
    // Write your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] count = new int[] {Integer.MAX_VALUE};
        helper(arr, threshold, d, map, 0, count, 0);
        return count[0];
    }
    public static void helper(List<Integer> arr, int threshold, int d, HashMap<Integer, Integer> map, int index, int[] count, int temp_count) {
        if (index < 0 || index >= arr.size())
            return;
        int array_value = arr.get(index);
        int temp_val = arr.get(index) / d;
        arr.set(index, temp_val);
        System.out.println(index + "   " + temp_val);
        map.put(temp_val, map.getOrDefault(temp_val, 0) + 1);
        int same = map.get(temp_val);
        if (same == threshold) {
            System.out.println("Yay   " + temp_count);
            count[0] = Math.min(temp_count, count[0]);
            return;
        }
        if (temp_val == 0)
            return;
        helper(arr, threshold, d, map, index, count, temp_count+1);
        helper(arr, threshold, d, map, index+1, count, temp_count);
        arr.set(index, array_value);
    }

    /*
     * Complete the 'maxPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY skillLevel
     *  2. INTEGER minDiff
     */

    public static int maxPairs(List<Integer> skillLevel, int minDiff) {
        if (minDiff <= 0)
            return 0;
        // Write your code here
        int count = 0;
        Collections.sort(skillLevel);
        // List<Integer> copy = new ArrayList<>();
        // for (int a : skillLevel)
        //     copy.add(a);

        int max = 1;
        for (int i = 0; i < skillLevel.size()-1; i++) {
            while (max++ < skillLevel.size()-1) {
                if (skillLevel.get(max) - skillLevel.get(i) >= minDiff) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : dictionary) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String temp = new String(arr);
            map.put(temp, map.getOrDefault(temp, 0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for (String word : query) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String temp = new String(arr);
            list.add(map.getOrDefault(temp, 0));
        }

        return list;
    }

}
